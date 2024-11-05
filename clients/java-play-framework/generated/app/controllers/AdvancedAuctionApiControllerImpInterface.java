package controllers;

import apimodels.AdvancedAuctionItems;
import apimodels.AdvancedAuctionItemsGetRequest;
import apimodels.AdvancedAuctionItemsSubmitRequest;
import apimodels.AdvancedAuctionProcessedItems;
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
public abstract class AdvancedAuctionApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result advancedAuctionItemsGetPostHttp(Http.Request request, AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdvancedAuctionItems obj = advancedAuctionItemsGetPost(request, advancedAuctionItemsGetRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdvancedAuctionItems advancedAuctionItemsGetPost(Http.Request request, AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result advancedAuctionItemsSubmitPostHttp(Http.Request request, AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdvancedAuctionProcessedItems obj = advancedAuctionItemsSubmitPost(request, advancedAuctionItemsSubmitRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdvancedAuctionProcessedItems advancedAuctionItemsSubmitPost(Http.Request request, AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

}
