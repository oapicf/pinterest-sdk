package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-08T00:33:33.395237Z[Etc/UTC]")
public interface CatalogsApiService {
      Response catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsDelete(String productGroupId,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsList(String feedId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response catalogsProductGroupsUpdate(String productGroupId,CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response feedProcessingResultsList(String feedId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsDelete(String feedId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsGet(String feedId,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsList(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response feedsUpdate(String feedId,CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response itemsBatchGet(String batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response itemsGet(String country,List<String> itemIds,String language,SecurityContext securityContext)
      throws NotFoundException;
}
