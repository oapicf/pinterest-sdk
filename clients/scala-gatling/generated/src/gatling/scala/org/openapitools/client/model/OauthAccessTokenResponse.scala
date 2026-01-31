
package org.openapitools.client.model


case class OauthAccessTokenResponse (
    _accessToken: String,
    _expiresIn: Integer,
    _responseType: Option[String],
    _scope: String,
    _tokenType: String
)
object OauthAccessTokenResponse {
    def toStringBody(var_accessToken: Object, var_expiresIn: Object, var_responseType: Object, var_scope: Object, var_tokenType: Object) =
        s"""
        | {
        | "accessToken":$var_accessToken,"expiresIn":$var_expiresIn,"responseType":$var_responseType,"scope":$var_scope,"tokenType":$var_tokenType
        | }
        """.stripMargin
}
