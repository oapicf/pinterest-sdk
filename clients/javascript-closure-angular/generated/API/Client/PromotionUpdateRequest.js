goog.provide('API.Client.PromotionUpdateRequest');

/**
 * @record
 */
API.Client.PromotionUpdateRequest = function() {}

/**
 * Discount status based on the current time and start and end time of discount
 * @type {!string}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.discountStatus;

/**
 * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
 * @type {!number}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.endTime;

/**
 * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
 * @type {!string}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.externalId;

/**
 * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
 * @type {!string}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.platformType;

/**
 * Code that can be used to redeem a promotion.
 * @type {!string}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.promotionCode;

/**
 * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
 * @type {!string}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.promotionCustomId;

/**
 * Internal name for the promotion.
 * @type {!string}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.promotionTitle;

/**
 * @type {!API.Client.PromotionType}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.promotionType;

/**
 * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
 * @type {!number}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.startTime;

/**
 * List of values to be inserted in the promotion type-specific template.
 * @type {!Array<!API.Client.PromotionTemplateValue>}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.templateValues;

/**
 * Promotion ID
 * @type {!string}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.id;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.PromotionUpdateRequest.prototype.status;

/** @enum {string} */
API.Client.PromotionUpdateRequest.DiscountStatusEnum = { 
  OTHER: 'OTHER',
  ACTIVE: 'ACTIVE',
  PAUSED: 'PAUSED',
  SCHEDULED: 'SCHEDULED',
  EXPIRED: 'EXPIRED',
}
