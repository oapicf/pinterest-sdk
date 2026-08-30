package api

import play.api.libs.json._
import model.AdAccountsAudience
import model.AdAccountsAudienceCreate
import model.AdAccountsAudienceUpdate
import model.AudienceOwnershipType
import model.AudiencesList200Response
import model.Error
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait AudiencesApi {
  /**
    * Create audience
    * Create a new audience for the ad account.
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesCreate(adAccountId: String, adAccountsAudienceCreate: AdAccountsAudienceCreate): AdAccountsAudience

  /**
    * Get audience
    * Get a specific audience given the audience ID.
    * @param audienceId Audience ID.
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesGet(audienceId: String, adAccountId: String): AdAccountsAudience

  /**
    * List audiences
    * Get list of audiences for the ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param excludeNca When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
    */
  def audiencesList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], ownershipType: Option[AudienceOwnershipType], excludeNca: Option[Boolean]): AudiencesList200Response

  /**
    * Update audience
    * Update an existing audience for the ad account.
    * @param audienceId Audience ID.
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesUpdate(audienceId: String, adAccountId: String, adAccountsAudienceUpdate: AdAccountsAudienceUpdate): AdAccountsAudience
}
