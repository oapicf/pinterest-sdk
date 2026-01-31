goog.provide('API.Client.PromotionCommon');

/**
 * @record
 */
API.Client.PromotionCommon = function() {}

/**
 * Discount status based on the current time and start and end time of discount
 * @type {!string}
 * @export
 */
API.Client.PromotionCommon.prototype.discountStatus;

/**
 * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
 * @type {!number}
 * @export
 */
API.Client.PromotionCommon.prototype.endTime;

/**
 * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
 * @type {!string}
 * @export
 */
API.Client.PromotionCommon.prototype.externalId;

/**
 * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
 * @type {!string}
 * @export
 */
API.Client.PromotionCommon.prototype.platformType;

/**
 * Code that can be used to redeem a promotion.
 * @type {!string}
 * @export
 */
API.Client.PromotionCommon.prototype.promotionCode;

/**
 * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
 * @type {!string}
 * @export
 */
API.Client.PromotionCommon.prototype.promotionCustomId;

/**
 * Internal name for the promotion.
 * @type {!string}
 * @export
 */
API.Client.PromotionCommon.prototype.promotionTitle;

/**
 * @type {!API.Client.PromotionType}
 * @export
 */
API.Client.PromotionCommon.prototype.promotionType;

/**
 * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
 * @type {!number}
 * @export
 */
API.Client.PromotionCommon.prototype.startTime;

/**
 * List of values to be inserted in the promotion type-specific template.
 * @type {!Array<!API.Client.PromotionTemplateValue>}
 * @export
 */
API.Client.PromotionCommon.prototype.templateValues;

/** @enum {string} */
API.Client.PromotionCommon.DiscountStatusEnum = { 
  OTHER: 'OTHER',
  ACTIVE: 'ACTIVE',
  PAUSED: 'PAUSED',
  SCHEDULED: 'SCHEDULED',
  EXPIRED: 'EXPIRED',
}
