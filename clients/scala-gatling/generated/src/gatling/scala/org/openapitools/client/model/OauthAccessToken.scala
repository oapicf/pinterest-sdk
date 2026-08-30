
package org.openapitools.client.model


case class OauthAccessToken (
    _accessToken: String,
    _expiresIn: Integer,
    _refreshToken: Option[String],
    _refreshTokenExpiresAt: Option[Integer],
    _refreshTokenExpiresIn: Option[Integer],
    _responseType: Option[TokenGrantType],
    _scope: Option[String],
    _tokenType: String
)
object OauthAccessToken {
    def toStringBody(var_accessToken: Object, var_expiresIn: Object, var_refreshToken: Object, var_refreshTokenExpiresAt: Object, var_refreshTokenExpiresIn: Object, var_responseType: Object, var_scope: Object, var_tokenType: Object) =
        s"""
        | {
        | "accessToken":$var_accessToken,"expiresIn":$var_expiresIn,"refreshToken":$var_refreshToken,"refreshTokenExpiresAt":$var_refreshTokenExpiresAt,"refreshTokenExpiresIn":$var_refreshTokenExpiresIn,"responseType":$var_responseType,"scope":$var_scope,"tokenType":$var_tokenType
        | }
        """.stripMargin
}
