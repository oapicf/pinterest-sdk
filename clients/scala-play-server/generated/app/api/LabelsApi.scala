package api

import play.api.libs.json._
import model.Error
import model.LabelCreateRequest
import model.LabelUpdateRequest
import model.LabeledEntities
import model.LabeledEntitiesCreate
import model.LabelsList200Response
import model.LabelsResponse
import model.QueryLabelEntityStatusesItems
import model.QueryLabelTypesItems

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait LabelsApi {
  /**
    * Apply label to entity
    *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
    * @param labelId Label ID.
    */
  def labelsApply(adAccountId: String, labelId: String, labeledEntitiesCreate: LabeledEntitiesCreate): LabeledEntities

  /**
    * Create labels
    * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
    * @param adAccountId Unique identifier of an ad account.
    */
  def labelsCreate(adAccountId: String, labelCreateRequest: LabelCreateRequest): LabelsResponse

  /**
    * List labels
    * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
    * @param adAccountId Unique identifier of an ad account.
    * @param campaignIds List of Campaign Ids to use to filter the results.
    * @param labelIds List of Label Ids to use to filter the results.
    * @param entityStatuses Label entity status
    * @param labelTypes Label type.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def labelsList(adAccountId: String, campaignIds: Option[List[String]], labelIds: Option[List[String]], entityStatuses: Option[List[QueryLabelEntityStatusesItems]], labelTypes: Option[List[QueryLabelTypesItems]], bookmark: Option[String], pageSize: Option[Int]): LabelsList200Response

  /**
    * Remove label from entities
    *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
    * @param labelId Label ID.
    */
  def labelsRemove(adAccountId: String, labelId: String, labeledEntitiesCreate: LabeledEntitiesCreate): LabeledEntities

  /**
    * Update labels
    * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
    * @param adAccountId Unique identifier of an ad account.
    */
  def labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest): LabelsResponse
}
