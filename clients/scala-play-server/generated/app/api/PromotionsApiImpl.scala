package api

import model.Error
import model.PaginationOrder
import model.Promotion
import model.PromotionBatchUpdate
import model.PromotionCreate
import model.PromotionsList200Response
import model.PromotionsResponse

/**
  * Provides a default implementation for [[PromotionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class PromotionsApiImpl extends PromotionsApi {
  /**
    * @inheritdoc
    */
  override def promotionsCreate(adAccountId: String, promotionCreate: List[PromotionCreate]): PromotionsResponse = {
    // TODO: Implement better logic

    PromotionsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def promotionsDelete(promotionId: String, adAccountId: String): Promotion = {
    // TODO: Implement better logic

    Promotion("", None, None, None, "", None, None, None, "", PromotionType(), None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def promotionsGet(promotionId: String, adAccountId: String): Promotion = {
    // TODO: Implement better logic

    Promotion("", None, None, None, "", None, None, None, "", PromotionType(), None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def promotionsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): PromotionsList200Response = {
    // TODO: Implement better logic

    PromotionsList200Response(None, List.empty[Promotion])
  }

  /**
    * @inheritdoc
    */
  override def promotionsUpdate(adAccountId: String, promotionBatchUpdate: List[PromotionBatchUpdate]): PromotionsResponse = {
    // TODO: Implement better logic

    PromotionsResponse(None)
  }
}
