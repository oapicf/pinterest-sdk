
package org.openapitools.client.model


case class BulkDownloadRequest (
    /* All entity types specified will be downloaded. Fewer types result in faster downloads. */
    _entityTypes: Option[List[BulkEntityType]],
    /* All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. */
    _entityIds: Option[List[String]],
    /* Unix UTC timestamp to retrieve all entities that have changed since this time. */
    _updatedSince: Option[String],
    _campaignFilter: Option[BulkDownloadRequestCampaignFilter],
    _outputFormat: Option[BulkOutputFormat]
)
object BulkDownloadRequest {
    def toStringBody(var_entityTypes: Object, var_entityIds: Object, var_updatedSince: Object, var_campaignFilter: Object, var_outputFormat: Object) =
        s"""
        | {
        | "entityTypes":$var_entityTypes,"entityIds":$var_entityIds,"updatedSince":$var_updatedSince,"campaignFilter":$var_campaignFilter,"outputFormat":$var_outputFormat
        | }
        """.stripMargin
}
