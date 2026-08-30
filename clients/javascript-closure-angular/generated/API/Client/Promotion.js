goog.provide('API.Client.Promotion');

/**
 * @record
 */
API.Client.Promotion = function() {}

/**
 * The Ad Account ID that this promotion belongs to.
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.adAccountId;

/**
 * @type {!API.Client.DiscountStatus}
 * @export
 */
API.Client.Promotion.prototype.discountStatus;

/**
 * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
 * @type {!number}
 * @export
 */
API.Client.Promotion.prototype.endTime;

/**
 * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.externalId;

/**
 * Promotion ID
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.id;

/**
 * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.platformType;

/**
 * Code that can be used to redeem a promotion.
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.promotionCode;

/**
 * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.promotionCustomId;

/**
 * Internal name for the promotion.
 * @type {!string}
 * @export
 */
API.Client.Promotion.prototype.promotionTitle;

/**
 * @type {!API.Client.PromotionType}
 * @export
 */
API.Client.Promotion.prototype.promotionType;

/**
 * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
 * @type {!number}
 * @export
 */
API.Client.Promotion.prototype.startTime;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.Promotion.prototype.status;

/**
 * List of values to be inserted in the promotion type-specific template.
 * @type {!Array<!API.Client.PromotionTemplateValue>}
 * @export
 */
API.Client.Promotion.prototype.templateValues;

