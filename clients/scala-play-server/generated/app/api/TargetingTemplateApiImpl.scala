package api

import model.Error
import model.PaginationOrder
import model.TargetingTemplate
import model.TargetingTemplateCreate
import model.TargetingTemplateList200Response
import model.TargetingTemplateUpdateRequestReadOrUpdate

/**
  * Provides a default implementation for [[TargetingTemplateApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class TargetingTemplateApiImpl extends TargetingTemplateApi {
  /**
    * @inheritdoc
    */
  override def targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate): TargetingTemplate = {
    // TODO: Implement better logic

    TargetingTemplate(None, None, None, None, None, "", None, None, None, TargetingSpecOptimal(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None), None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def targetingTemplateList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], includeSizing: Option[Boolean], searchQuery: Option[String]): TargetingTemplateList200Response = {
    // TODO: Implement better logic

    TargetingTemplateList200Response(None, List.empty[TargetingTemplate])
  }

  /**
    * @inheritdoc
    */
  override def targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate): Unit = {
    // TODO: Implement better logic

    
  }
}
