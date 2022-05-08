
package org.openapitools.client.model


case class OauthAccessTokenRequest (
    _grantType: String
)
object OauthAccessTokenRequest {
    def toStringBody(var_grantType: Object) =
        s"""
        | {
        | "grantType":$var_grantType
        | }
        """.stripMargin
}
