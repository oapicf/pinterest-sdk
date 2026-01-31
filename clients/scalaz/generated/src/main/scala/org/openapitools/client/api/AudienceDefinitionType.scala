package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceDefinitionType._

case class AudienceDefinitionType (
  scope: Option[Scope])

object AudienceDefinitionType {
  import DateTimeCodecs._
  sealed trait Scope
  case object IMPRESSIONPLUSENGAGEMENT extends Scope
  case object ENGAGEMENT extends Scope

  object Scope {
    def toScope(s: String): Option[Scope] = s match {
      case "IMPRESSIONPLUSENGAGEMENT" => Some(IMPRESSIONPLUSENGAGEMENT)
      case "ENGAGEMENT" => Some(ENGAGEMENT)
      case _ => None
    }

    def fromScope(x: Scope): String = x match {
      case IMPRESSIONPLUSENGAGEMENT => "IMPRESSIONPLUSENGAGEMENT"
      case ENGAGEMENT => "ENGAGEMENT"
    }
  }

  implicit val ScopeEnumEncoder: EncodeJson[Scope] =
    EncodeJson[Scope](is => StringEncodeJson(Scope.fromScope(is)))

  implicit val ScopeEnumDecoder: DecodeJson[Scope] =
    DecodeJson.optionDecoder[Scope](n => n.string.flatMap(jStr => Scope.toScope(jStr)), "Scope failed to de-serialize")

  implicit val AudienceDefinitionTypeCodecJson: CodecJson[AudienceDefinitionType] = CodecJson.derive[AudienceDefinitionType]
  implicit val AudienceDefinitionTypeDecoder: EntityDecoder[AudienceDefinitionType] = jsonOf[AudienceDefinitionType]
  implicit val AudienceDefinitionTypeEncoder: EntityEncoder[AudienceDefinitionType] = jsonEncoderOf[AudienceDefinitionType]
}
