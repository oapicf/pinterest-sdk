package api

import model.CatalogsItems
import model.CatalogsItemsBatch
import model.CatalogsItemsRequest
import model.Error
import model.ItemsBatchPostRequest

/**
  * Provides a default implementation for [[CatalogItemsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class CatalogItemsApiImpl extends CatalogItemsApi {
  /**
    * @inheritdoc
    */
  override def itemsBatchGet(batchId: String, adAccountId: Option[String]): CatalogsItemsBatch = {
    // TODO: Implement better logic

    CatalogsItemsBatch(CatalogsType(), None, None, OffsetDateTime.now, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemsBatchPost(itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId: Option[String]): CatalogsItemsBatch = {
    // TODO: Implement better logic

    CatalogsItemsBatch(CatalogsType(), None, None, OffsetDateTime.now, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemsPost(catalogsItemsRequest: CatalogsItemsRequest, adAccountId: Option[String]): CatalogsItems = {
    // TODO: Implement better logic

    CatalogsItems(None)
  }
}
