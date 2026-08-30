package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionAccessToken;
import org.openapitools.vertxweb.server.model.OauthAccessToken;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.TokenGrantType;
import org.openapitools.vertxweb.server.model.TokenTypeHint;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class OauthApiImpl implements OauthApi {
    public Future<ApiResponse<ConversionAccessToken>> oauthConversionToken() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<OauthAccessToken>> oauthToken(JsonObject formBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> tokenRevoke(JsonObject formBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
