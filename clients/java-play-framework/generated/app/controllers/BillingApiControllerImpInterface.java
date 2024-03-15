package controllers;

import apimodels.AdsCreditRedeemRequest;
import apimodels.AdsCreditRedeemResponse;
import apimodels.AdsCreditsDiscountsGet200Response;
import apimodels.BillingProfilesGet200Response;
import apimodels.Error;
import apimodels.SSIOAccountResponse;
import apimodels.SSIOCreateInsertionOrderRequest;
import apimodels.SSIOCreateInsertionOrderResponse;
import apimodels.SSIOEditInsertionOrderRequest;
import apimodels.SSIOEditInsertionOrderResponse;
import apimodels.SSIOInsertionOrderStatusResponse;
import apimodels.SsioInsertionOrdersStatusGetByAdAccount200Response;
import apimodels.SsioOrderLinesGetByAdAccount200Response;

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
public abstract class BillingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result adsCreditRedeemHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdsCreditRedeemResponse obj = adsCreditRedeem(request, adAccountId, adsCreditRedeemRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdsCreditRedeemResponse adsCreditRedeem(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest) throws Exception;

    public Result adsCreditsDiscountsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        AdsCreditsDiscountsGet200Response obj = adsCreditsDiscountsGet(request, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result billingProfilesGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull Boolean isActive, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BillingProfilesGet200Response obj = billingProfilesGet(request, adAccountId, isActive, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BillingProfilesGet200Response billingProfilesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull Boolean isActive, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result ssioAccountsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SSIOAccountResponse obj = ssioAccountsGet(request, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SSIOAccountResponse ssioAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result ssioInsertionOrderCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SSIOCreateInsertionOrderResponse obj = ssioInsertionOrderCreate(request, adAccountId, ssIOCreateInsertionOrderRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SSIOCreateInsertionOrderResponse ssioInsertionOrderCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest) throws Exception;

    public Result ssioInsertionOrderEditHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SSIOEditInsertionOrderResponse obj = ssioInsertionOrderEdit(request, adAccountId, ssIOEditInsertionOrderRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SSIOEditInsertionOrderResponse ssioInsertionOrderEdit(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest) throws Exception;

    public Result ssioInsertionOrdersStatusGetByAdAccountHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SsioInsertionOrdersStatusGetByAdAccount200Response obj = ssioInsertionOrdersStatusGetByAdAccount(request, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result ssioInsertionOrdersStatusGetByPinOrderIdHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SSIOInsertionOrderStatusResponse obj = ssioInsertionOrdersStatusGetByPinOrderId(request, adAccountId, pinOrderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId) throws Exception;

    public Result ssioOrderLinesGetByAdAccountHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String pinOrderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SsioOrderLinesGetByAdAccount200Response obj = ssioOrderLinesGetByAdAccount(request, adAccountId, bookmark, pageSize, pinOrderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String pinOrderId) throws Exception;

}
