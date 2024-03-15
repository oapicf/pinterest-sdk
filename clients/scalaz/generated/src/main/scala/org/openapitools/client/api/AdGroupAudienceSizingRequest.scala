package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupAudienceSizingRequest._

case class AdGroupAudienceSizingRequest (
  /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
/* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
  placementGroup: Option[PlacementGroupType],
/* Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
  creativeTypes: Option[List[CreativeTypes]],
targetingSpec: Option[TargetingSpec],
/* Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. */
  productGroupIds: Option[List[String]],
/* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
  keywords: Option[List[AdGroupAudienceSizingRequestKeywordsInner]])

object AdGroupAudienceSizingRequest {
  import DateTimeCodecs._
  sealed trait List[CreativeTypes]

  object List[CreativeTypes] {
    def toList[CreativeTypes](s: String): Option[List[CreativeTypes]] = s match {
      case _ => None
    }

    def fromList[CreativeTypes](x: List[CreativeTypes]): String = x match {
    }
  }

  implicit val List[CreativeTypes]EnumEncoder: EncodeJson[List[CreativeTypes]] =
    EncodeJson[List[CreativeTypes]](is => StringEncodeJson(List[CreativeTypes].fromList[CreativeTypes](is)))

  implicit val List[CreativeTypes]EnumDecoder: DecodeJson[List[CreativeTypes]] =
    DecodeJson.optionDecoder[List[CreativeTypes]](n => n.string.flatMap(jStr => List[CreativeTypes].toList[CreativeTypes](jStr)), "List[CreativeTypes] failed to de-serialize")

  implicit val AdGroupAudienceSizingRequestCodecJson: CodecJson[AdGroupAudienceSizingRequest] = CodecJson.derive[AdGroupAudienceSizingRequest]
  implicit val AdGroupAudienceSizingRequestDecoder: EntityDecoder[AdGroupAudienceSizingRequest] = jsonOf[AdGroupAudienceSizingRequest]
  implicit val AdGroupAudienceSizingRequestEncoder: EntityEncoder[AdGroupAudienceSizingRequest] = jsonEncoderOf[AdGroupAudienceSizingRequest]
}
