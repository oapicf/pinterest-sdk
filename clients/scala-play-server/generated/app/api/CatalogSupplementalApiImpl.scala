package api

import model.CatalogsLocalStoresCreate200ResponseInner
import model.CatalogsLocalStoresDelete200ResponseInner
import model.CatalogsLocalStoresList200Response
import model.Error
import model.LocalInventoryItemsBatch
import model.LocalInventoryItemsBatchCreate
import model.LocalInventoryItemsGet
import model.LocalInventoryItemsGetCreate
import model.LocalStore
import model.LocalStoreBatchUpdate
import model.LocalStoreCreate
import model.SupplementalItemsBatchResponse

/**
  * Provides a default implementation for [[CatalogSupplementalApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class CatalogSupplementalApiImpl extends CatalogSupplementalApi {
  /**
    * @inheritdoc
    */
  override def catalogsLocalInventoryItemsBatchOperate(catalogId: String, localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, adAccountId: Option[String]): SupplementalItemsBatchResponse = {
    // TODO: Implement better logic

    SupplementalItemsBatchResponse("", None, OffsetDateTime.now, List.empty[SupplementalOperationResult], SupplementalItemBatchOperationStatus())
  }

  /**
    * @inheritdoc
    */
  override def catalogsLocalInventoryItemsPost(catalogId: String, localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, adAccountId: Option[String]): LocalInventoryItemsGet = {
    // TODO: Implement better logic

    LocalInventoryItemsGet(List.empty[LocalInventoryItemResponse])
  }

  /**
    * @inheritdoc
    */
  override def catalogsLocalStoresCreate(catalogId: String, localStoreCreate: List[LocalStoreCreate], adAccountId: Option[String]): List[CatalogsLocalStoresCreate200ResponseInner] = {
    // TODO: Implement better logic

    List.empty[CatalogsLocalStoresCreate200ResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def catalogsLocalStoresDelete(catalogId: String, ids: List[String], adAccountId: Option[String]): List[CatalogsLocalStoresDelete200ResponseInner] = {
    // TODO: Implement better logic

    List.empty[CatalogsLocalStoresDelete200ResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def catalogsLocalStoresList(catalogId: String, ids: Option[List[String]], adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): CatalogsLocalStoresList200Response = {
    // TODO: Implement better logic

    CatalogsLocalStoresList200Response(None, List.empty[LocalStore])
  }

  /**
    * @inheritdoc
    */
  override def catalogsLocalStoresUpdate(catalogId: String, localStoreBatchUpdate: List[LocalStoreBatchUpdate], adAccountId: Option[String]): List[CatalogsLocalStoresCreate200ResponseInner] = {
    // TODO: Implement better logic

    List.empty[CatalogsLocalStoresCreate200ResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def catalogsSupplementalItemsBatchGet(catalogId: String, batchId: String, adAccountId: Option[String]): SupplementalItemsBatchResponse = {
    // TODO: Implement better logic

    SupplementalItemsBatchResponse("", None, OffsetDateTime.now, List.empty[SupplementalOperationResult], SupplementalItemBatchOperationStatus())
  }
}
