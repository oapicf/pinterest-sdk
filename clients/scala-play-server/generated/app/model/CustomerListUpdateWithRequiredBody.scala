package model

import play.api.libs.json._

/**
  * Resource create or update operation model with required body fields (no OptionalProperties).
  * @param operationType Customer list update operation type (add or remove). Only valid in update request body.
  * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  * @param recordsV2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerListUpdateWithRequiredBody(
  operationType: UserListOperationType,
  records: Option[String],
  recordsV2: Option[List[CustomerListRecordRow]]
)

object CustomerListUpdateWithRequiredBody {
  implicit lazy val customerListUpdateWithRequiredBodyJsonFormat: Format[CustomerListUpdateWithRequiredBody] = Json.format[CustomerListUpdateWithRequiredBody]
}

