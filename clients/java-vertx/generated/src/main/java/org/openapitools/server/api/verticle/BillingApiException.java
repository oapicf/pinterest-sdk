package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdsCreditRedeemRequest;
import org.openapitools.server.api.model.AdsCreditRedeemResponse;
import org.openapitools.server.api.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.server.api.model.BillingProfilesGet200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SSIOAccountResponse;
import org.openapitools.server.api.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.server.api.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.server.api.model.SSIOEditInsertionOrderRequest;
import org.openapitools.server.api.model.SSIOEditInsertionOrderResponse;
import org.openapitools.server.api.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.server.api.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.server.api.model.SsioOrderLinesGetByAdAccount200Response;

public final class BillingApiException extends MainApiException {
    public BillingApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BillingApiException Billing_adsCreditRedeem_200_Exception = new BillingApiException(200, "Successfully redeemed ad credits.");
    public static final BillingApiException Billing_adsCreditRedeem_400_Exception = new BillingApiException(400, "Error thrown when unable to redeem offer code.");
    public static final BillingApiException Billing_adsCreditsDiscountsGet_200_Exception = new BillingApiException(200, "Success");
    public static final BillingApiException Billing_billingProfilesGet_200_Exception = new BillingApiException(200, "Success");
    public static final BillingApiException Billing_ssioAccountsGet_200_Exception = new BillingApiException(200, "Success");
    public static final BillingApiException Billing_ssioAccountsGet_400_Exception = new BillingApiException(400, "Invalid request parameter.");
    public static final BillingApiException Billing_ssioInsertionOrderCreate_200_Exception = new BillingApiException(200, "Success");
    public static final BillingApiException Billing_ssioInsertionOrderCreate_400_Exception = new BillingApiException(400, "Invalid request.");
    public static final BillingApiException Billing_ssioInsertionOrderEdit_200_Exception = new BillingApiException(200, "Success");
    public static final BillingApiException Billing_ssioInsertionOrderEdit_400_Exception = new BillingApiException(400, "Invalid request.");
    public static final BillingApiException Billing_ssioInsertionOrdersStatusGetByAdAccount_200_Exception = new BillingApiException(200, "Success");
    public static final BillingApiException Billing_ssioInsertionOrdersStatusGetByAdAccount_400_Exception = new BillingApiException(400, "Invalid request parameter.");
    public static final BillingApiException Billing_ssioInsertionOrdersStatusGetByPinOrderId_200_Exception = new BillingApiException(200, "Success");
    public static final BillingApiException Billing_ssioInsertionOrdersStatusGetByPinOrderId_400_Exception = new BillingApiException(400, "Invalid request parameter.");
    public static final BillingApiException Billing_ssioOrderLinesGetByAdAccount_200_Exception = new BillingApiException(200, "Success");
    public static final BillingApiException Billing_ssioOrderLinesGetByAdAccount_400_Exception = new BillingApiException(400, "Invalid request parameter.");
    

}