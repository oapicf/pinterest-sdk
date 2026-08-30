package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.AdvancedAuctionOperationError;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;

@Canonical
class AdvancedAuctionItemsSubmitUpsertRecord {
    
    AdvancedAuctionBidOptions bidOptions
    
    Country country
    /* Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. */
    List<AdvancedAuctionOperationError> errors = new ArrayList<>()
    /* The catalog retail item id in the merchant namespace */
    String itemId
    
    Language language

    enum OperationEnum {
    
        UPSERT("UPSERT")
    
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
    /* The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. */
    List<UpdateMaskBidOptionField> updateMask
}
