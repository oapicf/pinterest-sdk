package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.LeadForm;
import org.openapitools.model.LeadFormBatchUpdate;
import org.openapitools.model.LeadFormCreate;
import org.openapitools.model.LeadFormTest;
import org.openapitools.model.LeadFormTestCreate;
import org.openapitools.model.LeadFormsCreate200Response;
import org.openapitools.model.LeadFormsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;

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
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     */
    @Override
    public LeadForm leadFormGet(String leadFormId, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create lead form test data
     *
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
     *
     */
    @Override
    public LeadFormTest leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestCreate leadFormTestCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     */
    @Override
    public LeadFormsCreate200Response leadFormsCreate(String adAccountId, List<@Valid LeadFormCreate> leadFormCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * List lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     */
    @Override
    public LeadFormsList200Response leadFormsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update lead forms
     *
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     */
    @Override
    public LeadFormsCreate200Response leadFormsUpdate(String adAccountId, List<@Valid LeadFormBatchUpdate> leadFormBatchUpdate) {
        // TODO: Implement...
        return null;
    }

}
