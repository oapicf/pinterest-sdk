package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-05T02:19:42.400563355Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface CatalogsApiService {
      public Response catalogsCreate(CatalogsCreateRequest catalogsCreateRequest, String adAccountId, SecurityContext securityContext);
      public Response catalogsList(String bookmark, Integer pageSize, String adAccountId, SecurityContext securityContext);
      public Response catalogsProductGroupPinsList(String productGroupId, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics, SecurityContext securityContext);
      public Response catalogsProductGroupsCreate(MultipleProductGroupsInner multipleProductGroupsInner, String adAccountId, SecurityContext securityContext);
      public Response catalogsProductGroupsCreateMany(List<MultipleProductGroupsInner> multipleProductGroupsInner, String adAccountId, SecurityContext securityContext);
      public Response catalogsProductGroupsDelete(String productGroupId, String adAccountId, SecurityContext securityContext);
      public Response catalogsProductGroupsDeleteMany(List<Integer> id, String adAccountId, SecurityContext securityContext);
      public Response catalogsProductGroupsGet(String productGroupId, String adAccountId, SecurityContext securityContext);
      public Response catalogsProductGroupsList(List<Integer> id, String feedId, String catalogId, String bookmark, Integer pageSize, String adAccountId, SecurityContext securityContext);
      public Response catalogsProductGroupsProductCountsGet(String productGroupId, String adAccountId, SecurityContext securityContext);
      public Response catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest, String adAccountId, SecurityContext securityContext);
      public Response feedProcessingResultsList(String feedId, String bookmark, Integer pageSize, String adAccountId, SecurityContext securityContext);
      public Response feedsCreate(FeedsCreateRequest feedsCreateRequest, String adAccountId, SecurityContext securityContext);
      public Response feedsDelete(String feedId, String adAccountId, SecurityContext securityContext);
      public Response feedsGet(String feedId, String adAccountId, SecurityContext securityContext);
      public Response feedsIngest(String feedId, String adAccountId, SecurityContext securityContext);
      public Response feedsList(String bookmark, Integer pageSize, String catalogId, String adAccountId, SecurityContext securityContext);
      public Response feedsUpdate(String feedId, FeedsUpdateRequest feedsUpdateRequest, String adAccountId, SecurityContext securityContext);
      public Response itemsBatchGet(String batchId, String adAccountId, SecurityContext securityContext);
      public Response itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest, String adAccountId, SecurityContext securityContext);
      @Deprecated public Response itemsGet(String country, String language, String adAccountId, List<String> itemIds, CatalogsItemsFilters filters, SecurityContext securityContext);
      public Response itemsIssuesList(String processingResultId, String bookmark, Integer pageSize, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue, String adAccountId, SecurityContext securityContext);
      public Response itemsPost(CatalogsItemsRequest catalogsItemsRequest, String adAccountId, SecurityContext securityContext);
      public Response productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark, Integer pageSize, String adAccountId, Boolean pinMetrics, SecurityContext securityContext);
      public Response reportsCreate(CatalogsReportParameters catalogsReportParameters, String adAccountId, SecurityContext securityContext);
      public Response reportsGet(String token, String adAccountId, SecurityContext securityContext);
      public Response reportsStats(CatalogsReportParameters parameters, String adAccountId, Integer pageSize, String bookmark, SecurityContext securityContext);
}
