/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.BulkDownloadRequestCampaignFilter
import org.openapitools.server.models.BulkEntityType
import org.openapitools.server.models.BulkOutputFormat

/**
 * Ad entities to get in bulk request.
 * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads.
 * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
 * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time.
 * @param campaignFilter 
 * @param outputFormat 
 */
data class BulkDownloadRequest(
    /* All entity types specified will be downloaded. Fewer types result in faster downloads. */
    val entityTypes: kotlin.collections.List<BulkEntityType>? = null,
    /* All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. */
    val entityIds: kotlin.collections.List<kotlin.String>? = null,
    /* Unix UTC timestamp to retrieve all entities that have changed since this time. */
    val updatedSince: kotlin.String? = null,
    val campaignFilter: BulkDownloadRequestCampaignFilter? = null,
    val outputFormat: BulkOutputFormat? = "JSON"
) 
