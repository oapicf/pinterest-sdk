package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateGetResponseData;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequest;

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
public class TargetingTemplateApiServiceImpl implements TargetingTemplateApi {
    /**
     * Create targeting templates
     *
     * &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
     *
     */
    @Override
    public TargetingTemplateGetResponseData targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * List targeting templates
     *
     * Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
     *
     */
    @Override
    public TargetingTemplateList200Response targetingTemplateList(String adAccountId, String order, Boolean includeSizing, String searchQuery, Integer pageSize, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update targeting templates
     *
     * &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
     *
     */
    @Override
    public void targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest) {
        // TODO: Implement...

    }

}
