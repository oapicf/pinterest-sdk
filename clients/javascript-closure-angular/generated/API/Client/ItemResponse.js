goog.provide('API.Client.ItemResponse');

/**
 * Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
 * @record
 */
API.Client.ItemResponse = function() {}

/**
 * @type {!API.Client.CatalogsCreativeAssetsAttributes}
 * @export
 */
API.Client.ItemResponse.prototype.attributes;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemResponse.prototype.catalogType;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponse.prototype.itemId;

/**
 * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @type {!string}
 * @export
 */
API.Client.ItemResponse.prototype.itemResponseKind;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.ItemResponse.prototype.pins;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponse.prototype.hotelId;

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponse.prototype.creativeAssetsId;

/**
 * Array with the errors for the item id requested
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.ItemResponse.prototype.errors;

/** @enum {string} */
API.Client.ItemResponse.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
/** @enum {string} */
API.Client.ItemResponse.ItemResponseKindEnum = { 
  creative_assets_item_error: 'creative_assets_item_error',
}
