package controllers;

import apimodels.PinterestLibError;
import apimodels.ProductTagsBulkAddRequest;
import apimodels.ProductTagsBulkDeleteRequest;
import apimodels.ProductTagsError;
import apimodels.ProductTagsResponse;

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
public abstract class ProductTagsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result productTagsBulkAddHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductTagsResponse obj = productTagsBulkAdd(request, pinId, productTagsBulkAddRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductTagsResponse productTagsBulkAdd(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest) throws Exception;

    public Result productTagsBulkDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        productTagsBulkDelete(request, pinId, productTagsBulkDeleteRequest);
        return ok();

    }

    public abstract void productTagsBulkDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest) throws Exception;

    public Result productTagsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductTagsResponse obj = productTagsList(request, pinId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductTagsResponse productTagsList(Http.Request request,  @Pattern(regexp="^\\d+$")String pinId) throws Exception;

}
