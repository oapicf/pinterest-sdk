package model

import play.api.libs.json._

/**
  * Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreativeType(
)

object CreativeType {
  implicit lazy val creativeTypeJsonFormat: Format[CreativeType] = Json.format[CreativeType]
}

