goog.provide('API.Client.TargetingSpec');

/**
 * Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}`
 * @record
 */
API.Client.TargetingSpec = function() {}

/**
 * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.AGE_BUCKET;

/**
 * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
 * @type {!Array<!string>}
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
 * @type {!Array<!string>}
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
 * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.LOCALE;

/**
 * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingSpec.prototype.LOCATION;

/**
 * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
 * @type {!Array<!API.Client.TargetingSpec_SHOPPING_RETARGETING>}
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
API.Client.TargetingSpec.Array&lt;!AGE_BUCKETEnum&gt; = { 
  18-24: '18-24',
  21+: '21+',
  25-34: '25-34',
  35-44: '35-44',
  45-49: '45-49',
  50-54: '50-54',
  55-64: '55-64',
  65+: '65+',
}
/** @enum {string} */
API.Client.TargetingSpec.Array&lt;!APPTYPEEnum&gt; = { 
  android_mobile: 'android_mobile',
  android_tablet: 'android_tablet',
  ipad: 'ipad',
  iphone: 'iphone',
  web: 'web',
  web_mobile: 'web_mobile',
}
/** @enum {string} */
API.Client.TargetingSpec.Array&lt;!GENDEREnum&gt; = { 
  unknown: 'unknown',
  male: 'male',
  female: 'female',
}
/** @enum {string} */
API.Client.TargetingSpec.Array&lt;!TARGETING_STRATEGYEnum&gt; = { 
  CHOOSE_YOUR_OWN: 'CHOOSE_YOUR_OWN',
  FIND_NEW_CUSTOMERS: 'FIND_NEW_CUSTOMERS',
  RECONNECT_WITH_USERS: 'RECONNECT_WITH_USERS',
}
