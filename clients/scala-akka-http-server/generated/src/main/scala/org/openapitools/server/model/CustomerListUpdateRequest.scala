package org.openapitools.server.model


/**
 * = CustomerListUpdate =
 *
 * @param operationType  for example: ''null''
 * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. for example: ''email2@pinterest.com,email6@pinterest.com,''
*/
final case class CustomerListUpdateRequest (
  operationType: UserListOperationType,
  records: String
)

