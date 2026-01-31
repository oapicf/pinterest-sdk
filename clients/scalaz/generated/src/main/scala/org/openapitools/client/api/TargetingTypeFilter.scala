package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTypeFilter._

case class TargetingTypeFilter (
  /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. */
  targetingTypes: Option[List[TargetingTypes]])

object TargetingTypeFilter {
  import DateTimeCodecs._
  sealed trait List[TargetingTypes]

  object List[TargetingTypes] {
    def toList[TargetingTypes](s: String): Option[List[TargetingTypes]] = s match {
      case _ => None
    }

    def fromList[TargetingTypes](x: List[TargetingTypes]): String = x match {
    }
  }

  implicit val List[TargetingTypes]EnumEncoder: EncodeJson[List[TargetingTypes]] =
    EncodeJson[List[TargetingTypes]](is => StringEncodeJson(List[TargetingTypes].fromList[TargetingTypes](is)))

  implicit val List[TargetingTypes]EnumDecoder: DecodeJson[List[TargetingTypes]] =
    DecodeJson.optionDecoder[List[TargetingTypes]](n => n.string.flatMap(jStr => List[TargetingTypes].toList[TargetingTypes](jStr)), "List[TargetingTypes] failed to de-serialize")

  implicit val TargetingTypeFilterCodecJson: CodecJson[TargetingTypeFilter] = CodecJson.derive[TargetingTypeFilter]
  implicit val TargetingTypeFilterDecoder: EntityDecoder[TargetingTypeFilter] = jsonOf[TargetingTypeFilter]
  implicit val TargetingTypeFilterEncoder: EntityEncoder[TargetingTypeFilter] = jsonEncoderOf[TargetingTypeFilter]
}
