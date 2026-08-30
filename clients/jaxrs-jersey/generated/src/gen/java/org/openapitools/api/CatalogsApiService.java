package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Catalog;
import org.openapitools.model.CatalogCreate;
import org.openapitools.model.CatalogsAvailableFilterValues;
import org.openapitools.model.CatalogsCreateReportResponse;
import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsFeedCreateRequestSchema;
import org.openapitools.model.CatalogsFeedIngestion;
import org.openapitools.model.CatalogsFeedUpdateRequestSchema;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsBatchPostRequest;
import org.openapitools.model.CatalogsItemsRequest;
import org.openapitools.model.CatalogsList200Response;
import org.openapitools.model.CatalogsListProductsByFilterRequest;
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInner;
import org.openapitools.model.CatalogsLocalStoresDelete200ResponseInner;
import org.openapitools.model.CatalogsLocalStoresList200Response;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.model.CatalogsProductGroupsCreateManyRequestItems;
import org.openapitools.model.CatalogsProductGroupsCreateRequestSchema;
import org.openapitools.model.CatalogsProductGroupsList200Response;
import org.openapitools.model.CatalogsProductGroupsUpdateRequestSchema;
import org.openapitools.model.CatalogsReport;
import org.openapitools.model.CatalogsReportParameters;
import org.openapitools.model.CatalogsReportStatsParameters;
import org.openapitools.model.CatalogsVerticalProductGroup;
import org.openapitools.model.Country;
import org.openapitools.model.FeedProcessingResultsList200Response;
import org.openapitools.model.FeedsList200Response;
import org.openapitools.model.ItemsIssuesList200Response;
import org.openapitools.model.ItemsPost200Response;
import org.openapitools.model.LocalInventoryItemsBatch;
import org.openapitools.model.LocalInventoryItemsBatchCreate;
import org.openapitools.model.LocalInventoryItemsGet;
import org.openapitools.model.LocalInventoryItemsGetCreate;
import org.openapitools.model.LocalStore;
import org.openapitools.model.LocalStoreBatchUpdate;
import org.openapitools.model.LocalStoreCreate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ReportsStats200Response;
import org.openapitools.model.SupplementalItemsBatchResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class CatalogsApiService {
    public abstract Response catalogsAvailableFilterValues( @NotNull  @Pattern(regexp="^\\d+$")String catalogId, @Pattern(regexp="^\\d+$")String feedId,Country country,CatalogsLocale language, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsCreate(CatalogCreate catalogCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsList( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsLocalInventoryItemsBatchOperate( @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId,LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsLocalInventoryItemsPost( @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId,LocalInventoryItemsGetCreate localInventoryItemsGetCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsLocalStoresCreate( @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId,List<@Valid LocalStoreCreate> localStoreCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsLocalStoresDelete( @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, @NotNull List<@Pattern(regexp = "^\\d+$")String> ids, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsLocalStoresList( @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId,List<@Pattern(regexp = "^\\d+$")String> ids, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsLocalStoresUpdate( @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId,List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupPinsList( @Pattern(regexp="^\\d+$")String productGroupId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean pinMetrics,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsCreate(CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsCreateMany(List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsDelete( @Pattern(regexp="^\\d+$")String productGroupId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsDeleteMany( @NotNull  @Size(min=1,max=1000)List<Integer> id, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsGet( @Pattern(regexp="^\\d+$")String productGroupId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsList( @Size(min=1,max=1000)List<Integer> id, @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$")String catalogId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsProductCountsGet( @Pattern(regexp="^\\d+$")String productGroupId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsUpdate( @Pattern(regexp="^\\d+$")String productGroupId,CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsSupplementalItemsBatchGet( @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, @Pattern(regexp="^\\d+$")String batchId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedProcessingResultsList( @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsCreate(CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsDelete( @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsGet( @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsIngest( @Pattern(regexp="^\\d+$")String feedId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsList( @Pattern(regexp="^\\d+$")String catalogId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsUpdate( @Pattern(regexp="^\\d+$")String feedId,CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsBatchGet( @Pattern(regexp="^\\d+$")String batchId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsBatchPost(CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsIssuesList( @Pattern(regexp="^\\d+$")String processingResultId,List<Integer> itemNumbers,CatalogsItemValidationIssue itemValidationIssue, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsPost(CatalogsItemsRequest catalogsItemsRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest,String bookmark, @Min(1) @Max(250)Integer pageSize, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean pinMetrics,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reportsCreate(CatalogsReportParameters catalogsReportParameters, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reportsGet( @NotNull String token, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reportsStats( @NotNull CatalogsReportStatsParameters parameters, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
}
