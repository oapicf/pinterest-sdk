package api

import model.Error
import model.ProductTagsBulkAddRequest
import model.ProductTagsBulkDeleteRequest
import model.ProductTagsError
import model.ProductTagsResponse

/**
  * Provides a default implementation for [[ProductTagsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ProductTagsApiImpl extends ProductTagsApi {
  /**
    * @inheritdoc
    */
  override def productTagsBulkAdd(pinId: String, productTagsBulkAddRequest: ProductTagsBulkAddRequest): ProductTagsResponse = {
    // TODO: Implement better logic

    ProductTagsResponse(List.empty[ProductTagItem])
  }

  /**
    * @inheritdoc
    */
  override def productTagsBulkDelete(pinId: String, productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def productTagsList(pinId: String): ProductTagsResponse = {
    // TODO: Implement better logic

    ProductTagsResponse(List.empty[ProductTagItem])
  }
}
