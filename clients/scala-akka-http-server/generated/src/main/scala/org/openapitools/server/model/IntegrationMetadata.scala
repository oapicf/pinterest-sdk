package org.openapitools.server.model


/**
 * = integration =
 *
 * Integration metadata
 *
 * @param id  for example: ''null''
 * @param externalBusinessId  for example: ''null''
 * @param connectedMerchantId  for example: ''null''
 * @param connectedUserId  for example: ''null''
 * @param connectedAdvertiserId  for example: ''null''
 * @param connectedLbaId  for example: ''null''
 * @param connectedTagId  for example: ''null''
 * @param partnerAccessTokenExpiry  for example: ''null''
 * @param partnerRefreshTokenExpiry  for example: ''null''
 * @param scopes  for example: ''null''
 * @param createdTimestamp  for example: ''null''
 * @param updatedTimestamp  for example: ''null''
 * @param additionalId1  for example: ''null''
 * @param partnerMetadata  for example: ''null''
*/
final case class IntegrationMetadata (
  id: Option[String] = None,
  externalBusinessId: Option[String] = None,
  connectedMerchantId: Option[String] = None,
  connectedUserId: Option[String] = None,
  connectedAdvertiserId: Option[String] = None,
  connectedLbaId: Option[String] = None,
  connectedTagId: Option[String] = None,
  partnerAccessTokenExpiry: Option[Double] = None,
  partnerRefreshTokenExpiry: Option[Double] = None,
  scopes: Option[String] = None,
  createdTimestamp: Option[Double] = None,
  updatedTimestamp: Option[Double] = None,
  additionalId1: Option[String] = None,
  partnerMetadata: Option[String] = None
)

