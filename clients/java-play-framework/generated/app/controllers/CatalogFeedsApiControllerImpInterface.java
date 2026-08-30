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

    public Result feedProcessingResultsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        FeedProcessingResultsList200Response obj = feedProcessingResultsList(request, feedId, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FeedProcessingResultsList200Response feedProcessingResultsList(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result feedsCreateHttp(Http.Request request, CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsCreate(request, catalogsFeedCreateRequestSchema, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsCreate(Http.Request request, CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result feedsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsDelete(request, feedId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

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

    public Result feedsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String catalogId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        FeedsList200Response obj = feedsList(request, catalogId, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FeedsList200Response feedsList(Http.Request request,  @Pattern(regexp="^\\d+$")String catalogId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result feedsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsUpdate(request, feedId, catalogsFeedUpdateRequestSchema, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result itemsIssuesListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String processingResultId, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ItemsIssuesList200Response obj = itemsIssuesList(request, processingResultId, itemNumbers, itemValidationIssue, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ItemsIssuesList200Response itemsIssuesList(Http.Request request,  @Pattern(regexp="^\\d+$")String processingResultId, List<Integer> itemNumbers, CatalogsItemValidationIssue itemValidationIssue,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

}
