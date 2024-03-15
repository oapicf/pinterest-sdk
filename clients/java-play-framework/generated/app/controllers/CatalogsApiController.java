package controllers;

import apimodels.CatalogsFeed;
import apimodels.CatalogsItemValidationIssue;
import apimodels.CatalogsItems;
import apimodels.CatalogsItemsBatch;
import apimodels.CatalogsItemsFilters;
import apimodels.CatalogsList200Response;
import apimodels.CatalogsListProductsByFilterRequest;
import apimodels.CatalogsProductGroupPinsList200Response;
import apimodels.CatalogsProductGroupProductCounts;
import apimodels.CatalogsProductGroupsCreate201Response;
import apimodels.CatalogsProductGroupsCreateRequest;
import apimodels.CatalogsProductGroupsList200Response;
import apimodels.CatalogsProductGroupsUpdateRequest;
import apimodels.Error;
import apimodels.FeedProcessingResultsList200Response;
import apimodels.FeedsCreateRequest;
import apimodels.FeedsList200Response;
import apimodels.FeedsUpdateRequest;
import apimodels.ItemsBatchPostRequest;
import apimodels.ItemsIssuesList200Response;

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
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
    public Result catalogsList(Http.Request request) throws Exception {
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsListHttp(request, bookmark, pageSize, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupPinsList(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupPinsListHttp(request, productGroupId, bookmark, pageSize, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsCreate(Http.Request request) throws Exception {
        JsonNode nodecatalogsProductGroupsCreateRequest = request.body().asJson();
        CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest;
        if (nodecatalogsProductGroupsCreateRequest != null) {
            catalogsProductGroupsCreateRequest = mapper.readValue(nodecatalogsProductGroupsCreateRequest.toString(), CatalogsProductGroupsCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsProductGroupsCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsProductGroupsCreateRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsCreateHttp(request, catalogsProductGroupsCreateRequest, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsDeleteHttp(request, productGroupId, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsGetHttp(request, productGroupId, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsList(Http.Request request) throws Exception {
        String valuefeedId = request.getQueryString("feed_id");
        String feedId;
        if (valuefeedId != null) {
            feedId = valuefeedId;
        } else {
            feedId = null;
        }
        String valuecatalogId = request.getQueryString("catalog_id");
        String catalogId;
        if (valuecatalogId != null) {
            catalogId = valuecatalogId;
        } else {
            catalogId = null;
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsListHttp(request, feedId, catalogId, bookmark, pageSize, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsProductCountsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsProductCountsGetHttp(request, productGroupId, adAccountId);
    }

    @ApiAction
    public Result catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        JsonNode nodecatalogsProductGroupsUpdateRequest = request.body().asJson();
        CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest;
        if (nodecatalogsProductGroupsUpdateRequest != null) {
            catalogsProductGroupsUpdateRequest = mapper.readValue(nodecatalogsProductGroupsUpdateRequest.toString(), CatalogsProductGroupsUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsProductGroupsUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsProductGroupsUpdateRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsProductGroupsUpdateHttp(request, productGroupId, catalogsProductGroupsUpdateRequest, adAccountId);
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedProcessingResultsListHttp(request, feedId, bookmark, pageSize, adAccountId);
    }

    @ApiAction
    public Result feedsCreate(Http.Request request) throws Exception {
        JsonNode nodefeedsCreateRequest = request.body().asJson();
        FeedsCreateRequest feedsCreateRequest;
        if (nodefeedsCreateRequest != null) {
            feedsCreateRequest = mapper.readValue(nodefeedsCreateRequest.toString(), FeedsCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(feedsCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'FeedsCreateRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedsCreateHttp(request, feedsCreateRequest, adAccountId);
    }

    @ApiAction
    public Result feedsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedsDeleteHttp(request, feedId, adAccountId);
    }

    @ApiAction
    public Result feedsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedsGetHttp(request, feedId, adAccountId);
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
        String valuecatalogId = request.getQueryString("catalog_id");
        String catalogId;
        if (valuecatalogId != null) {
            catalogId = valuecatalogId;
        } else {
            catalogId = null;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedsListHttp(request, bookmark, pageSize, catalogId, adAccountId);
    }

    @ApiAction
    public Result feedsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        JsonNode nodefeedsUpdateRequest = request.body().asJson();
        FeedsUpdateRequest feedsUpdateRequest;
        if (nodefeedsUpdateRequest != null) {
            feedsUpdateRequest = mapper.readValue(nodefeedsUpdateRequest.toString(), FeedsUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(feedsUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'FeedsUpdateRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedsUpdateHttp(request, feedId, feedsUpdateRequest, adAccountId);
    }

    @ApiAction
    public Result itemsBatchGet(Http.Request request, String batchId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.itemsBatchGetHttp(request, batchId, adAccountId);
    }

    @ApiAction
    public Result itemsBatchPost(Http.Request request) throws Exception {
        JsonNode nodeitemsBatchPostRequest = request.body().asJson();
        ItemsBatchPostRequest itemsBatchPostRequest;
        if (nodeitemsBatchPostRequest != null) {
            itemsBatchPostRequest = mapper.readValue(nodeitemsBatchPostRequest.toString(), ItemsBatchPostRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(itemsBatchPostRequest);
            }
        } else {
            throw new IllegalArgumentException("'ItemsBatchPostRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.itemsBatchPostHttp(request, itemsBatchPostRequest, adAccountId);
    }

    @ApiAction
    public Result itemsGet(Http.Request request) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            throw new IllegalArgumentException("'country' parameter is required");
        }
        String valuelanguage = request.getQueryString("language");
        String language;
        if (valuelanguage != null) {
            language = valuelanguage;
        } else {
            throw new IllegalArgumentException("'language' parameter is required");
        }
        String[] itemIdsArray = request.queryString().get("item_ids");
        List<String> itemIdsList = OpenAPIUtils.parametersToList("multi", itemIdsArray);
        List<String> itemIds = new ArrayList<>();
        for (String curParam : itemIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                itemIds.add(curParam);
            }
        }
        String valuefilters = request.getQueryString("filters");
        CatalogsItemsFilters filters;
        if (valuefilters != null) {
            filters = valuefilters;
        } else {
            filters = null;
        }
        return imp.itemsGetHttp(request, country, language, adAccountId, itemIds, filters);
    }

    @ApiAction
    public Result itemsIssuesList(Http.Request request,  @Pattern(regexp="^\\d+$")String processingResultId) throws Exception {
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
        String[] itemNumbersArray = request.queryString().get("item_numbers");
        List<String> itemNumbersList = OpenAPIUtils.parametersToList("multi", itemNumbersArray);
        List<Integer> itemNumbers = new ArrayList<>();
        for (String curParam : itemNumbersList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                itemNumbers.add(Integer.parseInt(curParam));
            }
        }
        String valueitemValidationIssue = request.getQueryString("item_validation_issue");
        CatalogsItemValidationIssue itemValidationIssue;
        if (valueitemValidationIssue != null) {
            itemValidationIssue = valueitemValidationIssue;
        } else {
            itemValidationIssue = null;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.itemsIssuesListHttp(request, processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId);
    }

    @ApiAction
    public Result productsByProductGroupFilterList(Http.Request request) throws Exception {
        JsonNode nodecatalogsListProductsByFilterRequest = request.body().asJson();
        CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest;
        if (nodecatalogsListProductsByFilterRequest != null) {
            catalogsListProductsByFilterRequest = mapper.readValue(nodecatalogsListProductsByFilterRequest.toString(), CatalogsListProductsByFilterRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsListProductsByFilterRequest);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsListProductsByFilterRequest' parameter is required");
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.productsByProductGroupFilterListHttp(request, catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId);
    }

}
