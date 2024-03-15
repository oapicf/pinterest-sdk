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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class CatalogsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result catalogsListHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsList200Response obj = catalogsList(request, bookmark, pageSize, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsList200Response catalogsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupPinsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupPinsList200Response obj = catalogsProductGroupPinsList(request, productGroupId, bookmark, pageSize, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsCreateHttp(Http.Request request, CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupsCreate201Response obj = catalogsProductGroupsCreate(request, catalogsProductGroupsCreateRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupsCreate201Response catalogsProductGroupsCreate(Http.Request request, CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        catalogsProductGroupsDelete(request, productGroupId, adAccountId);
        return ok();

    }

    public abstract void catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupsCreate201Response obj = catalogsProductGroupsGet(request, productGroupId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupsCreate201Response catalogsProductGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$")String catalogId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupsList200Response obj = catalogsProductGroupsList(request, feedId, catalogId, bookmark, pageSize, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupsList200Response catalogsProductGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$")String catalogId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsProductCountsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupProductCounts obj = catalogsProductGroupsProductCountsGet(request, productGroupId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupProductCounts catalogsProductGroupsProductCountsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupsCreate201Response obj = catalogsProductGroupsUpdate(request, productGroupId, catalogsProductGroupsUpdateRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupsCreate201Response catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result feedProcessingResultsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        FeedProcessingResultsList200Response obj = feedProcessingResultsList(request, feedId, bookmark, pageSize, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FeedProcessingResultsList200Response feedProcessingResultsList(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result feedsCreateHttp(Http.Request request, FeedsCreateRequest feedsCreateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsCreate(request, feedsCreateRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsCreate(Http.Request request, FeedsCreateRequest feedsCreateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result feedsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        feedsDelete(request, feedId, adAccountId);
        return ok();

    }

    public abstract void feedsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result feedsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsGet(request, feedId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result feedsListHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$")String catalogId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        FeedsList200Response obj = feedsList(request, bookmark, pageSize, catalogId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FeedsList200Response feedsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$")String catalogId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result feedsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, FeedsUpdateRequest feedsUpdateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsUpdate(request, feedId, feedsUpdateRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, FeedsUpdateRequest feedsUpdateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result itemsBatchGetHttp(Http.Request request, String batchId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsItemsBatch obj = itemsBatchGet(request, batchId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsItemsBatch itemsBatchGet(Http.Request request, String batchId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result itemsBatchPostHttp(Http.Request request, ItemsBatchPostRequest itemsBatchPostRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsItemsBatch obj = itemsBatchPost(request, itemsBatchPostRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsItemsBatch itemsBatchPost(Http.Request request, ItemsBatchPostRequest itemsBatchPostRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result itemsGetHttp(Http.Request request, @NotNull String country, @NotNull String language,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<String> itemIds, CatalogsItemsFilters filters) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsItems obj = itemsGet(request, country, language, adAccountId, itemIds, filters);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsItems itemsGet(Http.Request request, @NotNull String country, @NotNull String language,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<String> itemIds, CatalogsItemsFilters filters) throws Exception;

    public Result itemsIssuesListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String processingResultId, String bookmark,  @Min(1) @Max(250)Integer pageSize, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ItemsIssuesList200Response obj = itemsIssuesList(request, processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ItemsIssuesList200Response itemsIssuesList(Http.Request request,  @Pattern(regexp="^\\d+$")String processingResultId, String bookmark,  @Min(1) @Max(250)Integer pageSize, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result productsByProductGroupFilterListHttp(Http.Request request, CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupPinsList200Response obj = productsByProductGroupFilterList(request, catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(Http.Request request, CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

}
