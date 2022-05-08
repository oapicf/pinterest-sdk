package org.openapitools.server.model


/**
 * = OAuth access token request =
 *
 * Describes the valid schema for possible OAuth access token requests.
 *
 * @param grantType  for example: ''null''
*/
final case class OauthAccessTokenRequest (
  grantType: String
)

