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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-07-01T11:59:57.602846Z[Etc/UTC]")
public class CatalogsApiController extends Controller {
    private final CatalogsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CatalogsApiController(Config configuration, CatalogsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result catalogsProductGroupsCreate(Http.Request request) throws Exception {
        JsonNode nodecatalogsProductGroupCreateRequest = request.body().asJson();
        CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest;
        if (nodecatalogsProductGroupCreateRequest != null) {
            catalogsProductGroupCreateRequest = mapper.readValue(nodecatalogsProductGroupCreateRequest.toString(), CatalogsProductGroupCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsProductGroupCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsProductGroupCreateRequest' parameter is required");
        }
        return imp.catalogsProductGroupsCreateHttp(request, catalogsProductGroupCreateRequest);
    }

    @ApiAction
    public Result catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        return imp.catalogsProductGroupsDeleteHttp(request, productGroupId);
    }

    @ApiAction
    public Result catalogsProductGroupsList(Http.Request request) throws Exception {
        String valuefeedId = request.getQueryString("feed_id");
        String feedId;
        if (valuefeedId != null) {
            feedId = valuefeedId;
        } else {
            throw new IllegalArgumentException("'feed_id' parameter is required");
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.catalogsProductGroupsListHttp(request, feedId, bookmark, pageSize);
    }

    @ApiAction
    public Result catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        JsonNode nodecatalogsProductGroupUpdateRequest = request.body().asJson();
        CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest;
        if (nodecatalogsProductGroupUpdateRequest != null) {
            catalogsProductGroupUpdateRequest = mapper.readValue(nodecatalogsProductGroupUpdateRequest.toString(), CatalogsProductGroupUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsProductGroupUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsProductGroupUpdateRequest' parameter is required");
        }
        return imp.catalogsProductGroupsUpdateHttp(request, productGroupId, catalogsProductGroupUpdateRequest);
    }

    @ApiAction
    public Result feedProcessingResultsList(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.feedProcessingResultsListHttp(request, feedId, bookmark, pageSize);
    }

    @ApiAction
    public Result feedsCreate(Http.Request request) throws Exception {
        JsonNode nodecatalogsFeedsCreateRequest = request.body().asJson();
        CatalogsFeedsCreateRequest catalogsFeedsCreateRequest;
        if (nodecatalogsFeedsCreateRequest != null) {
            catalogsFeedsCreateRequest = mapper.readValue(nodecatalogsFeedsCreateRequest.toString(), CatalogsFeedsCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsFeedsCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsFeedsCreateRequest' parameter is required");
        }
        return imp.feedsCreateHttp(request, catalogsFeedsCreateRequest);
    }

    @ApiAction
    public Result feedsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        return imp.feedsDeleteHttp(request, feedId);
    }

    @ApiAction
    public Result feedsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        return imp.feedsGetHttp(request, feedId);
    }

    @ApiAction
    public Result feedsList(Http.Request request) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.feedsListHttp(request, bookmark, pageSize);
    }

    @ApiAction
    public Result feedsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        JsonNode nodecatalogsFeedsUpdateRequest = request.body().asJson();
        CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest;
        if (nodecatalogsFeedsUpdateRequest != null) {
            catalogsFeedsUpdateRequest = mapper.readValue(nodecatalogsFeedsUpdateRequest.toString(), CatalogsFeedsUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsFeedsUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsFeedsUpdateRequest' parameter is required");
        }
        return imp.feedsUpdateHttp(request, feedId, catalogsFeedsUpdateRequest);
    }

    @ApiAction
    public Result itemsBatchGet(Http.Request request, String batchId) throws Exception {
        return imp.itemsBatchGetHttp(request, batchId);
    }

    @ApiAction
    public Result itemsBatchPost(Http.Request request) throws Exception {
        JsonNode nodecatalogsItemsBatchRequest = request.body().asJson();
        CatalogsItemsBatchRequest catalogsItemsBatchRequest;
        if (nodecatalogsItemsBatchRequest != null) {
            catalogsItemsBatchRequest = mapper.readValue(nodecatalogsItemsBatchRequest.toString(), CatalogsItemsBatchRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsItemsBatchRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsItemsBatchRequest' parameter is required");
        }
        return imp.itemsBatchPostHttp(request, catalogsItemsBatchRequest);
    }

    @ApiAction
    public Result itemsGet(Http.Request request) throws Exception {
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            throw new IllegalArgumentException("'country' parameter is required");
        }
        String[] itemIdsArray = request.queryString().get("item_ids");
        if (itemIdsArray == null) {
            throw new IllegalArgumentException("'item_ids' parameter is required");
        }
        List<String> itemIdsList = OpenAPIUtils.parametersToList("multi", itemIdsArray);
        List<String> itemIds = new ArrayList<>();
        for (String curParam : itemIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                itemIds.add(curParam);
            }
        }
        String valuelanguage = request.getQueryString("language");
        String language;
        if (valuelanguage != null) {
            language = valuelanguage;
        } else {
            throw new IllegalArgumentException("'language' parameter is required");
        }
        return imp.itemsGetHttp(request, country, itemIds, language);
    }

}
