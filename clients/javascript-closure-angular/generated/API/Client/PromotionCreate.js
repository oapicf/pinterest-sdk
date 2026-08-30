goog.provide('API.Client.PromotionCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.PromotionCreate = function() {}

/**
 * @type {!API.Client.DiscountStatus}
 * @export
 */
API.Client.PromotionCreate.prototype.discountStatus;

/**
 * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
 * @type {!number}
 * @export
 */
API.Client.PromotionCreate.prototype.endTime;

/**
 * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
 * @type {!string}
 * @export
 */
API.Client.PromotionCreate.prototype.externalId;

/**
 * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
 * @type {!string}
 * @export
 */
API.Client.PromotionCreate.prototype.platformType;

/**
 * Code that can be used to redeem a promotion.
 * @type {!string}
 * @export
 */
API.Client.PromotionCreate.prototype.promotionCode;

/**
 * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
 * @type {!string}
 * @export
 */
API.Client.PromotionCreate.prototype.promotionCustomId;

/**
 * Internal name for the promotion.
 * @type {!string}
 * @export
 */
API.Client.PromotionCreate.prototype.promotionTitle;

/**
 * @type {!API.Client.PromotionType}
 * @export
 */
API.Client.PromotionCreate.prototype.promotionType;

/**
 * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
 * @type {!number}
 * @export
 */
API.Client.PromotionCreate.prototype.startTime;

/**
 * List of values to be inserted in the promotion type-specific template.
 * @type {!Array<!API.Client.PromotionTemplateValue>}
 * @export
 */
API.Client.PromotionCreate.prototype.templateValues;

