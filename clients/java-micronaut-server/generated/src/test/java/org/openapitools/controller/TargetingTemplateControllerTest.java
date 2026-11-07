package org.openapitools.controller;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.TargetingTemplate;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequestReadOrUpdate;
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
 * API tests for TargetingTemplateController
 */
@MicronautTest
public class TargetingTemplateControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    TargetingTemplateController controller;

    /**
     * This test is used to validate the implementation of targetingTemplateCreate() method
     *
     * The method should: Create targeting templates
     *
     * Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingTemplateCreateMethodTest() {
        // given
        String adAccountId = "example";
        TargetingTemplateCreate targetingTemplateCreate = new TargetingTemplateCreate("example", null);

        // when
        TargetingTemplate result = controller.targetingTemplateCreate(adAccountId, targetingTemplateCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/targeting_templates' to the features of targetingTemplateCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingTemplateCreateClientApiTest() throws IOException {
        // given
        TargetingTemplateCreate body = new TargetingTemplateCreate("example", null);
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/targeting_templates").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3c2db405");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TargetingTemplate.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of targetingTemplateList() method
     *
     * The method should: List targeting templates
     *
     * Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingTemplateListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        Boolean includeSizing = false;
        String searchQuery = "example";

        // when
        TargetingTemplateList200Response result = controller.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/targeting_templates' to the features of targetingTemplateList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingTemplateListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/targeting_templates").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@572eabf0");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("include_sizing", String.valueOf(false)) // The query parameter format should be 
            .add("search_query", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TargetingTemplateList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of targetingTemplateUpdate() method
     *
     * The method should: Update targeting templates
     *
     * Update the targeting template given advertiser ID and targeting template ID
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingTemplateUpdateMethodTest() {
        // given
        String adAccountId = "example";
        TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate = new TargetingTemplateUpdateRequestReadOrUpdate("643", org.openapitools.model.AudienceUpdateOperationType.fromValue("UPDATE"));

        // when
        controller.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/targeting_templates' to the features of targetingTemplateUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingTemplateUpdateClientApiTest() throws IOException {
        // given
        TargetingTemplateUpdateRequestReadOrUpdate body = new TargetingTemplateUpdateRequestReadOrUpdate("643", org.openapitools.model.AudienceUpdateOperationType.fromValue("UPDATE"));
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/targeting_templates").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@3f81a8bd");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
