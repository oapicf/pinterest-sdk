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
 * The type of discount of this credit
 * @type {!string}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.discountType;

/**
 * The discount applied in the offer’s currency value.
 * @type {!number}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.discountInMicroCurrency;

/**
 * Currency value for the discount.
 * @type {!string}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.discountCurrency;

/**
 * Human readable title of the offer code.
 * @type {!string}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.title;

/**
 * The credits left to spend.
 * @type {!number}
 * @export
 */
API.Client.AdsCreditDiscountsResponse.prototype.remainingDiscountInMicroCurrency;

/** @enum {string} */
API.Client.AdsCreditDiscountsResponse.DiscountTypeEnum = { 
  COUPON: 'COUPON',
  CREDIT: 'CREDIT',
  COUPON_APPLIED: 'COUPON_APPLIED',
  CREDIT_APPLIED: 'CREDIT_APPLIED',
  MARKETING_OFFER_CREDIT: 'MARKETING_OFFER_CREDIT',
  MARKETING_OFFER_CREDIT_APPLIED: 'MARKETING_OFFER_CREDIT_APPLIED',
  GOODWILL_CREDIT: 'GOODWILL_CREDIT',
  GOODWILL_CREDIT_APPLIED: 'GOODWILL_CREDIT_APPLIED',
  INTERNAL_CREDIT: 'INTERNAL_CREDIT',
  INTERNAL_CREDIT_APPLIED: 'INTERNAL_CREDIT_APPLIED',
  PREPAID_CREDIT: 'PREPAID_CREDIT',
  PREPAID_CREDIT_APPLIED: 'PREPAID_CREDIT_APPLIED',
  SALES_INCENTIVE_CREDIT: 'SALES_INCENTIVE_CREDIT',
  SALES_INCENTIVE_CREDIT_APPLIED: 'SALES_INCENTIVE_CREDIT_APPLIED',
  CREDIT_EXPIRED: 'CREDIT_EXPIRED',
  FUTURE_CREDIT: 'FUTURE_CREDIT',
  REFERRAL_CREDIT: 'REFERRAL_CREDIT',
  INVOICE_SALES_INCENTIVE_CREDIT: 'INVOICE_SALES_INCENTIVE_CREDIT',
  INVOICE_SALES_INCENTIVE_CREDIT_APPLIED: 'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED',
  PREPAID_CREDIT_REFUND: 'PREPAID_CREDIT_REFUND',
  : '',
}
