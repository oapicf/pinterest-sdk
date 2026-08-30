goog.provide('API.Client.CatalogsItemValidationErrors');

/**
 * @record
 */
API.Client.CatalogsItemValidationErrors = function() {}

/**
 * Item has an invalid adult value.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.ADULT_INVALID;

/**
 * Adword link contains too many characters.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.ADWORDS_FORMAT_INVALID;

/**
 * Item is missing availability value in its product metadata, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.AVAILABILITY_INVALID;

/**
 * Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.BLOCKLISTED_IMAGE_SIGNATURE;

/**
 * Item is missing description in its product metadata, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.DESCRIPTION_MISSING;

/**
 * This product is duplicated. The duplicate entry will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.DUPLICATE_PRODUCTS;

/**
 * Image link is invalid.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.IMAGE_LINK_INVALID;

/**
 * Item has image_link URL that contains too many characters, so the item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.IMAGE_LINK_LENGTH_TOO_LONG;

/**
 * Item is missing an image link URL in its product metadata, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.IMAGE_LINK_MISSING;

/**
 * Product link value doesn't match the verified domain associated with this account.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.INVALID_DOMAIN;

/**
 * Main image can't be found.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

/**
 * Item is missing item id in its product metadata, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.ITEMID_MISSING;

/**
 * Link is invalid.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.LINK_FORMAT_INVALID;

/**
 * Product link contains too many characters, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.LINK_LENGTH_TOO_LONG;

/**
 * Item has a list price formatting error, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.LIST_PRICE_INVALID;

/**
 * Item exceed the maximum number of items per item group, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

/**
 * Item contains formating errors.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.PARSE_LINE_ERROR;

/**
 * Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.PINJOIN_CONTENT_UNSAFE;

/**
 * Item price cannot be determined because the price, list price, and sale price are all different.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.PRICE_CANNOT_BE_DETERMINED;

/**
 * Product is missing a price, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.PRICE_MISSING;

/**
 * Item is missing a link URL in its product metadata, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.PRODUCT_LINK_MISSING;

/**
 * Item has a price formatting error in its product metadata, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.PRODUCT_PRICE_INVALID;

/**
 * Item is missing title in its product metadata, this item will not be published.
 * @type {!API.Client.CatalogsItemValidationDetails}
 * @export
 */
API.Client.CatalogsItemValidationErrors.prototype.TITLE_MISSING;

