package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param isNca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. for example: ''null''
 * @param listType Type of customer list (e.g., EMAIL, IDFA, MAID). for example: ''null''
 * @param name Customer list name. for example: ''The Glengarry Glen Ross leads''
 * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. for example: ''email1@pinterest.com,email2@pinterest.com,..<more records>''
 * @param recordsV2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. for example: ''null''
*/
final case class CustomerListCreate (
  isNca: Option[Boolean] = None,
  listType: Option[UserListType] = None,
  name: String,
  records: Option[String] = None,
  recordsV2: Option[Seq[CustomerListRecordRow]] = None
)

