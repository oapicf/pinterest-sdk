package controllers;

import apimodels.CatalogsFeed;
import apimodels.CatalogsItemValidationIssue;
import apimodels.CatalogsItems;
import apimodels.CatalogsItemsBatch;
import apimodels.CatalogsItemsFilters;
import apimodels.CatalogsList200Response;
import apimodels.CatalogsListProductsByFilterRequest;
import apimodels.CatalogsProductGroupPinsList200Response;
import apimodels.CatalogsProductGroupProductCounts;
import apimodels.CatalogsProductGroupsCreate201Response;
import apimodels.CatalogsProductGroupsCreateRequest;
import apimodels.CatalogsProductGroupsList200Response;
import apimodels.CatalogsProductGroupsUpdateRequest;
import apimodels.Error;
import apimodels.FeedProcessingResultsList200Response;
import apimodels.FeedsCreateRequest;
import apimodels.FeedsList200Response;
import apimodels.FeedsUpdateRequest;
import apimodels.ItemsBatchPostRequest;
import apimodels.ItemsIssuesList200Response;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsApiControllerImp extends CatalogsApiControllerImpInterface {
    @Override
    public CatalogsList200Response catalogsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsList200Response();
    }

    @Override
    public CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupPinsList200Response();
    }

    @Override
    public CatalogsProductGroupsCreate201Response catalogsProductGroupsCreate(Http.Request request, CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupsCreate201Response();
    }

    @Override
    public void catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public CatalogsProductGroupsCreate201Response catalogsProductGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupsCreate201Response();
    }

    @Override
    public CatalogsProductGroupsList200Response catalogsProductGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$")String catalogId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupsList200Response();
    }

    @Override
    public CatalogsProductGroupProductCounts catalogsProductGroupsProductCountsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupProductCounts();
    }

    @Override
    public CatalogsProductGroupsCreate201Response catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupsCreate201Response();
    }

    @Override
    public FeedProcessingResultsList200Response feedProcessingResultsList(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new FeedProcessingResultsList200Response();
    }

    @Override
    public CatalogsFeed feedsCreate(Http.Request request, FeedsCreateRequest feedsCreateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsFeed();
    }

    @Override
    public void feedsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public CatalogsFeed feedsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsFeed();
    }

    @Override
    public FeedsList200Response feedsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$")String catalogId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new FeedsList200Response();
    }

    @Override
    public CatalogsFeed feedsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, FeedsUpdateRequest feedsUpdateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsFeed();
    }

    @Override
    public CatalogsItemsBatch itemsBatchGet(Http.Request request, String batchId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsItemsBatch();
    }

    @Override
    public CatalogsItemsBatch itemsBatchPost(Http.Request request, ItemsBatchPostRequest itemsBatchPostRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsItemsBatch();
    }

    @Override
    public CatalogsItems itemsGet(Http.Request request, @NotNull String country, @NotNull String language,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<String> itemIds, CatalogsItemsFilters filters) throws Exception {
        //Do your magic!!!
        return new CatalogsItems();
    }

    @Override
    public ItemsIssuesList200Response itemsIssuesList(Http.Request request,  @Pattern(regexp="^\\d+$")String processingResultId, String bookmark,  @Min(1) @Max(250)Integer pageSize, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new ItemsIssuesList200Response();
    }

    @Override
    public CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(Http.Request request, CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupPinsList200Response();
    }

}
