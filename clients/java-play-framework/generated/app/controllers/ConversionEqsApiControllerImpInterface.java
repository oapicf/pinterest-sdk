package controllers;

import apimodels.EventQualityScore;
import apimodels.IngestionSourceOptions;
import apimodels.LookbackPeriodOptions;
import apimodels.PinterestLibError;
import apimodels.SourcePlatformOptions;

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
public abstract class ConversionEqsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result conversionEqsListHttp(Http.Request request, @NotNull LookbackPeriodOptions lookbackPeriod,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<EventQualityScore> obj = conversionEqsList(request, lookbackPeriod, adAccountId, sourcePlatform, ingestionSource);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (EventQualityScore curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<EventQualityScore> conversionEqsList(Http.Request request, @NotNull LookbackPeriodOptions lookbackPeriod,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource) throws Exception;

}
