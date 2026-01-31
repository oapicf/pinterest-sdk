package org.openapitools.server.model


/**
 * Schema used for updating the integration metadata.
 *
 * @param additionalId1  for example: ''null''
 * @param connectedAdvertiserId  for example: ''null''
 * @param connectedLbaId  for example: ''null''
 * @param connectedMerchantId  for example: ''null''
 * @param connectedTagId  for example: ''null''
 * @param partnerAccessToken  for example: ''null''
 * @param partnerAccessTokenExpiry  for example: ''null''
 * @param partnerMetadata  for example: ''null''
 * @param partnerPrimaryEmail  for example: ''null''
 * @param partnerRefreshToken  for example: ''null''
 * @param partnerRefreshTokenExpiry  for example: ''null''
 * @param scopes  for example: ''null''
*/
final case class IntegrationRequestPatch (
  additionalId1: Option[String] = None,
  connectedAdvertiserId: Option[String] = None,
  connectedLbaId: Option[String] = None,
  connectedMerchantId: Option[String] = None,
  connectedTagId: Option[String] = None,
  partnerAccessToken: Option[String] = None,
  partnerAccessTokenExpiry: Option[Double] = None,
  partnerMetadata: Option[String] = None,
  partnerPrimaryEmail: Option[String] = None,
  partnerRefreshToken: Option[String] = None,
  partnerRefreshTokenExpiry: Option[Double] = None,
  scopes: Option[String] = None
)

