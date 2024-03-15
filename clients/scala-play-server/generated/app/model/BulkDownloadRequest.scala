package model

import play.api.libs.json._

/**
  * Ad entities to get in bulk request.
  * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads.
  * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
  * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BulkDownloadRequest(
  entityTypes: Option[List[BulkEntityType]],
  entityIds: Option[List[String]],
  updatedSince: Option[String],
  campaignFilter: Option[BulkDownloadRequestCampaignFilter],
  outputFormat: Option[BulkOutputFormat]
)

object BulkDownloadRequest {
  implicit lazy val bulkDownloadRequestJsonFormat: Format[BulkDownloadRequest] = Json.format[BulkDownloadRequest]
}

