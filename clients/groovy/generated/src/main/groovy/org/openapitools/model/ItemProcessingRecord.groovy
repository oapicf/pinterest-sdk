package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemProcessingStatus;
import org.openapitools.model.ItemValidationEvent;

@Canonical
class ItemProcessingRecord {
    /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    List<ItemValidationEvent> errors = new ArrayList<>()
    /* The catalog item id in the merchant namespace */
    String itemId
    
    ItemProcessingStatus status
    /* Array with the validation warnings for the item processing record */
    List<ItemValidationEvent> warnings = new ArrayList<>()
}
