package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import AppTypeMultipliers._

case class AppTypeMultipliers (
  APP_TYPE: Option[APPTYPE])

object AppTypeMultipliers {
  import DateTimeCodecs._
  sealed trait APPTYPE
  case object AndroidMobile extends APPTYPE
  case object AndroidTablet extends APPTYPE
  case object Ipad extends APPTYPE
  case object Iphone extends APPTYPE
  case object Web extends APPTYPE
  case object WebMobile extends APPTYPE

  object APPTYPE {
    def toAPPTYPE(s: String): Option[APPTYPE] = s match {
      case "AndroidMobile" => Some(AndroidMobile)
      case "AndroidTablet" => Some(AndroidTablet)
      case "Ipad" => Some(Ipad)
      case "Iphone" => Some(Iphone)
      case "Web" => Some(Web)
      case "WebMobile" => Some(WebMobile)
      case _ => None
    }

    def fromAPPTYPE(x: APPTYPE): String = x match {
      case AndroidMobile => "AndroidMobile"
      case AndroidTablet => "AndroidTablet"
      case Ipad => "Ipad"
      case Iphone => "Iphone"
      case Web => "Web"
      case WebMobile => "WebMobile"
    }
  }

  implicit val APPTYPEEnumEncoder: EncodeJson[APPTYPE] =
    EncodeJson[APPTYPE](is => StringEncodeJson(APPTYPE.fromAPPTYPE(is)))

  implicit val APPTYPEEnumDecoder: DecodeJson[APPTYPE] =
    DecodeJson.optionDecoder[APPTYPE](n => n.string.flatMap(jStr => APPTYPE.toAPPTYPE(jStr)), "APPTYPE failed to de-serialize")

  implicit val AppTypeMultipliersCodecJson: CodecJson[AppTypeMultipliers] = CodecJson.derive[AppTypeMultipliers]
  implicit val AppTypeMultipliersDecoder: EntityDecoder[AppTypeMultipliers] = jsonOf[AppTypeMultipliers]
  implicit val AppTypeMultipliersEncoder: EntityEncoder[AppTypeMultipliers] = jsonEncoderOf[AppTypeMultipliers]
}
