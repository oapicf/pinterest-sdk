package org.openapitools.server.model


/**
 * = authorization_code =
 *
 * A request to exchange an authorization code for an access token.
 *
 * @param grantType  for example: ''null''
 * @param code  for example: ''null''
 * @param redirectUri  for example: ''null''
*/
final case class OauthAccessTokenRequestCode (
  grantType: String,
  code: String,
  redirectUri: String
)

