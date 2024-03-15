package api

import model.CatalogsFeed
import model.CatalogsItemValidationIssue
import model.CatalogsItems
import model.CatalogsItemsBatch
import model.CatalogsItemsFilters
import model.CatalogsList200Response
import model.CatalogsListProductsByFilterRequest
import model.CatalogsProductGroupPinsList200Response
import model.CatalogsProductGroupProductCounts
import model.CatalogsProductGroupsCreate201Response
import model.CatalogsProductGroupsCreateRequest
import model.CatalogsProductGroupsList200Response
import model.CatalogsProductGroupsUpdateRequest
import model.Error
import model.FeedProcessingResultsList200Response
import model.FeedsCreateRequest
import model.FeedsList200Response
import model.FeedsUpdateRequest
import model.ItemsBatchPostRequest
import model.ItemsIssuesList200Response

/**
  * Provides a default implementation for [[CatalogsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class CatalogsApiImpl extends CatalogsApi {
  /**
    * @inheritdoc
    */
  override def catalogsList(bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): CatalogsList200Response = {
    // TODO: Implement better logic

    CatalogsList200Response(List.empty[Catalog], None)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupPinsList(productGroupId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): CatalogsProductGroupPinsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupPinsList200Response(List.empty[CatalogsProduct], None)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest: CatalogsProductGroupsCreateRequest, adAccountId: Option[String]): CatalogsProductGroupsCreate201Response = {
    // TODO: Implement better logic

    CatalogsProductGroupsCreate201Response("", None, None, CatalogsProductGroupFilters(List.empty[CatalogsProductGroupFilterKeys], List.empty[CatalogsProductGroupFilterKeys], Map.empty), None, None, None, None, None, "", "", "")
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsDelete(productGroupId: String, adAccountId: Option[String]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsGet(productGroupId: String, adAccountId: Option[String]): CatalogsProductGroupsCreate201Response = {
    // TODO: Implement better logic

    CatalogsProductGroupsCreate201Response("", None, None, CatalogsProductGroupFilters(List.empty[CatalogsProductGroupFilterKeys], List.empty[CatalogsProductGroupFilterKeys], Map.empty), None, None, None, None, None, "", "", "")
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsList(feedId: Option[String], catalogId: Option[String], bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): CatalogsProductGroupsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupsList200Response(List.empty[CatalogsProductGroupsList200ResponseAllOfItemsInner], None)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsProductCountsGet(productGroupId: String, adAccountId: Option[String]): CatalogsProductGroupProductCounts = {
    // TODO: Implement better logic

    CatalogsProductGroupProductCounts(null, null, null, null)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: Option[String]): CatalogsProductGroupsCreate201Response = {
    // TODO: Implement better logic

    CatalogsProductGroupsCreate201Response("", None, None, CatalogsProductGroupFilters(List.empty[CatalogsProductGroupFilterKeys], List.empty[CatalogsProductGroupFilterKeys], Map.empty), None, None, None, None, None, "", "", "")
  }

  /**
    * @inheritdoc
    */
  override def feedProcessingResultsList(feedId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): FeedProcessingResultsList200Response = {
    // TODO: Implement better logic

    FeedProcessingResultsList200Response(List.empty[CatalogsFeedProcessingResult], None)
  }

  /**
    * @inheritdoc
    */
  override def feedsCreate(feedsCreateRequest: FeedsCreateRequest, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed(None, None, None, "", CatalogsFormat(), CatalogsType(), CatalogsFeedCredentials("", ""), "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), NullableCurrency(), "", Country(), ProductAvailabilityType(), "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsDelete(feedId: String, adAccountId: Option[String]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def feedsGet(feedId: String, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed(None, None, None, "", CatalogsFormat(), CatalogsType(), CatalogsFeedCredentials("", ""), "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), NullableCurrency(), "", Country(), ProductAvailabilityType(), "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsList(bookmark: Option[String], pageSize: Option[Int], catalogId: Option[String], adAccountId: Option[String]): FeedsList200Response = {
    // TODO: Implement better logic

    FeedsList200Response(List.empty[CatalogsFeed], None)
  }

  /**
    * @inheritdoc
    */
  override def feedsUpdate(feedId: String, feedsUpdateRequest: FeedsUpdateRequest, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed(None, None, None, "", CatalogsFormat(), CatalogsType(), CatalogsFeedCredentials("", ""), "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), NullableCurrency(), "", Country(), ProductAvailabilityType(), "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def itemsBatchGet(batchId: String, adAccountId: Option[String]): CatalogsItemsBatch = {
    // TODO: Implement better logic

    CatalogsItemsBatch(CatalogsType(), None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemsBatchPost(itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId: Option[String]): CatalogsItemsBatch = {
    // TODO: Implement better logic

    CatalogsItemsBatch(CatalogsType(), None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def itemsGet(country: String, language: String, adAccountId: Option[String], itemIds: Option[List[String]], filters: Option[CatalogsItemsFilters]): CatalogsItems = {
    // TODO: Implement better logic

    CatalogsItems(None)
  }

  /**
    * @inheritdoc
    */
  override def itemsIssuesList(processingResultId: String, bookmark: Option[String], pageSize: Option[Int], itemNumbers: Option[List[Int]], itemValidationIssue: Option[CatalogsItemValidationIssue], adAccountId: Option[String]): ItemsIssuesList200Response = {
    // TODO: Implement better logic

    ItemsIssuesList200Response(List.empty[CatalogsItemValidationIssues], None)
  }

  /**
    * @inheritdoc
    */
  override def productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): CatalogsProductGroupPinsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupPinsList200Response(List.empty[CatalogsProduct], None)
  }
}
