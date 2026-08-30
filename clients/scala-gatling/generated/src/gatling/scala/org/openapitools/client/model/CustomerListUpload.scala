
package org.openapitools.client.model


case class CustomerListUpload (
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
    /* Record processing counts */
    _recordCounts: Option[RecordCounts],
    _state: WorkloadState,
    /* Customer List Upload updated_time. Epoch (seconds). */
    _updatedTime: Integer
)
object CustomerListUpload {
    def toStringBody(var_adAccountId: Object, var_creationTime: Object, var_customerListId: Object, var_errorCounts: Object, var_id: Object, var_operation: Object, var_recordCounts: Object, var_state: Object, var_updatedTime: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"creationTime":$var_creationTime,"customerListId":$var_customerListId,"errorCounts":$var_errorCounts,"id":$var_id,"operation":$var_operation,"recordCounts":$var_recordCounts,"state":$var_state,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
