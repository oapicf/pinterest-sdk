package controllers;

import apimodels.Catalog;
import apimodels.CatalogsCreateReportResponse;
import apimodels.CatalogsCreateRequest;
import apimodels.CatalogsFeed;
import apimodels.CatalogsFeedIngestion;
import apimodels.CatalogsItemValidationIssue;
import apimodels.CatalogsItems;
import apimodels.CatalogsItemsBatch;
import apimodels.CatalogsItemsFilters;
import apimodels.CatalogsItemsRequest;
import apimodels.CatalogsList200Response;
import apimodels.CatalogsListProductsByFilterRequest;
import apimodels.CatalogsProductGroupPinsList200Response;
import apimodels.CatalogsProductGroupProductCountsVertical;
import apimodels.CatalogsProductGroupsList200Response;
import apimodels.CatalogsProductGroupsUpdateRequest;
import apimodels.CatalogsReport;
import apimodels.CatalogsReportParameters;
import apimodels.CatalogsVerticalProductGroup;
import apimodels.Error;
import apimodels.FeedProcessingResultsList200Response;
import apimodels.FeedsCreateRequest;
import apimodels.FeedsList200Response;
import apimodels.FeedsUpdateRequest;
import apimodels.ItemsBatchPostRequest;
import apimodels.ItemsIssuesList200Response;
import apimodels.MultipleProductGroupsInner;
import apimodels.ReportsStats200Response;

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
public class CatalogsApiControllerImp extends CatalogsApiControllerImpInterface {
    @Override
    public Catalog catalogsCreate(Http.Request request, CatalogsCreateRequest catalogsCreateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Catalog();
    }

    @Override
    public CatalogsList200Response catalogsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsList200Response();
    }

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
    public CatalogsFeedIngestion feedsIngest(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsFeedIngestion();
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
    public CatalogsItems itemsPost(Http.Request request, CatalogsItemsRequest catalogsItemsRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsItems();
    }

    @Override
    public CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(Http.Request request, CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroupPinsList200Response();
    }

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
    public ReportsStats200Response reportsStats(Http.Request request, @NotNull CatalogsReportParameters parameters,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new ReportsStats200Response();
    }

}
