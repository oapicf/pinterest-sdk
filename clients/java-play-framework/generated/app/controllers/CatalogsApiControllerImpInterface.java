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

@SuppressWarnings("RedundantThrows")
public abstract class CatalogsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result catalogsProductGroupsCreateHttp(Http.Request request, CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Object obj = catalogsProductGroupsCreate(request, catalogsProductGroupCreateRequest);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Object catalogsProductGroupsCreate(Http.Request request, CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest) throws Exception;

    public Result catalogsProductGroupsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        catalogsProductGroupsDelete(request, productGroupId);
        return ok();

    }

    public abstract void catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId) throws Exception;

    public Result catalogsProductGroupsListHttp(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = catalogsProductGroupsList(request, feedId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated catalogsProductGroupsList(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception;

    public Result catalogsProductGroupsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroup obj = catalogsProductGroupsUpdate(request, productGroupId, catalogsProductGroupUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroup catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest) throws Exception;

    public Result feedProcessingResultsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = feedProcessingResultsList(request, feedId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated feedProcessingResultsList(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception;

    public Result feedsCreateHttp(Http.Request request, CatalogsFeedsCreateRequest catalogsFeedsCreateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsCreate(request, catalogsFeedsCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsCreate(Http.Request request, CatalogsFeedsCreateRequest catalogsFeedsCreateRequest) throws Exception;

    public Result feedsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        feedsDelete(request, feedId);
        return ok();

    }

    public abstract void feedsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception;

    public Result feedsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsGet(request, feedId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId) throws Exception;

    public Result feedsListHttp(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = feedsList(request, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated feedsList(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception;

    public Result feedsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsFeed obj = feedsUpdate(request, feedId, catalogsFeedsUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsFeed feedsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest) throws Exception;

    public Result itemsBatchGetHttp(Http.Request request, String batchId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsItemsBatch obj = itemsBatchGet(request, batchId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsItemsBatch itemsBatchGet(Http.Request request, String batchId) throws Exception;

    public Result itemsBatchPostHttp(Http.Request request, CatalogsItemsBatchRequest catalogsItemsBatchRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsItemsBatch obj = itemsBatchPost(request, catalogsItemsBatchRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsItemsBatch itemsBatchPost(Http.Request request, CatalogsItemsBatchRequest catalogsItemsBatchRequest) throws Exception;

    public Result itemsGetHttp(Http.Request request, @NotNull String country, @NotNull List<String> itemIds, @NotNull String language) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsItems obj = itemsGet(request, country, itemIds, language);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsItems itemsGet(Http.Request request, @NotNull String country, @NotNull List<String> itemIds, @NotNull String language) throws Exception;

}
