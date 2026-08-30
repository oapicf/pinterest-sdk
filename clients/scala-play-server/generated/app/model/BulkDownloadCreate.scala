package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
  * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads.
  * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BulkDownloadCreate(
  campaignFilter: Option[BulkDownloadCampaignFilter],
  entityIds: Option[List[String]],
  entityTypes: Option[List[BulkEntityType]],
  outputFormat: Option[BulkOutputFormat],
  updatedSince: Option[String]
)

object BulkDownloadCreate {
  implicit lazy val bulkDownloadCreateJsonFormat: Format[BulkDownloadCreate] = Json.format[BulkDownloadCreate]
}

