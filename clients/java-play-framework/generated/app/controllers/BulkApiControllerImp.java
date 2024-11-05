package controllers;

import apimodels.BulkDownloadRequest;
import apimodels.BulkDownloadResponse;
import apimodels.BulkUpsertRequest;
import apimodels.BulkUpsertResponse;
import apimodels.BulkUpsertStatusResponse;
import apimodels.Error;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BulkApiControllerImp extends BulkApiControllerImpInterface {
    @Override
    public BulkDownloadResponse bulkDownloadCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BulkDownloadRequest bulkDownloadRequest) throws Exception {
        //Do your magic!!!
        return new BulkDownloadResponse();
    }

    @Override
    public BulkUpsertStatusResponse bulkRequestGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bulkRequestId, Boolean includeDetails) throws Exception {
        //Do your magic!!!
        return new BulkUpsertStatusResponse();
    }

    @Override
    public BulkUpsertResponse bulkUpsertCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BulkUpsertRequest bulkUpsertRequest) throws Exception {
        //Do your magic!!!
        return new BulkUpsertResponse();
    }

}
