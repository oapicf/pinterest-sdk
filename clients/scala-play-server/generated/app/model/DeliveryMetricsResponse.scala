package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeliveryMetricsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeliveryMetricsResponse(
  items: Option[List[DeliveryMetricsResponseItemsInner]]
)

object DeliveryMetricsResponse {
  implicit lazy val deliveryMetricsResponseJsonFormat: Format[DeliveryMetricsResponse] = Json.format[DeliveryMetricsResponse]
}

