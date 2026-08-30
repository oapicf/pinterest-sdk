package controllers;

import apimodels.CatalogsFeed;
import apimodels.CatalogsFeedCreateRequestSchema;
import apimodels.CatalogsFeedIngestion;
import apimodels.CatalogsFeedUpdateRequestSchema;
import apimodels.CatalogsItemValidationIssue;
import apimodels.FeedProcessingResultsList200Response;
import apimodels.FeedsList200Response;
import apimodels.ItemsIssuesList200Response;
import apimodels.PinterestLibError;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
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
        return imp.feedProcessingResultsListHttp(request, feedId, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result feedsCreate(Http.Request request) throws Exception {
        JsonNode nodecatalogsFeedCreateRequestSchema = request.body().asJson();
        CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema;
        if (nodecatalogsFeedCreateRequestSchema != null) {
            catalogsFeedCreateRequestSchema = mapper.readValue(nodecatalogsFeedCreateRequestSchema.toString(), CatalogsFeedCreateRequestSchema.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsFeedCreateRequestSchema);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsFeedCreateRequestSchema' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedsCreateHttp(request, catalogsFeedCreateRequestSchema, adAccountId);
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
        return imp.feedsListHttp(request, catalogId, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result feedsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        JsonNode nodecatalogsFeedUpdateRequestSchema = request.body().asJson();
        CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema;
        if (nodecatalogsFeedUpdateRequestSchema != null) {
            catalogsFeedUpdateRequestSchema = mapper.readValue(nodecatalogsFeedUpdateRequestSchema.toString(), CatalogsFeedUpdateRequestSchema.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(catalogsFeedUpdateRequestSchema);
            }
        } else {
            throw new IllegalArgumentException("'CatalogsFeedUpdateRequestSchema' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.feedsUpdateHttp(request, feedId, catalogsFeedUpdateRequestSchema, adAccountId);
    }

    @ApiAction
    public Result itemsIssuesList(Http.Request request,  @Pattern(regexp="^\\d+$")String processingResultId) throws Exception {
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
        return imp.itemsIssuesListHttp(request, processingResultId, itemNumbers, itemValidationIssue, adAccountId, bookmark, pageSize);
    }

}
