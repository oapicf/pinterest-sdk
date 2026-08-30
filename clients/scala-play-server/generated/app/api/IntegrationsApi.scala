package api

import play.api.libs.json._
import model.Error
import model.IntegrationLogsInvalidLogResponse
import model.IntegrationLogsRequestCreate
import model.IntegrationLogsSuccessResponse
import model.IntegrationMetadata
import model.IntegrationMetadataCreate
import model.IntegrationMetadataUpdate
import model.IntegrationRecord
import model.IntegrationsGetList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait IntegrationsApi {
  /**
    * Delete commerce integration
    * Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param externalBusinessId External business ID for the integration.
    */
  def integrationsCommerceDel(externalBusinessId: String): IntegrationMetadata

  /**
    * Get commerce integration
    * Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param externalBusinessId External business ID for the integration.
    */
  def integrationsCommerceGet(externalBusinessId: String): IntegrationMetadata

  /**
    * Update commerce integration
    * Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param externalBusinessId External business ID for the integration.
    */
  def integrationsCommercePatch(externalBusinessId: String, integrationMetadataUpdate: IntegrationMetadataUpdate): IntegrationMetadata

  /**
    * Create commerce integration
    * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    */
  def integrationsCommercePost(integrationMetadataCreate: IntegrationMetadataCreate): IntegrationMetadata

  /**
    * Get integration metadata
    * Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param id Integration record ID.
    */
  def integrationsGetById(id: String): IntegrationRecord

  /**
    * Get integration metadata list
    * Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def integrationsGetList(bookmark: Option[String], pageSize: Option[Int]): IntegrationsGetList200Response

  /**
    * Receives batched logs from integration applications.
    * This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    */
  def integrationsLogsPost(integrationLogsRequestCreate: IntegrationLogsRequestCreate): IntegrationLogsSuccessResponse
}
