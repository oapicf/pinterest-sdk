package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BillingProfileCardType;
import org.openapitools.model.BillingProfilePaymentMethodBrand;
import org.openapitools.model.BillingProfileStatus;
import org.openapitools.model.BillingType;

@Canonical
class BillingProfilesResponse {
    /* Advertiser ID of the billing. */
    String advertiserId
    /* Billing type of the advertiser */
    BillingType billingType
    /* Type of the card. */
    BillingProfileCardType cardType
    /* Billing ID. */
    String id
    /* Brand of the payment method. */
    BillingProfilePaymentMethodBrand paymentMethodBrand
    /* Status of the billing. */
    BillingProfileStatus status
}
