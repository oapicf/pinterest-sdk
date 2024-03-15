package org.openapitools.controller;

import org.openapitools.model.Error;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormsList200Response;
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
 * API tests for LeadFormsController
 */
@MicronautTest
public class LeadFormsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    LeadFormsController controller;

    /**
     * This test is used to validate the implementation of leadFormGet() method
     *
     * The method should: Get lead form by id
     *
     * Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormGetMethodTest() {
        // given
        String adAccountId = "example";
        String leadFormId = "1234567890123";

        // when
        LeadFormResponse result = controller.leadFormGet(adAccountId, leadFormId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}' to the features of leadFormGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("lead_form_id", "1234567890123");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadFormResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadFormTestCreate() method
     *
     * The method should: Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormTestCreateMethodTest() {
        // given
        String adAccountId = "example";
        String leadFormId = "1234567890123";
        LeadFormTestRequest leadFormTestRequest = new LeadFormTestRequest(Arrays.asList("example"));

        // when
        LeadFormTestResponse result = controller.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test' to the features of leadFormTestCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormTestCreateClientApiTest() throws IOException {
        // given
        LeadFormTestRequest body = new LeadFormTestRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("lead_form_id", "1234567890123");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadFormTestResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadFormsList() method
     *
     * The method should: Get lead forms
     *
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormsListMethodTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        LeadFormsList200Response result = controller.leadFormsList(adAccountId, pageSize, order, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/lead_forms' to the features of leadFormsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/lead_forms").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", "ASCENDING") // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadFormsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
