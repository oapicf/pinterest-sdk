package api

import model.Error
import model.TargetingTemplateCreate
import model.TargetingTemplateGetResponseData
import model.TargetingTemplateList200Response
import model.TargetingTemplateUpdateRequest

/**
  * Provides a default implementation for [[TargetingTemplateApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class TargetingTemplateApiImpl extends TargetingTemplateApi {
  /**
    * @inheritdoc
    */
  override def targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate): TargetingTemplateGetResponseData = {
    // TODO: Implement better logic

    TargetingTemplateGetResponseData(None, None, None, None, None, None, None, None, None, None, None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def targetingTemplateList(adAccountId: String, order: Option[String], includeSizing: Option[Boolean], searchQuery: Option[String], pageSize: Option[Int], bookmark: Option[String]): TargetingTemplateList200Response = {
    // TODO: Implement better logic

    TargetingTemplateList200Response(List.empty[TargetingTemplateResponseData], None)
  }

  /**
    * @inheritdoc
    */
  override def targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest): Unit = {
    // TODO: Implement better logic

    
  }
}
