package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdsCreditDiscountType;

@Canonical
class AdsCreditDiscountsResponse {
    /* True if the offer code is currently active. */
    Boolean active
    /* Advertiser ID the offer was applied to. */
    String advertiserId
    /* Currency value for the discount. */
    String discountCurrency
    /* The discount applied in the offer's currency value. */
    BigDecimal discountInMicroCurrency
    /* The type of discount of this credit */
    AdsCreditDiscountType discountType
    /* The credits left to spend. */
    BigDecimal remainingDiscountInMicroCurrency
    /* Human readable title of the offer code. */
    String title
}
