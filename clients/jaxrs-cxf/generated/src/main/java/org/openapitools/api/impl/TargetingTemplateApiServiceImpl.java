package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.TargetingTemplate;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequestReadOrUpdate;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


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
     * Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
     *
     */
    public TargetingTemplate targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * List targeting templates
     *
     * Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
     *
     */
    public TargetingTemplateList200Response targetingTemplateList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update targeting templates
     *
     * Update the targeting template given advertiser ID and targeting template ID
     *
     */
    public void targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate) {
        // TODO: Implement...

        
    }

}
