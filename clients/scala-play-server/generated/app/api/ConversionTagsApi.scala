package api

import play.api.libs.json._
import model.ConversionEventResponse
import model.ConversionTagCreate
import model.ConversionTagListResponse
import model.ConversionTagResponse
import model.Error
import model.PageVisitConversionTagsGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait ConversionTagsApi {
  /**
    * Create conversion tag
    * Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/enhanced-match/\&quot;&gt;Enhanced match&lt;/a&gt;
    * @param adAccountId Unique identifier of an ad account.
    * @param conversionTagCreate Conversion Tag to create
    */
  def conversionTagsCreate(adAccountId: String, conversionTagCreate: ConversionTagCreate): ConversionTagResponse

  /**
    * Get conversion tag
    * Get information about an existing conversion tag.
    * @param adAccountId Unique identifier of an ad account.
    * @param conversionTagId Id of the conversion tag.
    */
  def conversionTagsGet(adAccountId: String, conversionTagId: String): ConversionTagResponse

  /**
    * Get conversion tags
    * List conversion tags associated with an ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param filterDeleted Filter out deleted tags.
    */
  def conversionTagsList(adAccountId: String, filterDeleted: Option[Boolean]): ConversionTagListResponse

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
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def pageVisitConversionTagsGet(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): PageVisitConversionTagsGet200Response
}
