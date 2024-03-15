
package org.openapitools.client.model


case class CatalogsFeedValidationWarnings (
    /* Some items have ad links that are formatted incorrectly. */
    _AD_LINK_FORMAT_WARNING: Option[Integer],
    /* Some items have ad link URLs that are duplicates of the link URLs for those items. */
    _AD_LINK_SAME_AS_LINK: Option[Integer],
    /* The title for some items were truncated because they contain too many characters. */
    _TITLE_LENGTH_TOO_LONG: Option[Integer],
    /* The description for some items were truncated because they contain too many characters. */
    _DESCRIPTION_LENGTH_TOO_LONG: Option[Integer],
    /* Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
    _GENDER_INVALID: Option[Integer],
    /* Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
    _AGE_GROUP_INVALID: Option[Integer],
    /* Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
    _SIZE_TYPE_INVALID: Option[Integer],
    /* Some items have size system values which are not one of the supported size systems. */
    _SIZE_SYSTEM_INVALID: Option[Integer],
    /* Some items have an invalid product link which contains invalid UTM tracking paramaters. */
    _LINK_FORMAT_WARNING: Option[Integer],
    /* Some items have sale price values that are higher than the original price of the item. */
    _SALES_PRICE_INVALID: Option[Integer],
    /* Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. */
    _PRODUCT_CATEGORY_DEPTH_WARNING: Option[Integer],
    /* Some items have adwords_redirect links that are formatted incorrectly. */
    _ADWORDS_FORMAT_WARNING: Option[Integer],
    /* Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. */
    _ADWORDS_SAME_AS_LINK: Option[Integer],
    /* Your feed contains duplicate headers. */
    _DUPLICATE_HEADERS: Option[Integer],
    /* Ingestion completed early because there are no changes to your feed since the last successful update. */
    _FETCH_SAME_SIGNATURE: Option[Integer],
    /* Some items have additional_image_link URLs that contain too many characters, so those items will not be published. */
    _ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: Option[Integer],
    /* Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. */
    _ADDITIONAL_IMAGE_LINK_WARNING: Option[Integer],
    /* Some items have image_link URLs that are formatted incorrectly and will not be published with those items. */
    _IMAGE_LINK_WARNING: Option[Integer],
    /* Some items have shipping values that are formatted incorrectly. */
    _SHIPPING_INVALID: Option[Integer],
    /* Some items have tax values that are formatted incorrectly. */
    _TAX_INVALID: Option[Integer],
    /* Some items have invalid shipping_weight values. */
    _SHIPPING_WEIGHT_INVALID: Option[Integer],
    /* Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. */
    _EXPIRATION_DATE_INVALID: Option[Integer],
    /* Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. */
    _AVAILABILITY_DATE_INVALID: Option[Integer],
    /* Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. */
    _SALE_DATE_INVALID: Option[Integer],
    /* Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. */
    _WEIGHT_UNIT_INVALID: Option[Integer],
    /* Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. */
    _IS_BUNDLE_INVALID: Option[Integer],
    /* Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. */
    _UPDATED_TIME_INVALID: Option[Integer],
    /* Some items have custom_label values that are too long, those items will be published without that custom label. */
    _CUSTOM_LABEL_LENGTH_TOO_LONG: Option[Integer],
    /* Some items have product_type values that are too long, those items will be published without that product type. */
    _PRODUCT_TYPE_LENGTH_TOO_LONG: Option[Integer],
    /* Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. */
    _TOO_MANY_ADDITIONAL_IMAGE_LINKS: Option[Integer],
    /* Some items have invalid multipack values. */
    _MULTIPACK_INVALID: Option[Integer],
    /* The product count has increased or decreased significantly compared to the last successful ingestion. */
    _INDEXED_PRODUCT_COUNT_LARGE_DELTA: Option[Integer],
    /* Some items include additional_image_links that can't be found. */
    _ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: Option[Integer],
    /* Some items are missing a google_product_category. */
    _OPTIONAL_PRODUCT_CATEGORY_MISSING: Option[Integer],
    /* Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. */
    _OPTIONAL_PRODUCT_CATEGORY_INVALID: Option[Integer],
    /* Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. */
    _OPTIONAL_CONDITION_MISSING: Option[Integer],
    /* Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
    _OPTIONAL_CONDITION_INVALID: Option[Integer],
    /* Some items include invalid ios_deep_link values. */
    _IOS_DEEP_LINK_INVALID: Option[Integer],
    /* Some items include invalid android_deep_link. */
    _ANDROID_DEEP_LINK_INVALID: Option[Integer],
    /* Some items include utm_source values that are formatted incorrectly and have been automatically corrected. */
    _UTM_SOURCE_AUTO_CORRECTED: Option[Integer],
    /* Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped. */
    _COUNTRY_DOES_NOT_MAP_TO_CURRENCY: Option[Integer],
    /* Some items include min_ad_price values that are formatted incorrectly. */
    _MIN_AD_PRICE_INVALID: Option[Integer],
    /* Some items include incorrectly formatted GTINs. */
    _GTIN_INVALID: Option[Integer],
    /* Some items include inconsistent currencies in price fields. */
    _INCONSISTENT_CURRENCY_VALUES: Option[Integer],
    /* Some items include sales price that is much lower than the list price. */
    _SALES_PRICE_TOO_LOW: Option[Integer],
    /* Some items include incorrectly formatted shipping_width. */
    _SHIPPING_WIDTH_INVALID: Option[Integer],
    /* Some items include incorrectly formatted shipping_height. */
    _SHIPPING_HEIGHT_INVALID: Option[Integer],
    /* Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. */
    _SALES_PRICE_TOO_HIGH: Option[Integer],
    /* Some items include incorrectly formatted MPNs. */
    _MPN_INVALID: Option[Integer]
)
object CatalogsFeedValidationWarnings {
    def toStringBody(var_AD_LINK_FORMAT_WARNING: Object, var_AD_LINK_SAME_AS_LINK: Object, var_TITLE_LENGTH_TOO_LONG: Object, var_DESCRIPTION_LENGTH_TOO_LONG: Object, var_GENDER_INVALID: Object, var_AGE_GROUP_INVALID: Object, var_SIZE_TYPE_INVALID: Object, var_SIZE_SYSTEM_INVALID: Object, var_LINK_FORMAT_WARNING: Object, var_SALES_PRICE_INVALID: Object, var_PRODUCT_CATEGORY_DEPTH_WARNING: Object, var_ADWORDS_FORMAT_WARNING: Object, var_ADWORDS_SAME_AS_LINK: Object, var_DUPLICATE_HEADERS: Object, var_FETCH_SAME_SIGNATURE: Object, var_ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: Object, var_ADDITIONAL_IMAGE_LINK_WARNING: Object, var_IMAGE_LINK_WARNING: Object, var_SHIPPING_INVALID: Object, var_TAX_INVALID: Object, var_SHIPPING_WEIGHT_INVALID: Object, var_EXPIRATION_DATE_INVALID: Object, var_AVAILABILITY_DATE_INVALID: Object, var_SALE_DATE_INVALID: Object, var_WEIGHT_UNIT_INVALID: Object, var_IS_BUNDLE_INVALID: Object, var_UPDATED_TIME_INVALID: Object, var_CUSTOM_LABEL_LENGTH_TOO_LONG: Object, var_PRODUCT_TYPE_LENGTH_TOO_LONG: Object, var_TOO_MANY_ADDITIONAL_IMAGE_LINKS: Object, var_MULTIPACK_INVALID: Object, var_INDEXED_PRODUCT_COUNT_LARGE_DELTA: Object, var_ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: Object, var_OPTIONAL_PRODUCT_CATEGORY_MISSING: Object, var_OPTIONAL_PRODUCT_CATEGORY_INVALID: Object, var_OPTIONAL_CONDITION_MISSING: Object, var_OPTIONAL_CONDITION_INVALID: Object, var_IOS_DEEP_LINK_INVALID: Object, var_ANDROID_DEEP_LINK_INVALID: Object, var_UTM_SOURCE_AUTO_CORRECTED: Object, var_COUNTRY_DOES_NOT_MAP_TO_CURRENCY: Object, var_MIN_AD_PRICE_INVALID: Object, var_GTIN_INVALID: Object, var_INCONSISTENT_CURRENCY_VALUES: Object, var_SALES_PRICE_TOO_LOW: Object, var_SHIPPING_WIDTH_INVALID: Object, var_SHIPPING_HEIGHT_INVALID: Object, var_SALES_PRICE_TOO_HIGH: Object, var_MPN_INVALID: Object) =
        s"""
        | {
        | "AD_LINK_FORMAT_WARNING":$var_AD_LINK_FORMAT_WARNING,"AD_LINK_SAME_AS_LINK":$var_AD_LINK_SAME_AS_LINK,"TITLE_LENGTH_TOO_LONG":$var_TITLE_LENGTH_TOO_LONG,"DESCRIPTION_LENGTH_TOO_LONG":$var_DESCRIPTION_LENGTH_TOO_LONG,"GENDER_INVALID":$var_GENDER_INVALID,"AGE_GROUP_INVALID":$var_AGE_GROUP_INVALID,"SIZE_TYPE_INVALID":$var_SIZE_TYPE_INVALID,"SIZE_SYSTEM_INVALID":$var_SIZE_SYSTEM_INVALID,"LINK_FORMAT_WARNING":$var_LINK_FORMAT_WARNING,"SALES_PRICE_INVALID":$var_SALES_PRICE_INVALID,"PRODUCT_CATEGORY_DEPTH_WARNING":$var_PRODUCT_CATEGORY_DEPTH_WARNING,"ADWORDS_FORMAT_WARNING":$var_ADWORDS_FORMAT_WARNING,"ADWORDS_SAME_AS_LINK":$var_ADWORDS_SAME_AS_LINK,"DUPLICATE_HEADERS":$var_DUPLICATE_HEADERS,"FETCH_SAME_SIGNATURE":$var_FETCH_SAME_SIGNATURE,"ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG":$var_ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG,"ADDITIONAL_IMAGE_LINK_WARNING":$var_ADDITIONAL_IMAGE_LINK_WARNING,"IMAGE_LINK_WARNING":$var_IMAGE_LINK_WARNING,"SHIPPING_INVALID":$var_SHIPPING_INVALID,"TAX_INVALID":$var_TAX_INVALID,"SHIPPING_WEIGHT_INVALID":$var_SHIPPING_WEIGHT_INVALID,"EXPIRATION_DATE_INVALID":$var_EXPIRATION_DATE_INVALID,"AVAILABILITY_DATE_INVALID":$var_AVAILABILITY_DATE_INVALID,"SALE_DATE_INVALID":$var_SALE_DATE_INVALID,"WEIGHT_UNIT_INVALID":$var_WEIGHT_UNIT_INVALID,"IS_BUNDLE_INVALID":$var_IS_BUNDLE_INVALID,"UPDATED_TIME_INVALID":$var_UPDATED_TIME_INVALID,"CUSTOM_LABEL_LENGTH_TOO_LONG":$var_CUSTOM_LABEL_LENGTH_TOO_LONG,"PRODUCT_TYPE_LENGTH_TOO_LONG":$var_PRODUCT_TYPE_LENGTH_TOO_LONG,"TOO_MANY_ADDITIONAL_IMAGE_LINKS":$var_TOO_MANY_ADDITIONAL_IMAGE_LINKS,"MULTIPACK_INVALID":$var_MULTIPACK_INVALID,"INDEXED_PRODUCT_COUNT_LARGE_DELTA":$var_INDEXED_PRODUCT_COUNT_LARGE_DELTA,"ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE":$var_ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE,"OPTIONAL_PRODUCT_CATEGORY_MISSING":$var_OPTIONAL_PRODUCT_CATEGORY_MISSING,"OPTIONAL_PRODUCT_CATEGORY_INVALID":$var_OPTIONAL_PRODUCT_CATEGORY_INVALID,"OPTIONAL_CONDITION_MISSING":$var_OPTIONAL_CONDITION_MISSING,"OPTIONAL_CONDITION_INVALID":$var_OPTIONAL_CONDITION_INVALID,"IOS_DEEP_LINK_INVALID":$var_IOS_DEEP_LINK_INVALID,"ANDROID_DEEP_LINK_INVALID":$var_ANDROID_DEEP_LINK_INVALID,"UTM_SOURCE_AUTO_CORRECTED":$var_UTM_SOURCE_AUTO_CORRECTED,"COUNTRY_DOES_NOT_MAP_TO_CURRENCY":$var_COUNTRY_DOES_NOT_MAP_TO_CURRENCY,"MIN_AD_PRICE_INVALID":$var_MIN_AD_PRICE_INVALID,"GTIN_INVALID":$var_GTIN_INVALID,"INCONSISTENT_CURRENCY_VALUES":$var_INCONSISTENT_CURRENCY_VALUES,"SALES_PRICE_TOO_LOW":$var_SALES_PRICE_TOO_LOW,"SHIPPING_WIDTH_INVALID":$var_SHIPPING_WIDTH_INVALID,"SHIPPING_HEIGHT_INVALID":$var_SHIPPING_HEIGHT_INVALID,"SALES_PRICE_TOO_HIGH":$var_SALES_PRICE_TOO_HIGH,"MPN_INVALID":$var_MPN_INVALID
        | }
        """.stripMargin
}
