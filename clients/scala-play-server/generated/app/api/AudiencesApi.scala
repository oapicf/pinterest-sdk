package api

import play.api.libs.json._
import model.Audience
import model.AudienceCreateCustomRequest
import model.AudienceCreateRequest
import model.AudienceUpdateRequest
import model.AudiencesList200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait AudiencesApi {
  /**
    * Create audience
    * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.
    * @param adAccountId Unique identifier of an ad account.
    * @param audienceCreateRequest List of ads to create, size limit [1, 30]
    */
  def audiencesCreate(adAccountId: String, audienceCreateRequest: AudienceCreateRequest): Audience

  /**
    * Create custom audience
    * Create a custom audience and find the audiences you want your ads to reach.
    * @param adAccountId Unique identifier of an ad account.
    * @param audienceCreateCustomRequest Custom audience to create.
    */
  def audiencesCreateCustom(adAccountId: String, audienceCreateCustomRequest: AudienceCreateCustomRequest): Audience

  /**
    * Get audience
    * Get a specific audience given the audience ID.
    * @param adAccountId Unique identifier of an ad account.
    * @param audienceId Unique identifier of an audience
    */
  def audiencesGet(adAccountId: String, audienceId: String): Audience

  /**
    * List audiences
    * Get list of audiences for the ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param ownershipType Filter audiences by ownership type.
    */
  def audiencesList(adAccountId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int], ownershipType: Option[String]): AudiencesList200Response

  /**
    * Update audience
    * Update (edit or remove) an existing targeting audience.
    * @param adAccountId Unique identifier of an ad account.
    * @param audienceId Unique identifier of an audience
    * @param audienceUpdateRequest The audience to be updated.
    */
  def audiencesUpdate(adAccountId: String, audienceId: String, audienceUpdateRequest: Option[AudienceUpdateRequest]): Audience
}
