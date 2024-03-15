package org.openapitools.server.model


/**
 * Schema used for creating the integration metadata.
 *
 * @param externalBusinessId External business ID for the integration. for example: ''null''
 * @param connectedMerchantId  for example: ''null''
 * @param connectedAdvertiserId  for example: ''null''
 * @param connectedLbaId  for example: ''null''
 * @param connectedTagId  for example: ''null''
 * @param partnerAccessToken  for example: ''null''
 * @param partnerRefreshToken  for example: ''null''
 * @param partnerPrimaryEmail  for example: ''null''
 * @param partnerAccessTokenExpiry  for example: ''null''
 * @param partnerRefreshTokenExpiry  for example: ''null''
 * @param scopes  for example: ''null''
 * @param additionalId1  for example: ''null''
 * @param partnerMetadata  for example: ''null''
*/
final case class IntegrationRequest (
  externalBusinessId: Option[String] = None,
  connectedMerchantId: Option[String] = None,
  connectedAdvertiserId: Option[String] = None,
  connectedLbaId: Option[String] = None,
  connectedTagId: Option[String] = None,
  partnerAccessToken: Option[String] = None,
  partnerRefreshToken: Option[String] = None,
  partnerPrimaryEmail: Option[String] = None,
  partnerAccessTokenExpiry: Option[Int] = None,
  partnerRefreshTokenExpiry: Option[Int] = None,
  scopes: Option[String] = None,
  additionalId1: Option[String] = None,
  partnerMetadata: Option[String] = None
)

