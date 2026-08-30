package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdvancedAuctionOperationError;
import org.openapitools.model.Country;
import org.openapitools.model.Language;

@Canonical
class AdvancedAuctionItemsSubmitDeleteRecord {
    
    Country country
    /* Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
    List<AdvancedAuctionOperationError> errors = new ArrayList<>()
    /* The catalog retail item id in the merchant namespace */
    String itemId
    
    Language language

    enum OperationEnum {
    
        DELETE("DELETE")
    
        private final String value
    
        OperationEnum(String value) {
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

    
    OperationEnum operation
}
