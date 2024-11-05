package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BusinessSharedAudience;
import org.openapitools.model.BusinessSharedAudienceResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SharedAudience;
import org.openapitools.model.SharedAudienceResponse;

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
public class AudienceSharingApiServiceImpl implements AudienceSharingApi {
    /**
     * List accounts with access to an audience owned by an ad account
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
     *
     */
    @Override
    public AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(String adAccountId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * List accounts with access to an audience owned by a business
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     *
     */
    @Override
    public AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * List received audiences for a business
     *
     * Get a list of received audiences for the given business.
     *
     */
    @Override
    public AudiencesList200Response sharedAudiencesForBusinessList(String businessId, String bookmark, String order, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update audience sharing between ad accounts
     *
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     */
    @Override
    public SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(String adAccountId, SharedAudience sharedAudience) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update audience sharing from an ad account to businesses
     *
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     */
    @Override
    public BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(String adAccountId, BusinessSharedAudience businessSharedAudience) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update audience sharing from a business to ad accounts
     *
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     */
    @Override
    public SharedAudienceResponse updateBusinessToAdAccountSharedAudience(String businessId, SharedAudience sharedAudience) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update audience sharing between businesses
     *
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     */
    @Override
    public BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(String businessId, BusinessSharedAudience businessSharedAudience) {
        // TODO: Implement...
        return null;
    }

}
