package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabeledEntities._

case class LabeledEntities (
  entitiesLabels: Option[List[EntityLabel]],
/* Labels that were not successfully applied. */
  errors: Option[List[EntityLabelError]])

object LabeledEntities {
  import DateTimeCodecs._

  implicit val LabeledEntitiesCodecJson: CodecJson[LabeledEntities] = CodecJson.derive[LabeledEntities]
  implicit val LabeledEntitiesDecoder: EntityDecoder[LabeledEntities] = jsonOf[LabeledEntities]
  implicit val LabeledEntitiesEncoder: EntityEncoder[LabeledEntities] = jsonEncoderOf[LabeledEntities]
}
