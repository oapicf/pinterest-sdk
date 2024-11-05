package api

import model.AdvancedAuctionItems
import model.AdvancedAuctionItemsGetRequest
import model.AdvancedAuctionItemsSubmitRequest
import model.AdvancedAuctionProcessedItems
import model.Error

/**
  * Provides a default implementation for [[AdvancedAuctionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class AdvancedAuctionApiImpl extends AdvancedAuctionApi {
  /**
    * @inheritdoc
    */
  override def advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: Option[String]): AdvancedAuctionItems = {
    // TODO: Implement better logic

    AdvancedAuctionItems(None, None)
  }

  /**
    * @inheritdoc
    */
  override def advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: Option[String]): AdvancedAuctionProcessedItems = {
    // TODO: Implement better logic

    AdvancedAuctionProcessedItems(None, None)
  }
}
