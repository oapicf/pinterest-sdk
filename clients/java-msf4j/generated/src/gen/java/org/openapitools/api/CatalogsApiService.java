package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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
import java.util.List;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class CatalogsApiService {
    public abstract Response catalogsAvailableFilterValues(String catalogId
 ,String feedId
 ,Country country
 ,CatalogsLocale language
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsCreate(CatalogCreate catalogCreate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsList(String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response catalogsLocalInventoryItemsBatchOperate(String catalogId
 ,LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsLocalInventoryItemsPost(String catalogId
 ,LocalInventoryItemsGetCreate localInventoryItemsGetCreate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsLocalStoresCreate(String catalogId
 ,List<@Valid LocalStoreCreate> localStoreCreate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsLocalStoresDelete(String catalogId
 ,List<@Pattern(regexp = "^\\d+$")String> ids
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsLocalStoresList(String catalogId
 ,List<@Pattern(regexp = "^\\d+$")String> ids
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response catalogsLocalStoresUpdate(String catalogId
 ,List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupPinsList(String productGroupId
 ,String adAccountId
 ,Boolean pinMetrics
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsCreate(CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsCreateMany(List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsDelete(String productGroupId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsDeleteMany(List<Integer> id
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsGet(String productGroupId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsList(List<Integer> id
 ,String feedId
 ,String catalogId
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsProductCountsGet(String productGroupId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsUpdate(String productGroupId
 ,CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsSupplementalItemsBatchGet(String catalogId
 ,String batchId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedProcessingResultsList(String feedId
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response feedsCreate(CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsDelete(String feedId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsGet(String feedId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsIngest(String feedId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsList(String catalogId
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response feedsUpdate(String feedId
 ,CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response itemsBatchGet(String batchId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response itemsBatchPost(CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response itemsIssuesList(String processingResultId
 ,List<Integer> itemNumbers
 ,CatalogsItemValidationIssue itemValidationIssue
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response itemsPost(CatalogsItemsRequest catalogsItemsRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest
 ,String bookmark
 ,Integer pageSize
 ,String adAccountId
 ,Boolean pinMetrics
 ) throws NotFoundException;
    public abstract Response reportsCreate(CatalogsReportParameters catalogsReportParameters
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response reportsGet(String token
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response reportsStats(CatalogsReportStatsParameters parameters
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
}
