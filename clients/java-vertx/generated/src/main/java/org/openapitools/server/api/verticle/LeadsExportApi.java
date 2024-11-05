package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.LeadsExportCreateRequest;
import org.openapitools.server.api.model.LeadsExportCreateResponse;
import org.openapitools.server.api.model.LeadsExportResponseData;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface LeadsExportApi  {
    //leads_export/create
    void leadsExportCreate(String adAccountId, LeadsExportCreateRequest leadsExportCreateRequest, Handler<AsyncResult<LeadsExportCreateResponse>> handler);

    //leads_export/get
    void leadsExportGet(String adAccountId, String leadsExportId, Handler<AsyncResult<LeadsExportResponseData>> handler);

}
