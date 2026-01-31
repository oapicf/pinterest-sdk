package model

import play.api.libs.json._

/**
  * Set of quality components, with each component containing a event coverage and details.
  * @param externalEventId Dedup components.
  * @param hashedEmail User matching identifiers.
  * @param productId Product/event metadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class QualityComponents(
  advertiserExternalId: Option[Map[String, QualityComponentDetails]],
  clickIdEpik: Option[Map[String, QualityComponentDetails]],
  externalEventId: Option[Map[String, QualityComponentDetails]],
  hashedEmail: Option[Map[String, QualityComponentDetails]],
  hashedMaid: Option[Map[String, QualityComponentDetails]],
  ipAddress: Option[Map[String, QualityComponentDetails]],
  orderId: Option[Map[String, QualityComponentDetails]],
  orderValue: Option[Map[String, QualityComponentDetails]],
  productId: Option[Map[String, QualityComponentDetails]],
  sourceUrl: Option[Map[String, QualityComponentDetails]],
  userAgent: Option[Map[String, QualityComponentDetails]],
)

object QualityComponents {
  implicit lazy val qualityComponentsJsonFormat: Format[QualityComponents] = Json.format[QualityComponents]
}

