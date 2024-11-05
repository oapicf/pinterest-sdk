package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.LeadsExportCreateRequest;
import org.openapitools.server.api.model.LeadsExportCreateResponse;
import org.openapitools.server.api.model.LeadsExportResponseData;
import org.openapitools.server.api.MainApiException;

public final class LeadsExportApiException extends MainApiException {
    public LeadsExportApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final LeadsExportApiException LeadsExport_leadsExportCreate_200_Exception = new LeadsExportApiException(200, "Success");
    public static final LeadsExportApiException LeadsExport_leadsExportCreate_400_Exception = new LeadsExportApiException(400, "Invalid ad account parameter.");
    public static final LeadsExportApiException LeadsExport_leadsExportGet_200_Exception = new LeadsExportApiException(200, "Success");
    public static final LeadsExportApiException LeadsExport_leadsExportGet_400_Exception = new LeadsExportApiException(400, "Invalid ad account parameter.");
    public static final LeadsExportApiException LeadsExport_leadsExportGet_404_Exception = new LeadsExportApiException(404, "Invalid leads export id parameter.");
    

}