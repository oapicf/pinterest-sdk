package model

import play.api.libs.json._

/**
  * Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreativeType(
)

object CreativeType {
  implicit lazy val creativeTypeJsonFormat: Format[CreativeType] = Json.format[CreativeType]
}

