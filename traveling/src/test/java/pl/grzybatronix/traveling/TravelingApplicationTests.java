package pl.grzybatronix.traveling;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.mgrzybowski.DemoApplication;
import pl.mgrzybowski.model.User;
import pl.mgrzybowski.model.WordList;
import pl.mgrzybowski.repository.UserRepository;
import pl.mgrzybowski.repository.ListsRepository;
import pl.mgrzybowski.repository.WordsRepository;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TravelingApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ListsRepository listsRepository;
    @Autowired
    private WordsRepository wordsRepository;

    @Test
    public void shouldCreataRelationship() {
        User user = new User();
        user.setName("Tomasz");
        user.setLastName("Grzyb");
        userRepository.save(user);
        WordList wordList = new WordList();
        wordList.setListName("Koty");
        wordList.setOwner(user);
        listsRepository.save(wordList);
        List<User> all = userRepository.findAll();
        assertTrue(all.size()==3);
    }

}
