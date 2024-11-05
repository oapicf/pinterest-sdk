package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePartnerAssetAccessBodyAccessesInner._

case class DeletePartnerAssetAccessBodyAccessesInner (
  /* Unique identifier of a business partner to update asset access to. */
  partnerId: String,
/* Unique identifier of the business asset. */
  assetId: String,
/* If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. */
  partnerType: Option[PartnerType])

object DeletePartnerAssetAccessBodyAccessesInner {
  import DateTimeCodecs._
  sealed trait PartnerType
  case object INTERNAL extends PartnerType
  case object EXTERNAL extends PartnerType

  object PartnerType {
    def toPartnerType(s: String): Option[PartnerType] = s match {
      case "INTERNAL" => Some(INTERNAL)
      case "EXTERNAL" => Some(EXTERNAL)
      case _ => None
    }

    def fromPartnerType(x: PartnerType): String = x match {
      case INTERNAL => "INTERNAL"
      case EXTERNAL => "EXTERNAL"
    }
  }

  implicit val PartnerTypeEnumEncoder: EncodeJson[PartnerType] =
    EncodeJson[PartnerType](is => StringEncodeJson(PartnerType.fromPartnerType(is)))

  implicit val PartnerTypeEnumDecoder: DecodeJson[PartnerType] =
    DecodeJson.optionDecoder[PartnerType](n => n.string.flatMap(jStr => PartnerType.toPartnerType(jStr)), "PartnerType failed to de-serialize")

  implicit val DeletePartnerAssetAccessBodyAccessesInnerCodecJson: CodecJson[DeletePartnerAssetAccessBodyAccessesInner] = CodecJson.derive[DeletePartnerAssetAccessBodyAccessesInner]
  implicit val DeletePartnerAssetAccessBodyAccessesInnerDecoder: EntityDecoder[DeletePartnerAssetAccessBodyAccessesInner] = jsonOf[DeletePartnerAssetAccessBodyAccessesInner]
  implicit val DeletePartnerAssetAccessBodyAccessesInnerEncoder: EntityEncoder[DeletePartnerAssetAccessBodyAccessesInner] = jsonEncoderOf[DeletePartnerAssetAccessBodyAccessesInner]
}
