package bootcampJava.EvaluacionFinal;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.security.test.context.support.WithMockUser;


@SpringBootTest
@AutoConfigureMockMvc
public class SecurityTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void accessProtectedUrlUnauthenticated() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/some-protected-url"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    public void loginWithValidUserThenAuthenticated() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/login")
                .with(httpBasic("user", "password"))
                .with(csrf()))
                .andExpect(status().isOk());
    }

    @Test
    @WithMockUser(username = "user", roles = {"USER"})
    public void accessProtectedUrlAuthenticated() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/some-protected-url"))
                .andExpect(status().isOk());
    }
}