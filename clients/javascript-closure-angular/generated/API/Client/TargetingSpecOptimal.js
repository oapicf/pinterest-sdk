goog.provide('API.Client.TargetingSpecOptimal');

/**
 * @record
 */
API.Client.TargetingSpecOptimal = function() {}

/**
 * **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
 * @type {!Array<!API.Client.TargetingSpecAgeBucket>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.AGE_BUCKET;

/**
 * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
 * @type {!Array<!API.Client.TargetingSpecAppType>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.APPTYPE;

/**
 * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.AUDIENCE_EXCLUDE;

/**
 * Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.AUDIENCE_INCLUDE;

/**
 * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
 * @type {!Array<!API.Client.TargetingSpecGender>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.GENDER;

/**
 * Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: `US-CA` is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: `94103` is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like `US-CA` or a more granular postal code within that regon, such as `94103`.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the `region_codes` key and a postal code value with the `postal_codes` key. Examples:  ``` \"geo\": {   \"region_codes\": [\"US-CA\"] } ```  ``` \"geo\": {   \"postal_codes\": [\"94103\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION`.  If you do not specifiy a `GEO` code, only `LOCATION` values will be targeted (See `LOCATION` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.GEO;

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See `GEO` parameter in this targeting spec for rules, syntax, and other information.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.GEO_EXCLUDE;

/**
 * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.INTEREST;

/**
 * 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.LOCALE;

/**
 * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the `country_codes` key and metro code values with `metro_codes` key. Example:  ``` \"location\": {   \"country_codes\": [\"US\", \"CA\"],   \"metro_codes\": [\"501\", \"602\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION` code.  If you do not specify a `LOCATION` code, only `GEO` values will be targeted (See `GEO` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.LOCATION;

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See `LOCATION` parameter in this targeting spec for rules, syntax, and other information.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.LOCATION_EXCLUDE;

/**
 * Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.MAXIMUM_AGE;

/**
 * Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
 * @type {!string}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.MINIMUM_AGE;

/**
 * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
 * @type {!Array<!API.Client.TargetingSpecShoppingRetargeting>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.SHOPPING_RETARGETING;

/**
 * @type {!Array<!API.Client.TargetingStrategy>}
 * @export
 */
API.Client.TargetingSpecOptimal.prototype.TARGETING_STRATEGY;

