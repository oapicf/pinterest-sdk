package api

import model.BulkDownload
import model.BulkDownloadCreate
import model.BulkJobData
import model.BulkUpsertRequest
import model.BulkUpsertResponse
import model.Error

/**
  * Provides a default implementation for [[BulkApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class BulkApiImpl extends BulkApi {
  /**
    * @inheritdoc
    */
  override def bulkDownloadCreate(adAccountId: String, bulkDownloadCreate: BulkDownloadCreate): BulkDownload = {
    // TODO: Implement better logic

    BulkDownload(None)
  }

  /**
    * @inheritdoc
    */
  override def bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Option[Boolean]): BulkJobData = {
    // TODO: Implement better logic

    BulkJobData(None, BulkRequestStatus(), None)
  }

  /**
    * @inheritdoc
    */
  override def bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest): BulkUpsertResponse = {
    // TODO: Implement better logic

    BulkUpsertResponse(None)
  }
}
