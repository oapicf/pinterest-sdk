goog.provide('API.Client.OptimizationGoalMetadata_conversion_tag_v3_goal_metadata');

/**
 * @record
 */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata = function() {}

/**
 * @type {!API.Client.OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows}
 * @export
 */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.prototype.attributionWindows;

/**
 * @type {!string}
 * @export
 */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.prototype.conversionEvent;

/**
 * @type {!string}
 * @export
 */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.prototype.conversionTagId;

/**
 * @type {!string}
 * @export
 */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.prototype.cpaGoalValueInMicroCurrency;

/**
 * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
 * @type {!boolean}
 * @export
 */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.prototype.isRoasOptimized;

/**
 * Conversion learning model type
 * @type {!string}
 * @export
 */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.prototype.learningModeType;

/**
 * Event name for custom or standard events mapped to an oCPM model
 * @type {!string}
 * @export
 */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.prototype.reportingEvent;

/** @enum {string} */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.ConversionEventEnum = { 
  PAGE_VISIT: 'PAGE_VISIT',
  SIGNUP: 'SIGNUP',
  CHECKOUT: 'CHECKOUT',
  CUSTOM: 'CUSTOM',
  VIEW_CATEGORY: 'VIEW_CATEGORY',
  SEARCH: 'SEARCH',
  ADD_TO_CART: 'ADD_TO_CART',
  WATCH_VIDEO: 'WATCH_VIDEO',
  LEAD: 'LEAD',
  APP_INSTALL: 'APP_INSTALL',
}
/** @enum {string} */
API.Client.OptimizationGoalMetadataConversionTagV3GoalMetadata.LearningModeTypeEnum = { 
  NOT_ACTIVE: 'NOT_ACTIVE',
  ACTIVE: 'ACTIVE',
  : '',
}
