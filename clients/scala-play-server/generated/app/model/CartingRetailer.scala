package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CartingRetailer.
  * @param retailerId Unique identifier for the retailer
  * @param retailerName Name of the retailer
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CartingRetailer(
  retailerId: String,
  retailerName: String
)

object CartingRetailer {
  implicit lazy val cartingRetailerJsonFormat: Format[CartingRetailer] = Json.format[CartingRetailer]
}

