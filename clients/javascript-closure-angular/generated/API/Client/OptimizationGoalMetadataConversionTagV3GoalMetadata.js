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
 * ROAS optimization is not supported
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
