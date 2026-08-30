package org.openapitools.server.model


/**
 * = Integration record =
 *
 * Integration record
 *
 * @param additionalId1  for example: ''null''
 * @param connectedAdvertiserId  for example: ''null''
 * @param connectedLbaId  for example: ''null''
 * @param connectedMerchantId  for example: ''null''
 * @param connectedTagId  for example: ''null''
 * @param connectedUserId  for example: ''null''
 * @param createdTime  for example: ''null''
 * @param externalBusinessId  for example: ''null''
 * @param id Integration record ID. for example: ''null''
 * @param partnerAccessToken  for example: ''null''
 * @param partnerAccessTokenExpiry  for example: ''null''
 * @param partnerMetadata  for example: ''null''
 * @param partnerPrimaryEmail  for example: ''null''
 * @param partnerRefreshToken  for example: ''null''
 * @param partnerRefreshTokenExpiry  for example: ''null''
 * @param scopes  for example: ''null''
 * @param updatedTime  for example: ''null''
*/
final case class IntegrationRecord (
  additionalId1: Option[String] = None,
  connectedAdvertiserId: Option[String] = None,
  connectedLbaId: Option[String] = None,
  connectedMerchantId: Option[String] = None,
  connectedTagId: Option[String] = None,
  connectedUserId: Option[String] = None,
  createdTime: Option[Int] = None,
  externalBusinessId: Option[String] = None,
  id: String,
  partnerAccessToken: Option[String] = None,
  partnerAccessTokenExpiry: Option[Int] = None,
  partnerMetadata: Option[String] = None,
  partnerPrimaryEmail: Option[String] = None,
  partnerRefreshToken: Option[String] = None,
  partnerRefreshTokenExpiry: Option[Int] = None,
  scopes: Option[String] = None,
  updatedTime: Option[Int] = None
)

