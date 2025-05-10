package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderLineError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class OrderLineError(
  data: Option[OrderLine],
  errorMessages: Option[List[String]]
)

object OrderLineError {
  implicit lazy val orderLineErrorJsonFormat: Format[OrderLineError] = Json.format[OrderLineError]
}

