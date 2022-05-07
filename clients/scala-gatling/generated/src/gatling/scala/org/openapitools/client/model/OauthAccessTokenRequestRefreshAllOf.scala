
package org.openapitools.client.model


case class OauthAccessTokenRequestRefreshAllOf (
    _refreshToken: String,
    _scope: Option[String]
)
object OauthAccessTokenRequestRefreshAllOf {
    def toStringBody(var_refreshToken: Object, var_scope: Object) =
        s"""
        | {
        | "refreshToken":$var_refreshToken,"scope":$var_scope
        | }
        """.stripMargin
}
