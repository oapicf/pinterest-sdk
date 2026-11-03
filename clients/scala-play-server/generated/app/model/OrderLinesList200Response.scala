package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for order_lines_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OrderLinesList200Response(
  bookmark: Option[String],
  items: List[OrderLine]
)

object OrderLinesList200Response {
  implicit lazy val orderLinesList200ResponseJsonFormat: Format[OrderLinesList200Response] = Json.format[OrderLinesList200Response]
}

