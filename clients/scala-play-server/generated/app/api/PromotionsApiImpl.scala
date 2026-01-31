package api

import model.Error
import model.PromotionCreateRequest
import model.PromotionResponse
import model.PromotionUpdateRequest
import model.PromotionsList200Response
import model.PromotionsResponse

/**
  * Provides a default implementation for [[PromotionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class PromotionsApiImpl extends PromotionsApi {
  /**
    * @inheritdoc
    */
  override def promotionsCreate(adAccountId: String, promotionCreateRequest: List[PromotionCreateRequest]): PromotionsResponse = {
    // TODO: Implement better logic

    PromotionsResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def promotionsDelete(adAccountId: String, promotionId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def promotionsGet(adAccountId: String, promotionId: String): PromotionResponse = {
    // TODO: Implement better logic

    PromotionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def promotionsList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): PromotionsList200Response = {
    // TODO: Implement better logic

    PromotionsList200Response(None, List.empty[PromotionResponse])
  }

  /**
    * @inheritdoc
    */
  override def promotionsUpdate(adAccountId: String, promotionUpdateRequest: List[PromotionUpdateRequest]): PromotionsResponse = {
    // TODO: Implement better logic

    PromotionsResponse(None)
  }
}
