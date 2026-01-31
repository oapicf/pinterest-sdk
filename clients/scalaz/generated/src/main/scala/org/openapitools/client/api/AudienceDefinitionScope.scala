package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceDefinitionScope._

case class AudienceDefinitionScope (
  scope: Option[Scope])

object AudienceDefinitionScope {
  import DateTimeCodecs._
  sealed trait Scope
  case object PARTNER extends Scope
  case object PINTEREST extends Scope

  object Scope {
    def toScope(s: String): Option[Scope] = s match {
      case "PARTNER" => Some(PARTNER)
      case "PINTEREST" => Some(PINTEREST)
      case _ => None
    }

    def fromScope(x: Scope): String = x match {
      case PARTNER => "PARTNER"
      case PINTEREST => "PINTEREST"
    }
  }

  implicit val ScopeEnumEncoder: EncodeJson[Scope] =
    EncodeJson[Scope](is => StringEncodeJson(Scope.fromScope(is)))

  implicit val ScopeEnumDecoder: DecodeJson[Scope] =
    DecodeJson.optionDecoder[Scope](n => n.string.flatMap(jStr => Scope.toScope(jStr)), "Scope failed to de-serialize")

  implicit val AudienceDefinitionScopeCodecJson: CodecJson[AudienceDefinitionScope] = CodecJson.derive[AudienceDefinitionScope]
  implicit val AudienceDefinitionScopeDecoder: EntityDecoder[AudienceDefinitionScope] = jsonOf[AudienceDefinitionScope]
  implicit val AudienceDefinitionScopeEncoder: EntityEncoder[AudienceDefinitionScope] = jsonEncoderOf[AudienceDefinitionScope]
}
