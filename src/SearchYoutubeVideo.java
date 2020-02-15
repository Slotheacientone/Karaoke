import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.services.youtube.YouTube;

import java.io.*;
import java.nio.charset.Charset;

public class SearchYoutubeVideo {
    private String apikey;

    public SearchYoutubeVideo() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("key.txt")));
        apikey = reader.readLine();
        reader.close();
    }

    /*public static void main(String[] args) throws IOException {
        HttpTransport httpTransport = new HttpTransport() {
            @Override
            protected LowLevelHttpRequest buildRequest(String s, String s1) throws IOException {
                return null;
            }
        };
        JsonFactory jsonFactory = new JsonFactory() {
            @Override
            public JsonParser createJsonParser(InputStream inputStream) throws IOException {


            }

            @Override
            public JsonParser createJsonParser(InputStream inputStream, Charset charset) throws IOException {
                return null;
            }

            @Override
            public JsonParser createJsonParser(String s) throws IOException {
                return null;
            }

            @Override
            public JsonParser createJsonParser(Reader reader) throws IOException {
                return null;
            }

            @Override
            public JsonGenerator createJsonGenerator(OutputStream outputStream, Charset charset) throws IOException {
                return null;
            }

            @Override
            public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
                return null;
            }
        };
        HttpRequestInitializer httpRequestInitializer = new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest httpRequest) throws IOException {

            }
        };
        YouTube.Builder youTubeBuilder= new YouTube.Builder(httpTransport, jsonFactory, httpRequestInitializer);
        YouTube youTube = youTubeBuilder.build();
        youTube.search().list("Karaoke");

    }*/


}
