
package org.openapitools.client.model


case class OauthAccessTokenRequestClientCredentials (
    _scope: String,
    _grantType: String
)
object OauthAccessTokenRequestClientCredentials {
    def toStringBody(var_scope: Object, var_grantType: Object) =
        s"""
        | {
        | "scope":$var_scope,"grantType":$var_grantType
        | }
        """.stripMargin
}
