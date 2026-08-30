package api

import play.api.libs.json._
import model.BulkDownload
import model.BulkDownloadCreate
import model.BulkJobData
import model.BulkUpsertRequest
import model.BulkUpsertResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait BulkApi {
  /**
    * Get advertiser entities in bulk
    * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
    * @param adAccountId Unique identifier of an ad account.
    */
  def bulkDownloadCreate(adAccountId: String, bulkDownloadCreate: BulkDownloadCreate): BulkDownload

  /**
    * Download advertiser entities in bulk
    * Get the status of a bulk request by &#x60;request_id&#x60;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
    * @param adAccountId Unique identifier of an ad account.
    * @param bulkRequestId Bulk request ID that is from one of the entities bulk endpoints
    * @param includeDetails If set to True then attach the errors/details to all the requests
    */
  def bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Option[Boolean]): BulkJobData

  /**
    * Create/update ad entities in bulk
    * Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
    * @param adAccountId Unique identifier of an ad account.
    * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk
    */
  def bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest): BulkUpsertResponse
}
