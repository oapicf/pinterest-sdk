package org.openapitools.controller;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for BoardsController
 */
@MicronautTest
public class BoardsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    BoardsController controller;

    /**
     * This test is used to validate the implementation of boardSectionsCreate() method
     *
     * The method should: Create board section
     *
     * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsCreateMethodTest() {
        // given
        String boardId = "example";
        BoardSection boardSection = new BoardSection("Salads");
        String adAccountId = "example";

        // when
        BoardSection result = controller.boardSectionsCreate(boardId, boardSection, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}/sections' to the features of boardSectionsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsCreateClientApiTest() throws IOException {
        // given
        BoardSection body = new BoardSection("Salads");
        String uri = UriTemplate.of("/boards/{board_id}/sections").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@582957b1");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BoardSection.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardSectionsDelete() method
     *
     * The method should: Delete board section
     *
     * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsDeleteMethodTest() {
        // given
        String boardId = "example";
        String sectionId = "example";
        String adAccountId = "example";

        // when
        controller.boardSectionsDelete(boardId, sectionId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}/sections/{section_id}' to the features of boardSectionsDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/boards/{board_id}/sections/{section_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
            put("section_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@4555583b");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardSectionsList() method
     *
     * The method should: List board sections
     *
     * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsListMethodTest() {
        // given
        String boardId = "example";
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BoardSectionsList200Response result = controller.boardSectionsList(boardId, adAccountId, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}/sections' to the features of boardSectionsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/boards/{board_id}/sections").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@43dad60c");
        request.getParameters()
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BoardSectionsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardSectionsListPins() method
     *
     * The method should: List Pins on board section
     *
     * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsListPinsMethodTest() {
        // given
        String boardId = "example";
        String sectionId = "example";
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BoardsListPins200Response result = controller.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}/sections/{section_id}/pins' to the features of boardSectionsListPins() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsListPinsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/boards/{board_id}/sections/{section_id}/pins").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
            put("section_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1a9660c9");
        request.getParameters()
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BoardsListPins200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardSectionsUpdate() method
     *
     * The method should: Update board section
     *
     * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsUpdateMethodTest() {
        // given
        String boardId = "example";
        String sectionId = "example";
        BoardSection boardSection = new BoardSection("Salads");
        String adAccountId = "example";

        // when
        BoardSection result = controller.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}/sections/{section_id}' to the features of boardSectionsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardSectionsUpdateClientApiTest() throws IOException {
        // given
        BoardSection body = new BoardSection("Salads");
        String uri = UriTemplate.of("/boards/{board_id}/sections/{section_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
            put("section_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@81028f5");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BoardSection.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardsCreate() method
     *
     * The method should: Create board
     *
     * Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsCreateMethodTest() {
        // given
        Board board = new Board("Summer Recipes");
        String adAccountId = "example";

        // when
        Board result = controller.boardsCreate(board, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards' to the features of boardsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsCreateClientApiTest() throws IOException {
        // given
        Board body = new Board("Summer Recipes");
        String uri = UriTemplate.of("/boards").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@676b3d4c");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Board.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardsDelete() method
     *
     * The method should: Delete board
     *
     * Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsDeleteMethodTest() {
        // given
        String boardId = "example";
        String adAccountId = "example";

        // when
        controller.boardsDelete(boardId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}' to the features of boardsDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/boards/{board_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@7214fd1b");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardsGet() method
     *
     * The method should: Get board
     *
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsGetMethodTest() {
        // given
        String boardId = "example";
        String adAccountId = "example";

        // when
        Board result = controller.boardsGet(boardId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}' to the features of boardsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/boards/{board_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5b2d5bb8");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Board.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardsList() method
     *
     * The method should: List boards
     *
     * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        String privacy = "example";

        // when
        BoardsList200Response result = controller.boardsList(adAccountId, bookmark, pageSize, privacy).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards' to the features of boardsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/boards").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@52f387a8");
        request.getParameters()
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("privacy", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BoardsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardsListPins() method
     *
     * The method should: List Pins on board
     *
     * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsListPinsMethodTest() {
        // given
        String boardId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        List<String> creativeTypes = Arrays.asList("example");
        String adAccountId = "example";
        Boolean pinMetrics = false;

        // when
        BoardsListPins200Response result = controller.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}/pins' to the features of boardsListPins() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsListPinsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/boards/{board_id}/pins").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6ccc41e7");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("creative_types", Arrays.asList("example")) // The query format should be multi
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("pin_metrics", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BoardsListPins200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of boardsUpdate() method
     *
     * The method should: Update board
     *
     * Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsUpdateMethodTest() {
        // given
        String boardId = "example";
        BoardUpdate boardUpdate = new BoardUpdate();
        String adAccountId = "example";

        // when
        Board result = controller.boardsUpdate(boardId, boardUpdate, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/boards/{board_id}' to the features of boardsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void boardsUpdateClientApiTest() throws IOException {
        // given
        BoardUpdate body = new BoardUpdate();
        String uri = UriTemplate.of("/boards/{board_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("board_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@39659540");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Board.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
