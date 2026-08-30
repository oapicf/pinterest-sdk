goog.provide('API.Client.ProductGroupPromotions');

/**
 * Wrapper model for ProductGroupPromotion.
 * @record
 */
API.Client.ProductGroupPromotions = function() {}

/**
 * Response-only: created or updated product group promotions, or exceptions.
 * @type {!Array<!API.Client.ProductGroupPromotionResponseItem>}
 * @export
 */
API.Client.ProductGroupPromotions.prototype.items;

