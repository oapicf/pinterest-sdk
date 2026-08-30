package controllers;

import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.TargetingTemplate;
import apimodels.TargetingTemplateCreate;
import apimodels.TargetingTemplateList200Response;
import apimodels.TargetingTemplateUpdateRequestReadOrUpdate;

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
public class TargetingTemplateApiControllerImp extends TargetingTemplateApiControllerImpInterface {
    @Override
    public TargetingTemplate targetingTemplateCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, TargetingTemplateCreate targetingTemplateCreate) throws Exception {
        //Do your magic!!!
        return new TargetingTemplate();
    }

    @Override
    public TargetingTemplateList200Response targetingTemplateList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery) throws Exception {
        //Do your magic!!!
        return new TargetingTemplateList200Response();
    }

    @Override
    public void targetingTemplateUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate) throws Exception {
        //Do your magic!!!
    }

}
