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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BillingApiControllerImp extends BillingApiControllerImpInterface {
    @Override
    public AdsCreditRedeemResponse adsCreditRedeem(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest) throws Exception {
        //Do your magic!!!
        return new AdsCreditRedeemResponse();
    }

    @Override
    public AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new AdsCreditsDiscountsGet200Response();
    }

    @Override
    public BillingProfilesGet200Response billingProfilesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull Boolean isActive, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BillingProfilesGet200Response();
    }

    @Override
    public SSIOAccountResponse ssioAccountsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new SSIOAccountResponse();
    }

    @Override
    public SSIOCreateInsertionOrderResponse ssioInsertionOrderCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest) throws Exception {
        //Do your magic!!!
        return new SSIOCreateInsertionOrderResponse();
    }

    @Override
    public SSIOEditInsertionOrderResponse ssioInsertionOrderEdit(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest) throws Exception {
        //Do your magic!!!
        return new SSIOEditInsertionOrderResponse();
    }

    @Override
    public SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new SsioInsertionOrdersStatusGetByAdAccount200Response();
    }

    @Override
    public SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String pinOrderId) throws Exception {
        //Do your magic!!!
        return new SSIOInsertionOrderStatusResponse();
    }

    @Override
    public SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String pinOrderId) throws Exception {
        //Do your magic!!!
        return new SsioOrderLinesGetByAdAccount200Response();
    }

}
