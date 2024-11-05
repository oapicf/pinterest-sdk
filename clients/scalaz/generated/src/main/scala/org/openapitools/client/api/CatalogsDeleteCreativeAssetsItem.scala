package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsDeleteCreativeAssetsItem._

case class CatalogsDeleteCreativeAssetsItem (
  /* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: String,
operation: Operation)

object CatalogsDeleteCreativeAssetsItem {
  import DateTimeCodecs._
  sealed trait Operation
  case object DELETE extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "DELETE" => Some(DELETE)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case DELETE => "DELETE"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val CatalogsDeleteCreativeAssetsItemCodecJson: CodecJson[CatalogsDeleteCreativeAssetsItem] = CodecJson.derive[CatalogsDeleteCreativeAssetsItem]
  implicit val CatalogsDeleteCreativeAssetsItemDecoder: EntityDecoder[CatalogsDeleteCreativeAssetsItem] = jsonOf[CatalogsDeleteCreativeAssetsItem]
  implicit val CatalogsDeleteCreativeAssetsItemEncoder: EntityEncoder[CatalogsDeleteCreativeAssetsItem] = jsonEncoderOf[CatalogsDeleteCreativeAssetsItem]
}
