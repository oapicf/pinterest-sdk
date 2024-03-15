
package org.openapitools.client.model


case class CustomerListRequest (
    /* Customer list name. */
    _name: String,
    /* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
    _records: String,
    _listType: Option[UserListType],
    /* Customer list errors. */
    _exceptions: Option[Any]
)
object CustomerListRequest {
    def toStringBody(var_name: Object, var_records: Object, var_listType: Object, var_exceptions: Object) =
        s"""
        | {
        | "name":$var_name,"records":$var_records,"listType":$var_listType,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
