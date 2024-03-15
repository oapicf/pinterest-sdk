goog.provide('API.Client.ProductGroupPromotionUpdateRequest');

/**
 * @record
 */
API.Client.ProductGroupPromotionUpdateRequest = function() {}

/**
 * ID of the ad group the product group belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionUpdateRequest.prototype.adGroupId;

/**
 * @type {!Array<!API.Client.ProductGroupPromotion>}
 * @export
 */
API.Client.ProductGroupPromotionUpdateRequest.prototype.productGroupPromotion;

