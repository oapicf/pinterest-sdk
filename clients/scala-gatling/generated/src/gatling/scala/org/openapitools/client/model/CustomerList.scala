
package org.openapitools.client.model


case class CustomerList (
    /* Associated ad account ID. */
    _adAccountId: Option[String],
    /* Creation time. Unix timestamp in seconds. */
    _createdTime: Option[Number],
    /* Customer list ID. */
    _id: Option[String],
    /* Customer list name. */
    _name: Option[String],
    /* Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. */
    _numBatches: Option[Number],
    /* Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list. */
    _numRemovedUserRecords: Option[Number],
    /* Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list. */
    _numUploadedUserRecords: Option[Number],
    /* Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. */
    _status: Option[String],
    /* Always \"customerlist\". */
    _type: Option[String],
    /* Last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Number],
    /* Customer list errors */
    _exceptions: Option[Any]
)
object CustomerList {
    def toStringBody(var_adAccountId: Object, var_createdTime: Object, var_id: Object, var_name: Object, var_numBatches: Object, var_numRemovedUserRecords: Object, var_numUploadedUserRecords: Object, var_status: Object, var_type: Object, var_updatedTime: Object, var_exceptions: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"createdTime":$var_createdTime,"id":$var_id,"name":$var_name,"numBatches":$var_numBatches,"numRemovedUserRecords":$var_numRemovedUserRecords,"numUploadedUserRecords":$var_numUploadedUserRecords,"status":$var_status,"type":$var_type,"updatedTime":$var_updatedTime,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
