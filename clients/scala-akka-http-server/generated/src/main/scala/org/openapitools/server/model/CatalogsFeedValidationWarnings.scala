package org.openapitools.server.model


/**
 * @param AD_LINK_FORMAT_WARNING Some items have ad links that are formatted incorrectly. for example: ''null''
 * @param AD_LINK_SAME_AS_LINK Some items have ad link URLs that are duplicates of the link URLs for those items. for example: ''null''
 * @param TITLE_LENGTH_TOO_LONG The title for some items were truncated because they contain too many characters. for example: ''null''
 * @param DESCRIPTION_LENGTH_TOO_LONG The description for some items were truncated because they contain too many characters. for example: ''null''
 * @param GENDER_INVALID Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. for example: ''null''
 * @param AGE_GROUP_INVALID Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. for example: ''null''
 * @param SIZE_TYPE_INVALID Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. for example: ''null''
 * @param SIZE_SYSTEM_INVALID Some items have size system values which are not one of the supported size systems. for example: ''null''
 * @param LINK_FORMAT_WARNING Some items have an invalid product link which contains invalid UTM tracking paramaters. for example: ''null''
 * @param SALES_PRICE_INVALID Some items have sale price values that are higher than the original price of the item. for example: ''null''
 * @param PRODUCT_CATEGORY_DEPTH_WARNING Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. for example: ''null''
 * @param ADWORDS_FORMAT_WARNING Some items have adwords_redirect links that are formatted incorrectly. for example: ''null''
 * @param ADWORDS_SAME_AS_LINK Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. for example: ''null''
 * @param DUPLICATE_HEADERS Your feed contains duplicate headers. for example: ''null''
 * @param FETCH_SAME_SIGNATURE Ingestion completed early because there are no changes to your feed since the last successful update. for example: ''null''
 * @param ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG Some items have additional_image_link URLs that contain too many characters, so those items will not be published. for example: ''null''
 * @param ADDITIONAL_IMAGE_LINK_WARNING Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. for example: ''null''
 * @param IMAGE_LINK_WARNING Some items have image_link URLs that are formatted incorrectly and will not be published with those items. for example: ''null''
 * @param SHIPPING_INVALID Some items have shipping values that are formatted incorrectly. for example: ''null''
 * @param TAX_INVALID Some items have tax values that are formatted incorrectly. for example: ''null''
 * @param SHIPPING_WEIGHT_INVALID Some items have invalid shipping_weight values. for example: ''null''
 * @param EXPIRATION_DATE_INVALID Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. for example: ''null''
 * @param AVAILABILITY_DATE_INVALID Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. for example: ''null''
 * @param SALE_DATE_INVALID Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. for example: ''null''
 * @param WEIGHT_UNIT_INVALID Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. for example: ''null''
 * @param IS_BUNDLE_INVALID Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. for example: ''null''
 * @param UPDATED_TIME_INVALID Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. for example: ''null''
 * @param CUSTOM_LABEL_LENGTH_TOO_LONG Some items have custom_label values that are too long, those items will be published without that custom label. for example: ''null''
 * @param PRODUCT_TYPE_LENGTH_TOO_LONG Some items have product_type values that are too long, those items will be published without that product type. for example: ''null''
 * @param TOO_MANY_ADDITIONAL_IMAGE_LINKS Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. for example: ''null''
 * @param MULTIPACK_INVALID Some items have invalid multipack values. for example: ''null''
 * @param INDEXED_PRODUCT_COUNT_LARGE_DELTA The product count has increased or decreased significantly compared to the last successful ingestion. for example: ''null''
 * @param ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE Some items include additional_image_links that can't be found. for example: ''null''
 * @param OPTIONAL_PRODUCT_CATEGORY_MISSING Some items are missing a google_product_category. for example: ''null''
 * @param OPTIONAL_PRODUCT_CATEGORY_INVALID Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. for example: ''null''
 * @param OPTIONAL_CONDITION_MISSING Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. for example: ''null''
 * @param OPTIONAL_CONDITION_INVALID Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. for example: ''null''
 * @param IOS_DEEP_LINK_INVALID Some items include invalid ios_deep_link values. for example: ''null''
 * @param ANDROID_DEEP_LINK_INVALID Some items include invalid android_deep_link. for example: ''null''
 * @param UTM_SOURCE_AUTO_CORRECTED Some items include utm_source values that are formatted incorrectly and have been automatically corrected. for example: ''null''
 * @param COUNTRY_DOES_NOT_MAP_TO_CURRENCY Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped. for example: ''null''
 * @param MIN_AD_PRICE_INVALID Some items include min_ad_price values that are formatted incorrectly. for example: ''null''
 * @param GTIN_INVALID Some items include incorrectly formatted GTINs. for example: ''null''
 * @param INCONSISTENT_CURRENCY_VALUES Some items include inconsistent currencies in price fields. for example: ''null''
 * @param SALES_PRICE_TOO_LOW Some items include sales price that is much lower than the list price. for example: ''null''
 * @param SHIPPING_WIDTH_INVALID Some items include incorrectly formatted shipping_width. for example: ''null''
 * @param SHIPPING_HEIGHT_INVALID Some items include incorrectly formatted shipping_height. for example: ''null''
 * @param SALES_PRICE_TOO_HIGH Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. for example: ''null''
 * @param MPN_INVALID Some items include incorrectly formatted MPNs. for example: ''null''
*/
final case class CatalogsFeedValidationWarnings (
  AD_LINK_FORMAT_WARNING: Option[Int] = None,
  AD_LINK_SAME_AS_LINK: Option[Int] = None,
  TITLE_LENGTH_TOO_LONG: Option[Int] = None,
  DESCRIPTION_LENGTH_TOO_LONG: Option[Int] = None,
  GENDER_INVALID: Option[Int] = None,
  AGE_GROUP_INVALID: Option[Int] = None,
  SIZE_TYPE_INVALID: Option[Int] = None,
  SIZE_SYSTEM_INVALID: Option[Int] = None,
  LINK_FORMAT_WARNING: Option[Int] = None,
  SALES_PRICE_INVALID: Option[Int] = None,
  PRODUCT_CATEGORY_DEPTH_WARNING: Option[Int] = None,
  ADWORDS_FORMAT_WARNING: Option[Int] = None,
  ADWORDS_SAME_AS_LINK: Option[Int] = None,
  DUPLICATE_HEADERS: Option[Int] = None,
  FETCH_SAME_SIGNATURE: Option[Int] = None,
  ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: Option[Int] = None,
  ADDITIONAL_IMAGE_LINK_WARNING: Option[Int] = None,
  IMAGE_LINK_WARNING: Option[Int] = None,
  SHIPPING_INVALID: Option[Int] = None,
  TAX_INVALID: Option[Int] = None,
  SHIPPING_WEIGHT_INVALID: Option[Int] = None,
  EXPIRATION_DATE_INVALID: Option[Int] = None,
  AVAILABILITY_DATE_INVALID: Option[Int] = None,
  SALE_DATE_INVALID: Option[Int] = None,
  WEIGHT_UNIT_INVALID: Option[Int] = None,
  IS_BUNDLE_INVALID: Option[Int] = None,
  UPDATED_TIME_INVALID: Option[Int] = None,
  CUSTOM_LABEL_LENGTH_TOO_LONG: Option[Int] = None,
  PRODUCT_TYPE_LENGTH_TOO_LONG: Option[Int] = None,
  TOO_MANY_ADDITIONAL_IMAGE_LINKS: Option[Int] = None,
  MULTIPACK_INVALID: Option[Int] = None,
  INDEXED_PRODUCT_COUNT_LARGE_DELTA: Option[Int] = None,
  ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: Option[Int] = None,
  OPTIONAL_PRODUCT_CATEGORY_MISSING: Option[Int] = None,
  OPTIONAL_PRODUCT_CATEGORY_INVALID: Option[Int] = None,
  OPTIONAL_CONDITION_MISSING: Option[Int] = None,
  OPTIONAL_CONDITION_INVALID: Option[Int] = None,
  IOS_DEEP_LINK_INVALID: Option[Int] = None,
  ANDROID_DEEP_LINK_INVALID: Option[Int] = None,
  UTM_SOURCE_AUTO_CORRECTED: Option[Int] = None,
  COUNTRY_DOES_NOT_MAP_TO_CURRENCY: Option[Int] = None,
  MIN_AD_PRICE_INVALID: Option[Int] = None,
  GTIN_INVALID: Option[Int] = None,
  INCONSISTENT_CURRENCY_VALUES: Option[Int] = None,
  SALES_PRICE_TOO_LOW: Option[Int] = None,
  SHIPPING_WIDTH_INVALID: Option[Int] = None,
  SHIPPING_HEIGHT_INVALID: Option[Int] = None,
  SALES_PRICE_TOO_HIGH: Option[Int] = None,
  MPN_INVALID: Option[Int] = None
)

