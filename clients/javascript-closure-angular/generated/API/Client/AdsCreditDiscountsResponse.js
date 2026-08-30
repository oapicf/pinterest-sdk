goog.provide('API.Client.AdsCreditDiscountsResponse');

/**
 * @record
 */
API.Client.AdsCreditDiscountsResponse = function() {}

/**
 * True if the offer code is currently active.
 * @type {!boolean}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.active;

/**
 * Advertiser ID the offer was applied to.
 * @type {!string}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.advertiserId;

/**
 * Currency value for the discount.
 * @type {!string}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.discountCurrency;

/**
 * The discount applied in the offer's currency value.
 * @type {!number}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.discountInMicroCurrency;

/**
 * The type of discount of this credit
 * @type {!API.Client.AdsCreditDiscountType}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.discountType;

/**
 * The credits left to spend.
 * @type {!number}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.remainingDiscountInMicroCurrency;

/**
 * Human readable title of the offer code.
 * @type {!string}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.title;

