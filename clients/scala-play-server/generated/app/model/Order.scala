package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Order.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Order(
)

object Order {
  implicit lazy val orderJsonFormat: Format[Order] = Json.format[Order]
}

