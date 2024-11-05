package api

import model.Catalog
import model.CatalogsCreateReportResponse
import model.CatalogsCreateRequest
import model.CatalogsFeed
import model.CatalogsFeedIngestion
import model.CatalogsItemValidationIssue
import model.CatalogsItems
import model.CatalogsItemsBatch
import model.CatalogsItemsFilters
import model.CatalogsItemsRequest
import model.CatalogsList200Response
import model.CatalogsListProductsByFilterRequest
import model.CatalogsProductGroupPinsList200Response
import model.CatalogsProductGroupProductCountsVertical
import model.CatalogsProductGroupsList200Response
import model.CatalogsProductGroupsUpdateRequest
import model.CatalogsReport
import model.CatalogsReportParameters
import model.CatalogsVerticalProductGroup
import model.Error
import model.FeedProcessingResultsList200Response
import model.FeedsCreateRequest
import model.FeedsList200Response
import model.FeedsUpdateRequest
import model.ItemsBatchPostRequest
import model.ItemsIssuesList200Response
import model.MultipleProductGroupsInner
import model.ReportsStats200Response

/**
  * Provides a default implementation for [[CatalogsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class CatalogsApiImpl extends CatalogsApi {
  /**
    * @inheritdoc
    */
  override def catalogsCreate(catalogsCreateRequest: CatalogsCreateRequest, adAccountId: Option[String]): Catalog = {
    // TODO: Implement better logic

    Catalog(OffsetDateTime.now, "", OffsetDateTime.now, "", CatalogsType(), Map.empty)
  }

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
  override def catalogsProductGroupPinsList(productGroupId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]): CatalogsProductGroupPinsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupPinsList200Response(List.empty[CatalogsProduct], None)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsCreate(multipleProductGroupsInner: MultipleProductGroupsInner, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup("", "", None, None, CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], Map.empty), None, None, None, None, None, "", "", None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsCreateMany(multipleProductGroupsInner: List[MultipleProductGroupsInner], adAccountId: Option[String]): List[String] = {
    // TODO: Implement better logic

    List.empty[String]
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
  override def catalogsProductGroupsDeleteMany(id: List[Int], adAccountId: Option[String]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsGet(productGroupId: String, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup("", "", None, None, CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], Map.empty), None, None, None, None, None, "", "", None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsList(id: Option[List[Int]], feedId: Option[String], catalogId: Option[String], bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): CatalogsProductGroupsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupsList200Response(List.empty[CatalogsVerticalProductGroup], None)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsProductCountsGet(productGroupId: String, adAccountId: Option[String]): CatalogsProductGroupProductCountsVertical = {
    // TODO: Implement better logic

    CatalogsProductGroupProductCountsVertical(CatalogsType(), null, null, null, null, null)
  }

  /**
    * @inheritdoc
    */
  override def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: Option[String]): CatalogsVerticalProductGroup = {
    // TODO: Implement better logic

    CatalogsVerticalProductGroup("", "", None, None, CatalogsCreativeAssetsProductGroupFilters(List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], List.empty[CatalogsCreativeAssetsProductGroupFilterKeys], Map.empty), None, None, None, None, None, "", "", None, None, Map.empty)
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

    CatalogsFeed(OffsetDateTime.now, "", OffsetDateTime.now, "", CatalogsFormat(), CatalogsType(), CatalogsFeedCredentials("", ""), "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), NullableCurrency(), "", Country(), ProductAvailabilityType(), "", Map.empty)
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

    CatalogsFeed(OffsetDateTime.now, "", OffsetDateTime.now, "", CatalogsFormat(), CatalogsType(), CatalogsFeedCredentials("", ""), "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), NullableCurrency(), "", Country(), ProductAvailabilityType(), "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsIngest(feedId: String, adAccountId: Option[String]): CatalogsFeedIngestion = {
    // TODO: Implement better logic

    CatalogsFeedIngestion("", "", OffsetDateTime.now, CatalogsFeedProcessingStatus())
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

    CatalogsFeed(OffsetDateTime.now, "", OffsetDateTime.now, "", CatalogsFormat(), CatalogsType(), CatalogsFeedCredentials("", ""), "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), NullableCurrency(), "", Country(), ProductAvailabilityType(), "", Map.empty)
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
  override def itemsPost(catalogsItemsRequest: CatalogsItemsRequest, adAccountId: Option[String]): CatalogsItems = {
    // TODO: Implement better logic

    CatalogsItems(None)
  }

  /**
    * @inheritdoc
    */
  override def productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]): CatalogsProductGroupPinsList200Response = {
    // TODO: Implement better logic

    CatalogsProductGroupPinsList200Response(List.empty[CatalogsProduct], None)
  }

  /**
    * @inheritdoc
    */
  override def reportsCreate(catalogsReportParameters: CatalogsReportParameters, adAccountId: Option[String]): CatalogsCreateReportResponse = {
    // TODO: Implement better logic

    CatalogsCreateReportResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def reportsGet(token: String, adAccountId: Option[String]): CatalogsReport = {
    // TODO: Implement better logic

    CatalogsReport(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def reportsStats(parameters: CatalogsReportParameters, adAccountId: Option[String], pageSize: Option[Int], bookmark: Option[String]): ReportsStats200Response = {
    // TODO: Implement better logic

    ReportsStats200Response(List.empty[CatalogsReportStats], None)
  }
}
