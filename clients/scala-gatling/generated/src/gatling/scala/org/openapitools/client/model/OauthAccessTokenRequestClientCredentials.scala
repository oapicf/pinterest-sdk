
package org.openapitools.client.model


case class OauthAccessTokenRequestClientCredentials (
    _grantType: String,
    _scope: String
)
object OauthAccessTokenRequestClientCredentials {
    def toStringBody(var_grantType: Object, var_scope: Object) =
        s"""
        | {
        | "grantType":$var_grantType,"scope":$var_scope
        | }
        """.stripMargin
}
