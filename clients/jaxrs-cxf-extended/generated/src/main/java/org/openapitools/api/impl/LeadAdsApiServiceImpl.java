package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.LeadSubscription;
import org.openapitools.model.LeadSubscriptionPostParamsCreate;
import org.openapitools.model.PinterestLibError;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class LeadAdsApiServiceImpl implements LeadAdsApi {
    /**
     * Delete lead ads subscription
     *
     * Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
     *
     */
    @Override
    public void adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId) {
        // TODO: Implement...

    }

    /**
     * Get lead ads subscription by ID
     *
     * Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
     *
     */
    @Override
    public LeadSubscription adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get lead ads subscriptions
     *
     * Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
     *
     */
    @Override
    public AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(String adAccountId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create lead ads subscription
     *
     * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
     *
     */
    @Override
    public LeadSubscription adAccountsSubscriptionsPost(String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate) {
        // TODO: Implement...
        return null;
    }

}
