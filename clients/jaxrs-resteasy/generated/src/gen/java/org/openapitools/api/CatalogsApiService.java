package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface CatalogsApiService {
      Response catalogsCreate(CatalogsCreateRequest catalogsCreateRequest,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsList(String bookmark,Integer pageSize,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupPinsList(String productGroupId,String bookmark,Integer pageSize,String adAccountId,Boolean pinMetrics,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsCreate(MultipleProductGroupsInner multipleProductGroupsInner,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsCreateMany(List<MultipleProductGroupsInner> multipleProductGroupsInner,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsDelete(String productGroupId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsDeleteMany(List<Integer> id,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsGet(String productGroupId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsList(List<Integer> id,String feedId,String catalogId,String bookmark,Integer pageSize,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsProductCountsGet(String productGroupId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsUpdate(String productGroupId,CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedProcessingResultsList(String feedId,String bookmark,Integer pageSize,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsCreate(FeedsCreateRequest feedsCreateRequest,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsDelete(String feedId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsGet(String feedId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsIngest(String feedId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsList(String bookmark,Integer pageSize,String catalogId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsUpdate(String feedId,FeedsUpdateRequest feedsUpdateRequest,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response itemsBatchGet(String batchId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response itemsGet(String country,String language,String adAccountId,List<String> itemIds,CatalogsItemsFilters filters,SecurityContext securityContext)
      throws NotFoundException;
      Response itemsIssuesList(String processingResultId,String bookmark,Integer pageSize,List<Integer> itemNumbers,CatalogsItemValidationIssue itemValidationIssue,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response itemsPost(CatalogsItemsRequest catalogsItemsRequest,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest,String bookmark,Integer pageSize,String adAccountId,Boolean pinMetrics,SecurityContext securityContext)
      throws NotFoundException;
      Response reportsCreate(CatalogsReportParameters catalogsReportParameters,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response reportsGet(String token,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response reportsStats(CatalogsReportParameters parameters,String adAccountId,Integer pageSize,String bookmark,SecurityContext securityContext)
      throws NotFoundException;
}
