package org.openapitools.server.model


/**
 * @param refreshToken  for example: ''null''
 * @param scope  for example: ''null''
*/
final case class OauthAccessTokenRequestRefreshAllOf (
  refreshToken: String,
  scope: Option[String]
)

