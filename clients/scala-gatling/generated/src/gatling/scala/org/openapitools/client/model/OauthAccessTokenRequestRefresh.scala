
package org.openapitools.client.model


case class OauthAccessTokenRequestRefresh (
    _grantType: String,
    _refreshToken: String,
    _scope: Option[String]
)
object OauthAccessTokenRequestRefresh {
    def toStringBody(var_grantType: Object, var_refreshToken: Object, var_scope: Object) =
        s"""
        | {
        | "grantType":$var_grantType,"refreshToken":$var_refreshToken,"scope":$var_scope
        | }
        """.stripMargin
}
