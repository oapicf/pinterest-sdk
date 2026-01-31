package org.openapitools.server.model


/**
 * @param refreshToken  for example: ''null''
 * @param scope  for example: ''null''
 * @param grantType  for example: ''null''
*/
final case class OauthAccessTokenRequestRefresh (
  refreshToken: String,
  scope: Option[String] = None,
  grantType: String
)

