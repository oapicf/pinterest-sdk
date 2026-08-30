package org.openapitools.server.model


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 *
 * @param operationType Customer list update operation type (add or remove). Only valid in update request body. for example: ''null''
 * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. for example: ''email1@pinterest.com,email2@pinterest.com,..<more records>''
 * @param recordsV2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. for example: ''null''
*/
final case class CustomerListUpdateWithRequiredBody (
  operationType: UserListOperationType,
  records: Option[String] = None,
  recordsV2: Option[Seq[CustomerListRecordRow]] = None
)

