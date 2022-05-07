package org.openapitools.server.model


/**
 * = refresh_token =
 *
 * A request to exchange a refresh token for a new access token.
 *
 * @param grantType  for example: ''null''
 * @param refreshToken  for example: ''null''
 * @param scope  for example: ''null''
*/
final case class OauthAccessTokenRequestRefresh (
  grantType: String,
  refreshToken: String,
  scope: Option[String]
)

