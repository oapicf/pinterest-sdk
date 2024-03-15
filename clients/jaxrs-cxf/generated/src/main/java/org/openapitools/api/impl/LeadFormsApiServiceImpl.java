package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormsList200Response;

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
public class LeadFormsApiServiceImpl implements LeadFormsApi {
    /**
     * Get lead form by id
     *
     * Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    public LeadFormResponse leadFormGet(String adAccountId, String leadFormId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    public LeadFormTestResponse leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get lead forms
     *
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    public LeadFormsList200Response leadFormsList(String adAccountId, Integer pageSize, String order, String bookmark) {
        // TODO: Implement...

        return null;
    }

}
