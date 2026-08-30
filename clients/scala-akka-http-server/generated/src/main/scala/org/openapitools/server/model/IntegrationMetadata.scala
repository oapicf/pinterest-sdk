package org.openapitools.server.model


/**
 * = integration =
 *
 * Integration metadata
 *
 * @param additionalId1  for example: ''null''
 * @param connectedAdvertiserId  for example: ''null''
 * @param connectedLbaId  for example: ''null''
 * @param connectedMerchantId  for example: ''null''
 * @param connectedTagId  for example: ''null''
 * @param connectedUserId  for example: ''null''
 * @param createdTimestamp  for example: ''null''
 * @param externalBusinessId External business ID for the integration. for example: ''null''
 * @param id  for example: ''null''
 * @param partnerAccessTokenExpiry  for example: ''null''
 * @param partnerMetadata  for example: ''null''
 * @param partnerRefreshTokenExpiry  for example: ''null''
 * @param scopes  for example: ''null''
 * @param updatedTimestamp  for example: ''null''
*/
final case class IntegrationMetadata (
  additionalId1: Option[String] = None,
  connectedAdvertiserId: Option[String] = None,
  connectedLbaId: Option[String] = None,
  connectedMerchantId: Option[String] = None,
  connectedTagId: Option[String] = None,
  connectedUserId: Option[String] = None,
  createdTimestamp: Option[Double] = None,
  externalBusinessId: Option[String] = None,
  id: Option[String] = None,
  partnerAccessTokenExpiry: Option[Double] = None,
  partnerMetadata: Option[String] = None,
  partnerRefreshTokenExpiry: Option[Double] = None,
  scopes: Option[String] = None,
  updatedTimestamp: Option[Double] = None
)

