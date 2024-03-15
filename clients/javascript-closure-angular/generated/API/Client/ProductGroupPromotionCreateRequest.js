goog.provide('API.Client.ProductGroupPromotionCreateRequest');

/**
 * @record
 */
API.Client.ProductGroupPromotionCreateRequest = function() {}

/**
 * ID of the Ad Group the Product Group Promotion belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequest.prototype.adGroupId;

/**
 * @type {!Array<!API.Client.ProductGroupPromotion>}
 * @export
 */
API.Client.ProductGroupPromotionCreateRequest.prototype.productGroupPromotion;

