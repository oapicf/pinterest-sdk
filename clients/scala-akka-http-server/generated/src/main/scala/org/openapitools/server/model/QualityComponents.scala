package org.openapitools.server.model


/**
 * Set of quality components, with each component containing a event coverage and details.
 *
 * @param advertiserExternalId  for example: ''null''
 * @param clickIdEpik  for example: ''null''
 * @param externalEventId Dedup components. for example: ''null''
 * @param hashedEmail User matching identifiers. for example: ''null''
 * @param hashedMaid  for example: ''null''
 * @param ipAddress  for example: ''null''
 * @param orderId  for example: ''null''
 * @param orderValue  for example: ''null''
 * @param productId Product/event metadata. for example: ''null''
 * @param sourceUrl  for example: ''null''
 * @param userAgent  for example: ''null''
*/
final case class QualityComponents (
  advertiserExternalId: Option[Map[String, QualityComponentDetails]] = None,
  clickIdEpik: Option[Map[String, QualityComponentDetails]] = None,
  externalEventId: Option[Map[String, QualityComponentDetails]] = None,
  hashedEmail: Option[Map[String, QualityComponentDetails]] = None,
  hashedMaid: Option[Map[String, QualityComponentDetails]] = None,
  ipAddress: Option[Map[String, QualityComponentDetails]] = None,
  orderId: Option[Map[String, QualityComponentDetails]] = None,
  orderValue: Option[Map[String, QualityComponentDetails]] = None,
  productId: Option[Map[String, QualityComponentDetails]] = None,
  sourceUrl: Option[Map[String, QualityComponentDetails]] = None,
  userAgent: Option[Map[String, QualityComponentDetails]] = None
)

