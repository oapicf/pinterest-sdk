package controllers;

import apimodels.CatalogsFeed;
import apimodels.CatalogsFeedsCreateRequest;
import apimodels.CatalogsFeedsUpdateRequest;
import apimodels.CatalogsItems;
import apimodels.CatalogsItemsBatch;
import apimodels.CatalogsItemsBatchRequest;
import apimodels.CatalogsProductGroup;
import apimodels.CatalogsProductGroupCreateRequest;
import apimodels.CatalogsProductGroupUpdateRequest;
import apimodels.Error;
import apimodels.Paginated;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
public class CatalogsApiControllerImp extends CatalogsApiControllerImpInterface {
    @Override
    public Object catalogsProductGroupsCreate(Http.Request request, CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest) throws Exception {
        //Do your magic!!!
        return new Object();
    }

    @Override
    public void catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Paginated catalogsProductGroupsList(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public CatalogsProductGroup catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest) throws Exception {
        //Do your magic!!!
        return new CatalogsProductGroup();
    }

    @Override
    public Paginated feedProcessingResultsList(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public CatalogsFeed feedsCreate(Http.Request request, CatalogsFeedsCreateRequest catalogsFeedsCreateRequest) throws Exception {
        //Do your magic!!!
        return new CatalogsFeed();
    }

    @Override
    public void feedsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public CatalogsFeed feedsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        //Do your magic!!!
        return new CatalogsFeed();
    }

    @Override
    public Paginated feedsList(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public CatalogsFeed feedsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest) throws Exception {
        //Do your magic!!!
        return new CatalogsFeed();
    }

    @Override
    public CatalogsItemsBatch itemsBatchGet(Http.Request request, String batchId) throws Exception {
        //Do your magic!!!
        return new CatalogsItemsBatch();
    }

    @Override
    public CatalogsItemsBatch itemsBatchPost(Http.Request request, CatalogsItemsBatchRequest catalogsItemsBatchRequest) throws Exception {
        //Do your magic!!!
        return new CatalogsItemsBatch();
    }

    @Override
    public CatalogsItems itemsGet(Http.Request request, @NotNull String country, @NotNull List<String> itemIds, @NotNull String language) throws Exception {
        //Do your magic!!!
        return new CatalogsItems();
    }

}
