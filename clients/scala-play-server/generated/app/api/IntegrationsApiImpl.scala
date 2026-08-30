package api

import model.Error
import model.IntegrationLogsInvalidLogResponse
import model.IntegrationLogsRequestCreate
import model.IntegrationLogsSuccessResponse
import model.IntegrationMetadata
import model.IntegrationMetadataCreate
import model.IntegrationMetadataUpdate
import model.IntegrationRecord
import model.IntegrationsGetList200Response

/**
  * Provides a default implementation for [[IntegrationsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class IntegrationsApiImpl extends IntegrationsApi {
  /**
    * @inheritdoc
    */
  override def integrationsCommerceDel(externalBusinessId: String): IntegrationMetadata = {
    // TODO: Implement better logic

    IntegrationMetadata(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
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
  override def integrationsCommercePatch(externalBusinessId: String, integrationMetadataUpdate: IntegrationMetadataUpdate): IntegrationMetadata = {
    // TODO: Implement better logic

    IntegrationMetadata(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def integrationsCommercePost(integrationMetadataCreate: IntegrationMetadataCreate): IntegrationMetadata = {
    // TODO: Implement better logic

    IntegrationMetadata(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def integrationsGetById(id: String): IntegrationRecord = {
    // TODO: Implement better logic

    IntegrationRecord(None, None, None, None, None, None, None, None, null, None, None, None, None, None, None, None, None)
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
  override def integrationsLogsPost(integrationLogsRequestCreate: IntegrationLogsRequestCreate): IntegrationLogsSuccessResponse = {
    // TODO: Implement better logic

    IntegrationLogsSuccessResponse(None)
  }
}
