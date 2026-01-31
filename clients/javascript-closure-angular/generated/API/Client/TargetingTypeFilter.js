goog.provide('API.Client.TargetingTypeFilter');

/**
 * @record
 */
API.Client.TargetingTypeFilter = function() {}

/**
 * List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
 * @type {!Array<!string>}
 * @export
 */
API.Client.TargetingTypeFilter.prototype.targetingTypes;

/** @enum {string} */
API.Client.TargetingTypeFilter.Array&lt;!TargetingTypesEnum&gt; = { 
  KEYWORD: 'KEYWORD',
  APPTYPE: 'APPTYPE',
  GENDER: 'GENDER',
  LOCATION: 'LOCATION',
  PLACEMENT: 'PLACEMENT',
  COUNTRY: 'COUNTRY',
  TARGETED_INTEREST: 'TARGETED_INTEREST',
  PINNER_INTEREST: 'PINNER_INTEREST',
  AUDIENCE_INCLUDE: 'AUDIENCE_INCLUDE',
  GEO: 'GEO',
  AGE_BUCKET: 'AGE_BUCKET',
  REGION: 'REGION',
  MEDIA_TYPE: 'MEDIA_TYPE',
  AGE_BUCKET_AND_GENDER: 'AGE_BUCKET_AND_GENDER',
  AUDIENCE_MULTIPLIER: 'AUDIENCE_MULTIPLIER',
  CREATIVE_ENHANCEMENTS: 'CREATIVE_ENHANCEMENTS',
  LOCAL_ADS_STORE_CODE: 'LOCAL_ADS_STORE_CODE',
}
