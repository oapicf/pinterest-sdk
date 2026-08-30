goog.provide('API.Client.ProductGroupPromotionsUpdateWithRequiredBody');

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 * @record
 */
API.Client.ProductGroupPromotionsUpdateWithRequiredBody = function() {}

/**
 * ID of the ad group the product group promotion belongs to.
 * @type {!string}
 * @export
 */
API.Client.ProductGroupPromotionsUpdateWithRequiredBody.prototype.adGroupId;

/**
 * List of product group promotions to create or update.
 * @type {!Array<!API.Client.ProductGroupPromotion>}
 * @export
 */
API.Client.ProductGroupPromotionsUpdateWithRequiredBody.prototype.productGroupPromotion;

