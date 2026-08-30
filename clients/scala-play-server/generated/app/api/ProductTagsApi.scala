package api

import play.api.libs.json._
import model.Error
import model.ProductTagsBulkAddRequest
import model.ProductTagsBulkDeleteRequest
import model.ProductTagsError
import model.ProductTagsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait ProductTagsApi {
  /**
    * Add product tags to pin
    * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
    * @param pinId Unique identifier of the hero pin that will receive product tags.
    */
  def productTagsBulkAdd(pinId: String, productTagsBulkAddRequest: ProductTagsBulkAddRequest): ProductTagsResponse

  /**
    * Delete product tags from pin
    * Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
    * @param pinId Unique identifier of the hero pin that will receive product tags.
    */
  def productTagsBulkDelete(pinId: String, productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest): Unit

  /**
    * Get product tags for pin
    * Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
    * @param pinId Unique identifier of the hero pin that will receive product tags.
    */
  def productTagsList(pinId: String): ProductTagsResponse
}
