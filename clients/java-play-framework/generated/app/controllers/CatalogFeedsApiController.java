package controllers;

import apimodels.CatalogsFeed;
import apimodels.CatalogsFeedIngestion;
import apimodels.CatalogsItemValidationIssue;
import apimodels.Error;
import apimodels.FeedProcessingResultsList200Response;
import apimodels.FeedsCreateRequest;
import apimodels.FeedsList200Response;
import apimodels.FeedsUpdateRequest;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogFeedsApiController extends Controller {
    private final CatalogFeedsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CatalogFeedsApiController(Config configuration, CatalogFeedsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
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
    public Result feedsIngest(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedsIngestHttp(request, feedId, adAccountId);
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

}
