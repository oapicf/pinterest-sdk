package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SSIOInsertionOrderUpdate {
    /* Ads manager OrderLineId */
    String adsManagerOrderLineId
    /* URL link for agency */
    String agencyLink
    /* The billing contact email */
    String billingContactEmail
    /* The billing contact first name */
    String billingContactFirstname
    /* The billing contact last name */
    String billingContactLastname
    /* If Budget order line, the budget amount. */
    Double budgetAmount
    /* End date of time period. Format: YYYY-MM-DD */
    String endDate
    /* The media contact email */
    String mediaContactEmail
    /* The media contact first name */
    String mediaContactFirstname
    /* The media contact last name */
    String mediaContactLastname
    /* LineId in the Oracle DB */
    String oracleLineId
    /* The po number */
    String poNumber
    /* OrderId in SFDC */
    String salesforceOrderId
    /* OrderLineId in SFDC */
    String salesforceOrderLineId
    /* Starting date of time period. Format: YYYY-MM-DD */
    String startDate
    /* The email of user submitting the insertion order */
    String userEmail
}
