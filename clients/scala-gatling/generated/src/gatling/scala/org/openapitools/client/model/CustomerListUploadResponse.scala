
package org.openapitools.client.model


case class CustomerListUploadResponse (
    /* Advertiser ID. */
    _adAccountId: String,
    /* Customer List Upload creation_time. Epoch (seconds). */
    _creationTime: Integer,
    /* ID of the customer list associated with this upload. */
    _customerListId: String,
    /* Error counts by error code */
    _errorCounts: Option[List[ErrorDetail]],
    /* Customer List Upload ID. */
    _id: String,
    _operation: UserListOperationType,
    _recordCounts: Option[RecordCounts],
    /* Workload processing state */
    _state: String,
    /* Customer List Upload updated_time. Epoch (seconds). */
    _updatedTime: Integer
)
object CustomerListUploadResponse {
    def toStringBody(var_adAccountId: Object, var_creationTime: Object, var_customerListId: Object, var_errorCounts: Object, var_id: Object, var_operation: Object, var_recordCounts: Object, var_state: Object, var_updatedTime: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"creationTime":$var_creationTime,"customerListId":$var_customerListId,"errorCounts":$var_errorCounts,"id":$var_id,"operation":$var_operation,"recordCounts":$var_recordCounts,"state":$var_state,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
