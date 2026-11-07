package org.openapitools.controller;

import org.openapitools.model.LeadForm;
import org.openapitools.model.LeadFormBatchUpdate;
import org.openapitools.model.LeadFormCreate;
import org.openapitools.model.LeadFormTest;
import org.openapitools.model.LeadFormTestCreate;
import org.openapitools.model.LeadFormsCreate200Response;
import org.openapitools.model.LeadFormsList200Response;
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
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormGetMethodTest() {
        // given
        String leadFormId = "example";
        String adAccountId = "example";

        // when
        LeadForm result = controller.leadFormGet(leadFormId, adAccountId).block();

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
            put("lead_form_id", "example");
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@37015ba0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadForm.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadFormTestCreate() method
     *
     * The method should: Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormTestCreateMethodTest() {
        // given
        String adAccountId = "example";
        String leadFormId = "example";
        LeadFormTestCreate leadFormTestCreate = new LeadFormTestCreate(Arrays.asList("example"));

        // when
        LeadFormTest result = controller.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate).block();

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
        LeadFormTestCreate body = new LeadFormTestCreate(Arrays.asList("example"));
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("lead_form_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2432bed2");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadFormTest.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadFormsCreate() method
     *
     * The method should: Create lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormsCreateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid LeadFormCreate> leadFormCreate = Arrays.asList();

        // when
        LeadFormsCreate200Response result = controller.leadFormsCreate(adAccountId, leadFormCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/lead_forms' to the features of leadFormsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormsCreateClientApiTest() throws IOException {
        // given
        List<@Valid LeadFormCreate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/lead_forms").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@457a154a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadFormsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadFormsList() method
     *
     * The method should: List lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormsListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");

        // when
        LeadFormsList200Response result = controller.leadFormsList(adAccountId, bookmark, pageSize, order).block();

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
            .accept("[Ljava.lang.String;@15b677ba");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadFormsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadFormsUpdate() method
     *
     * The method should: Update lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid LeadFormBatchUpdate> leadFormBatchUpdate = Arrays.asList();

        // when
        LeadFormsCreate200Response result = controller.leadFormsUpdate(adAccountId, leadFormBatchUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/lead_forms' to the features of leadFormsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormsUpdateClientApiTest() throws IOException {
        // given
        List<@Valid LeadFormBatchUpdate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/lead_forms").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@2857f2f7");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadFormsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
