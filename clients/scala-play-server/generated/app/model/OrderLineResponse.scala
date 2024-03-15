package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderLineResponse.
  * @param errors Error list if update(s) fail.
  * @param orderLine Order Line object array.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class OrderLineResponse(
  errors: Option[List[OrderLineError]],
  orderLine: Option[List[OrderLine]]
)

object OrderLineResponse {
  implicit lazy val orderLineResponseJsonFormat: Format[OrderLineResponse] = Json.format[OrderLineResponse]
}

