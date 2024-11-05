package org.openapitools.server.model


/**
 * = client_credentials =
 *
 * A request to receive a client token.
 *
 * @param grantType  for example: ''null''
 * @param scope  for example: ''null''
*/
final case class OauthAccessTokenRequestClientCredentials (
  grantType: String,
  scope: String
)

