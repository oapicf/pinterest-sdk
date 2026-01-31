package api

import model.Error
import model.IntegrationLogsRequest
import model.IntegrationLogsSuccessResponse
import model.IntegrationMetadata
import model.IntegrationRecord
import model.IntegrationRequest
import model.IntegrationRequestPatch
import model.IntegrationsGetList200Response
import model.IntegrationsLogsPost400Response

/**
  * Provides a default implementation for [[IntegrationsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class IntegrationsApiImpl extends IntegrationsApi {
  /**
    * @inheritdoc
    */
  override def integrationsCommerceDel(externalBusinessId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def integrationsCommerceGet(externalBusinessId: String): IntegrationMetadata = {
    // TODO: Implement better logic

    IntegrationMetadata(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def integrationsCommercePatch(externalBusinessId: String, integrationRequestPatch: IntegrationRequestPatch): IntegrationMetadata = {
    // TODO: Implement better logic

    IntegrationMetadata(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def integrationsCommercePost(integrationRequest: IntegrationRequest): IntegrationMetadata = {
    // TODO: Implement better logic

    IntegrationMetadata(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def integrationsGetById(id: String): IntegrationRecord = {
    // TODO: Implement better logic

    IntegrationRecord(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def integrationsGetList(bookmark: Option[String], pageSize: Option[Int]): IntegrationsGetList200Response = {
    // TODO: Implement better logic

    IntegrationsGetList200Response(None, List.empty[IntegrationRecord])
  }

  /**
    * @inheritdoc
    */
  override def integrationsLogsPost(integrationLogsRequest: IntegrationLogsRequest): IntegrationLogsSuccessResponse = {
    // TODO: Implement better logic

    IntegrationLogsSuccessResponse(None)
  }
}
