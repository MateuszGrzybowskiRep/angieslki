$(document).ready(function () {

    fetchEmployees();

    $('#addEmployee').click(function (eventAdd) {
        eventAdd.preventDefault();

        var employee = {
            name: $('#name').val(),
            lastName: $('#lastname').val(),
            phone: $('#phone').val(),
            email: $('#email').val(),
            active: $('#active').val()
        };
        $.ajax({
            url: `/employee`,
            method: 'POST',
            data: JSON.stringify(employee),
            contentType: 'application/json',
            success: function (data, status) {
                console.log('Data:' + data);
                console.log("Status: " + status);

                fetchEmployees();

                $('#close').click();
            },
            error: function (data, status) {

            }
        });
    });


    function addEmployessToTable(employees) {
        for (var i = 0; i < employees.length; i++) {

            var employee = employees[i];

            $('#employee').append(
                `<tr class="employeeRow">" +
                "<td>${employee.id}</td>" +
                "<td>${employee.name}</td>" +
                "<td>${employee.lastName}</td>" +
                "<td>${employee.email}</td>" +
                "<td>${employee.phone}</td>" +
            "<td>${employee.active}</td>" +
            "<td><span id="${employee.id}" class="glyphicon glyphicon-trash"></span></td>" +
            "</tr>`
            );
        }

        $(".glyphicon").click(function (event) {
            var employeeId = event.target.id;
            removeEmployee(employeeId);
        });
    }

    function removeEmployee(employeeId) {
        $.ajax({
            url: `/employee/${employeeId}`,
            method: 'DELETE',
        }).done(function (data, status) {
            console.log('Data:' + data);
            console.log("Status: " + status);

            fetchEmployees();
        });
    }

    function cleanTable() {
        $('.employeeRow').remove();
    }

    function fetchEmployees() {

        cleanTable();

        $.get("/employees", function (data, status) {

            console.log('Data:' + data);
            console.log("Status: " + status);
            console.log(arguments);

            if (status !== 'success') {
                alert("Server response with an error " + status);
            } else {
                addEmployessToTable(data);
            }

        });
    }
});