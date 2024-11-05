package org.openapitools.api;

import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
import org.openapitools.model.Error;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for AdvancedAuctionApi
 */
@MicronautTest
public class AdvancedAuctionApiTest {

    @Inject
    AdvancedAuctionApi api;

    
    /**
     * Get item bid options (POST)
     *
     * Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     */
    @Test
    @Disabled("Not Implemented")
    public void advancedAuctionItemsGetPostTest() {
        // given
        AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest = new AdvancedAuctionItemsGetRequest("2680059592705", Arrays.asList());
        String adAccountId = "example";

        // when
        AdvancedAuctionItems body = api.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId).block();

        // then
        // TODO implement the advancedAuctionItemsGetPostTest()
    }

    
    /**
     * Operate on item level bid options
     *
     * This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.
     */
    @Test
    @Disabled("Not Implemented")
    public void advancedAuctionItemsSubmitPostTest() {
        // given
        AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = new AdvancedAuctionItemsSubmitRequest("2680059592705", Arrays.asList());
        String adAccountId = "example";

        // when
        AdvancedAuctionProcessedItems body = api.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId).block();

        // then
        // TODO implement the advancedAuctionItemsSubmitPostTest()
    }

    
}
