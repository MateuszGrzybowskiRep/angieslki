$(document).ready(function () {

/*https://medium.com/@bryanjenningz/how-to-record-and-play-audio-in-javascript-faa1b2b3e49b*/

    var mediaRecorder;

    $("#record").click(function (event) {

        console.log("Start recording");

        navigator.mediaDevices.getUserMedia({ audio: true })
            .then(stream => {
                mediaRecorder = new MediaRecorder(stream);
                mediaRecorder.start();

                const audioChunks = [];

                mediaRecorder.addEventListener("dataavailable", event => {
                    audioChunks.push(event.data);
                });

                mediaRecorder.addEventListener("stop", () => {
                    const audioBlob = new Blob(audioChunks);
                    console.log(audioBlob);
                    console.log(audioChunks);

                    const audioUrl = URL.createObjectURL(audioBlob);

                    console.log(audioUrl);


                    var fd = new FormData();
                    // fd.append('fname', 'test.wav');
                    fd.append('file', audioBlob);

                    $.ajax({
                        url: '/record',
                        method: 'POST',
                        data: fd,
                        processData: false,
                        contentType: false

                    }).done(function (res) {
                        console.log(res);
                    })



                });
            }).catch(function(err) {
                console.log("Ugh.. error:");
                console.log(err);
        });
    });

    $("#stop").click(function (event) {

        console.log("Stop recording");

        mediaRecorder.stop();

    });







});