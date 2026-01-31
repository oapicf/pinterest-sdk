goog.provide('API.Client.TargetingSpec');

/**
 * Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`
 * @record
 */
API.Client.TargetingSpec = function() {}

/**
 * **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
 * @type {!Array<!API.Client.TargetingSpecAgeBucket>}
 * @export
 */
API.Client.TargetingSpec.prototype.AGE_BUCKET;

/**
 * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
 * @type {!Array<!API.Client.TargetingSpecAppType>}
 * @export
 */
API.Client.TargetingSpec.prototype.APPTYPE;

/**
 * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.AUDIENCE_EXCLUDE;

/**
 * Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.AUDIENCE_INCLUDE;

/**
 * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
 * @type {!Array<!API.Client.TargetingSpecGender>}
 * @export
 */
API.Client.TargetingSpec.prototype.GENDER;

/**
 * Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.GEO;

/**
 * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.INTEREST;

/**
 * 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.LOCALE;

/**
 * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a>. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.LOCATION;

/**
 * Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
 * @type {!string}
 * @export
 */
API.Client.TargetingSpec.prototype.MAXIMUM_AGE;

/**
 * Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
 * @type {!string}
 * @export
 */
API.Client.TargetingSpec.prototype.MINIMUM_AGE;

/**
 * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
 * @type {!Array<!API.Client.TargetingSpecShoppingRetargeting>}
 * @export
 */
API.Client.TargetingSpec.prototype.SHOPPING_RETARGETING;

/**
 * 
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.TARGETING_STRATEGY;

/** @enum {string} */
API.Client.TargetingSpec.Array&lt;!TARGETING_STRATEGYEnum&gt; = { 
  CHOOSE_YOUR_OWN: 'CHOOSE_YOUR_OWN',
  FIND_NEW_CUSTOMERS: 'FIND_NEW_CUSTOMERS',
  RECONNECT_WITH_USERS: 'RECONNECT_WITH_USERS',
}
