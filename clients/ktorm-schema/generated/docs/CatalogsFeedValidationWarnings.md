
# Table `CatalogsFeedValidationWarnings`
(mapped from: CatalogsFeedValidationWarnings)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**AD_LINK_FORMAT_WARNING** | AD_LINK_FORMAT_WARNING | int |  | **kotlin.Int** | Some items have ad links that are formatted incorrectly. |  [optional]
**AD_LINK_SAME_AS_LINK** | AD_LINK_SAME_AS_LINK | int |  | **kotlin.Int** | Some items have ad link URLs that are duplicates of the link URLs for those items. |  [optional]
**TITLE_LENGTH_TOO_LONG** | TITLE_LENGTH_TOO_LONG | int |  | **kotlin.Int** | The title for some items were truncated because they contain too many characters. |  [optional]
**DESCRIPTION_LENGTH_TOO_LONG** | DESCRIPTION_LENGTH_TOO_LONG | int |  | **kotlin.Int** | The description for some items were truncated because they contain too many characters. |  [optional]
**GENDER_INVALID** | GENDER_INVALID | int |  | **kotlin.Int** | Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**AGE_GROUP_INVALID** | AGE_GROUP_INVALID | int |  | **kotlin.Int** | Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**SIZE_TYPE_INVALID** | SIZE_TYPE_INVALID | int |  | **kotlin.Int** | Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**SIZE_SYSTEM_INVALID** | SIZE_SYSTEM_INVALID | int |  | **kotlin.Int** | Some items have size system values which are not one of the supported size systems. |  [optional]
**LINK_FORMAT_WARNING** | LINK_FORMAT_WARNING | int |  | **kotlin.Int** | Some items have an invalid product link which contains invalid UTM tracking paramaters. |  [optional]
**SALES_PRICE_INVALID** | SALES_PRICE_INVALID | int |  | **kotlin.Int** | Some items have sale price values that are higher than the original price of the item. |  [optional]
**PRODUCT_CATEGORY_DEPTH_WARNING** | PRODUCT_CATEGORY_DEPTH_WARNING | int |  | **kotlin.Int** | Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**ADWORDS_FORMAT_WARNING** | ADWORDS_FORMAT_WARNING | int |  | **kotlin.Int** | Some items have adwords_redirect links that are formatted incorrectly. |  [optional]
**ADWORDS_SAME_AS_LINK** | ADWORDS_SAME_AS_LINK | int |  | **kotlin.Int** | Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. |  [optional]
**DUPLICATE_HEADERS** | DUPLICATE_HEADERS | int |  | **kotlin.Int** | Your feed contains duplicate headers. |  [optional]
**FETCH_SAME_SIGNATURE** | FETCH_SAME_SIGNATURE | int |  | [**FETCH_SAME_SIGNATURE**](#FETCHSAMESIGNATURE) | Ingestion completed early because there are no changes to your feed since the last successful update. |  [optional]
**ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG** | ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG | int |  | **kotlin.Int** | Some items have additional_image_link URLs that contain too many characters, so those items will not be published. |  [optional]
**ADDITIONAL_IMAGE_LINK_WARNING** | ADDITIONAL_IMAGE_LINK_WARNING | int |  | **kotlin.Int** | Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. |  [optional]
**IMAGE_LINK_WARNING** | IMAGE_LINK_WARNING | int |  | **kotlin.Int** | Some items have image_link URLs that are formatted incorrectly and will not be published with those items. |  [optional]
**SHIPPING_INVALID** | SHIPPING_INVALID | int |  | **kotlin.Int** | Some items have shipping values that are formatted incorrectly. |  [optional]
**TAX_INVALID** | TAX_INVALID | int |  | **kotlin.Int** | Some items have tax values that are formatted incorrectly. |  [optional]
**SHIPPING_WEIGHT_INVALID** | SHIPPING_WEIGHT_INVALID | int |  | **kotlin.Int** | Some items have invalid shipping_weight values. |  [optional]
**EXPIRATION_DATE_INVALID** | EXPIRATION_DATE_INVALID | int |  | **kotlin.Int** | Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. |  [optional]
**AVAILABILITY_DATE_INVALID** | AVAILABILITY_DATE_INVALID | int |  | **kotlin.Int** | Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. |  [optional]
**SALE_DATE_INVALID** | SALE_DATE_INVALID | int |  | **kotlin.Int** | Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. |  [optional]
**WEIGHT_UNIT_INVALID** | WEIGHT_UNIT_INVALID | int |  | **kotlin.Int** | Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. |  [optional]
**IS_BUNDLE_INVALID** | IS_BUNDLE_INVALID | int |  | **kotlin.Int** | Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. |  [optional]
**UPDATED_TIME_INVALID** | UPDATED_TIME_INVALID | int |  | **kotlin.Int** | Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. |  [optional]
**CUSTOM_LABEL_LENGTH_TOO_LONG** | CUSTOM_LABEL_LENGTH_TOO_LONG | int |  | **kotlin.Int** | Some items have custom_label values that are too long, those items will be published without that custom label. |  [optional]
**PRODUCT_TYPE_LENGTH_TOO_LONG** | PRODUCT_TYPE_LENGTH_TOO_LONG | int |  | **kotlin.Int** | Some items have product_type values that are too long, those items will be published without that product type. |  [optional]
**TOO_MANY_ADDITIONAL_IMAGE_LINKS** | TOO_MANY_ADDITIONAL_IMAGE_LINKS | int |  | **kotlin.Int** | Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. |  [optional]
**MULTIPACK_INVALID** | MULTIPACK_INVALID | int |  | **kotlin.Int** | Some items have invalid multipack values. |  [optional]
**INDEXED_PRODUCT_COUNT_LARGE_DELTA** | INDEXED_PRODUCT_COUNT_LARGE_DELTA | int |  | **kotlin.Int** | The product count has increased or decreased significantly compared to the last successful ingestion. |  [optional]
**ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE** | ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE | int |  | **kotlin.Int** | Some items include additional_image_links that can&#39;t be found. |  [optional]
**OPTIONAL_PRODUCT_CATEGORY_MISSING** | OPTIONAL_PRODUCT_CATEGORY_MISSING | int |  | **kotlin.Int** | Some items are missing a google_product_category. |  [optional]
**OPTIONAL_PRODUCT_CATEGORY_INVALID** | OPTIONAL_PRODUCT_CATEGORY_INVALID | int |  | **kotlin.Int** | Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. |  [optional]
**OPTIONAL_CONDITION_MISSING** | OPTIONAL_CONDITION_MISSING | int |  | **kotlin.Int** | Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**OPTIONAL_CONDITION_INVALID** | OPTIONAL_CONDITION_INVALID | int |  | **kotlin.Int** | Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**IOS_DEEP_LINK_INVALID** | IOS_DEEP_LINK_INVALID | int |  | **kotlin.Int** | Some items include invalid ios_deep_link values. |  [optional]
**ANDROID_DEEP_LINK_INVALID** | ANDROID_DEEP_LINK_INVALID | int |  | **kotlin.Int** | Some items include invalid android_deep_link. |  [optional]
**UTM_SOURCE_AUTO_CORRECTED** | UTM_SOURCE_AUTO_CORRECTED | int |  | **kotlin.Int** | Some items include utm_source values that are formatted incorrectly and have been automatically corrected. |  [optional]
**COUNTRY_DOES_NOT_MAP_TO_CURRENCY** | COUNTRY_DOES_NOT_MAP_TO_CURRENCY | int |  | **kotlin.Int** | Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped. |  [optional]
**MIN_AD_PRICE_INVALID** | MIN_AD_PRICE_INVALID | int |  | **kotlin.Int** | Some items include min_ad_price values that are formatted incorrectly. |  [optional]
**GTIN_INVALID** | GTIN_INVALID | int |  | **kotlin.Int** | Some items include incorrectly formatted GTINs. |  [optional]
**INCONSISTENT_CURRENCY_VALUES** | INCONSISTENT_CURRENCY_VALUES | int |  | **kotlin.Int** | Some items include inconsistent currencies in price fields. |  [optional]
**SALES_PRICE_TOO_LOW** | SALES_PRICE_TOO_LOW | int |  | **kotlin.Int** | Some items include sales price that is much lower than the list price. |  [optional]
**SHIPPING_WIDTH_INVALID** | SHIPPING_WIDTH_INVALID | int |  | **kotlin.Int** | Some items include incorrectly formatted shipping_width. |  [optional]
**SHIPPING_HEIGHT_INVALID** | SHIPPING_HEIGHT_INVALID | int |  | **kotlin.Int** | Some items include incorrectly formatted shipping_height. |  [optional]
**SALES_PRICE_TOO_HIGH** | SALES_PRICE_TOO_HIGH | int |  | **kotlin.Int** | Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. |  [optional]
**MPN_INVALID** | MPN_INVALID | int |  | **kotlin.Int** | Some items include incorrectly formatted MPNs. |  [optional]



















































