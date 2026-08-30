package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EntityLabel._

case class EntityLabel (
  /* Entity ID to apply label to. */
  entityId: String,
entityType: Option[LabelParentType],
/* Label ID. */
  labelId: String,
status: Option[EntityLabelStatus])

object EntityLabel {
  import DateTimeCodecs._

  implicit val EntityLabelCodecJson: CodecJson[EntityLabel] = CodecJson.derive[EntityLabel]
  implicit val EntityLabelDecoder: EntityDecoder[EntityLabel] = jsonOf[EntityLabel]
  implicit val EntityLabelEncoder: EntityEncoder[EntityLabel] = jsonEncoderOf[EntityLabel]
}
