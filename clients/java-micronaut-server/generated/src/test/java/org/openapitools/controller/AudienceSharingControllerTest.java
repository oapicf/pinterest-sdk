package org.openapitools.controller;

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BusinessSharedAudience;
import org.openapitools.model.BusinessSharedAudienceResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SharedAudience;
import org.openapitools.model.SharedAudienceResponse;
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
 * API tests for AudienceSharingController
 */
@MicronautTest
public class AudienceSharingControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AudienceSharingController controller;

    /**
     * This test is used to validate the implementation of adAccountsAudiencesSharedAccountsList() method
     *
     * The method should: List accounts with access to an audience owned by an ad account
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsAudiencesSharedAccountsListMethodTest() {
        // given
        String adAccountId = "example";
        String audienceId = "example";
        AudienceAccountType accountType = AudienceAccountType.fromValue("AD_ACCOUNT");
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        AdAccountsAudiencesSharedAccountsList200Response result = controller.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audiences/shared/accounts' to the features of adAccountsAudiencesSharedAccountsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsAudiencesSharedAccountsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences/shared/accounts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@20381e51");
        request.getParameters()
            .add("audience_id", "example") // The query parameter format should be 
            .add("account_type", String.valueOf(AudienceAccountType.fromValue("AD_ACCOUNT"))) // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsAudiencesSharedAccountsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of businessAccountAudiencesSharedAccountsList() method
     *
     * The method should: List accounts with access to an audience owned by a business
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void businessAccountAudiencesSharedAccountsListMethodTest() {
        // given
        String businessId = "729090764583391194";
        String audienceId = "example";
        AudienceAccountType accountType = AudienceAccountType.fromValue("AD_ACCOUNT");
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        AdAccountsAudiencesSharedAccountsList200Response result = controller.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/audiences/shared/accounts' to the features of businessAccountAudiencesSharedAccountsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void businessAccountAudiencesSharedAccountsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/audiences/shared/accounts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@470602f8");
        request.getParameters()
            .add("audience_id", "example") // The query parameter format should be 
            .add("account_type", String.valueOf(AudienceAccountType.fromValue("AD_ACCOUNT"))) // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsAudiencesSharedAccountsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of sharedAudiencesForBusinessList() method
     *
     * The method should: List received audiences for a business
     *
     * Get a list of received audiences for the given business.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void sharedAudiencesForBusinessListMethodTest() {
        // given
        String businessId = "729090764583391194";
        String bookmark = "example";
        String order = "ASCENDING";
        Integer pageSize = 25;

        // when
        AudiencesList200Response result = controller.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/audiences' to the features of sharedAudiencesForBusinessList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void sharedAudiencesForBusinessListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/audiences").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3c47011f");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("order", "ASCENDING") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AudiencesList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateAdAccountToAdAccountSharedAudience() method
     *
     * The method should: Update audience sharing between ad accounts
     *
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateAdAccountToAdAccountSharedAudienceMethodTest() {
        // given
        String adAccountId = "example";
        SharedAudience sharedAudience = new SharedAudience();

        // when
        SharedAudienceResponse result = controller.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared' to the features of updateAdAccountToAdAccountSharedAudience() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateAdAccountToAdAccountSharedAudienceClientApiTest() throws IOException {
        // given
        SharedAudience body = new SharedAudience();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@2e478638");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SharedAudienceResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateAdAccountToBusinessSharedAudience() method
     *
     * The method should: Update audience sharing from an ad account to businesses
     *
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateAdAccountToBusinessSharedAudienceMethodTest() {
        // given
        String adAccountId = "example";
        BusinessSharedAudience businessSharedAudience = new BusinessSharedAudience();

        // when
        BusinessSharedAudienceResponse result = controller.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audiences/businesses/shared' to the features of updateAdAccountToBusinessSharedAudience() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateAdAccountToBusinessSharedAudienceClientApiTest() throws IOException {
        // given
        BusinessSharedAudience body = new BusinessSharedAudience();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audiences/businesses/shared").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@4e6ddf37");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessSharedAudienceResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateBusinessToAdAccountSharedAudience() method
     *
     * The method should: Update audience sharing from a business to ad accounts
     *
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateBusinessToAdAccountSharedAudienceMethodTest() {
        // given
        String businessId = "729090764583391194";
        SharedAudience sharedAudience = new SharedAudience();

        // when
        SharedAudienceResponse result = controller.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/audiences/ad_accounts/shared' to the features of updateBusinessToAdAccountSharedAudience() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateBusinessToAdAccountSharedAudienceClientApiTest() throws IOException {
        // given
        SharedAudience body = new SharedAudience();
        String uri = UriTemplate.of("/businesses/{business_id}/audiences/ad_accounts/shared").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@390b15c0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SharedAudienceResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateBusinessToBusinessSharedAudience() method
     *
     * The method should: Update audience sharing between businesses
     *
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateBusinessToBusinessSharedAudienceMethodTest() {
        // given
        String businessId = "729090764583391194";
        BusinessSharedAudience businessSharedAudience = new BusinessSharedAudience();

        // when
        BusinessSharedAudienceResponse result = controller.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/audiences/businesses/shared' to the features of updateBusinessToBusinessSharedAudience() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateBusinessToBusinessSharedAudienceClientApiTest() throws IOException {
        // given
        BusinessSharedAudience body = new BusinessSharedAudience();
        String uri = UriTemplate.of("/businesses/{business_id}/audiences/businesses/shared").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@3dc0b407");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessSharedAudienceResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
