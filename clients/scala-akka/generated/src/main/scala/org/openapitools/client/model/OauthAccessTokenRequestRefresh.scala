/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class OauthAccessTokenRequestRefresh (
  grantType: OauthAccessTokenRequestRefreshEnums.GrantType,
  refreshToken: String,
  scope: Option[String] = None,
  /* Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\". */
  refreshOn: Option[Boolean] = None
) extends ApiModel

object OauthAccessTokenRequestRefreshEnums {

  type GrantType = GrantType.Value
  object GrantType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")
  }

}