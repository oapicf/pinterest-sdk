package org.openapitools.server.model


/**
 * = CustomerListUploadCreateRequest =
 *
 * @param operation  for example: ''null''
 * @param totalParts Number of parts to upload the file in. for example: ''2''
*/
final case class CustomerListUploadCreateRequest (
  operation: UserListOperationType,
  totalParts: Int
)

