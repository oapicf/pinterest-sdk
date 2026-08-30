goog.provide('API.Client.ProductGroupPromotionsCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.ProductGroupPromotionsCreate = function() {}

/**
 * ID of the ad group the product group promotion belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionsCreate.prototype.adGroupId;

/**
 * List of product group promotions to create or update.
 * @type {!Array<!API.Client.ProductGroupPromotion>}
 * @export
 */
API.Client.ProductGroupPromotionsCreate.prototype.productGroupPromotion;

