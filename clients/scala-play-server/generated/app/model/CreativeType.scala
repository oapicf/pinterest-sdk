package model

import play.api.libs.json._

/**
  * Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CreativeType(
)

object CreativeType {
  implicit lazy val creativeTypeJsonFormat: Format[CreativeType] = Json.format[CreativeType]
}

