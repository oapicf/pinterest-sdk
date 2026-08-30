package org.openapitools.api.consumer;

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
import org.openapitools.model.*;
import org.openapitools.api.interfaces.CatalogsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/catalogs")
public class CatalogsServiceController {

    @DubboReference
    private CatalogsService catalogsService;

    @RequestMapping(method = RequestMethod.GET, value = "/available_filter_values")
    public CatalogsAvailableFilterValues catalogsAvailableFilterValues(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "feedId") String feedId,
        @RequestParam(name = "country") Country country,
        @RequestParam(name = "language") CatalogsLocale language,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsAvailableFilterValues(catalogId, feedId, country, language, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Catalog catalogsCreate(
        @RequestParam(name = "catalogCreate") CatalogCreate catalogCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsCreate(catalogCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public CatalogsList200Response catalogsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return catalogsService.catalogsList(adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{catalog_id}/local_inventory_items/batch")
    public SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatchOperate(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "localInventoryItemsBatchCreate") LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{catalog_id}/local_inventory_items/query")
    public LocalInventoryItemsGet catalogsLocalInventoryItemsPost(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "localInventoryItemsGetCreate") LocalInventoryItemsGetCreate localInventoryItemsGetCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{catalog_id}/local_stores")
    public List<CatalogsLocalStoresCreate200ResponseInner> catalogsLocalStoresCreate(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "localStoreCreate") List<LocalStoreCreate> localStoreCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{catalog_id}/local_stores")
    public List<CatalogsLocalStoresDelete200ResponseInner> catalogsLocalStoresDelete(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "ids") List<String> ids,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsLocalStoresDelete(catalogId, ids, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{catalog_id}/local_stores")
    public CatalogsLocalStoresList200Response catalogsLocalStoresList(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "ids") List<String> ids,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return catalogsService.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{catalog_id}/local_stores")
    public List<CatalogsLocalStoresCreate200ResponseInner> catalogsLocalStoresUpdate(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "localStoreBatchUpdate") List<LocalStoreBatchUpdate> localStoreBatchUpdate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product_groups/{product_group_id}/products")
    public CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(
        @RequestParam(name = "productGroupId") String productGroupId,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "pinMetrics", defaultValue = "false") Boolean pinMetrics,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return catalogsService.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/product_groups")
    public CatalogsVerticalProductGroup catalogsProductGroupsCreate(
        @RequestParam(name = "catalogsProductGroupsCreateRequestSchema") CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/product_groups/multiple")
    public List<String> catalogsProductGroupsCreateMany(
        @RequestParam(name = "catalogsProductGroupsCreateManyRequestItems") List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/product_groups/{product_group_id}")
    public CatalogsVerticalProductGroup catalogsProductGroupsDelete(
        @RequestParam(name = "productGroupId") String productGroupId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsProductGroupsDelete(productGroupId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/product_groups/multiple")
    public void catalogsProductGroupsDeleteMany(
        @RequestParam(name = "id") List<Integer> id,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        catalogsService.catalogsProductGroupsDeleteMany(id, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product_groups/{product_group_id}")
    public CatalogsVerticalProductGroup catalogsProductGroupsGet(
        @RequestParam(name = "productGroupId") String productGroupId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsProductGroupsGet(productGroupId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product_groups")
    public CatalogsProductGroupsList200Response catalogsProductGroupsList(
        @RequestParam(name = "id") List<Integer> id,
        @RequestParam(name = "feedId") String feedId,
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return catalogsService.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product_groups/{product_group_id}/product_counts")
    public CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet(
        @RequestParam(name = "productGroupId") String productGroupId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/product_groups/{product_group_id}")
    public CatalogsVerticalProductGroup catalogsProductGroupsUpdate(
        @RequestParam(name = "productGroupId") String productGroupId,
        @RequestParam(name = "catalogsProductGroupsUpdateRequestSchema") CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{catalog_id}/supplemental_items/batch/{batch_id}")
    public SupplementalItemsBatchResponse catalogsSupplementalItemsBatchGet(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "batchId") String batchId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/feeds/{feed_id}/processing_results")
    public FeedProcessingResultsList200Response feedProcessingResultsList(
        @RequestParam(name = "feedId") String feedId,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return catalogsService.feedProcessingResultsList(feedId, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/feeds")
    public CatalogsFeed feedsCreate(
        @RequestParam(name = "catalogsFeedCreateRequestSchema") CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.feedsCreate(catalogsFeedCreateRequestSchema, adAccountId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/feeds/{feed_id}")
    public CatalogsFeed feedsDelete(
        @RequestParam(name = "feedId") String feedId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.feedsDelete(feedId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/feeds/{feed_id}")
    public CatalogsFeed feedsGet(
        @RequestParam(name = "feedId") String feedId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.feedsGet(feedId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/feeds/{feed_id}/ingest")
    public CatalogsFeedIngestion feedsIngest(
        @RequestParam(name = "feedId") String feedId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.feedsIngest(feedId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/feeds")
    public FeedsList200Response feedsList(
        @RequestParam(name = "catalogId") String catalogId,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return catalogsService.feedsList(catalogId, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/feeds/{feed_id}")
    public CatalogsFeed feedsUpdate(
        @RequestParam(name = "feedId") String feedId,
        @RequestParam(name = "catalogsFeedUpdateRequestSchema") CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.feedsUpdate(feedId, catalogsFeedUpdateRequestSchema, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/items/batch/{batch_id}")
    public CatalogsItemsBatch itemsBatchGet(
        @RequestParam(name = "batchId") String batchId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.itemsBatchGet(batchId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items/batch")
    public CatalogsItemsBatch itemsBatchPost(
        @RequestParam(name = "catalogsItemsBatchPostRequest") CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/processing_results/{processing_result_id}/item_issues")
    public ItemsIssuesList200Response itemsIssuesList(
        @RequestParam(name = "processingResultId") String processingResultId,
        @RequestParam(name = "itemNumbers") List<Integer> itemNumbers,
        @RequestParam(name = "itemValidationIssue") CatalogsItemValidationIssue itemValidationIssue,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return catalogsService.itemsIssuesList(processingResultId, itemNumbers, itemValidationIssue, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items")
    public ItemsPost200Response itemsPost(
        @RequestParam(name = "catalogsItemsRequest") CatalogsItemsRequest catalogsItemsRequest,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.itemsPost(catalogsItemsRequest, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products/get_by_product_group_filters")
    public CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(
        @RequestParam(name = "catalogsListProductsByFilterRequest") CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "pinMetrics", defaultValue = "false") Boolean pinMetrics
    ) {
        return catalogsService.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/reports")
    public CatalogsCreateReportResponse reportsCreate(
        @RequestParam(name = "catalogsReportParameters") CatalogsReportParameters catalogsReportParameters,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.reportsCreate(catalogsReportParameters, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/reports")
    public CatalogsReport reportsGet(
        @RequestParam(name = "token") String token,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return catalogsService.reportsGet(token, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/reports/stats")
    public ReportsStats200Response reportsStats(
        @RequestParam(name = "parameters") CatalogsReportStatsParameters parameters,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return catalogsService.reportsStats(parameters, adAccountId, bookmark, pageSize);
    }
}
