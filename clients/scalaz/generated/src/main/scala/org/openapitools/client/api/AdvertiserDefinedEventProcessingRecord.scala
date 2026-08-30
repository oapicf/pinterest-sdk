package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvertiserDefinedEventProcessingRecord._

case class AdvertiserDefinedEventProcessingRecord (
  /* List of exception messages if the operation failed */
  exceptions: Option[List[String]],
/* Name of the advertiser defined event */
  name: String,
/* Processing status (success or failure) */
  status: String)

object AdvertiserDefinedEventProcessingRecord {
  import DateTimeCodecs._

  implicit val AdvertiserDefinedEventProcessingRecordCodecJson: CodecJson[AdvertiserDefinedEventProcessingRecord] = CodecJson.derive[AdvertiserDefinedEventProcessingRecord]
  implicit val AdvertiserDefinedEventProcessingRecordDecoder: EntityDecoder[AdvertiserDefinedEventProcessingRecord] = jsonOf[AdvertiserDefinedEventProcessingRecord]
  implicit val AdvertiserDefinedEventProcessingRecordEncoder: EntityEncoder[AdvertiserDefinedEventProcessingRecord] = jsonEncoderOf[AdvertiserDefinedEventProcessingRecord]
}
