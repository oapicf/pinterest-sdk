package org.openapitools.server.model


/**
 * @param AGE_BUCKET **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted. for example: ''null''
 * @param APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. for example: ''null''
 * @param AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. for example: ''null''
 * @param AUDIENCE_INCLUDE Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. for example: ''null''
 * @param GENDER Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. for example: ''null''
 * @param GEO Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: `US-CA` is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: `94103` is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like `US-CA` or a more granular postal code within that regon, such as `94103`.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the `region_codes` key and a postal code value with the `postal_codes` key. Examples:  ``` \"geo\": {   \"region_codes\": [\"US-CA\"] } ```  ``` \"geo\": {   \"postal_codes\": [\"94103\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION`.  If you do not specifiy a `GEO` code, only `LOCATION` values will be targeted (See `LOCATION` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones). for example: ''null''
 * @param GEO_EXCLUDE [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See `GEO` parameter in this targeting spec for rules, syntax, and other information. for example: ''null''
 * @param INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. for example: ''null''
 * @param LOCALE 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. for example: ''null''
 * @param LOCATION Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the `country_codes` key and metro code values with `metro_codes` key. Example:  ``` \"location\": {   \"country_codes\": [\"US\", \"CA\"],   \"metro_codes\": [\"501\", \"602\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION` code.  If you do not specify a `LOCATION` code, only `GEO` values will be targeted (See `GEO` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones). for example: ''null''
 * @param LOCATION_EXCLUDE [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See `LOCATION` parameter in this targeting spec for rules, syntax, and other information. for example: ''null''
 * @param MAXIMUM_AGE Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. for example: ''null''
 * @param MINIMUM_AGE Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. for example: ''null''
 * @param SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting for example: ''null''
 * @param TARGETING_STRATEGY  for example: ''null''
*/
final case class TargetingSpecOptimal (
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
  TARGETING_STRATEGY: Option[Seq[TargetingStrategy]] = None
)

