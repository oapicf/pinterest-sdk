
package org.openapitools.client.model


case class OauthAccessTokenRequestCodeAllOf (
    _code: String,
    _redirectUri: String
)
object OauthAccessTokenRequestCodeAllOf {
    def toStringBody(var_code: Object, var_redirectUri: Object) =
        s"""
        | {
        | "code":$var_code,"redirectUri":$var_redirectUri
        | }
        """.stripMargin
}
