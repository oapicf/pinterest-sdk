
package org.openapitools.client.model


case class CustomerList (
    /* Associated ad account ID. */
    _adAccountId: Option[String],
    /* Creation time. Unix timestamp in seconds. */
    _createdTime: Option[Number],
    /* Customer list errors. */
    _exceptions: Option[Any],
    /* Customer list ID. */
    _id: String,
    /* Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. */
    _isNca: Option[Boolean],
    /* Customer list name. */
    _name: String,
    /* Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. */
    _numBatches: Option[Number],
    /* Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. */
    _numRemovedUserRecords: Option[Number],
    /* Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. */
    _numUploadedUserRecords: Option[Number],
    /* Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users. */
    _status: Option[CustomerListStatus],
    /* Always `customerlist`. */
    _type: Option[String],
    /* Last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Number]
)
object CustomerList {
    def toStringBody(var_adAccountId: Object, var_createdTime: Object, var_exceptions: Object, var_id: Object, var_isNca: Object, var_name: Object, var_numBatches: Object, var_numRemovedUserRecords: Object, var_numUploadedUserRecords: Object, var_status: Object, var_type: Object, var_updatedTime: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"createdTime":$var_createdTime,"exceptions":$var_exceptions,"id":$var_id,"isNca":$var_isNca,"name":$var_name,"numBatches":$var_numBatches,"numRemovedUserRecords":$var_numRemovedUserRecords,"numUploadedUserRecords":$var_numUploadedUserRecords,"status":$var_status,"type":$var_type,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
