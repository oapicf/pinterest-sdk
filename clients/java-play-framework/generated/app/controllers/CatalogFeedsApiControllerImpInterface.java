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
public abstract class CatalogFeedsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

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

    public Result feedsIngestHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeedIngestion obj = feedsIngest(request, feedId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeedIngestion feedsIngest(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

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

}
