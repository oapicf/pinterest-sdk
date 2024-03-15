
package org.openapitools.client.model


case class OauthAccessTokenRequestCode (
    _grantType: String,
    _code: String,
    _redirectUri: String
)
object OauthAccessTokenRequestCode {
    def toStringBody(var_grantType: Object, var_code: Object, var_redirectUri: Object) =
        s"""
        | {
        | "grantType":$var_grantType,"code":$var_code,"redirectUri":$var_redirectUri
        | }
        """.stripMargin
}
