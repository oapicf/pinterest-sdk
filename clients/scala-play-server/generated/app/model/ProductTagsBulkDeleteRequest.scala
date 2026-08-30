package model

import play.api.libs.json._

/**
  * Request body for bulk deleting product tags from a pin.
  * @param productTags List of product tags to delete.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductTagsBulkDeleteRequest(
  productTags: List[ProductTagItem]
)

object ProductTagsBulkDeleteRequest {
  implicit lazy val productTagsBulkDeleteRequestJsonFormat: Format[ProductTagsBulkDeleteRequest] = Json.format[ProductTagsBulkDeleteRequest]
}

