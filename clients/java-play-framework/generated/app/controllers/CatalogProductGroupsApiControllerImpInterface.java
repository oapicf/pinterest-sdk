package controllers;

import apimodels.CatalogsListProductsByFilterRequest;
import apimodels.CatalogsProductGroupPinsList200Response;
import apimodels.CatalogsProductGroupProductCountsVertical;
import apimodels.CatalogsProductGroupsCreateManyRequestItems;
import apimodels.CatalogsProductGroupsCreateRequestSchema;
import apimodels.CatalogsProductGroupsList200Response;
import apimodels.CatalogsProductGroupsUpdateRequestSchema;
import apimodels.CatalogsVerticalProductGroup;
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
public abstract class CatalogProductGroupsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result catalogsProductGroupPinsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupPinsList200Response obj = catalogsProductGroupPinsList(request, productGroupId, adAccountId, pinMetrics, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result catalogsProductGroupsCreateHttp(Http.Request request, CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsVerticalProductGroup obj = catalogsProductGroupsCreate(request, catalogsProductGroupsCreateRequestSchema, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsVerticalProductGroup catalogsProductGroupsCreate(Http.Request request, CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsCreateManyHttp(Http.Request request, List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<String> obj = catalogsProductGroupsCreateMany(request, catalogsProductGroupsCreateManyRequestItems, adAccountId);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<String> catalogsProductGroupsCreateMany(Http.Request request, List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsVerticalProductGroup obj = catalogsProductGroupsDelete(request, productGroupId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsVerticalProductGroup catalogsProductGroupsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsDeleteManyHttp(Http.Request request, @NotNull  @Size(min=1,max=1000)List<Integer> id,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        catalogsProductGroupsDeleteMany(request, id, adAccountId);
        return ok();

    }

    public abstract void catalogsProductGroupsDeleteMany(Http.Request request, @NotNull  @Size(min=1,max=1000)List<Integer> id,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsVerticalProductGroup obj = catalogsProductGroupsGet(request, productGroupId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsVerticalProductGroup catalogsProductGroupsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsListHttp(Http.Request request,  @Size(min=1,max=1000)List<Integer> id,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$")String catalogId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupsList200Response obj = catalogsProductGroupsList(request, id, feedId, catalogId, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupsList200Response catalogsProductGroupsList(Http.Request request,  @Size(min=1,max=1000)List<Integer> id,  @Pattern(regexp="^\\d+$")String feedId,  @Pattern(regexp="^\\d+$")String catalogId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result catalogsProductGroupsProductCountsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupProductCountsVertical obj = catalogsProductGroupsProductCountsGet(request, productGroupId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsProductGroupsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsVerticalProductGroup obj = catalogsProductGroupsUpdate(request, productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsVerticalProductGroup catalogsProductGroupsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String productGroupId, CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result productsByProductGroupFilterListHttp(Http.Request request, CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsProductGroupPinsList200Response obj = productsByProductGroupFilterList(request, catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(Http.Request request, CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception;

}
