package controllers;

import apimodels.CatalogsListProductsByFilterRequest;
import apimodels.CatalogsProductGroupPinsList200Response;
import apimodels.CatalogsProductGroupProductCountsVertical;
import apimodels.CatalogsProductGroupsList200Response;
import apimodels.CatalogsProductGroupsUpdateRequest;
import apimodels.CatalogsVerticalProductGroup;
import apimodels.Error;
import apimodels.MultipleProductGroupsInner;

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
public class CatalogProductGroupsApiControllerImp extends CatalogProductGroupsApiControllerImpInterface {
    @Override
    public CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupPinsList200Response();
    }

    @Override
    public CatalogsVerticalProductGroup catalogsProductGroupsCreate(Http.Request request, MultipleProductGroupsInner multipleProductGroupsInner,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsVerticalProductGroup();
    }

    @Override
    public List<String> catalogsProductGroupsCreateMany(Http.Request request, List<MultipleProductGroupsInner> multipleProductGroupsInner,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new ArrayList<String>();
    }

    @Override
    public void catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void catalogsProductGroupsDeleteMany(Http.Request request, @NotNull  @Size(min=1,max=1000)List<Integer> id,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public CatalogsVerticalProductGroup catalogsProductGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsVerticalProductGroup();
    }

    @Override
    public CatalogsProductGroupsList200Response catalogsProductGroupsList(Http.Request request,  @Size(min=1,max=1000)List<Integer> id,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$")String catalogId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupsList200Response();
    }

    @Override
    public CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupProductCountsVertical();
    }

    @Override
    public CatalogsVerticalProductGroup catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsVerticalProductGroup();
    }

    @Override
    public CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(Http.Request request, CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupPinsList200Response();
    }

}
