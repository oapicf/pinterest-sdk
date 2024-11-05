package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeliveryMetricsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeliveryMetricsResponse(
  items: Option[List[DeliveryMetricsResponseItemsInner]]
)

object DeliveryMetricsResponse {
  implicit lazy val deliveryMetricsResponseJsonFormat: Format[DeliveryMetricsResponse] = Json.format[DeliveryMetricsResponse]
}

