package org.openapitools.controller;

import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
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
 * API tests for AdvancedAuctionController
 */
@MicronautTest
public class AdvancedAuctionControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AdvancedAuctionController controller;

    /**
     * This test is used to validate the implementation of advancedAuctionItemsGetPost() method
     *
     * The method should: Get item bid options (POST)
     *
     * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void advancedAuctionItemsGetPostMethodTest() {
        // given
        AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest = new AdvancedAuctionItemsGetRequest("2680059592705", Arrays.asList());
        String adAccountId = "example";

        // when
        AdvancedAuctionItems result = controller.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/advanced_auction/items/get' to the features of advancedAuctionItemsGetPost() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void advancedAuctionItemsGetPostClientApiTest() throws IOException {
        // given
        AdvancedAuctionItemsGetRequest body = new AdvancedAuctionItemsGetRequest("2680059592705", Arrays.asList());
        String uri = UriTemplate.of("/advanced_auction/items/get").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2be4a633");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdvancedAuctionItems.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of advancedAuctionItemsSubmitPost() method
     *
     * The method should: Operate on item level bid options
     *
     * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void advancedAuctionItemsSubmitPostMethodTest() {
        // given
        AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = new AdvancedAuctionItemsSubmitRequest("2680059592705", Arrays.asList());
        String adAccountId = "example";

        // when
        AdvancedAuctionProcessedItems result = controller.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/advanced_auction/items/submit' to the features of advancedAuctionItemsSubmitPost() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void advancedAuctionItemsSubmitPostClientApiTest() throws IOException {
        // given
        AdvancedAuctionItemsSubmitRequest body = new AdvancedAuctionItemsSubmitRequest("2680059592705", Arrays.asList());
        String uri = UriTemplate.of("/advanced_auction/items/submit").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@90a4093");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdvancedAuctionProcessedItems.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
