package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TermsOfService;

public final class TermsOfServiceApiException extends MainApiException {
    public TermsOfServiceApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final TermsOfServiceApiException TermsOfService_termsOfServiceGet_200_Exception = new TermsOfServiceApiException(200, "Success");
    

}