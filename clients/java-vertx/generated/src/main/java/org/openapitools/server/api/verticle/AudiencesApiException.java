package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Audience;
import org.openapitools.server.api.model.AudienceCreateCustomRequest;
import org.openapitools.server.api.model.AudienceCreateRequest;
import org.openapitools.server.api.model.AudienceUpdateRequest;
import org.openapitools.server.api.model.AudiencesList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class AudiencesApiException extends MainApiException {
    public AudiencesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AudiencesApiException Audiences_audiencesCreate_200_Exception = new AudiencesApiException(200, "Success");
    public static final AudiencesApiException Audiences_audiencesCreateCustom_200_Exception = new AudiencesApiException(200, "Success");
    public static final AudiencesApiException Audiences_audiencesGet_200_Exception = new AudiencesApiException(200, "Success");
    public static final AudiencesApiException Audiences_audiencesGet_404_Exception = new AudiencesApiException(404, "Audience not found.");
    public static final AudiencesApiException Audiences_audiencesList_200_Exception = new AudiencesApiException(200, "Success");
    public static final AudiencesApiException Audiences_audiencesList_400_Exception = new AudiencesApiException(400, "Invalid ad account audience parameters.");
    public static final AudiencesApiException Audiences_audiencesUpdate_200_Exception = new AudiencesApiException(200, "Success");
    

}