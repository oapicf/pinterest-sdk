package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EntityDataChangeHistory._

case class EntityDataChangeHistory (
  /* A string identifier representing the changed field on the entity */
  changedFieldId: Option[String],
/* The human readable name of the changed field on the entity */
  changedFieldName: Option[String],
/* Specifies the type of the field's data values */
  dataType: Option[ChangeHistoryDataType],
/* A string representation of the value of the changed field, after the change */
  newDataValue: Option[String],
/* A string representation of the value of the changed field, before the change */
  oldDataValue: Option[String])

object EntityDataChangeHistory {
  import DateTimeCodecs._

  implicit val EntityDataChangeHistoryCodecJson: CodecJson[EntityDataChangeHistory] = CodecJson.derive[EntityDataChangeHistory]
  implicit val EntityDataChangeHistoryDecoder: EntityDecoder[EntityDataChangeHistory] = jsonOf[EntityDataChangeHistory]
  implicit val EntityDataChangeHistoryEncoder: EntityEncoder[EntityDataChangeHistory] = jsonEncoderOf[EntityDataChangeHistory]
}
