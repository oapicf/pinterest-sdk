
package org.openapitools.client.model


case class OauthAccessTokenRequestRefresh (
    _refreshToken: String,
    _scope: Option[String],
    _grantType: String
)
object OauthAccessTokenRequestRefresh {
    def toStringBody(var_refreshToken: Object, var_scope: Object, var_grantType: Object) =
        s"""
        | {
        | "refreshToken":$var_refreshToken,"scope":$var_scope,"grantType":$var_grantType
        | }
        """.stripMargin
}
