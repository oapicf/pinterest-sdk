package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderLineError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OrderLineError(
  data: Option[OrderLine],
  errorMessages: Option[List[String]]
)

object OrderLineError {
  implicit lazy val orderLineErrorJsonFormat: Format[OrderLineError] = Json.format[OrderLineError]
}

