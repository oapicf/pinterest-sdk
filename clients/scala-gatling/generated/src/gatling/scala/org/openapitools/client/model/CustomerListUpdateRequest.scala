
package org.openapitools.client.model


case class CustomerListUpdateRequest (
    /* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
    _records: String,
    _operationType: UserListOperationType,
    _exceptions: Option[Exception]
)
object CustomerListUpdateRequest {
    def toStringBody(var_records: Object, var_operationType: Object, var_exceptions: Object) =
        s"""
        | {
        | "records":$var_records,"operationType":$var_operationType,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
