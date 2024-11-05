package org.openapitools.api;

import org.openapitools.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.model.AdAccountGetSubscriptionResponse;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
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
 * API tests for LeadAdsApi
 */
@MicronautTest
public class LeadAdsApiTest {

    @Inject
    LeadAdsApi api;

    
    /**
     * Delete lead ads subscription
     *
     * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsSubscriptionsDelByIdTest() {
        // given
        String adAccountId = "example";
        String subscriptionId = "example";

        // when
        api.adAccountsSubscriptionsDelById(adAccountId, subscriptionId).block();

        // then
        // TODO implement the adAccountsSubscriptionsDelByIdTest()
    }

    
    /**
     * Get lead ads subscription
     *
     * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsSubscriptionsGetByIdTest() {
        // given
        String adAccountId = "example";
        String subscriptionId = "example";

        // when
        AdAccountGetSubscriptionResponse body = api.adAccountsSubscriptionsGetById(adAccountId, subscriptionId).block();

        // then
        // TODO implement the adAccountsSubscriptionsGetByIdTest()
    }

    
    /**
     * Get lead ads subscriptions
     *
     * Get the advertiser&#39;s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsSubscriptionsGetListTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        AdAccountsSubscriptionsGetList200Response body = api.adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark).block();

        // then
        // TODO implement the adAccountsSubscriptionsGetListTest()
    }

    
    /**
     * Create lead ads subscription
     *
     * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records. - For data security, egress lead data is encrypted with AES-256-GCM.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsSubscriptionsPostTest() {
        // given
        String adAccountId = "example";
        AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest = new AdAccountCreateSubscriptionRequest("https://webhook.example.com/xyz");

        // when
        AdAccountCreateSubscriptionResponse body = api.adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest).block();

        // then
        // TODO implement the adAccountsSubscriptionsPostTest()
    }

    
}
