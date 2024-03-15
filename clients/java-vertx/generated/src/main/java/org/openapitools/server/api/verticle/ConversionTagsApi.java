package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ConversionEventResponse;
import org.openapitools.server.api.model.ConversionTagCreate;
import org.openapitools.server.api.model.ConversionTagListResponse;
import org.openapitools.server.api.model.ConversionTagResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PageVisitConversionTagsGet200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ConversionTagsApi  {
    //conversion_tags/create
    void conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate, Handler<AsyncResult<ConversionTagResponse>> handler);

    //conversion_tags/get
    void conversionTagsGet(String adAccountId, String conversionTagId, Handler<AsyncResult<ConversionTagResponse>> handler);

    //conversion_tags/list
    void conversionTagsList(String adAccountId, Boolean filterDeleted, Handler<AsyncResult<ConversionTagListResponse>> handler);

    //ocpm_eligible_conversion_tags/get
    void ocpmEligibleConversionTagsGet(String adAccountId, Handler<AsyncResult<Map<String, List<ConversionEventResponse>>>> handler);

    //page_visit_conversion_tags/get
    void pageVisitConversionTagsGet(String adAccountId, Integer pageSize, String order, String bookmark, Handler<AsyncResult<PageVisitConversionTagsGet200Response>> handler);

}
