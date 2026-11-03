package model

import play.api.libs.json._

/**
  * Request body for bulk adding product tags to a pin.
  * @param productTags List of product tags to add. Maximum 24 items allowed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductTagsBulkAddRequest(
  productTags: List[ProductTagItem]
)

object ProductTagsBulkAddRequest {
  implicit lazy val productTagsBulkAddRequestJsonFormat: Format[ProductTagsBulkAddRequest] = Json.format[ProductTagsBulkAddRequest]
}

