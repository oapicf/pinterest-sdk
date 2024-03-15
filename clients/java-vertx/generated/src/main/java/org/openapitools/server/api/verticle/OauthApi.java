package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OauthAccessTokenResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OauthApi  {
    //oauth/token
    void oauthToken(String grantType, Handler<AsyncResult<OauthAccessTokenResponse>> handler);

}
