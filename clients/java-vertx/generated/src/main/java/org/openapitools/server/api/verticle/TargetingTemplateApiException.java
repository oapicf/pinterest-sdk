package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TargetingTemplateCreate;
import org.openapitools.server.api.model.TargetingTemplateGetResponseData;
import org.openapitools.server.api.model.TargetingTemplateList200Response;
import org.openapitools.server.api.model.TargetingTemplateUpdateRequest;

public final class TargetingTemplateApiException extends MainApiException {
    public TargetingTemplateApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final TargetingTemplateApiException TargetingTemplate_targetingTemplateCreate_200_Exception = new TargetingTemplateApiException(200, "Success");
    public static final TargetingTemplateApiException TargetingTemplate_targetingTemplateCreate_400_Exception = new TargetingTemplateApiException(400, "Invalid ad account id.");
    public static final TargetingTemplateApiException TargetingTemplate_targetingTemplateList_200_Exception = new TargetingTemplateApiException(200, "Success");
    public static final TargetingTemplateApiException TargetingTemplate_targetingTemplateList_400_Exception = new TargetingTemplateApiException(400, "Invalid ad account id.");
    public static final TargetingTemplateApiException TargetingTemplate_targetingTemplateUpdate_200_Exception = new TargetingTemplateApiException(200, "Success");
    public static final TargetingTemplateApiException TargetingTemplate_targetingTemplateUpdate_400_Exception = new TargetingTemplateApiException(400, "Invalid ad account id.");
    

}