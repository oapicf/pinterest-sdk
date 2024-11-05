package controllers;

import apimodels.Error;
import apimodels.LeadFormArrayResponse;
import apimodels.LeadFormCreateRequest;
import apimodels.LeadFormResponse;
import apimodels.LeadFormTestRequest;
import apimodels.LeadFormTestResponse;
import apimodels.LeadFormUpdateRequest;
import apimodels.LeadFormsList200Response;

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
public class LeadFormsApiControllerImp extends LeadFormsApiControllerImpInterface {
    @Override
    public LeadFormResponse leadFormGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String leadFormId) throws Exception {
        //Do your magic!!!
        return new LeadFormResponse();
    }

    @Override
    public LeadFormTestResponse leadFormTestCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$")String leadFormId, LeadFormTestRequest leadFormTestRequest) throws Exception {
        //Do your magic!!!
        return new LeadFormTestResponse();
    }

    @Override
    public LeadFormArrayResponse leadFormsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid LeadFormCreateRequest> leadFormCreateRequest) throws Exception {
        //Do your magic!!!
        return new LeadFormArrayResponse();
    }

    @Override
    public LeadFormsList200Response leadFormsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new LeadFormsList200Response();
    }

    @Override
    public LeadFormArrayResponse leadFormsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid LeadFormUpdateRequest> leadFormUpdateRequest) throws Exception {
        //Do your magic!!!
        return new LeadFormArrayResponse();
    }

}
