
package org.openapitools.client.model


case class OauthAccessTokenResponseIntegrationRefresh (
    _refreshToken: String,
    _refreshTokenExpiresIn: Integer,
    _responseType: Option[String],
    _accessToken: String,
    _tokenType: String,
    _expiresIn: Integer,
    _scope: String
)
object OauthAccessTokenResponseIntegrationRefresh {
    def toStringBody(var_refreshToken: Object, var_refreshTokenExpiresIn: Object, var_responseType: Object, var_accessToken: Object, var_tokenType: Object, var_expiresIn: Object, var_scope: Object) =
        s"""
        | {
        | "refreshToken":$var_refreshToken,"refreshTokenExpiresIn":$var_refreshTokenExpiresIn,"responseType":$var_responseType,"accessToken":$var_accessToken,"tokenType":$var_tokenType,"expiresIn":$var_expiresIn,"scope":$var_scope
        | }
        """.stripMargin
}
