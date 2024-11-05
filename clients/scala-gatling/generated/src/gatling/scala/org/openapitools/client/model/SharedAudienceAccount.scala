
package org.openapitools.client.model


case class SharedAudienceAccount (
    /* Account ID (ad account or business ID). */
    _accountId: String,
    /* Account name. */
    _accountName: String,
    /* account type */
    _accountType: String,
    /* Epoch timestamp in seconds for the shared audience event */
    _sharedOnTimestamp: Integer
)
object SharedAudienceAccount {
    def toStringBody(var_accountId: Object, var_accountName: Object, var_accountType: Object, var_sharedOnTimestamp: Object) =
        s"""
        | {
        | "accountId":$var_accountId,"accountName":$var_accountName,"accountType":$var_accountType,"sharedOnTimestamp":$var_sharedOnTimestamp
        | }
        """.stripMargin
}
