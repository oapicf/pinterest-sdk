
package org.openapitools.client.model


case class BulkDownloadRequest (
    _campaignFilter: Option[BulkDownloadRequestCampaignFilter],
    /* All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. */
    _entityIds: Option[List[String]],
    /* All entity types specified will be downloaded. Fewer types result in faster downloads. */
    _entityTypes: Option[List[BulkEntityType]],
    _outputFormat: Option[BulkOutputFormat],
    /* Unix UTC timestamp to retrieve all entities that have changed since this time. */
    _updatedSince: Option[String]
)
object BulkDownloadRequest {
    def toStringBody(var_campaignFilter: Object, var_entityIds: Object, var_entityTypes: Object, var_outputFormat: Object, var_updatedSince: Object) =
        s"""
        | {
        | "campaignFilter":$var_campaignFilter,"entityIds":$var_entityIds,"entityTypes":$var_entityTypes,"outputFormat":$var_outputFormat,"updatedSince":$var_updatedSince
        | }
        """.stripMargin
}
