package controllers;

import apimodels.Error;
import apimodels.MediaList200Response;
import apimodels.MediaUpload;
import apimodels.MediaUploadDetails;
import apimodels.MediaUploadRequest;

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
public abstract class MediaApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result mediaCreateHttp(Http.Request request, MediaUploadRequest mediaUploadRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MediaUpload obj = mediaCreate(request, mediaUploadRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MediaUpload mediaCreate(Http.Request request, MediaUploadRequest mediaUploadRequest) throws Exception;

    public Result mediaGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String mediaId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MediaUploadDetails obj = mediaGet(request, mediaId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MediaUploadDetails mediaGet(Http.Request request,  @Pattern(regexp="^\\d+$")String mediaId) throws Exception;

    public Result mediaListHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        MediaList200Response obj = mediaList(request, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MediaList200Response mediaList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

}
