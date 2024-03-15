package api

import model.BulkDownloadRequest
import model.BulkDownloadResponse
import model.BulkUpsertRequest
import model.BulkUpsertResponse
import model.BulkUpsertStatusResponse
import model.Error

/**
  * Provides a default implementation for [[BulkApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class BulkApiImpl extends BulkApi {
  /**
    * @inheritdoc
    */
  override def bulkDownloadCreate(adAccountId: String, bulkDownloadRequest: BulkDownloadRequest): BulkDownloadResponse = {
    // TODO: Implement better logic

    BulkDownloadResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Option[Boolean]): BulkUpsertStatusResponse = {
    // TODO: Implement better logic

    BulkUpsertStatusResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest): BulkUpsertResponse = {
    // TODO: Implement better logic

    BulkUpsertResponse(None)
  }
}
