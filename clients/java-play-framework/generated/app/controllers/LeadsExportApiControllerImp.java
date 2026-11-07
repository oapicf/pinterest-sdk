package controllers;

import apimodels.LeadsExportResponseData;
import apimodels.LeadsExports;
import apimodels.LeadsExportsCreate;
import apimodels.PinterestLibError;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-07T04:05:46.315568162Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LeadsExportApiControllerImp extends LeadsExportApiControllerImpInterface {
    @Override
    public LeadsExports leadsExportCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, LeadsExportsCreate leadsExportsCreate) throws Exception {
        //Do your magic!!!
        return new LeadsExports();
    }

    @Override
    public LeadsExportResponseData leadsExportGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String leadsExportId) throws Exception {
        //Do your magic!!!
        return new LeadsExportResponseData();
    }

}
