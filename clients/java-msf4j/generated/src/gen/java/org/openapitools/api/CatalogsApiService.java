package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class CatalogsApiService {
    public abstract Response catalogsList(String bookmark
 ,Integer pageSize
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupPinsList(String productGroupId
 ,String bookmark
 ,Integer pageSize
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsCreate(CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsDelete(String productGroupId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsGet(String productGroupId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsList(String feedId
 ,String catalogId
 ,String bookmark
 ,Integer pageSize
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsProductCountsGet(String productGroupId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsUpdate(String productGroupId
 ,CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedProcessingResultsList(String feedId
 ,String bookmark
 ,Integer pageSize
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsCreate(FeedsCreateRequest feedsCreateRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsDelete(String feedId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsGet(String feedId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsList(String bookmark
 ,Integer pageSize
 ,String catalogId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response feedsUpdate(String feedId
 ,FeedsUpdateRequest feedsUpdateRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response itemsBatchGet(String batchId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response itemsBatchPost(ItemsBatchPostRequest itemsBatchPostRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response itemsGet(String country
 ,String language
 ,String adAccountId
 ,List<String> itemIds
 ,CatalogsItemsFilters filters
 ) throws NotFoundException;
    public abstract Response itemsIssuesList(String processingResultId
 ,String bookmark
 ,Integer pageSize
 ,List<Integer> itemNumbers
 ,CatalogsItemValidationIssue itemValidationIssue
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response productsByProductGroupFilterList(CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest
 ,String bookmark
 ,Integer pageSize
 ,String adAccountId
 ) throws NotFoundException;
}
