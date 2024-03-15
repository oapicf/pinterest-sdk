goog.provide('API.Client.ConversionEvents_data_inner_custom_data_contents_inner');

/**
 * @record
 */
API.Client.ConversionEventsDataInnerCustomDataContentsInner = function() {}

/**
 * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomDataContentsInner.prototype.id;

/**
 * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomDataContentsInner.prototype.itemPrice;

/**
 * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @type {!number}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomDataContentsInner.prototype.quantity;

/**
 * The name of a product.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomDataContentsInner.prototype.itemName;

/**
 * The category of a product.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomDataContentsInner.prototype.itemCategory;

/**
 * The brand of a product.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomDataContentsInner.prototype.itemBrand;

