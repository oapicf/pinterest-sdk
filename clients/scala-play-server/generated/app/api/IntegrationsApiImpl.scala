package api

import model.DetailedError
import model.Error
import model.IntegrationLogsRequest
import model.IntegrationLogsSuccessResponse
import model.IntegrationMetadata
import model.IntegrationRecord
import model.IntegrationRequest
import model.IntegrationRequestPatch
import model.IntegrationsGetList200Response

/**
  * Provides a default implementation for [[IntegrationsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
  override def integrationsCommercePatch(externalBusinessId: String, integrationRequestPatch: Option[IntegrationRequestPatch]): IntegrationMetadata = {
    // TODO: Implement better logic

    IntegrationMetadata(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def integrationsCommercePost(integrationRequest: Option[IntegrationRequest]): IntegrationMetadata = {
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

    IntegrationsGetList200Response(List.empty[IntegrationRecord], None)
  }

  /**
    * @inheritdoc
    */
  override def integrationsLogsPost(integrationLogsRequest: IntegrationLogsRequest): IntegrationLogsSuccessResponse = {
    // TODO: Implement better logic

    IntegrationLogsSuccessResponse(None)
  }
}
