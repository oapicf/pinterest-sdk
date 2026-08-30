goog.provide('API.Client.ConversionEventsDataItemsCustomDataContentsItems');

/**
 * @record
 */
API.Client.ConversionEventsDataItemsCustomDataContentsItems = function() {}

/**
 * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomDataContentsItems.prototype.id;

/**
 * The brand of a product.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomDataContentsItems.prototype.itemBrand;

/**
 * The brand ID of a product.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomDataContentsItems.prototype.itemBrandId;

/**
 * The category of a product.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomDataContentsItems.prototype.itemCategory;

/**
 * The name of a product.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomDataContentsItems.prototype.itemName;

/**
 * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomDataContentsItems.prototype.itemPrice;

/**
 * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
 * @type {!number}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomDataContentsItems.prototype.quantity;

