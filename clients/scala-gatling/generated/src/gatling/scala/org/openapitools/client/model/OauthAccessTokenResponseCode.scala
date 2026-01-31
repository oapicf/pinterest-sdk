
package org.openapitools.client.model


case class OauthAccessTokenResponseCode (
    _refreshToken: Option[String],
    _refreshTokenExpiresAt: Option[Integer],
    _refreshTokenExpiresIn: Option[Integer],
    _accessToken: String,
    _expiresIn: Integer,
    _responseType: Option[String],
    _scope: String,
    _tokenType: String
)
object OauthAccessTokenResponseCode {
    def toStringBody(var_refreshToken: Object, var_refreshTokenExpiresAt: Object, var_refreshTokenExpiresIn: Object, var_accessToken: Object, var_expiresIn: Object, var_responseType: Object, var_scope: Object, var_tokenType: Object) =
        s"""
        | {
        | "refreshToken":$var_refreshToken,"refreshTokenExpiresAt":$var_refreshTokenExpiresAt,"refreshTokenExpiresIn":$var_refreshTokenExpiresIn,"accessToken":$var_accessToken,"expiresIn":$var_expiresIn,"responseType":$var_responseType,"scope":$var_scope,"tokenType":$var_tokenType
        | }
        """.stripMargin
}
