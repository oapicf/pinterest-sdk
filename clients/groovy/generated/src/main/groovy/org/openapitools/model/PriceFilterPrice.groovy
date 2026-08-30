package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NumericFilterOperatorType;

@Canonical
class PriceFilterPrice {
    
    NonNullableCatalogsCurrency currency
    
    Boolean negated
    
    NumericFilterOperatorType operator
    
    BigDecimal value
}
