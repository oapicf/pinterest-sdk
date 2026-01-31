package org.openapitools.server.model


/**
 * Ad entities to get in bulk request.
 *
 * @param campaignFilter  for example: ''null''
 * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. for example: ''null''
 * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads. for example: ''["CAMPAIGN","AD_GROUP"]''
 * @param outputFormat  for example: ''null''
 * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time. for example: ''1622848072''
*/
final case class BulkDownloadRequest (
  campaignFilter: Option[BulkDownloadRequestCampaignFilter] = None,
  entityIds: Option[Seq[String]] = None,
  entityTypes: Option[Seq[BulkEntityType]] = None,
  outputFormat: Option[BulkOutputFormat] = None,
  updatedSince: Option[String] = None
)

