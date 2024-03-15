package org.openapitools.controller;

import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListRequest;
import org.openapitools.model.CustomerListUpdateRequest;
import org.openapitools.model.CustomerListsList200Response;
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
 * API tests for CustomerListsController
 */
@MicronautTest
public class CustomerListsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CustomerListsController controller;

    /**
     * This test is used to validate the implementation of customerListsCreate() method
     *
     * The method should: Create customer lists
     *
     * &lt;p&gt;Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).&lt;/p&gt; &lt;p&gt;A customer list is one of the four types of Pinterest audiences: for more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;p/&gt; &lt;p&gt;&lt;b&gt;Please review our &lt;u&gt;&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting#section-13341\&quot; target&#x3D;\&quot;_blank\&quot;&gt;requirements&lt;/a&gt;&lt;/u&gt; for what type of information is allowed when uploading a customer list.&lt;/b&gt;&lt;/p&gt; &lt;p&gt;When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.&lt;/p&gt; &lt;p&gt;Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the &lt;a href&#x3D;\&quot;#operation/create_audience_handler\&quot;&gt;create audience endpoint&lt;/a&gt; before it can be used.&lt;/p&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListsCreateMethodTest() {
        // given
        String adAccountId = "example";
        CustomerListRequest customerListRequest = new CustomerListRequest("The Glengarry Glen Ross leads", "email1@pinterest.com,email2@pinterest.com,..<more records>");

        // when
        CustomerList result = controller.customerListsCreate(adAccountId, customerListRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_lists' to the features of customerListsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListsCreateClientApiTest() throws IOException {
        // given
        CustomerListRequest body = new CustomerListRequest("The Glengarry Glen Ross leads", "email1@pinterest.com,email2@pinterest.com,..<more records>");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_lists").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of customerListsGet() method
     *
     * The method should: Get customer list
     *
     * Gets a specific customer list given the customer list ID.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListsGetMethodTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";

        // when
        CustomerList result = controller.customerListsGet(adAccountId, customerListId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}' to the features of customerListsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("customer_list_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of customerListsList() method
     *
     * The method should: Get customer lists
     *
     * &lt;p&gt;Get a set of customer lists including id and name based on the filters provided.&lt;/p&gt; &lt;p&gt;(Customer lists are a type of audience.) For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;  or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListsListMethodTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        CustomerListsList200Response result = controller.customerListsList(adAccountId, pageSize, order, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_lists' to the features of customerListsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_lists").expand(new HashMap<String, Object>(){{
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
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerListsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of customerListsUpdate() method
     *
     * The method should: Update customer list
     *
     * &lt;p&gt;Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)&lt;/p&gt; &lt;p&gt;When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        CustomerListUpdateRequest customerListUpdateRequest = new CustomerListUpdateRequest("email2@pinterest.com,email6@pinterest.com,", org.openapitools.model.UserListOperationType.fromValue("ADD"));

        // when
        CustomerList result = controller.customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}' to the features of customerListsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerListsUpdateClientApiTest() throws IOException {
        // given
        CustomerListUpdateRequest body = new CustomerListUpdateRequest("email2@pinterest.com,email6@pinterest.com,", org.openapitools.model.UserListOperationType.fromValue("ADD"));
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("customer_list_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
