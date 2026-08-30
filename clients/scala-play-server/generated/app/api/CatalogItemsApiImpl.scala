package api

import model.CatalogsItemsBatch
import model.CatalogsItemsBatchPostRequest
import model.CatalogsItemsRequest
import model.Error
import model.ItemsPost200Response

/**
  * Provides a default implementation for [[CatalogItemsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class CatalogItemsApiImpl extends CatalogItemsApi {
  /**
    * @inheritdoc
    */
  override def itemsBatchGet(batchId: String, adAccountId: Option[String]): CatalogsItemsBatch = {
    // TODO: Implement better logic

    CatalogsItemsBatch(None, "", None, OffsetDateTime.now, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def itemsBatchPost(catalogsItemsBatchPostRequest: CatalogsItemsBatchPostRequest, adAccountId: Option[String]): CatalogsItemsBatch = {
    // TODO: Implement better logic

    CatalogsItemsBatch(None, "", None, OffsetDateTime.now, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def itemsPost(catalogsItemsRequest: CatalogsItemsRequest, adAccountId: Option[String]): ItemsPost200Response = {
    // TODO: Implement better logic

    ItemsPost200Response(List.empty[ItemResponse])
  }
}
