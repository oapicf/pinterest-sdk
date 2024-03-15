package api

import play.api.libs.json._
import model.BulkDownloadRequest
import model.BulkDownloadResponse
import model.BulkUpsertRequest
import model.BulkUpsertResponse
import model.BulkUpsertStatusResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait BulkApi {
  /**
    * Get advertiser entities in bulk
    * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
    * @param adAccountId Unique identifier of an ad account.
    * @param bulkDownloadRequest Parameters to get ad entities in bulk
    */
  def bulkDownloadCreate(adAccountId: String, bulkDownloadRequest: BulkDownloadRequest): BulkDownloadResponse

  /**
    * Download advertiser entities in bulk
    * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
    * @param adAccountId Unique identifier of an ad account.
    * @param bulkRequestId Unique identifier of a bulk upsert request.
    * @param includeDetails if set to True then attach the errors/details to all the requests
    */
  def bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Option[Boolean]): BulkUpsertStatusResponse

  /**
    * Create/update ad entities in bulk
    * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
    * @param adAccountId Unique identifier of an ad account.
    * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk
    */
  def bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest): BulkUpsertResponse
}
