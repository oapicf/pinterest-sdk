package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-07-01T12:00:52.037403Z[Etc/UTC]")
public abstract class CatalogsApiService {
    public abstract Response catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsDelete( @Pattern(regexp="^\\d+$")String productGroupId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsList( @NotNull  @Pattern(regexp="^\\d+$")String feedId,String bookmark, @Min(1) @Max(100)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response catalogsProductGroupsUpdate( @Pattern(regexp="^\\d+$")String productGroupId,CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedProcessingResultsList( @Pattern(regexp="^\\d+$")String feedId,String bookmark, @Min(1) @Max(100)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsDelete( @Pattern(regexp="^\\d+$")String feedId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsGet( @Pattern(regexp="^\\d+$")String feedId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsList(String bookmark, @Min(1) @Max(100)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response feedsUpdate( @Pattern(regexp="^\\d+$")String feedId,CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsBatchGet(String batchId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response itemsGet( @NotNull String country, @NotNull List<String> itemIds, @NotNull String language,SecurityContext securityContext) throws NotFoundException;
}
