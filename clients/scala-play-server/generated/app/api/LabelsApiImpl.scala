package api

import model.Error
import model.LabelCreateRequest
import model.LabelUpdateRequest
import model.LabeledEntities
import model.LabeledEntitiesCreate
import model.LabelsList200Response
import model.LabelsResponse
import model.QueryLabelEntityStatusesItems
import model.QueryLabelTypesItems

/**
  * Provides a default implementation for [[LabelsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class LabelsApiImpl extends LabelsApi {
  /**
    * @inheritdoc
    */
  override def labelsApply(adAccountId: String, labelId: String, labeledEntitiesCreate: LabeledEntitiesCreate): LabeledEntities = {
    // TODO: Implement better logic

    LabeledEntities(None, None)
  }

  /**
    * @inheritdoc
    */
  override def labelsCreate(adAccountId: String, labelCreateRequest: LabelCreateRequest): LabelsResponse = {
    // TODO: Implement better logic

    LabelsResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def labelsList(adAccountId: String, campaignIds: Option[List[String]], labelIds: Option[List[String]], entityStatuses: Option[List[QueryLabelEntityStatusesItems]], labelTypes: Option[List[QueryLabelTypesItems]], bookmark: Option[String], pageSize: Option[Int]): LabelsList200Response = {
    // TODO: Implement better logic

    LabelsList200Response(None, List.empty[Label])
  }

  /**
    * @inheritdoc
    */
  override def labelsRemove(adAccountId: String, labelId: String, labeledEntitiesCreate: LabeledEntitiesCreate): LabeledEntities = {
    // TODO: Implement better logic

    LabeledEntities(None, None)
  }

  /**
    * @inheritdoc
    */
  override def labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest): LabelsResponse = {
    // TODO: Implement better logic

    LabelsResponse(None, None)
  }
}
