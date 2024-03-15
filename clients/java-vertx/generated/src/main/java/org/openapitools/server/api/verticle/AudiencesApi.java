package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Audience;
import org.openapitools.server.api.model.AudienceCreateCustomRequest;
import org.openapitools.server.api.model.AudienceCreateRequest;
import org.openapitools.server.api.model.AudienceUpdateRequest;
import org.openapitools.server.api.model.AudiencesList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AudiencesApi  {
    //audiences/create
    void audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest, Handler<AsyncResult<Audience>> handler);

    //audiences/create_custom
    void audiencesCreateCustom(String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest, Handler<AsyncResult<Audience>> handler);

    //audiences/get
    void audiencesGet(String adAccountId, String audienceId, Handler<AsyncResult<Audience>> handler);

    //audiences/list
    void audiencesList(String adAccountId, String bookmark, String order, Integer pageSize, String ownershipType, Handler<AsyncResult<AudiencesList200Response>> handler);

    //audiences/update
    void audiencesUpdate(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest, Handler<AsyncResult<Audience>> handler);

}
