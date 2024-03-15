package org.openapitools.server.model


/**
 * Ad entities to get in bulk request.
 *
 * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads. for example: ''["CAMPAIGN","AD_GROUP"]''
 * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. for example: ''null''
 * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time. for example: ''1622848072''
 * @param campaignFilter  for example: ''null''
 * @param outputFormat  for example: ''null''
*/
final case class BulkDownloadRequest (
  entityTypes: Option[Seq[BulkEntityType]] = None,
  entityIds: Option[Seq[String]] = None,
  updatedSince: Option[String] = None,
  campaignFilter: Option[BulkDownloadRequestCampaignFilter] = None,
  outputFormat: Option[BulkOutputFormat] = None
)

