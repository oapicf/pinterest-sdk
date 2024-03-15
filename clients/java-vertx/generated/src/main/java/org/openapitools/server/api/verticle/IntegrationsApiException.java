package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DetailedError;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.IntegrationLogsRequest;
import org.openapitools.server.api.model.IntegrationLogsSuccessResponse;
import org.openapitools.server.api.model.IntegrationMetadata;
import org.openapitools.server.api.model.IntegrationRecord;
import org.openapitools.server.api.model.IntegrationRequest;
import org.openapitools.server.api.model.IntegrationRequestPatch;
import org.openapitools.server.api.model.IntegrationsGetList200Response;
import org.openapitools.server.api.MainApiException;

public final class IntegrationsApiException extends MainApiException {
    public IntegrationsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final IntegrationsApiException Integrations_integrationsCommerceDel_204_Exception = new IntegrationsApiException(204, "Commerce Integration deleted successfully");
    public static final IntegrationsApiException Integrations_integrationsCommerceGet_200_Exception = new IntegrationsApiException(200, "Success");
    public static final IntegrationsApiException Integrations_integrationsCommerceGet_404_Exception = new IntegrationsApiException(404, "Integration not found.");
    public static final IntegrationsApiException Integrations_integrationsCommerceGet_409_Exception = new IntegrationsApiException(409, "Can't access this integration metadata.");
    public static final IntegrationsApiException Integrations_integrationsCommercePatch_200_Exception = new IntegrationsApiException(200, "Success");
    public static final IntegrationsApiException Integrations_integrationsCommercePatch_404_Exception = new IntegrationsApiException(404, "Integration not found.");
    public static final IntegrationsApiException Integrations_integrationsCommercePatch_409_Exception = new IntegrationsApiException(409, "Can't access this integration metadata.");
    public static final IntegrationsApiException Integrations_integrationsCommercePost_200_Exception = new IntegrationsApiException(200, "Success");
    public static final IntegrationsApiException Integrations_integrationsCommercePost_404_Exception = new IntegrationsApiException(404, "Integration not found.");
    public static final IntegrationsApiException Integrations_integrationsCommercePost_409_Exception = new IntegrationsApiException(409, "Can't access this integration metadata.");
    public static final IntegrationsApiException Integrations_integrationsGetById_200_Exception = new IntegrationsApiException(200, "Success");
    public static final IntegrationsApiException Integrations_integrationsGetById_404_Exception = new IntegrationsApiException(404, "Integration not found.");
    public static final IntegrationsApiException Integrations_integrationsGetList_200_Exception = new IntegrationsApiException(200, "Success");
    public static final IntegrationsApiException Integrations_integrationsLogsPost_200_Exception = new IntegrationsApiException(200, "Success.");
    public static final IntegrationsApiException Integrations_integrationsLogsPost_400_Exception = new IntegrationsApiException(400, "Bad request.");
    

}