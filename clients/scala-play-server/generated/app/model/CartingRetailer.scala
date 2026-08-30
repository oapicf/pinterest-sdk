package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CartingRetailer.
  * @param retailerId Unique identifier for the retailer
  * @param retailerName Name of the retailer
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CartingRetailer(
  retailerId: String,
  retailerName: String
)

object CartingRetailer {
  implicit lazy val cartingRetailerJsonFormat: Format[CartingRetailer] = Json.format[CartingRetailer]
}

