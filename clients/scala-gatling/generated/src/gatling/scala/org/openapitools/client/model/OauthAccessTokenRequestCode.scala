
package org.openapitools.client.model


case class OauthAccessTokenRequestCode (
    _code: String,
    _redirectUri: String,
    _grantType: String
)
object OauthAccessTokenRequestCode {
    def toStringBody(var_code: Object, var_redirectUri: Object, var_grantType: Object) =
        s"""
        | {
        | "code":$var_code,"redirectUri":$var_redirectUri,"grantType":$var_grantType
        | }
        """.stripMargin
}
