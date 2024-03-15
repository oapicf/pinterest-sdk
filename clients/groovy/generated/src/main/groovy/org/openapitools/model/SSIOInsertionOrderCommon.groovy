package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class SSIOInsertionOrderCommon {
    /* Starting date of time period. Format: YYYY-MM-DD */
    String startDate
    /* End date of time period. Format: YYYY-MM-DD */
    String endDate
    /* The po number */
    String poNumber
    /* If Budget order line, the budget amount. */
    BigDecimal budgetAmount
    /* The billing contact first name */
    String billingContactFirstname
    /* The billing contact last name */
    String billingContactLastname
    /* The billing contact email */
    String billingContactEmail
    /* The media contact first name */
    String mediaContactFirstname
    /* The media contact last name */
    String mediaContactLastname
    /* The media contact email */
    String mediaContactEmail
    /* URL link for agency */
    String agencyLink
    /* The email of user submitting the insertion order */
    String userEmail
}
