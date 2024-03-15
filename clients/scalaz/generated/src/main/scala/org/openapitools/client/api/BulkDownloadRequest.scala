package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkDownloadRequest._

case class BulkDownloadRequest (
  /* All entity types specified will be downloaded. Fewer types result in faster downloads. */
  entityTypes: Option[List[BulkEntityType]],
/* All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. */
  entityIds: Option[List[String]],
/* Unix UTC timestamp to retrieve all entities that have changed since this time. */
  updatedSince: Option[String],
campaignFilter: Option[BulkDownloadRequestCampaignFilter],
outputFormat: Option[BulkOutputFormat])

object BulkDownloadRequest {
  import DateTimeCodecs._

  implicit val BulkDownloadRequestCodecJson: CodecJson[BulkDownloadRequest] = CodecJson.derive[BulkDownloadRequest]
  implicit val BulkDownloadRequestDecoder: EntityDecoder[BulkDownloadRequest] = jsonOf[BulkDownloadRequest]
  implicit val BulkDownloadRequestEncoder: EntityEncoder[BulkDownloadRequest] = jsonEncoderOf[BulkDownloadRequest]
}
