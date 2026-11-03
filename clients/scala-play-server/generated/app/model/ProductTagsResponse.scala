package model

import play.api.libs.json._

/**
  * Response containing a list of product tags for a pin.
  * @param productTags List of product tags on the pin.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductTagsResponse(
  productTags: List[ProductTagItem]
)

object ProductTagsResponse {
  implicit lazy val productTagsResponseJsonFormat: Format[ProductTagsResponse] = Json.format[ProductTagsResponse]
}

