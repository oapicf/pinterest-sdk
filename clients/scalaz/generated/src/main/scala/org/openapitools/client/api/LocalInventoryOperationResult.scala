package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalInventoryOperationResult._

case class LocalInventoryOperationResult (
  /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
  errors: Option[List[SupplementalItemValidationEvent]],
/* Catalog item id in the merchant namespace */
  itemId: String,
/* Status of the item processing record */
  status: SupplementalItemProcessingStatus,
/* Store code for the local inventory item */
  storeCode: String,
supplementalType: SupplementalType,
/* Array with the validation warnings for the item processing record */
  warnings: Option[List[SupplementalItemValidationEvent]])

object LocalInventoryOperationResult {
  import DateTimeCodecs._
  sealed trait SupplementalType
  case object LOCALINVENTORY extends SupplementalType

  object SupplementalType {
    def toSupplementalType(s: String): Option[SupplementalType] = s match {
      case "LOCALINVENTORY" => Some(LOCALINVENTORY)
      case _ => None
    }

    def fromSupplementalType(x: SupplementalType): String = x match {
      case LOCALINVENTORY => "LOCALINVENTORY"
    }
  }

  implicit val SupplementalTypeEnumEncoder: EncodeJson[SupplementalType] =
    EncodeJson[SupplementalType](is => StringEncodeJson(SupplementalType.fromSupplementalType(is)))

  implicit val SupplementalTypeEnumDecoder: DecodeJson[SupplementalType] =
    DecodeJson.optionDecoder[SupplementalType](n => n.string.flatMap(jStr => SupplementalType.toSupplementalType(jStr)), "SupplementalType failed to de-serialize")

  implicit val LocalInventoryOperationResultCodecJson: CodecJson[LocalInventoryOperationResult] = CodecJson.derive[LocalInventoryOperationResult]
  implicit val LocalInventoryOperationResultDecoder: EntityDecoder[LocalInventoryOperationResult] = jsonOf[LocalInventoryOperationResult]
  implicit val LocalInventoryOperationResultEncoder: EntityEncoder[LocalInventoryOperationResult] = jsonEncoderOf[LocalInventoryOperationResult]
}
