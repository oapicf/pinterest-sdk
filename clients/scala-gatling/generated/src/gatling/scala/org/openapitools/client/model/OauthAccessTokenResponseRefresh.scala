
package org.openapitools.client.model


case class OauthAccessTokenResponseRefresh (
    _accessToken: String,
    _expiresIn: Integer,
    _responseType: Option[String],
    _scope: String,
    _tokenType: String,
    _refreshToken: String,
    _refreshTokenExpiresAt: Integer,
    _refreshTokenExpiresIn: Integer
)
object OauthAccessTokenResponseRefresh {
    def toStringBody(var_accessToken: Object, var_expiresIn: Object, var_responseType: Object, var_scope: Object, var_tokenType: Object, var_refreshToken: Object, var_refreshTokenExpiresAt: Object, var_refreshTokenExpiresIn: Object) =
        s"""
        | {
        | "accessToken":$var_accessToken,"expiresIn":$var_expiresIn,"responseType":$var_responseType,"scope":$var_scope,"tokenType":$var_tokenType,"refreshToken":$var_refreshToken,"refreshTokenExpiresAt":$var_refreshTokenExpiresAt,"refreshTokenExpiresIn":$var_refreshTokenExpiresIn
        | }
        """.stripMargin
}
