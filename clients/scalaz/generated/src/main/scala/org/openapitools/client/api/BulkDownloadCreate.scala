package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkDownloadCreate._

case class BulkDownloadCreate (
  campaignFilter: Option[BulkDownloadCampaignFilter],
/* All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. */
  entityIds: Option[List[String]],
/* All entity types specified will be downloaded. Fewer types result in faster downloads. */
  entityTypes: Option[List[BulkEntityType]],
outputFormat: Option[BulkOutputFormat],
/* Unix UTC timestamp to retrieve all entities that have changed since this time. */
  updatedSince: Option[String])

object BulkDownloadCreate {
  import DateTimeCodecs._

  implicit val BulkDownloadCreateCodecJson: CodecJson[BulkDownloadCreate] = CodecJson.derive[BulkDownloadCreate]
  implicit val BulkDownloadCreateDecoder: EntityDecoder[BulkDownloadCreate] = jsonOf[BulkDownloadCreate]
  implicit val BulkDownloadCreateEncoder: EntityEncoder[BulkDownloadCreate] = jsonEncoderOf[BulkDownloadCreate]
}
