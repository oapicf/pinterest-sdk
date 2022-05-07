
package org.openapitools.client.model


case class OauthAccessTokenResponseRefresh (
    _responseType: Option[String],
    _accessToken: String,
    _tokenType: String,
    _expiresIn: Integer,
    _scope: String
)
object OauthAccessTokenResponseRefresh {
    def toStringBody(var_responseType: Object, var_accessToken: Object, var_tokenType: Object, var_expiresIn: Object, var_scope: Object) =
        s"""
        | {
        | "responseType":$var_responseType,"accessToken":$var_accessToken,"tokenType":$var_tokenType,"expiresIn":$var_expiresIn,"scope":$var_scope
        | }
        """.stripMargin
}
