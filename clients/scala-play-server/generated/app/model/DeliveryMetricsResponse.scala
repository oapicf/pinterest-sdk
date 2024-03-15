package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeliveryMetricsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class DeliveryMetricsResponse(
  items: Option[List[DeliveryMetricsResponseItemsInner]]
)

object DeliveryMetricsResponse {
  implicit lazy val deliveryMetricsResponseJsonFormat: Format[DeliveryMetricsResponse] = Json.format[DeliveryMetricsResponse]
}

