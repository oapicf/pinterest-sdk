
package org.openapitools.client.model


case class CustomerListUpdateWithRequiredBody (
    /* Customer list update operation type (add or remove). Only valid in update request body. */
    _operationType: UserListOperationType,
    /* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
    _records: Option[String],
    /* Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. */
    _recordsV2: Option[List[CustomerListRecordRow]]
)
object CustomerListUpdateWithRequiredBody {
    def toStringBody(var_operationType: Object, var_records: Object, var_recordsV2: Object) =
        s"""
        | {
        | "operationType":$var_operationType,"records":$var_records,"recordsV2":$var_recordsV2
        | }
        """.stripMargin
}
