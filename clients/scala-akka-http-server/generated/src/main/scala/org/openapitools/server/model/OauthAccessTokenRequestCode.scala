package org.openapitools.server.model


/**
 * @param code  for example: ''null''
 * @param redirectUri  for example: ''null''
 * @param grantType  for example: ''null''
*/
final case class OauthAccessTokenRequestCode (
  code: String,
  redirectUri: String,
  grantType: String
)

