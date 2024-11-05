package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Catalog;
import org.openapitools.model.CatalogsCreateReportResponse;
import org.openapitools.model.CatalogsCreateRequest;
import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsFeedIngestion;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.CatalogsItems;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsFilters;
import org.openapitools.model.CatalogsItemsRequest;
import org.openapitools.model.CatalogsList200Response;
import org.openapitools.model.CatalogsListProductsByFilterRequest;
import org.openapitools.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.model.CatalogsProductGroupsList200Response;
import org.openapitools.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.model.CatalogsReport;
import org.openapitools.model.CatalogsReportParameters;
import org.openapitools.model.CatalogsVerticalProductGroup;
import org.openapitools.model.Error;
import org.openapitools.model.FeedProcessingResultsList200Response;
import org.openapitools.model.FeedsCreateRequest;
import org.openapitools.model.FeedsList200Response;
import org.openapitools.model.FeedsUpdateRequest;
import org.openapitools.model.ItemsBatchPostRequest;
import org.openapitools.model.ItemsIssuesList200Response;
import org.openapitools.model.MultipleProductGroupsInner;
import org.openapitools.model.ReportsStats200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class CatalogsApiService {
    public abstract Response catalogsCreate(CatalogsCreateRequest catalogsCreateRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsList(String bookmark, @Min(1) @Max(250)Integer pageSize, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupPinsList( @Pattern(regexp="^\\d+$")String productGroupId,String bookmark, @Min(1) @Max(250)Integer pageSize, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean pinMetrics,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsCreate(MultipleProductGroupsInner multipleProductGroupsInner, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsCreateMany(List<MultipleProductGroupsInner> multipleProductGroupsInner, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsDelete( @Pattern(regexp="^\\d+$")String productGroupId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsDeleteMany( @NotNull  @Size(min=1,max=1000)List<Integer> id, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsGet( @Pattern(regexp="^\\d+$")String productGroupId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsList( @Size(min=1,max=1000)List<Integer> id, @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$")String catalogId,String bookmark, @Min(1) @Max(250)Integer pageSize, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsProductCountsGet( @Pattern(regexp="^\\d+$")String productGroupId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsUpdate( @Pattern(regexp="^\\d+$")String productGroupId,CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedProcessingResultsList( @Pattern(regexp="^\\d+$")String feedId,String bookmark, @Min(1) @Max(250)Integer pageSize, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsCreate(FeedsCreateRequest feedsCreateRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsDelete( @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsGet( @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsIngest( @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsList(String bookmark, @Min(1) @Max(250)Integer pageSize, @Pattern(regexp="^\\d+$")String catalogId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsUpdate( @Pattern(regexp="^\\d+$")String feedId,FeedsUpdateRequest feedsUpdateRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsBatchGet(String batchId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsGet( @NotNull String country, @NotNull String language, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,List<String> itemIds,CatalogsItemsFilters filters,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsIssuesList( @Pattern(regexp="^\\d+$")String processingResultId,String bookmark, @Min(1) @Max(250)Integer pageSize,List<Integer> itemNumbers,CatalogsItemValidationIssue itemValidationIssue, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsPost(CatalogsItemsRequest catalogsItemsRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest,String bookmark, @Min(1) @Max(250)Integer pageSize, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean pinMetrics,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reportsCreate(CatalogsReportParameters catalogsReportParameters, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reportsGet( @NotNull String token, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reportsStats( @NotNull CatalogsReportParameters parameters, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Min(1) @Max(250)Integer pageSize,String bookmark,SecurityContext securityContext) throws NotFoundException;
}
