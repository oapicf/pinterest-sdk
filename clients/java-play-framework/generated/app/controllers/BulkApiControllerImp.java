package controllers;

import apimodels.BulkDownload;
import apimodels.BulkDownloadCreate;
import apimodels.BulkJobData;
import apimodels.BulkUpsertRequest;
import apimodels.BulkUpsertResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkApiControllerImp extends BulkApiControllerImpInterface {
    @Override
    public BulkDownload bulkDownloadCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BulkDownloadCreate bulkDownloadCreate) throws Exception {
        //Do your magic!!!
        return new BulkDownload();
    }

    @Override
    public BulkJobData bulkRequestGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bulkRequestId, Boolean includeDetails) throws Exception {
        //Do your magic!!!
        return new BulkJobData();
    }

    @Override
    public BulkUpsertResponse bulkUpsertCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BulkUpsertRequest bulkUpsertRequest) throws Exception {
        //Do your magic!!!
        return new BulkUpsertResponse();
    }

}
