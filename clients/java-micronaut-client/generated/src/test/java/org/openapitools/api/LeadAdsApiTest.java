package org.openapitools.api;

import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.LeadSubscription;
import org.openapitools.model.LeadSubscriptionPostParamsCreate;
import org.openapitools.model.PinterestLibError;
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
     * Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
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
     * Get lead ads subscription by ID
     *
     * Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsSubscriptionsGetByIdTest() {
        // given
        String adAccountId = "example";
        String subscriptionId = "example";

        // when
        LeadSubscription body = api.adAccountsSubscriptionsGetById(adAccountId, subscriptionId).block();

        // then
        // TODO implement the adAccountsSubscriptionsGetByIdTest()
    }

    
    /**
     * Get lead ads subscriptions
     *
     * Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsSubscriptionsGetListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        AdAccountsSubscriptionsGetList200Response body = api.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the adAccountsSubscriptionsGetListTest()
    }

    
    /**
     * Create lead ads subscription
     *
     * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsSubscriptionsPostTest() {
        // given
        String adAccountId = "example";
        LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate = new LeadSubscriptionPostParamsCreate();

        // when
        LeadSubscription body = api.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate).block();

        // then
        // TODO implement the adAccountsSubscriptionsPostTest()
    }

    
}
