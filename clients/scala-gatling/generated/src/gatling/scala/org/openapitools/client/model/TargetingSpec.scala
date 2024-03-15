
package org.openapitools.client.model


case class TargetingSpec (
    /* Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. */
    _AGE_BUCKET: Option[List[String]],
    /* Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. */
    _APPTYPE: Option[List[String]],
    /* Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. */
    _AUDIENCE_EXCLUDE: Option[List[String]],
    /* Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. */
    _AUDIENCE_INCLUDE: Option[List[String]],
    /* Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. */
    _GENDER: Option[List[String]],
    /* Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. */
    _GEO: Option[List[String]],
    /* Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. */
    _INTEREST: Option[List[String]],
    /* 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. */
    _LOCALE: Option[List[String]],
    /* 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. */
    _LOCATION: Option[List[String]],
    /* Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting */
    _SHOPPING_RETARGETING: Option[List[TargetingSpecSHOPPINGRETARGETING]],
    /*  */
    _TARGETING_STRATEGY: Option[List[String]]
)
object TargetingSpec {
    def toStringBody(var_AGE_BUCKET: Object, var_APPTYPE: Object, var_AUDIENCE_EXCLUDE: Object, var_AUDIENCE_INCLUDE: Object, var_GENDER: Object, var_GEO: Object, var_INTEREST: Object, var_LOCALE: Object, var_LOCATION: Object, var_SHOPPING_RETARGETING: Object, var_TARGETING_STRATEGY: Object) =
        s"""
        | {
        | "AGE_BUCKET":$var_AGE_BUCKET,"APPTYPE":$var_APPTYPE,"AUDIENCE_EXCLUDE":$var_AUDIENCE_EXCLUDE,"AUDIENCE_INCLUDE":$var_AUDIENCE_INCLUDE,"GENDER":$var_GENDER,"GEO":$var_GEO,"INTEREST":$var_INTEREST,"LOCALE":$var_LOCALE,"LOCATION":$var_LOCATION,"SHOPPING_RETARGETING":$var_SHOPPING_RETARGETING,"TARGETING_STRATEGY":$var_TARGETING_STRATEGY
        | }
        """.stripMargin
}
