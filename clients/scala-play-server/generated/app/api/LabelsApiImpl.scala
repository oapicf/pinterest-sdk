package api

import model.Error
import model.LabelCreateRequest
import model.LabelUpdateRequest
import model.LabelsList200Response
import model.LabelsResponse

/**
  * Provides a default implementation for [[LabelsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class LabelsApiImpl extends LabelsApi {
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
  override def labelsList(adAccountId: String, campaignIds: Option[List[String]], labelIds: Option[List[String]], entityStatuses: Option[List[String]], labelTypes: Option[List[String]], pageSize: Option[Int], bookmark: Option[String]): LabelsList200Response = {
    // TODO: Implement better logic

    LabelsList200Response(None, List.empty[LabelsResponse])
  }

  /**
    * @inheritdoc
    */
  override def labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest): LabelsResponse = {
    // TODO: Implement better logic

    LabelsResponse(None, None)
  }
}
