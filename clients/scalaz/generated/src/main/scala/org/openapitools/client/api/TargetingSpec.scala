package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpec._

case class TargetingSpec (
  /* **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted. */
  AGE_BUCKET: Option[List[TargetingSpecAgeBucket]],
/* Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. */
  APPTYPE: Option[List[TargetingSpecAppType]],
/* Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. */
  AUDIENCE_EXCLUDE: Option[List[String]],
/* Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. */
  AUDIENCE_INCLUDE: Option[List[String]],
/* Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. */
  GENDER: Option[List[TargetingSpecGender]],
/* Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below). */
  GEO: Option[List[String]],
/* Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. */
  INTEREST: Option[List[String]],
/* 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. */
  LOCALE: Option[List[String]],
/* 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a>. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above). */
  LOCATION: Option[List[String]],
/* Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. */
  MAXIMUM_AGE: Option[String],
/* Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. */
  MINIMUM_AGE: Option[String],
/* Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting */
  SHOPPING_RETARGETING: Option[List[TargetingSpecShoppingRetargeting]],
/*  */
  TARGETING_STRATEGY: Option[List[TARGETINGSTRATEGY]])

object TargetingSpec {
  import DateTimeCodecs._
  sealed trait List[TARGETINGSTRATEGY]

  object List[TARGETINGSTRATEGY] {
    def toList[TARGETINGSTRATEGY](s: String): Option[List[TARGETINGSTRATEGY]] = s match {
      case _ => None
    }

    def fromList[TARGETINGSTRATEGY](x: List[TARGETINGSTRATEGY]): String = x match {
    }
  }

  implicit val List[TARGETINGSTRATEGY]EnumEncoder: EncodeJson[List[TARGETINGSTRATEGY]] =
    EncodeJson[List[TARGETINGSTRATEGY]](is => StringEncodeJson(List[TARGETINGSTRATEGY].fromList[TARGETINGSTRATEGY](is)))

  implicit val List[TARGETINGSTRATEGY]EnumDecoder: DecodeJson[List[TARGETINGSTRATEGY]] =
    DecodeJson.optionDecoder[List[TARGETINGSTRATEGY]](n => n.string.flatMap(jStr => List[TARGETINGSTRATEGY].toList[TARGETINGSTRATEGY](jStr)), "List[TARGETINGSTRATEGY] failed to de-serialize")

  implicit val TargetingSpecCodecJson: CodecJson[TargetingSpec] = CodecJson.derive[TargetingSpec]
  implicit val TargetingSpecDecoder: EntityDecoder[TargetingSpec] = jsonOf[TargetingSpec]
  implicit val TargetingSpecEncoder: EntityEncoder[TargetingSpec] = jsonEncoderOf[TargetingSpec]
}
