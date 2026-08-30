package api

import model.CatalogsFeed
import model.CatalogsFeedCreateRequestSchema
import model.CatalogsFeedIngestion
import model.CatalogsFeedUpdateRequestSchema
import model.CatalogsItemValidationIssue
import model.Error
import model.FeedProcessingResultsList200Response
import model.FeedsList200Response
import model.ItemsIssuesList200Response

/**
  * Provides a default implementation for [[CatalogFeedsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class CatalogFeedsApiImpl extends CatalogFeedsApi {
  /**
    * @inheritdoc
    */
  override def feedProcessingResultsList(feedId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): FeedProcessingResultsList200Response = {
    // TODO: Implement better logic

    FeedProcessingResultsList200Response(None, List.empty[CatalogsFeedProcessingResult])
  }

  /**
    * @inheritdoc
    */
  override def feedsCreate(catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed("", OffsetDateTime.now, None, None, Country(), None, "", CatalogsFormat(), "", "", "", None, CatalogsStatus(), OffsetDateTime.now, "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsDelete(feedId: String, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed("", OffsetDateTime.now, None, None, Country(), None, "", CatalogsFormat(), "", "", "", None, CatalogsStatus(), OffsetDateTime.now, "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def feedsGet(feedId: String, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed("", OffsetDateTime.now, None, None, Country(), None, "", CatalogsFormat(), "", "", "", None, CatalogsStatus(), OffsetDateTime.now, "", Map.empty)
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
  override def feedsList(catalogId: Option[String], adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): FeedsList200Response = {
    // TODO: Implement better logic

    FeedsList200Response(None, List.empty[CatalogsFeed])
  }

  /**
    * @inheritdoc
    */
  override def feedsUpdate(feedId: String, catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema, adAccountId: Option[String]): CatalogsFeed = {
    // TODO: Implement better logic

    CatalogsFeed("", OffsetDateTime.now, None, None, Country(), None, "", CatalogsFormat(), "", "", "", None, CatalogsStatus(), OffsetDateTime.now, "", Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def itemsIssuesList(processingResultId: String, itemNumbers: Option[List[Int]], itemValidationIssue: Option[CatalogsItemValidationIssue], adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): ItemsIssuesList200Response = {
    // TODO: Implement better logic

    ItemsIssuesList200Response(None, List.empty[CatalogsItemValidationIssues])
  }
}
