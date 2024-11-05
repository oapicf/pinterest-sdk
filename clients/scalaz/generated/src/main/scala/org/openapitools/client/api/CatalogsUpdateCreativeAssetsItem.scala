package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsUpdateCreativeAssetsItem._

case class CatalogsUpdateCreativeAssetsItem (
  /* The catalog creative assets item id in the merchant namespace */
  creativeAssetsId: String,
operation: Operation,
attributes: CatalogsUpdatableCreativeAssetsAttributes)

object CatalogsUpdateCreativeAssetsItem {
  import DateTimeCodecs._
  sealed trait Operation
  case object UPDATE extends Operation

  object Operation {
    def toOperation(s: String): Option[Operation] = s match {
      case "UPDATE" => Some(UPDATE)
      case _ => None
    }

    def fromOperation(x: Operation): String = x match {
      case UPDATE => "UPDATE"
    }
  }

  implicit val OperationEnumEncoder: EncodeJson[Operation] =
    EncodeJson[Operation](is => StringEncodeJson(Operation.fromOperation(is)))

  implicit val OperationEnumDecoder: DecodeJson[Operation] =
    DecodeJson.optionDecoder[Operation](n => n.string.flatMap(jStr => Operation.toOperation(jStr)), "Operation failed to de-serialize")

  implicit val CatalogsUpdateCreativeAssetsItemCodecJson: CodecJson[CatalogsUpdateCreativeAssetsItem] = CodecJson.derive[CatalogsUpdateCreativeAssetsItem]
  implicit val CatalogsUpdateCreativeAssetsItemDecoder: EntityDecoder[CatalogsUpdateCreativeAssetsItem] = jsonOf[CatalogsUpdateCreativeAssetsItem]
  implicit val CatalogsUpdateCreativeAssetsItemEncoder: EntityEncoder[CatalogsUpdateCreativeAssetsItem] = jsonEncoderOf[CatalogsUpdateCreativeAssetsItem]
}
