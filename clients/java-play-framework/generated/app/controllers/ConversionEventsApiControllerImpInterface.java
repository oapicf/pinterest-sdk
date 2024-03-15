package controllers;

import apimodels.ConversionApiResponse;
import apimodels.ConversionEvents;
import apimodels.DetailedError;
import apimodels.Error;

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
public abstract class ConversionEventsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result eventsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionEvents conversionEvents, Boolean test) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ConversionApiResponse obj = eventsCreate(request, adAccountId, conversionEvents, test);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConversionApiResponse eventsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionEvents conversionEvents, Boolean test) throws Exception;

}
