package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.CatalogsItems;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsFilters;
import org.openapitools.model.CatalogsList200Response;
import org.openapitools.model.CatalogsListProductsByFilterRequest;
import org.openapitools.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.model.CatalogsProductGroupProductCounts;
import org.openapitools.model.CatalogsProductGroupsCreate201Response;
import org.openapitools.model.CatalogsProductGroupsCreateRequest;
import org.openapitools.model.CatalogsProductGroupsList200Response;
import org.openapitools.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.model.Error;
import org.openapitools.model.FeedProcessingResultsList200Response;
import org.openapitools.model.FeedsCreateRequest;
import org.openapitools.model.FeedsList200Response;
import org.openapitools.model.FeedsUpdateRequest;
import org.openapitools.model.ItemsBatchPostRequest;
import org.openapitools.model.ItemsIssuesList200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface CatalogsApiService {
      Response catalogsList(String bookmark,Integer pageSize,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupPinsList(String productGroupId,String bookmark,Integer pageSize,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsCreate(CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsDelete(String productGroupId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsGet(String productGroupId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsList(String feedId,String catalogId,String bookmark,Integer pageSize,String adAccountId,SecurityContext securityContext)
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
      Response productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest,String bookmark,Integer pageSize,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
}
