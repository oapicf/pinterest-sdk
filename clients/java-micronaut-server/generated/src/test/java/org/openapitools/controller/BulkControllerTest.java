package org.openapitools.controller;

import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
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
 * API tests for BulkController
 */
@MicronautTest
public class BulkControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    BulkController controller;

    /**
     * This test is used to validate the implementation of bulkDownloadCreate() method
     *
     * The method should: Get advertiser entities in bulk
     *
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void bulkDownloadCreateMethodTest() {
        // given
        String adAccountId = "example";
        BulkDownloadRequest bulkDownloadRequest = new BulkDownloadRequest();

        // when
        BulkDownloadResponse result = controller.bulkDownloadCreate(adAccountId, bulkDownloadRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/bulk/download' to the features of bulkDownloadCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void bulkDownloadCreateClientApiTest() throws IOException {
        // given
        BulkDownloadRequest body = new BulkDownloadRequest();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/bulk/download").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@7a8ddc9d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BulkDownloadResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of bulkRequestGet() method
     *
     * The method should: Download advertiser entities in bulk
     *
     * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void bulkRequestGetMethodTest() {
        // given
        String adAccountId = "example";
        String bulkRequestId = "example";
        Boolean includeDetails = false;

        // when
        BulkUpsertStatusResponse result = controller.bulkRequestGet(adAccountId, bulkRequestId, includeDetails).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}' to the features of bulkRequestGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void bulkRequestGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("bulk_request_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@301dc6d6");
        request.getParameters()
            .add("include_details", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BulkUpsertStatusResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of bulkUpsertCreate() method
     *
     * The method should: Create/update ad entities in bulk
     *
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void bulkUpsertCreateMethodTest() {
        // given
        String adAccountId = "example";
        BulkUpsertRequest bulkUpsertRequest = new BulkUpsertRequest();

        // when
        BulkUpsertResponse result = controller.bulkUpsertCreate(adAccountId, bulkUpsertRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/bulk/upsert' to the features of bulkUpsertCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void bulkUpsertCreateClientApiTest() throws IOException {
        // given
        BulkUpsertRequest body = new BulkUpsertRequest();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/bulk/upsert").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@6a2c9220");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BulkUpsertResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
