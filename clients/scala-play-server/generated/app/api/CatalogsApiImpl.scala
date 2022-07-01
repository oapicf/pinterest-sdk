package api

import model.CatalogsFeed
import model.CatalogsFeedsCreateRequest
import model.CatalogsFeedsUpdateRequest
import model.CatalogsItems
import model.CatalogsItemsBatch
import model.CatalogsItemsBatchRequest
import model.CatalogsProductGroup
import model.CatalogsProductGroupCreateRequest
import model.CatalogsProductGroupUpdateRequest
import model.Error
import model.JsObject
import model.Paginated

/**
  * Provides a default implementation for [[CatalogsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
class CatalogsApiImpl extends CatalogsApi {
  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsCreate(catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest): JsObject = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsDelete(productGroupId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsList(feedId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest): CatalogsProductGroup = {
    // TODO: Implement better logic

    CatalogsProductGroup("", None, None, CatalogsProductGroupFilters(None, None, Map.empty), None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedProcessingResultsList(feedId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsCreate(catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed(None, None, None, Country(), ProductAvailabilityType(), NullableCurrency(), "", CatalogsFormat(), "", CatalogsFeedCredentials("", "", Map.empty), "", CatalogsFeedProcessingSchedule("", "", Map.empty), CatalogsStatus(), Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsDelete(feedId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def feedsGet(feedId: String): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed(None, None, None, Country(), ProductAvailabilityType(), NullableCurrency(), "", CatalogsFormat(), "", CatalogsFeedCredentials("", "", Map.empty), "", CatalogsFeedProcessingSchedule("", "", Map.empty), CatalogsStatus(), Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsList(bookmark: Option[String], pageSize: Option[Int]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsUpdate(feedId: String, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed(None, None, None, Country(), ProductAvailabilityType(), NullableCurrency(), "", CatalogsFormat(), "", CatalogsFeedCredentials("", "", Map.empty), "", CatalogsFeedProcessingSchedule("", "", Map.empty), CatalogsStatus(), Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def itemsBatchGet(batchId: String): CatalogsItemsBatch = {
    // TODO: Implement better logic

    CatalogsItemsBatch(None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def itemsBatchPost(catalogsItemsBatchRequest: CatalogsItemsBatchRequest): CatalogsItemsBatch = {
    // TODO: Implement better logic

    CatalogsItemsBatch(None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def itemsGet(country: String, itemIds: List[String], language: String): CatalogsItems = {
    // TODO: Implement better logic

    CatalogsItems(None, Map.empty)
  }
}
