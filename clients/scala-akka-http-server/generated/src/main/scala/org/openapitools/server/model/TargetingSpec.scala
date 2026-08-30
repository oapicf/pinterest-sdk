package org.openapitools.server.model


/**
 * Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`
 *
 * @param AGE_BUCKET **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted. for example: ''["35-44","50-54"]''
 * @param APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. for example: ''["ipad","iphone"]''
 * @param AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. for example: ''null''
 * @param AUDIENCE_INCLUDE Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. for example: ''null''
 * @param GENDER Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. for example: ''null''
 * @param GEO Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>. for example: ''null''
 * @param GEO_EXCLUDE Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br /> for example: ''null''
 * @param INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. for example: ''null''
 * @param LOCALE 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. for example: ''null''
 * @param LOCATION Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>. for example: ''null''
 * @param LOCATION_EXCLUDE Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information. for example: ''null''
 * @param MAXIMUM_AGE Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. for example: ''65+''
 * @param MINIMUM_AGE Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. for example: ''18''
 * @param SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting for example: ''null''
 * @param TARGETING_STRATEGY  for example: ''null''
*/
final case class TargetingSpec (
  AGE_BUCKET: Option[Seq[TargetingSpecAgeBucket]] = None,
  APPTYPE: Option[Seq[TargetingSpecAppType]] = None,
  AUDIENCE_EXCLUDE: Option[Seq[String]] = None,
  AUDIENCE_INCLUDE: Option[Seq[String]] = None,
  GENDER: Option[Seq[TargetingSpecGender]] = None,
  GEO: Option[Seq[String]] = None,
  GEO_EXCLUDE: Option[Seq[String]] = None,
  INTEREST: Option[Seq[String]] = None,
  LOCALE: Option[Seq[String]] = None,
  LOCATION: Option[Seq[String]] = None,
  LOCATION_EXCLUDE: Option[Seq[String]] = None,
  MAXIMUM_AGE: Option[String] = None,
  MINIMUM_AGE: Option[String] = None,
  SHOPPING_RETARGETING: Option[Seq[TargetingSpecShoppingRetargeting]] = None,
  TARGETING_STRATEGY: Option[Seq[String]] = None
)

