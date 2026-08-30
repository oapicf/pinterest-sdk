package model

import play.api.libs.json._

/**
  * Product tag request item containing the pin_id of the product to tag.
  * @param pinId Pin ID of the product pin to tag onto the hero pin.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductTagItem(
  pinId: String
)

object ProductTagItem {
  implicit lazy val productTagItemJsonFormat: Format[ProductTagItem] = Json.format[ProductTagItem]
}

