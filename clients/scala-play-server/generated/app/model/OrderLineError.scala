package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderLineError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class OrderLineError(
  data: Option[OrderLine],
  errorMessages: Option[List[String]]
)

object OrderLineError {
  implicit lazy val orderLineErrorJsonFormat: Format[OrderLineError] = Json.format[OrderLineError]
}

