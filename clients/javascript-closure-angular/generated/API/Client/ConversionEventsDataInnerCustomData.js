goog.provide('API.Client.ConversionEvents_data_inner_custom_data');

/**
 * Object containing other custom data.
 * @record
 */
API.Client.ConversionEventsDataInnerCustomData = function() {}

/**
 * The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.currency;

/**
 * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.value;

/**
 * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.contentIds;

/**
 * The name of the page or product associated with the event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.contentName;

/**
 * The category of the content associated with the event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.contentCategory;

/**
 * The brand of the content associated with the event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.contentBrand;

/**
 * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @type {!Array<!API.Client.ConversionEvents_data_inner_custom_data_contents_inner>}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.contents;

/**
 * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @type {!number}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.numItems;

/**
 * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.orderId;

/**
 * The search string related to the user conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.searchString;

/**
 * Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.optOutType;

/**
 * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventsDataInnerCustomData.prototype.np;

