package controllers;

import apimodels.Error;
import apimodels.TargetingTemplateCreate;
import apimodels.TargetingTemplateGetResponseData;
import apimodels.TargetingTemplateList200Response;
import apimodels.TargetingTemplateUpdateRequest;

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
public class TargetingTemplateApiControllerImp extends TargetingTemplateApiControllerImpInterface {
    @Override
    public TargetingTemplateGetResponseData targetingTemplateCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, TargetingTemplateCreate targetingTemplateCreate) throws Exception {
        //Do your magic!!!
        return new TargetingTemplateGetResponseData();
    }

    @Override
    public TargetingTemplateList200Response targetingTemplateList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String order, Boolean includeSizing, String searchQuery,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new TargetingTemplateList200Response();
    }

    @Override
    public void targetingTemplateUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest) throws Exception {
        //Do your magic!!!
    }

}
