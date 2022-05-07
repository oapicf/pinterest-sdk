package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedIngestionErrors._

case class CatalogsFeedIngestionErrors (
  imageDownloadError: Option[Integer],
imageDownloadConnectionTimeout: Option[Integer],
imageFormatUnrecognize: Option[Integer],
lineLevelInternalError: Option[Integer],
largeProductCountDecrease: Option[LargeProductCountDecrease])

object CatalogsFeedIngestionErrors {
  import DateTimeCodecs._
  sealed trait LargeProductCountDecrease
  case object `1` extends LargeProductCountDecrease

  object LargeProductCountDecrease {
    def toLargeProductCountDecrease(s: String): Option[LargeProductCountDecrease] = s match {
      case "`1`" => Some(`1`)
      case _ => None
    }

    def fromLargeProductCountDecrease(x: LargeProductCountDecrease): String = x match {
      case `1` => "`1`"
    }
  }

  implicit val LargeProductCountDecreaseEnumEncoder: EncodeJson[LargeProductCountDecrease] =
    EncodeJson[LargeProductCountDecrease](is => StringEncodeJson(LargeProductCountDecrease.fromLargeProductCountDecrease(is)))

  implicit val LargeProductCountDecreaseEnumDecoder: DecodeJson[LargeProductCountDecrease] =
    DecodeJson.optionDecoder[LargeProductCountDecrease](n => n.string.flatMap(jStr => LargeProductCountDecrease.toLargeProductCountDecrease(jStr)), "LargeProductCountDecrease failed to de-serialize")

  implicit val CatalogsFeedIngestionErrorsCodecJson: CodecJson[CatalogsFeedIngestionErrors] = CodecJson.derive[CatalogsFeedIngestionErrors]
  implicit val CatalogsFeedIngestionErrorsDecoder: EntityDecoder[CatalogsFeedIngestionErrors] = jsonOf[CatalogsFeedIngestionErrors]
  implicit val CatalogsFeedIngestionErrorsEncoder: EntityEncoder[CatalogsFeedIngestionErrors] = jsonEncoderOf[CatalogsFeedIngestionErrors]
}
