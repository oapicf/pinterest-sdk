package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DetailedError;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.IntegrationLogsRequest;
import org.openapitools.server.api.model.IntegrationLogsSuccessResponse;
import org.openapitools.server.api.model.IntegrationMetadata;
import org.openapitools.server.api.model.IntegrationRecord;
import org.openapitools.server.api.model.IntegrationRequest;
import org.openapitools.server.api.model.IntegrationRequestPatch;
import org.openapitools.server.api.model.IntegrationsGetList200Response;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface IntegrationsApi  {
    //integrations_commerce/del
    void integrationsCommerceDel(String externalBusinessId, Handler<AsyncResult<Void>> handler);

    //integrations_commerce/get
    void integrationsCommerceGet(String externalBusinessId, Handler<AsyncResult<IntegrationMetadata>> handler);

    //integrations_commerce/patch
    void integrationsCommercePatch(String externalBusinessId, IntegrationRequestPatch integrationRequestPatch, Handler<AsyncResult<IntegrationMetadata>> handler);

    //integrations_commerce/post
    void integrationsCommercePost(IntegrationRequest integrationRequest, Handler<AsyncResult<IntegrationMetadata>> handler);

    //integrations/get_by_id
    void integrationsGetById(String id, Handler<AsyncResult<IntegrationRecord>> handler);

    //integrations/get_list
    void integrationsGetList(String bookmark, Integer pageSize, Handler<AsyncResult<IntegrationsGetList200Response>> handler);

    //integrations_logs/post
    void integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest, Handler<AsyncResult<IntegrationLogsSuccessResponse>> handler);

}
