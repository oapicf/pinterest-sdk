package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AudienceDefinitionResponse;
import org.openapitools.server.api.model.AudienceInsightType;
import org.openapitools.server.api.model.AudienceInsightsResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class AudienceInsightsApiException extends MainApiException {
    public AudienceInsightsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AudienceInsightsApiException AudienceInsights_audienceInsightsGet_200_Exception = new AudienceInsightsApiException(200, "Success");
    public static final AudienceInsightsApiException AudienceInsights_audienceInsightsScopeAndTypeGet_200_Exception = new AudienceInsightsApiException(200, "Success");
    

}