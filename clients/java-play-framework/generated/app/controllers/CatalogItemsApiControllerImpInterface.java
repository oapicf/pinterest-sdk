package controllers;

import apimodels.CatalogsItemsBatch;
import apimodels.CatalogsItemsBatchPostRequest;
import apimodels.CatalogsItemsRequest;
import apimodels.ItemsPost200Response;
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
public abstract class CatalogItemsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result itemsBatchGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String batchId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
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

    public abstract CatalogsItemsBatch itemsBatchGet(Http.Request request,  @Pattern(regexp="^\\d+$")String batchId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result itemsBatchPostHttp(Http.Request request, CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsItemsBatch obj = itemsBatchPost(request, catalogsItemsBatchPostRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsItemsBatch itemsBatchPost(Http.Request request, CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result itemsPostHttp(Http.Request request, CatalogsItemsRequest catalogsItemsRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ItemsPost200Response obj = itemsPost(request, catalogsItemsRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ItemsPost200Response itemsPost(Http.Request request, CatalogsItemsRequest catalogsItemsRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

}
