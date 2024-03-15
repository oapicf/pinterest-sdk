package org.openapitools.controller;

import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateCustomRequest;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
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
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesCreateMethodTest() {
        // given
        String adAccountId = "example";
        AudienceCreateRequest audienceCreateRequest = new AudienceCreateRequest();

        // when
        Audience result = controller.audiencesCreate(adAccountId, audienceCreateRequest).block();

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
        AudienceCreateRequest body = new AudienceCreateRequest();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Audience.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of audiencesCreateCustom() method
     *
     * The method should: Create custom audience
     *
     * Create a custom audience and find the audiences you want your ads to reach.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesCreateCustomMethodTest() {
        // given
        String adAccountId = "example";
        AudienceCreateCustomRequest audienceCreateCustomRequest = new AudienceCreateCustomRequest();

        // when
        Audience result = controller.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audiences/custom' to the features of audiencesCreateCustom() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesCreateCustomClientApiTest() throws IOException {
        // given
        AudienceCreateCustomRequest body = new AudienceCreateCustomRequest();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences/custom").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Audience.class);

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
        String adAccountId = "example";
        String audienceId = "example";

        // when
        Audience result = controller.audiencesGet(adAccountId, audienceId).block();

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
            put("ad_account_id", "example");
            put("audience_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Audience.class);

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
        String order = "ASCENDING";
        Integer pageSize = 25;
        String ownershipType = "OWNED";

        // when
        AudiencesList200Response result = controller.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType).block();

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
            .accept("application/json");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("order", "ASCENDING") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("ownership_type", "OWNED"); // The query parameter format should be 

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
     * Update (edit or remove) an existing targeting audience.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audiencesUpdateMethodTest() {
        // given
        String adAccountId = "example";
        String audienceId = "example";
        AudienceUpdateRequest audienceUpdateRequest = new AudienceUpdateRequest();

        // when
        Audience result = controller.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest).block();

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
        AudienceUpdateRequest body = new AudienceUpdateRequest();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences/{audience_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("audience_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Audience.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
