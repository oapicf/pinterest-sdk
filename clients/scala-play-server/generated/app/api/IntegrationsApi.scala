package api

import play.api.libs.json._
import model.DetailedError
import model.Error
import model.IntegrationLogsRequest
import model.IntegrationLogsSuccessResponse
import model.IntegrationMetadata
import model.IntegrationRecord
import model.IntegrationRequest
import model.IntegrationRequestPatch
import model.IntegrationsGetList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait IntegrationsApi {
  /**
    * Delete commerce integration
    * Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param externalBusinessId External business ID for the integration.
    */
  def integrationsCommerceDel(externalBusinessId: String): Unit

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
    * @param integrationRequestPatch Parameters to get create/update the Integration Metadata
    */
  def integrationsCommercePatch(externalBusinessId: String, integrationRequestPatch: Option[IntegrationRequestPatch]): IntegrationMetadata

  /**
    * Create commerce integration
    * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param integrationRequest Parameters to get create/update the Integration Metadata
    */
  def integrationsCommercePost(integrationRequest: Option[IntegrationRequest]): IntegrationMetadata

  /**
    * Get integration metadata
    * Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param id Integration ID.
    */
  def integrationsGetById(id: String): IntegrationRecord

  /**
    * Get integration metadata list
    * Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def integrationsGetList(bookmark: Option[String], pageSize: Option[Int]): IntegrationsGetList200Response

  /**
    * Receives batched logs from integration applications.
    * This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    * @param integrationLogsRequest Ingest log information from external integration application.
    */
  def integrationsLogsPost(integrationLogsRequest: IntegrationLogsRequest): IntegrationLogsSuccessResponse
}
