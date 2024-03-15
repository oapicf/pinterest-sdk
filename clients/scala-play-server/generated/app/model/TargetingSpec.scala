package model

import play.api.libs.json._

/**
  * Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}
  * @param AGE_BUCKET Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
  * @param APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
  * @param AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
  * @param AUDIENCE_INCLUDE Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
  * @param GENDER Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
  * @param GEO Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
  * @param INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
  * @param LOCALE 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
  * @param LOCATION 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
  * @param SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
  * @param TARGETING_STRATEGY 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TargetingSpec(
  AGE_BUCKET: Option[TargetingSpec.AGEBUCKET.Value],
  APPTYPE: Option[TargetingSpec.APPTYPE.Value],
  AUDIENCE_EXCLUDE: Option[List[String]],
  AUDIENCE_INCLUDE: Option[List[String]],
  GENDER: Option[TargetingSpec.GENDER.Value],
  GEO: Option[List[String]],
  INTEREST: Option[List[String]],
  LOCALE: Option[List[String]],
  LOCATION: Option[List[String]],
  SHOPPING_RETARGETING: Option[List[TargetingSpecSHOPPINGRETARGETING]],
  TARGETING_STRATEGY: Option[TargetingSpec.TARGETINGSTRATEGY.Value]
)

object TargetingSpec {
  implicit lazy val targetingSpecJsonFormat: Format[TargetingSpec] = Json.format[TargetingSpec]

  // noinspection TypeAnnotation
  object AGEBUCKET extends Enumeration {
    val _1824 = Value("18-24")
    val _21 = Value("21+")
    val _2534 = Value("25-34")
    val _3544 = Value("35-44")
    val _4549 = Value("45-49")
    val _5054 = Value("50-54")
    val _5564 = Value("55-64")
    val _65 = Value("65+")

    type AGEBUCKET = Value
    implicit lazy val AGEBUCKETJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object APPTYPE extends Enumeration {
    val AndroidMobile = Value("android_mobile")
    val AndroidTablet = Value("android_tablet")
    val Ipad = Value("ipad")
    val Iphone = Value("iphone")
    val Web = Value("web")
    val WebMobile = Value("web_mobile")

    type APPTYPE = Value
    implicit lazy val APPTYPEJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object GENDER extends Enumeration {
    val Unknown = Value("unknown")
    val Male = Value("male")
    val Female = Value("female")

    type GENDER = Value
    implicit lazy val GENDERJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object TARGETINGSTRATEGY extends Enumeration {
    val CHOOSEYOUROWN = Value("CHOOSE_YOUR_OWN")
    val FINDNEWCUSTOMERS = Value("FIND_NEW_CUSTOMERS")
    val RECONNECTWITHUSERS = Value("RECONNECT_WITH_USERS")

    type TARGETINGSTRATEGY = Value
    implicit lazy val TARGETINGSTRATEGYJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

