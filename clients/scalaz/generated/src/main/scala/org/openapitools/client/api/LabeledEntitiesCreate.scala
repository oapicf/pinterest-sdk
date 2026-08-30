package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabeledEntitiesCreate._

case class LabeledEntitiesCreate (
  /* Entity IDs to apply label to. */
  entityIds: List[String])

object LabeledEntitiesCreate {
  import DateTimeCodecs._

  implicit val LabeledEntitiesCreateCodecJson: CodecJson[LabeledEntitiesCreate] = CodecJson.derive[LabeledEntitiesCreate]
  implicit val LabeledEntitiesCreateDecoder: EntityDecoder[LabeledEntitiesCreate] = jsonOf[LabeledEntitiesCreate]
  implicit val LabeledEntitiesCreateEncoder: EntityEncoder[LabeledEntitiesCreate] = jsonEncoderOf[LabeledEntitiesCreate]
}
