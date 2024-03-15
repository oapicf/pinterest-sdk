package org.openapitools.server.model


/**
 * = CustomerListCreate =
 *
 * @param name Customer list name. for example: ''The Glengarry Glen Ross leads''
 * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. for example: ''email1@pinterest.com,email2@pinterest.com,..<more records>''
 * @param listType  for example: ''null''
 * @param exceptions Customer list errors. for example: ''null''
*/
final case class CustomerListRequest (
  name: String,
  records: String,
  listType: Option[UserListType] = None,
  exceptions: Option[Any] = None
)

