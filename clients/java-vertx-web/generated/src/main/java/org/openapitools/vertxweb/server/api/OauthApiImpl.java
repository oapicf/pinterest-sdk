package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.OauthAccessTokenResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class OauthApiImpl implements OauthApi {
    public Future<ApiResponse<OauthAccessTokenResponse>> oauthToken(JsonObject formBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
