goog.provide('API.Client.CatalogsFeedValidationWarnings');

/**
 * @record
 */
API.Client.CatalogsFeedValidationWarnings = function() {}

/**
 * Some items have ad links that are formatted incorrectly.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.AD_LINK_FORMAT_WARNING;

/**
 * Some items have ad link URLs that are duplicates of the link URLs for those items.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.AD_LINK_SAME_AS_LINK;

/**
 * The title for some items were truncated because they contain too many characters.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.TITLE_LENGTH_TOO_LONG;

/**
 * The description for some items were truncated because they contain too many characters.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.DESCRIPTION_LENGTH_TOO_LONG;

/**
 * Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.GENDER_INVALID;

/**
 * Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.AGE_GROUP_INVALID;

/**
 * Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SIZE_TYPE_INVALID;

/**
 * Some items have size system values which are not one of the supported size systems.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SIZE_SYSTEM_INVALID;

/**
 * Some items have an invalid product link which contains invalid UTM tracking paramaters.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.LINK_FORMAT_WARNING;

/**
 * Some items have sale price values that are higher than the original price of the item.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SALES_PRICE_INVALID;

/**
 * Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.PRODUCT_CATEGORY_DEPTH_WARNING;

/**
 * Some items have adwords_redirect links that are formatted incorrectly.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.ADWORDS_FORMAT_WARNING;

/**
 * Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.ADWORDS_SAME_AS_LINK;

/**
 * Your feed contains duplicate headers.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.DUPLICATE_HEADERS;

/**
 * Ingestion completed early because there are no changes to your feed since the last successful update.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.FETCH_SAME_SIGNATURE;

/**
 * Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;

/**
 * Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.ADDITIONAL_IMAGE_LINK_WARNING;

/**
 * Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.IMAGE_LINK_WARNING;

/**
 * Some items have shipping values that are formatted incorrectly.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SHIPPING_INVALID;

/**
 * Some items have tax values that are formatted incorrectly.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.TAX_INVALID;

/**
 * Some items have invalid shipping_weight values.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SHIPPING_WEIGHT_INVALID;

/**
 * Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.EXPIRATION_DATE_INVALID;

/**
 * Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.AVAILABILITY_DATE_INVALID;

/**
 * Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SALE_DATE_INVALID;

/**
 * Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.WEIGHT_UNIT_INVALID;

/**
 * Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.IS_BUNDLE_INVALID;

/**
 * Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.UPDATED_TIME_INVALID;

/**
 * Some items have custom_label values that are too long, those items will be published without that custom label.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.CUSTOM_LABEL_LENGTH_TOO_LONG;

/**
 * Some items have product_type values that are too long, those items will be published without that product type.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.PRODUCT_TYPE_LENGTH_TOO_LONG;

/**
 * Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.TOO_MANY_ADDITIONAL_IMAGE_LINKS;

/**
 * Some items have invalid multipack values.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.MULTIPACK_INVALID;

/**
 * The product count has increased or decreased significantly compared to the last successful ingestion.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.INDEXED_PRODUCT_COUNT_LARGE_DELTA;

/**
 * Some items include additional_image_links that can't be found.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;

/**
 * Some items are missing a google_product_category.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.OPTIONAL_PRODUCT_CATEGORY_MISSING;

/**
 * Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.OPTIONAL_PRODUCT_CATEGORY_INVALID;

/**
 * Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.OPTIONAL_CONDITION_MISSING;

/**
 * Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.OPTIONAL_CONDITION_INVALID;

/**
 * Some items include invalid ios_deep_link values.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.IOS_DEEP_LINK_INVALID;

/**
 * Some items include invalid android_deep_link.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.ANDROID_DEEP_LINK_INVALID;

/**
 * Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.UTM_SOURCE_AUTO_CORRECTED;

/**
 * Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.COUNTRY_DOES_NOT_MAP_TO_CURRENCY;

/**
 * Some items include min_ad_price values that are formatted incorrectly.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.MIN_AD_PRICE_INVALID;

/**
 * Some items include incorrectly formatted GTINs.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.GTIN_INVALID;

/**
 * Some items include inconsistent currencies in price fields.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.INCONSISTENT_CURRENCY_VALUES;

/**
 * Some items include sales price that is much lower than the list price.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SALES_PRICE_TOO_LOW;

/**
 * Some items include incorrectly formatted shipping_width.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SHIPPING_WIDTH_INVALID;

/**
 * Some items include incorrectly formatted shipping_height.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SHIPPING_HEIGHT_INVALID;

/**
 * Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.SALES_PRICE_TOO_HIGH;

/**
 * Some items include incorrectly formatted MPNs.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationWarnings.prototype.MPN_INVALID;

/** @enum {string} */
API.Client.CatalogsFeedValidationWarnings.FETCH_SAME_SIGNATUREEnum = { 
  1: '1',
}
