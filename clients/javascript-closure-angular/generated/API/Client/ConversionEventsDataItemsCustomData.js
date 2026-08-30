goog.provide('API.Client.ConversionEventsDataItemsCustomData');

/**
 * Object containing other custom data.
 * @record
 */
API.Client.ConversionEventsDataItemsCustomData = function() {}

/**
 * The brand of the content associated with the event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.contentBrand;

/**
 * The category of the content associated with the event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.contentCategory;

/**
 * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.contentIds;

/**
 * The name of the page or product associated with the event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.contentName;

/**
 * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
 * @type {!Array<!API.Client.ConversionEventsDataItemsCustomDataContentsItems>}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.contents;

/**
 * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.currency;

/**
 * Only use when instructed.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.externalMeasurementId;

/**
 * Only use when instructed.
 * @type {!number}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.externalMeasurementVendorId;

/**
 * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.np;

/**
 * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
 * @type {!number}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.numItems;

/**
 * Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.optOutType;

/**
 * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.orderId;

/**
 * Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.predictedLtv;

/**
 * The search string related to the user conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.searchString;

/**
 * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataItemsCustomData.prototype.value;

