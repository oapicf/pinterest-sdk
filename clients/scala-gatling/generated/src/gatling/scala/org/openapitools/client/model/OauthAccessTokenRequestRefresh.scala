
package org.openapitools.client.model


case class OauthAccessTokenRequestRefresh (
    _refreshToken: String,
    _scope: Option[String],
    /* Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\". */
    _refreshOn: Option[Boolean],
    _grantType: String
)
object OauthAccessTokenRequestRefresh {
    def toStringBody(var_refreshToken: Object, var_scope: Object, var_refreshOn: Object, var_grantType: Object) =
        s"""
        | {
        | "refreshToken":$var_refreshToken,"scope":$var_scope,"refreshOn":$var_refreshOn,"grantType":$var_grantType
        | }
        """.stripMargin
}
