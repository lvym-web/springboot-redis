
import com.lvym.util.RedisService;
import com.lvym.util.Userkey;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test_1{
    @Autowired
    private RedisService redisService;


    @Test
    public void set(){


        redisService.set(Userkey.getById,"key","value");
        redisService.get(Userkey.getById,"key",String.class);

    }


}

