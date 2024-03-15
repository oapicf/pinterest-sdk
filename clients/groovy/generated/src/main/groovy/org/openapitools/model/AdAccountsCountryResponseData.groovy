package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.AdCountry;

@Canonical
class AdAccountsCountryResponseData {
    
    AdCountry code
    /* Country currency. */
    String currency
    /* Country index */
    BigDecimal index
    /* Country name */
    String name
}
