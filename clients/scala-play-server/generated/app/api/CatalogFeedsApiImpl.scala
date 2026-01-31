package api

import model.CatalogsFeed
import model.CatalogsFeedIngestion
import model.CatalogsItemValidationIssue
import model.Error
import model.FeedProcessingResultsList200Response
import model.FeedsCreateRequest
import model.FeedsList200Response
import model.FeedsUpdateRequest
import model.ItemsIssuesList200Response

/**
  * Provides a default implementation for [[CatalogFeedsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class CatalogFeedsApiImpl extends CatalogFeedsApi {
  /**
    * @inheritdoc
    */
  override def feedProcessingResultsList(feedId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): FeedProcessingResultsList200Response = {
    // TODO: Implement better logic

    FeedProcessingResultsList200Response(None, List.empty[CatalogsFeedProcessingResult])
  }

  /**
    * @inheritdoc
    */
  override def feedsCreate(feedsCreateRequest: FeedsCreateRequest, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed(OffsetDateTime.now, "", OffsetDateTime.now, CatalogsType(), CatalogsFeedCredentials("", ""), ProductAvailabilityType(), Country(), NullableCurrency(), "", CatalogsFormat(), "", "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), "", Map.empty)
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

    CatalogsFeed(OffsetDateTime.now, "", OffsetDateTime.now, CatalogsType(), CatalogsFeedCredentials("", ""), ProductAvailabilityType(), Country(), NullableCurrency(), "", CatalogsFormat(), "", "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsIngest(feedId: String, adAccountId: Option[String]): CatalogsFeedIngestion = {
    // TODO: Implement better logic

    CatalogsFeedIngestion(OffsetDateTime.now, "", "", CatalogsFeedProcessingStatus())
  }

  /**
    * @inheritdoc
    */
  override def feedsList(bookmark: Option[String], pageSize: Option[Int], catalogId: Option[String], adAccountId: Option[String]): FeedsList200Response = {
    // TODO: Implement better logic

    FeedsList200Response(None, List.empty[CatalogsFeed])
  }

  /**
    * @inheritdoc
    */
  override def feedsUpdate(feedId: String, feedsUpdateRequest: FeedsUpdateRequest, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed(OffsetDateTime.now, "", OffsetDateTime.now, CatalogsType(), CatalogsFeedCredentials("", ""), ProductAvailabilityType(), Country(), NullableCurrency(), "", CatalogsFormat(), "", "", CatalogsFeedProcessingSchedule("", ""), CatalogsStatus(), "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def itemsIssuesList(processingResultId: String, bookmark: Option[String], pageSize: Option[Int], itemNumbers: Option[List[Int]], itemValidationIssue: Option[CatalogsItemValidationIssue], adAccountId: Option[String]): ItemsIssuesList200Response = {
    // TODO: Implement better logic

    ItemsIssuesList200Response(None, List.empty[CatalogsItemValidationIssues])
  }
}
