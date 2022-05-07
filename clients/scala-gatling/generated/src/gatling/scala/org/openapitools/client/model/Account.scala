
package org.openapitools.client.model


case class Account (
    /* Type of account */
    _accountType: Option[String],
    _profileImage: Option[String],
    _websiteUrl: Option[String],
    _username: Option[String]
)
object Account {
    def toStringBody(var_accountType: Object, var_profileImage: Object, var_websiteUrl: Object, var_username: Object) =
        s"""
        | {
        | "accountType":$var_accountType,"profileImage":$var_profileImage,"websiteUrl":$var_websiteUrl,"username":$var_username
        | }
        """.stripMargin
}
