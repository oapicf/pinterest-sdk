package controllers;

import apimodels.LeadForm;
import apimodels.LeadFormBatchUpdate;
import apimodels.LeadFormCreate;
import apimodels.LeadFormTest;
import apimodels.LeadFormTestCreate;
import apimodels.LeadFormsCreate200Response;
import apimodels.LeadFormsList200Response;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;

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
public class LeadFormsApiControllerImp extends LeadFormsApiControllerImpInterface {
    @Override
    public LeadForm leadFormGet(Http.Request request,  @Pattern(regexp="^\\d+$")String leadFormId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new LeadForm();
    }

    @Override
    public LeadFormTest leadFormTestCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String leadFormId, LeadFormTestCreate leadFormTestCreate) throws Exception {
        //Do your magic!!!
        return new LeadFormTest();
    }

    @Override
    public LeadFormsCreate200Response leadFormsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid LeadFormCreate> leadFormCreate) throws Exception {
        //Do your magic!!!
        return new LeadFormsCreate200Response();
    }

    @Override
    public LeadFormsList200Response leadFormsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception {
        //Do your magic!!!
        return new LeadFormsList200Response();
    }

    @Override
    public LeadFormsCreate200Response leadFormsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid LeadFormBatchUpdate> leadFormBatchUpdate) throws Exception {
        //Do your magic!!!
        return new LeadFormsCreate200Response();
    }

}
