package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.LeadFormResponse;
import org.openapitools.server.api.model.LeadFormTestRequest;
import org.openapitools.server.api.model.LeadFormTestResponse;
import org.openapitools.server.api.model.LeadFormsList200Response;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface LeadFormsApi  {
    //lead_form/get
    void leadFormGet(String adAccountId, String leadFormId, Handler<AsyncResult<LeadFormResponse>> handler);

    //lead_form_test/create
    void leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest, Handler<AsyncResult<LeadFormTestResponse>> handler);

    //lead_forms/list
    void leadFormsList(String adAccountId, Integer pageSize, String order, String bookmark, Handler<AsyncResult<LeadFormsList200Response>> handler);

}
