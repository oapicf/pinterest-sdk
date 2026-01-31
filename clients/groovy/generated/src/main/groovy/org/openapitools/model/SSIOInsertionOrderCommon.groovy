package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class SSIOInsertionOrderCommon {
    /* URL link for agency */
    String agencyLink
    /* The billing contact email */
    String billingContactEmail
    /* The billing contact first name */
    String billingContactFirstname
    /* The billing contact last name */
    String billingContactLastname
    /* If Budget order line, the budget amount. */
    BigDecimal budgetAmount
    /* End date of time period. Format: YYYY-MM-DD */
    String endDate
    /* The media contact email */
    String mediaContactEmail
    /* The media contact first name */
    String mediaContactFirstname
    /* The media contact last name */
    String mediaContactLastname
    /* The po number */
    String poNumber
    /* Starting date of time period. Format: YYYY-MM-DD */
    String startDate
    /* The email of user submitting the insertion order */
    String userEmail
}
