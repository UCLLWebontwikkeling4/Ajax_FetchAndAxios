import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class Overview extends RequestHandler {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        List<Lector> lectors = lectorRepository.getAll();
        String lectorsToJSON = null;
        lectorsToJSON = lectorsToJSON(lectors);
        return lectorsToJSON;
    }

    private String lectorsToJSON(List<Lector> lectors) {
        ObjectMapper mapper = new ObjectMapper();
        String result = null;
        try {
            result = mapper.writeValueAsString(lectors);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

}
