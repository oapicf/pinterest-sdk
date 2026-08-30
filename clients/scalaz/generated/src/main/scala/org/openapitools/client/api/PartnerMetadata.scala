package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PartnerMetadata._

case class PartnerMetadata (
  /* Text field value that uniquely identifies a subscriber. */
  subscriberKey: Option[String])

object PartnerMetadata {
  import DateTimeCodecs._

  implicit val PartnerMetadataCodecJson: CodecJson[PartnerMetadata] = CodecJson.derive[PartnerMetadata]
  implicit val PartnerMetadataDecoder: EntityDecoder[PartnerMetadata] = jsonOf[PartnerMetadata]
  implicit val PartnerMetadataEncoder: EntityEncoder[PartnerMetadata] = jsonEncoderOf[PartnerMetadata]
}
