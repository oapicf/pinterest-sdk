package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RelatedTerms;

public final class TermsApiException extends MainApiException {
    public TermsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final TermsApiException Terms_termsRelatedList_200_Exception = new TermsApiException(200, "Success");
    public static final TermsApiException Terms_termsRelatedList_400_Exception = new TermsApiException(400, "Invalid terms related parameters.");
    public static final TermsApiException Terms_termsSuggestedList_200_Exception = new TermsApiException(200, "Success");
    public static final TermsApiException Terms_termsSuggestedList_400_Exception = new TermsApiException(400, "Invalid terms suggested parameters.");
    

}