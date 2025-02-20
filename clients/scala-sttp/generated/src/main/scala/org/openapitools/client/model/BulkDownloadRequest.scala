/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.model.BulkEntityType._
import org.openapitools.client.model.BulkOutputFormat._

  /**
   * Ad entities to get in bulk request.
   */
case class BulkDownloadRequest(
  /* All entity types specified will be downloaded. Fewer types result in faster downloads. */
  entityTypes: Option[Seq[BulkEntityType]] = None,
  /* All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. */
  entityIds: Option[Seq[String]] = None,
  /* Unix UTC timestamp to retrieve all entities that have changed since this time. */
  updatedSince: Option[String] = None,
  campaignFilter: Option[BulkDownloadRequestCampaignFilter] = None,
  outputFormat: Option[BulkOutputFormat] = None
)

object BulkDownloadRequestEnums {

}
