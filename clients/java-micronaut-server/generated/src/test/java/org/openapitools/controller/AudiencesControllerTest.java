package org.openapitools.controller;

import org.openapitools.model.AdAccountsAudience;
import org.openapitools.model.AdAccountsAudienceCreate;
import org.openapitools.model.AdAccountsAudienceUpdate;
import org.openapitools.model.AudienceOwnershipType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
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
 * API tests for AudiencesController
 */
@MicronautTest
public class AudiencesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AudiencesController controller;

    /**
     * This test is used to validate the implementation of audiencesCreate() method
     *
     * The method should: Create audience
     *
     * Create a new audience for the ad account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesCreateMethodTest() {
        // given
        String adAccountId = "example";
        AdAccountsAudienceCreate adAccountsAudienceCreate = new AdAccountsAudienceCreate();

        // when
        AdAccountsAudience result = controller.audiencesCreate(adAccountId, adAccountsAudienceCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audiences' to the features of audiencesCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesCreateClientApiTest() throws IOException {
        // given
        AdAccountsAudienceCreate body = new AdAccountsAudienceCreate();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@7f86ffaf");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsAudience.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of audiencesGet() method
     *
     * The method should: Get audience
     *
     * Get a specific audience given the audience ID.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesGetMethodTest() {
        // given
        String audienceId = "example";
        String adAccountId = "example";

        // when
        AdAccountsAudience result = controller.audiencesGet(audienceId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audiences/{audience_id}' to the features of audiencesGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences/{audience_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("audience_id", "example");
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3840f3ef");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsAudience.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of audiencesList() method
     *
     * The method should: List audiences
     *
     * Get list of audiences for the ad account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        AudienceOwnershipType ownershipType = AudienceOwnershipType.fromValue("OWNED");
        Boolean excludeNca = false;

        // when
        AudiencesList200Response result = controller.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audiences' to the features of audiencesList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@36d151ca");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("ownership_type", String.valueOf(AudienceOwnershipType.fromValue("OWNED"))) // The query parameter format should be 
            .add("exclude_nca", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AudiencesList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of audiencesUpdate() method
     *
     * The method should: Update audience
     *
     * Update an existing audience for the ad account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesUpdateMethodTest() {
        // given
        String audienceId = "example";
        String adAccountId = "example";
        AdAccountsAudienceUpdate adAccountsAudienceUpdate = new AdAccountsAudienceUpdate();

        // when
        AdAccountsAudience result = controller.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audiences/{audience_id}' to the features of audiencesUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesUpdateClientApiTest() throws IOException {
        // given
        AdAccountsAudienceUpdate body = new AdAccountsAudienceUpdate();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences/{audience_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("audience_id", "example");
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@3249667e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsAudience.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
