package controllers;

import apimodels.AdvancedAuctionItems;
import apimodels.AdvancedAuctionItemsGetRequest;
import apimodels.AdvancedAuctionItemsSubmitRequest;
import apimodels.AdvancedAuctionProcessedItems;
import apimodels.Error;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionApiController extends Controller {
    private final AdvancedAuctionApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AdvancedAuctionApiController(Config configuration, AdvancedAuctionApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result advancedAuctionItemsGetPost(Http.Request request) throws Exception {
        JsonNode nodeadvancedAuctionItemsGetRequest = request.body().asJson();
        AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest;
        if (nodeadvancedAuctionItemsGetRequest != null) {
            advancedAuctionItemsGetRequest = mapper.readValue(nodeadvancedAuctionItemsGetRequest.toString(), AdvancedAuctionItemsGetRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(advancedAuctionItemsGetRequest);
            }
        } else {
            throw new IllegalArgumentException("'AdvancedAuctionItemsGetRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.advancedAuctionItemsGetPostHttp(request, advancedAuctionItemsGetRequest, adAccountId);
    }

    @ApiAction
    public Result advancedAuctionItemsSubmitPost(Http.Request request) throws Exception {
        JsonNode nodeadvancedAuctionItemsSubmitRequest = request.body().asJson();
        AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest;
        if (nodeadvancedAuctionItemsSubmitRequest != null) {
            advancedAuctionItemsSubmitRequest = mapper.readValue(nodeadvancedAuctionItemsSubmitRequest.toString(), AdvancedAuctionItemsSubmitRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(advancedAuctionItemsSubmitRequest);
            }
        } else {
            throw new IllegalArgumentException("'AdvancedAuctionItemsSubmitRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.advancedAuctionItemsSubmitPostHttp(request, advancedAuctionItemsSubmitRequest, adAccountId);
    }

}
