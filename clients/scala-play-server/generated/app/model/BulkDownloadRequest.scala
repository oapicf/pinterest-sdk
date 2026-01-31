package model

import play.api.libs.json._

/**
  * Ad entities to get in bulk request.
  * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
  * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads.
  * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BulkDownloadRequest(
  campaignFilter: Option[BulkDownloadRequestCampaignFilter],
  entityIds: Option[List[String]],
  entityTypes: Option[List[BulkEntityType]],
  outputFormat: Option[BulkOutputFormat],
  updatedSince: Option[String]
)

object BulkDownloadRequest {
  implicit lazy val bulkDownloadRequestJsonFormat: Format[BulkDownloadRequest] = Json.format[BulkDownloadRequest]
}

