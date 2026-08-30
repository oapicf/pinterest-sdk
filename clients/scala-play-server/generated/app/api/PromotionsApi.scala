package api

import play.api.libs.json._
import model.Error
import model.PaginationOrder
import model.Promotion
import model.PromotionBatchUpdate
import model.PromotionCreate
import model.PromotionsList200Response
import model.PromotionsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait PromotionsApi {
  /**
    * Create promotions
    * Create multiple new promotions.
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsCreate(adAccountId: String, promotionCreate: List[PromotionCreate]): PromotionsResponse

  /**
    * Delete promotion by id
    * Delete a promotion within Pinterest.
    * @param promotionId Promotion ID
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsDelete(promotionId: String, adAccountId: String): Promotion

  /**
    * Get promotion by id
    * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
    * @param promotionId Promotion ID
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsGet(promotionId: String, adAccountId: String): Promotion

  /**
    * Get promotions
    * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    */
  def promotionsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): PromotionsList200Response

  /**
    * Update promotions
    * Update multiple promotions.
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsUpdate(adAccountId: String, promotionBatchUpdate: List[PromotionBatchUpdate]): PromotionsResponse
}
