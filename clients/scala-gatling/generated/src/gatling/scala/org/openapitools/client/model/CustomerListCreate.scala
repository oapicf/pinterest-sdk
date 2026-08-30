
package org.openapitools.client.model


case class CustomerListCreate (
    /* Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. */
    _isNca: Option[Boolean],
    /* Type of customer list (e.g., EMAIL, IDFA, MAID). */
    _listType: Option[UserListType],
    /* Customer list name. */
    _name: String,
    /* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
    _records: Option[String],
    /* Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. */
    _recordsV2: Option[List[CustomerListRecordRow]]
)
object CustomerListCreate {
    def toStringBody(var_isNca: Object, var_listType: Object, var_name: Object, var_records: Object, var_recordsV2: Object) =
        s"""
        | {
        | "isNca":$var_isNca,"listType":$var_listType,"name":$var_name,"records":$var_records,"recordsV2":$var_recordsV2
        | }
        """.stripMargin
}
