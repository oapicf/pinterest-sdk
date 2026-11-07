package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for delivery_metrics_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeliveryMetricsGet200Response(
  items: List[DeliveryMetricsResponseItemsItems]
)

object DeliveryMetricsGet200Response {
  implicit lazy val deliveryMetricsGet200ResponseJsonFormat: Format[DeliveryMetricsGet200Response] = Json.format[DeliveryMetricsGet200Response]
}

