package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EntityHistory._

case class EntityHistory (
  /* A Unix timestamp representing the time of the change in seconds */
  changeTimestamp: Option[Integer],
/* Properties associated with a particular change to an entity's data */
  dataChanges: Option[List[EntityDataChangeHistory]],
/* The id of the entity that was changed */
  entityId: Option[String],
/* The name of the entity that was changed */
  entityName: Option[String],
/* The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users */
  ldap: Option[String],
/* The type of operation that caused the change */
  operation: Option[ChangeHistoryOperationType],
/* The id of the user who initiated the change */
  userId: Option[String])

object EntityHistory {
  import DateTimeCodecs._

  implicit val EntityHistoryCodecJson: CodecJson[EntityHistory] = CodecJson.derive[EntityHistory]
  implicit val EntityHistoryDecoder: EntityDecoder[EntityHistory] = jsonOf[EntityHistory]
  implicit val EntityHistoryEncoder: EntityEncoder[EntityHistory] = jsonEncoderOf[EntityHistory]
}
