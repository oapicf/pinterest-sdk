package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdCollectionsHeaderType._

case class AdCollectionsHeaderType (
  
object AdCollectionsHeaderType {
  import DateTimeCodecs._

  implicit val AdCollectionsHeaderTypeCodecJson: CodecJson[AdCollectionsHeaderType] = CodecJson.derive[AdCollectionsHeaderType]
  implicit val AdCollectionsHeaderTypeDecoder: EntityDecoder[AdCollectionsHeaderType] = jsonOf[AdCollectionsHeaderType]
  implicit val AdCollectionsHeaderTypeEncoder: EntityEncoder[AdCollectionsHeaderType] = jsonEncoderOf[AdCollectionsHeaderType]
}
