package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.LeadFormArrayResponse;
import org.openapitools.server.api.model.LeadFormCreateRequest;
import org.openapitools.server.api.model.LeadFormResponse;
import org.openapitools.server.api.model.LeadFormTestRequest;
import org.openapitools.server.api.model.LeadFormTestResponse;
import org.openapitools.server.api.model.LeadFormUpdateRequest;
import org.openapitools.server.api.model.LeadFormsList200Response;
import org.openapitools.server.api.MainApiException;

public final class LeadFormsApiException extends MainApiException {
    public LeadFormsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final LeadFormsApiException LeadForms_leadFormGet_200_Exception = new LeadFormsApiException(200, "Success");
    public static final LeadFormsApiException LeadForms_leadFormGet_400_Exception = new LeadFormsApiException(400, "Invalid ad account lead forms parameters.");
    public static final LeadFormsApiException LeadForms_leadFormGet_404_Exception = new LeadFormsApiException(404, "The lead form ID for the given ad account ID does not exist.");
    public static final LeadFormsApiException LeadForms_leadFormTestCreate_200_Exception = new LeadFormsApiException(200, "Success");
    public static final LeadFormsApiException LeadForms_leadFormTestCreate_400_Exception = new LeadFormsApiException(400, "Invalid parameters.");
    public static final LeadFormsApiException LeadForms_leadFormTestCreate_404_Exception = new LeadFormsApiException(404, "Lead not found.");
    public static final LeadFormsApiException LeadForms_leadFormsCreate_200_Exception = new LeadFormsApiException(200, "Success");
    public static final LeadFormsApiException LeadForms_leadFormsCreate_400_Exception = new LeadFormsApiException(400, "Invalid ad account lead forms parameters.");
    public static final LeadFormsApiException LeadForms_leadFormsList_200_Exception = new LeadFormsApiException(200, "Success");
    public static final LeadFormsApiException LeadForms_leadFormsList_400_Exception = new LeadFormsApiException(400, "Invalid ad account lead forms parameters.");
    public static final LeadFormsApiException LeadForms_leadFormsUpdate_200_Exception = new LeadFormsApiException(200, "Success");
    public static final LeadFormsApiException LeadForms_leadFormsUpdate_400_Exception = new LeadFormsApiException(400, "Invalid ad account lead forms parameters.");
    

}