package org.openapitools.server.model


/**
 * = Integration record =
 *
 * Integration record
 *
 * @param id  for example: ''null''
 * @param externalBusinessId  for example: ''null''
 * @param connectedMerchantId  for example: ''null''
 * @param connectedUserId  for example: ''null''
 * @param connectedAdvertiserId  for example: ''null''
 * @param connectedLbaId  for example: ''null''
 * @param connectedTagId  for example: ''null''
 * @param partnerAccessToken  for example: ''null''
 * @param partnerRefreshToken  for example: ''null''
 * @param partnerPrimaryEmail  for example: ''null''
 * @param partnerAccessTokenExpiry  for example: ''null''
 * @param partnerRefreshTokenExpiry  for example: ''null''
 * @param scopes  for example: ''null''
 * @param partnerMetadata  for example: ''null''
 * @param additionalId1  for example: ''null''
 * @param createdTime  for example: ''null''
 * @param updatedTime  for example: ''null''
*/
final case class IntegrationRecord (
  id: Option[String] = None,
  externalBusinessId: Option[String] = None,
  connectedMerchantId: Option[String] = None,
  connectedUserId: Option[String] = None,
  connectedAdvertiserId: Option[String] = None,
  connectedLbaId: Option[String] = None,
  connectedTagId: Option[String] = None,
  partnerAccessToken: Option[String] = None,
  partnerRefreshToken: Option[String] = None,
  partnerPrimaryEmail: Option[String] = None,
  partnerAccessTokenExpiry: Option[Int] = None,
  partnerRefreshTokenExpiry: Option[Int] = None,
  scopes: Option[String] = None,
  partnerMetadata: Option[String] = None,
  additionalId1: Option[String] = None,
  createdTime: Option[Int] = None,
  updatedTime: Option[Int] = None
)

