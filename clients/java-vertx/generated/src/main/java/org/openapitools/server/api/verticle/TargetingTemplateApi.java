package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TargetingTemplateCreate;
import org.openapitools.server.api.model.TargetingTemplateGetResponseData;
import org.openapitools.server.api.model.TargetingTemplateList200Response;
import org.openapitools.server.api.model.TargetingTemplateUpdateRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface TargetingTemplateApi  {
    //targeting_template/create
    void targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate, Handler<AsyncResult<TargetingTemplateGetResponseData>> handler);

    //targeting_template/list
    void targetingTemplateList(String adAccountId, String order, Boolean includeSizing, String searchQuery, Integer pageSize, String bookmark, Handler<AsyncResult<TargetingTemplateList200Response>> handler);

    //targeting_template/update
    void targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest, Handler<AsyncResult<Void>> handler);

}
