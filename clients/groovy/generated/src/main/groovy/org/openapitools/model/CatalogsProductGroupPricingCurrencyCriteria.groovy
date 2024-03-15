package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;

@Canonical
class CatalogsProductGroupPricingCurrencyCriteria {

    enum OperatorEnum {
    
        GREATER_THAN("GREATER_THAN"),
        
        GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
        
        LESS_THAN("LESS_THAN"),
        
        LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS")
    
        private final String value
    
        OperatorEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    OperatorEnum operator
    
    BigDecimal value
    
    NonNullableCatalogsCurrency currency
    
    Boolean negated = false
}
