package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for order_lines_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class OrderLinesList200Response(
  items: List[OrderLine],
  bookmark: Option[String]
)

object OrderLinesList200Response {
  implicit lazy val orderLinesList200ResponseJsonFormat: Format[OrderLinesList200Response] = Json.format[OrderLinesList200Response]
}

