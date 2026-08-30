goog.provide('API.Client.PromotionBatchUpdate');

/**
 * @record
 */
API.Client.PromotionBatchUpdate = function() {}

/**
 * @type {!API.Client.DiscountStatus}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.discountStatus;

/**
 * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
 * @type {!number}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.endTime;

/**
 * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
 * @type {!string}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.externalId;

/**
 * Promotion ID
 * @type {!string}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.id;

/**
 * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
 * @type {!string}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.platformType;

/**
 * Code that can be used to redeem a promotion.
 * @type {!string}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.promotionCode;

/**
 * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
 * @type {!string}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.promotionCustomId;

/**
 * Internal name for the promotion.
 * @type {!string}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.promotionTitle;

/**
 * @type {!API.Client.PromotionType}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.promotionType;

/**
 * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
 * @type {!number}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.startTime;

/**
 * List of values to be inserted in the promotion type-specific template.
 * @type {!Array<!API.Client.PromotionTemplateValue>}
 * @export
 */
API.Client.PromotionBatchUpdate.prototype.templateValues;

