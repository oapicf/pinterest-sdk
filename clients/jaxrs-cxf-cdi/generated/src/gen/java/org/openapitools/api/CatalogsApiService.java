package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-07-01T12:00:45.266033Z[Etc/UTC]")
public interface CatalogsApiService {
      public Response catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest, SecurityContext securityContext);
      public Response catalogsProductGroupsDelete(String productGroupId, SecurityContext securityContext);
      public Response catalogsProductGroupsList(String feedId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest, SecurityContext securityContext);
      public Response feedProcessingResultsList(String feedId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest, SecurityContext securityContext);
      public Response feedsDelete(String feedId, SecurityContext securityContext);
      public Response feedsGet(String feedId, SecurityContext securityContext);
      public Response feedsList(String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response feedsUpdate(String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest, SecurityContext securityContext);
      public Response itemsBatchGet(String batchId, SecurityContext securityContext);
      public Response itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest, SecurityContext securityContext);
      public Response itemsGet(String country, List<String> itemIds, String language, SecurityContext securityContext);
}
