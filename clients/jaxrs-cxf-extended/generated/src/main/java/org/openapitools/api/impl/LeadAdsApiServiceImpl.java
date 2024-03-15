package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.model.AdAccountGetSubscriptionResponse;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.Error;

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
     * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @Override
    public void adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId) {
        // TODO: Implement...

    }

    /**
     * Get lead ads subscription
     *
     * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @Override
    public AdAccountGetSubscriptionResponse adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get lead ads subscriptions
     *
     * Get the advertiser&#39;s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @Override
    public AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(String adAccountId, Integer pageSize, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create lead ads subscription
     *
     * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @Override
    public AdAccountCreateSubscriptionResponse adAccountsSubscriptionsPost(String adAccountId, AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest) {
        // TODO: Implement...
        return null;
    }

}
