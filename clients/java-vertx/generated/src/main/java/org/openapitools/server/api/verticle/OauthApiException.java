package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OauthAccessTokenResponse;

public final class OauthApiException extends MainApiException {
    public OauthApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OauthApiException Oauth_oauthToken_200_Exception = new OauthApiException(200, "response");
    

}