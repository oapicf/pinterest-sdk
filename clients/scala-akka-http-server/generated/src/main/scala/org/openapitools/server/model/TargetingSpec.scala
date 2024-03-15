package org.openapitools.server.model


/**
 * Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}
 *
 * @param AGE_BUCKET Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted. for example: ''["35-44","50-54"]''
 * @param APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. for example: ''["ipad","iphone"]''
 * @param AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. for example: ''null''
 * @param AUDIENCE_INCLUDE Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. for example: ''null''
 * @param GENDER Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. for example: ''null''
 * @param GEO Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**. for example: ''null''
 * @param INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. for example: ''null''
 * @param LOCALE 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**. for example: ''null''
 * @param LOCATION 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**. for example: ''null''
 * @param SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting for example: ''null''
 * @param TARGETING_STRATEGY  for example: ''null''
*/
final case class TargetingSpec (
  AGE_BUCKET: Option[Seq[String]] = None,
  APPTYPE: Option[Seq[String]] = None,
  AUDIENCE_EXCLUDE: Option[Seq[String]] = None,
  AUDIENCE_INCLUDE: Option[Seq[String]] = None,
  GENDER: Option[Seq[String]] = None,
  GEO: Option[Seq[String]] = None,
  INTEREST: Option[Seq[String]] = None,
  LOCALE: Option[Seq[String]] = None,
  LOCATION: Option[Seq[String]] = None,
  SHOPPING_RETARGETING: Option[Seq[TargetingSpecSHOPPINGRETARGETING]] = None,
  TARGETING_STRATEGY: Option[Seq[String]] = None
)

