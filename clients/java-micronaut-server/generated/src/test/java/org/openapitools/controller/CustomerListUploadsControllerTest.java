package org.openapitools.controller;

import org.openapitools.model.CustomerListUploadCreateRequest;
import org.openapitools.model.CustomerListUploadCreateResponse;
import org.openapitools.model.CustomerListUploadResponse;
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
 * API tests for CustomerListUploadsController
 */
@MicronautTest
public class CustomerListUploadsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CustomerListUploadsController controller;

    /**
     * This test is used to validate the implementation of customerListUploadsCreate() method
     *
     * The method should: Create customer list upload
     *
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListUploadsCreateMethodTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        CustomerListUploadCreateRequest customerListUploadCreateRequest = new CustomerListUploadCreateRequest(org.openapitools.model.UserListOperationType.fromValue("ADD"), 2);

        // when
        CustomerListUploadCreateResponse result = controller.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads' to the features of customerListUploadsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListUploadsCreateClientApiTest() throws IOException {
        // given
        CustomerListUploadCreateRequest body = new CustomerListUploadCreateRequest(org.openapitools.model.UserListOperationType.fromValue("ADD"), 2);
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("customer_list_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@6f3db926");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerListUploadCreateResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of customerListUploadsGet() method
     *
     * The method should: Get customer list upload
     *
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListUploadsGetMethodTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        String customerListUploadId = "example";

        // when
        CustomerListUploadResponse result = controller.customerListUploadsGet(adAccountId, customerListId, customerListUploadId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}' to the features of customerListUploadsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListUploadsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("customer_list_id", "example");
            put("customer_list_upload_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3f4c340b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerListUploadResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of customerListUploadsRun() method
     *
     * The method should: Run customer list upload
     *
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListUploadsRunMethodTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        String customerListUploadId = "example";

        // when
        CustomerListUploadResponse result = controller.customerListUploadsRun(adAccountId, customerListId, customerListUploadId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run' to the features of customerListUploadsRun() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListUploadsRunClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("customer_list_id", "example");
            put("customer_list_upload_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@2f6c5a76");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerListUploadResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
