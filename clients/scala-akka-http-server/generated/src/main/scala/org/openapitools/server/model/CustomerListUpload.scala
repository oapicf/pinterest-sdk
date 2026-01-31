package org.openapitools.server.model


/**
 * = CustomerListUpload =
 *
 * @param adAccountId Advertiser ID. for example: ''9876543210''
 * @param creationTime Customer List Upload creation_time. Epoch (seconds). for example: ''1728606435''
 * @param customerListId ID of the customer list associated with this upload. for example: ''59854745824''
 * @param errorCounts Error counts by error code for example: ''[{"error_code":42,"message":"Invalid email","count":20}]''
 * @param id Customer List Upload ID. for example: ''1234567890''
 * @param operation  for example: ''null''
 * @param recordCounts  for example: ''null''
 * @param state Workload processing state for example: ''RUNNING''
 * @param updatedTime Customer List Upload updated_time. Epoch (seconds). for example: ''1728606435''
*/
final case class CustomerListUpload (
  adAccountId: String,
  creationTime: Int,
  customerListId: String,
  errorCounts: Option[Seq[ErrorDetail]] = None,
  id: String,
  operation: UserListOperationType,
  recordCounts: Option[RecordCounts] = None,
  state: String,
  updatedTime: Int
)

