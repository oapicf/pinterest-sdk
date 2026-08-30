package api

import model.ConversionDeletionRequest
import model.ConversionDeletionRequestCreate
import model.ConversionDeletionRequestList200Response
import model.Error
import model.PaginationOrder

/**
  * Provides a default implementation for [[ConversionDeletionRequestsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ConversionDeletionRequestsApiImpl extends ConversionDeletionRequestsApi {
  /**
    * @inheritdoc
    */
  override def conversionDeletionRequestCreate(adAccountId: String, conversionDeletionRequestCreate: ConversionDeletionRequestCreate): ConversionDeletionRequest = {
    // TODO: Implement better logic

    ConversionDeletionRequest(LocalDate.now, None, "", ConversionDeletionRequestStatus())
  }

  /**
    * @inheritdoc
    */
  override def conversionDeletionRequestDelete(requestId: String, adAccountId: String): ConversionDeletionRequest = {
    // TODO: Implement better logic

    ConversionDeletionRequest(LocalDate.now, None, "", ConversionDeletionRequestStatus())
  }

  /**
    * @inheritdoc
    */
  override def conversionDeletionRequestGet(requestId: String, adAccountId: String): ConversionDeletionRequest = {
    // TODO: Implement better logic

    ConversionDeletionRequest(LocalDate.now, None, "", ConversionDeletionRequestStatus())
  }

  /**
    * @inheritdoc
    */
  override def conversionDeletionRequestList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): ConversionDeletionRequestList200Response = {
    // TODO: Implement better logic

    ConversionDeletionRequestList200Response(None, List.empty[ConversionDeletionRequest])
  }
}
