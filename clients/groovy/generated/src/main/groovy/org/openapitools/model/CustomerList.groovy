package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CustomerList {
    /* Associated ad account ID. */
    String adAccountId
    /* Creation time. Unix timestamp in seconds. */
    BigDecimal createdTime
    /* Customer list ID. */
    String id
    /* Customer list name. */
    String name
    /* Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. */
    BigDecimal numBatches
    /* Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list. */
    BigDecimal numRemovedUserRecords
    /* Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list. */
    BigDecimal numUploadedUserRecords

    enum StatusEnum {
    
        PROCESSING("PROCESSING"),
        
        READY("READY"),
        
        TOO_SMALL("TOO_SMALL"),
        
        UPLOADING("UPLOADING")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. */
    StatusEnum status
    /* Always \"customerlist\". */
    String type
    /* Last update time. Unix timestamp in seconds. */
    BigDecimal updatedTime
    /* Customer list errors */
    Object exceptions
}
