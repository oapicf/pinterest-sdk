package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.SupplementalItemProcessingStatus;
import org.openapitools.model.SupplementalItemValidationEvent;

@Canonical
class LocalInventoryOperationResult {
    /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    List<SupplementalItemValidationEvent> errors = new ArrayList<>()
    /* Catalog item id in the merchant namespace */
    String itemId
    /* Status of the item processing record */
    SupplementalItemProcessingStatus status
    /* Store code for the local inventory item */
    String storeCode

    enum SupplementalTypeEnum {
    
        LOCAL_INVENTORY("LOCAL_INVENTORY")
    
        private final String value
    
        SupplementalTypeEnum(String value) {
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

    
    SupplementalTypeEnum supplementalType
    /* Array with the validation warnings for the item processing record */
    List<SupplementalItemValidationEvent> warnings = new ArrayList<>()
}
