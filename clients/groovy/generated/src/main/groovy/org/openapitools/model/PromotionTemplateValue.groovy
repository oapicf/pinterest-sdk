package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Currency;

@Canonical
class PromotionTemplateValue {
    /* Numeric value. */
    BigDecimal amount
    
    Currency currencyCode
    /* Custom text. */
    String customText
    /* Percent value. */
    BigDecimal percent
}
