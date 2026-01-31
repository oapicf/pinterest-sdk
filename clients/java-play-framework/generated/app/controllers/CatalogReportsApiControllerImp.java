package controllers;

import apimodels.CatalogsCreateReportResponse;
import apimodels.CatalogsReport;
import apimodels.CatalogsReportParameters;
import apimodels.Error;
import apimodels.ReportsStats200Response;
import apimodels.ReportsStatsParametersParameter;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogReportsApiControllerImp extends CatalogReportsApiControllerImpInterface {
    @Override
    public CatalogsCreateReportResponse reportsCreate(Http.Request request, CatalogsReportParameters catalogsReportParameters,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsCreateReportResponse();
    }

    @Override
    public CatalogsReport reportsGet(Http.Request request, @NotNull String token,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsReport();
    }

    @Override
    public ReportsStats200Response reportsStats(Http.Request request, @NotNull ReportsStatsParametersParameter parameters,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new ReportsStats200Response();
    }

}
