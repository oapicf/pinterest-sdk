
package org.openapitools.client.model


case class CustomerListUpdateRequest (
    _operationType: UserListOperationType,
    /* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
    _records: String
)
object CustomerListUpdateRequest {
    def toStringBody(var_operationType: Object, var_records: Object) =
        s"""
        | {
        | "operationType":$var_operationType,"records":$var_records
        | }
        """.stripMargin
}
