package org.openapitools.server.model


/**
 * @param scope  for example: ''null''
 * @param grantType  for example: ''null''
*/
final case class OauthAccessTokenRequestClientCredentials (
  scope: String,
  grantType: String
)

