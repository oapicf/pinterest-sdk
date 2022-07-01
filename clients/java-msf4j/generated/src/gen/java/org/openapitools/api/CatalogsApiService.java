package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsFeedsCreateRequest;
import org.openapitools.model.CatalogsFeedsUpdateRequest;
import org.openapitools.model.CatalogsItems;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsBatchRequest;
import org.openapitools.model.CatalogsProductGroup;
import org.openapitools.model.CatalogsProductGroupCreateRequest;
import org.openapitools.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-07-01T11:59:44.239108Z[Etc/UTC]")
public abstract class CatalogsApiService {
    public abstract Response catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsDelete(String productGroupId
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsList(String feedId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response catalogsProductGroupsUpdate(String productGroupId
 ,CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest
 ) throws NotFoundException;
    public abstract Response feedProcessingResultsList(String feedId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest
 ) throws NotFoundException;
    public abstract Response feedsDelete(String feedId
 ) throws NotFoundException;
    public abstract Response feedsGet(String feedId
 ) throws NotFoundException;
    public abstract Response feedsList(String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response feedsUpdate(String feedId
 ,CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest
 ) throws NotFoundException;
    public abstract Response itemsBatchGet(String batchId
 ) throws NotFoundException;
    public abstract Response itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest
 ) throws NotFoundException;
    public abstract Response itemsGet(String country
 ,List<String> itemIds
 ,String language
 ) throws NotFoundException;
}
