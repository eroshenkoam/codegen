package codegen;

import com.google.gson.Gson;
import examples.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCodeGen {

    private static final long USER_ID = 1;

    private static final String USER_NAME = "Simon";

    @Test
    public void testGsonAnnotations() {
        User user = new User()
                .withId(USER_ID)
                .withName(USER_NAME);

        String actualName = new Gson().toJsonTree(user).getAsJsonObject().get("full_name").getAsString();
        assertThat(actualName, equalTo(USER_NAME));

    }
}
