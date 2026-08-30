package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CustomerListStatus;

@Canonical
class CustomerList {
    /* Associated ad account ID. */
    String adAccountId
    /* Creation time. Unix timestamp in seconds. */
    BigDecimal createdTime
    /* Customer list errors. */
    Object exceptions
    /* Customer list ID. */
    String id
    /* Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. */
    Boolean isNca
    /* Customer list name. */
    String name
    /* Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. */
    BigDecimal numBatches
    /* Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. */
    BigDecimal numRemovedUserRecords
    /* Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. */
    BigDecimal numUploadedUserRecords
    /* Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users. */
    CustomerListStatus status
    /* Always `customerlist`. */
    String type
    /* Last update time. Unix timestamp in seconds. */
    BigDecimal updatedTime
}
