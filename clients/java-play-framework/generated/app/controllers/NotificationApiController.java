package controllers;

import apimodels.NotificationPostRequest;
import apimodels.NotificationResponse;
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
public class NotificationApiController extends Controller {
    private final NotificationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private NotificationApiController(Config configuration, NotificationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result notificationPost(Http.Request request) throws Exception {
        JsonNode nodenotificationPostRequest = request.body().asJson();
        NotificationPostRequest notificationPostRequest;
        if (nodenotificationPostRequest != null) {
            notificationPostRequest = mapper.readValue(nodenotificationPostRequest.toString(), NotificationPostRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(notificationPostRequest);
            }
        } else {
            throw new IllegalArgumentException("'NotificationPostRequest' parameter is required");
        }
        return imp.notificationPostHttp(request, notificationPostRequest);
    }

}
