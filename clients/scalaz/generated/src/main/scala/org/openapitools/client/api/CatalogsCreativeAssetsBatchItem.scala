package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsBatchItem._

case class CatalogsCreativeAssetsBatchItem (
  /* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: String,
operation: Operation,
attributes: CatalogsUpdatableCreativeAssetsAttributes)

object CatalogsCreativeAssetsBatchItem {
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

  implicit val CatalogsCreativeAssetsBatchItemCodecJson: CodecJson[CatalogsCreativeAssetsBatchItem] = CodecJson.derive[CatalogsCreativeAssetsBatchItem]
  implicit val CatalogsCreativeAssetsBatchItemDecoder: EntityDecoder[CatalogsCreativeAssetsBatchItem] = jsonOf[CatalogsCreativeAssetsBatchItem]
  implicit val CatalogsCreativeAssetsBatchItemEncoder: EntityEncoder[CatalogsCreativeAssetsBatchItem] = jsonEncoderOf[CatalogsCreativeAssetsBatchItem]
}
