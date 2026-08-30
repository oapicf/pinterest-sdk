package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ConversionAccessToken;
import org.openapitools.vertxweb.server.model.OauthAccessToken;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.TokenGrantType;
import org.openapitools.vertxweb.server.model.TokenTypeHint;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface OauthApi  {
    Future<ApiResponse<ConversionAccessToken>> oauthConversionToken();
    Future<ApiResponse<OauthAccessToken>> oauthToken(JsonObject formBody);
    Future<ApiResponse<Void>> tokenRevoke(JsonObject formBody);
}
