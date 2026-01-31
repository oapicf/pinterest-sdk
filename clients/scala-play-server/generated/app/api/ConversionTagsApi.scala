package api

import play.api.libs.json._
import model.ConversionEventResponse
import model.ConversionTag
import model.ConversionTagCreate
import model.ConversionTagsList200Response
import model.Error
import model.PageVisitConversionTagsGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait ConversionTagsApi {
  /**
    * Create conversion tag
    * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionTagsCreate(adAccountId: String, conversionTagCreate: ConversionTagCreate): ConversionTag

  /**
    * Get conversion tag
    * Get information about an existing conversion tag.
    * @param adAccountId Unique identifier of an ad account.
    * @param conversionTagId Id of the conversion tag.
    */
  def conversionTagsGet(adAccountId: String, conversionTagId: String): ConversionTag

  /**
    * List conversion tags
    * List conversion tags associated with an ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param filterDeleted Filter by deleted status
    */
  def conversionTagsList(adAccountId: String, filterDeleted: Option[Boolean]): ConversionTagsList200Response

  /**
    * Get Ocpm eligible conversion tags
    * Get Ocpm eligible conversion tag events for an ad account.
    * @param adAccountId Unique identifier of an ad account.
    */
  def ocpmEligibleConversionTagsGet(adAccountId: String): Map[String, List[ConversionEventResponse]]

  /**
    * Get page visit conversion tags
    * Get all page visit conversion tag events for an ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def pageVisitConversionTagsGet(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): PageVisitConversionTagsGet200Response
}
