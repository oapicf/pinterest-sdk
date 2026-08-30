package controllers;

import apimodels.Media;
import apimodels.MediaList200Response;
import apimodels.MediaUpload;
import apimodels.MediaUploadCreate;
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
public class MediaApiController extends Controller {
    private final MediaApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private MediaApiController(Config configuration, MediaApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result mediaCreate(Http.Request request) throws Exception {
        JsonNode nodemediaUploadCreate = request.body().asJson();
        MediaUploadCreate mediaUploadCreate;
        if (nodemediaUploadCreate != null) {
            mediaUploadCreate = mapper.readValue(nodemediaUploadCreate.toString(), MediaUploadCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(mediaUploadCreate);
            }
        } else {
            throw new IllegalArgumentException("'MediaUploadCreate' parameter is required");
        }
        return imp.mediaCreateHttp(request, mediaUploadCreate);
    }

    @ApiAction
    public Result mediaGet(Http.Request request,  @Pattern(regexp="^\\d+$")String mediaId) throws Exception {
        return imp.mediaGetHttp(request, mediaId);
    }

    @ApiAction
    public Result mediaList(Http.Request request) throws Exception {
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
        return imp.mediaListHttp(request, bookmark, pageSize);
    }

}
