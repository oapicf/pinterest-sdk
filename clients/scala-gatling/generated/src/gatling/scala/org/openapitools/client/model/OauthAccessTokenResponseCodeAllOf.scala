
package org.openapitools.client.model


case class OauthAccessTokenResponseCodeAllOf (
    _refreshToken: String,
    _refreshTokenExpiresIn: Integer
)
object OauthAccessTokenResponseCodeAllOf {
    def toStringBody(var_refreshToken: Object, var_refreshTokenExpiresIn: Object) =
        s"""
        | {
        | "refreshToken":$var_refreshToken,"refreshTokenExpiresIn":$var_refreshTokenExpiresIn
        | }
        """.stripMargin
}
