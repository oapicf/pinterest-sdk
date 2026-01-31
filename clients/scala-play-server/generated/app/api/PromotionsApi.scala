package api

import play.api.libs.json._
import model.Error
import model.PromotionCreateRequest
import model.PromotionResponse
import model.PromotionUpdateRequest
import model.PromotionsList200Response
import model.PromotionsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait PromotionsApi {
  /**
    * Create promotions
    * Create multiple new promotions.
    * @param adAccountId Unique identifier of an ad account.
    * @param promotionCreateRequest List of promotions to create, size limit [1, 30].
    */
  def promotionsCreate(adAccountId: String, promotionCreateRequest: List[PromotionCreateRequest]): PromotionsResponse

  /**
    * Delete promotion by id
    * Delete a promotion within Pinterest.
    * @param adAccountId Unique identifier of an ad account.
    * @param promotionId Unique identifier of a promotion
    */
  def promotionsDelete(adAccountId: String, promotionId: String): Unit

  /**
    * Get promotion by id
    * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
    * @param adAccountId Unique identifier of an ad account.
    * @param promotionId Unique identifier of a promotion
    */
  def promotionsGet(adAccountId: String, promotionId: String): PromotionResponse

  /**
    * Get promotions
    * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
    * @param adAccountId Unique identifier of an ad account.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def promotionsList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): PromotionsList200Response

  /**
    * Update promotions
    * Update multiple promotions.
    * @param adAccountId Unique identifier of an ad account.
    * @param promotionUpdateRequest List of promotions to create, size limit [1, 30].
    */
  def promotionsUpdate(adAccountId: String, promotionUpdateRequest: List[PromotionUpdateRequest]): PromotionsResponse
}
