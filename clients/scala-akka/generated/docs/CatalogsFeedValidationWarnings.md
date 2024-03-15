

# CatalogsFeedValidationWarnings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AD_LINK_FORMAT_WARNING** | **Int** | Some items have ad links that are formatted incorrectly. |  [optional]
**AD_LINK_SAME_AS_LINK** | **Int** | Some items have ad link URLs that are duplicates of the link URLs for those items. |  [optional]
**TITLE_LENGTH_TOO_LONG** | **Int** | The title for some items were truncated because they contain too many characters. |  [optional]
**DESCRIPTION_LENGTH_TOO_LONG** | **Int** | The description for some items were truncated because they contain too many characters. |  [optional]
**GENDER_INVALID** | **Int** | Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**AGE_GROUP_INVALID** | **Int** | Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**SIZE_TYPE_INVALID** | **Int** | Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**SIZE_SYSTEM_INVALID** | **Int** | Some items have size system values which are not one of the supported size systems. |  [optional]
**LINK_FORMAT_WARNING** | **Int** | Some items have an invalid product link which contains invalid UTM tracking paramaters. |  [optional]
**SALES_PRICE_INVALID** | **Int** | Some items have sale price values that are higher than the original price of the item. |  [optional]
**PRODUCT_CATEGORY_DEPTH_WARNING** | **Int** | Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**ADWORDS_FORMAT_WARNING** | **Int** | Some items have adwords_redirect links that are formatted incorrectly. |  [optional]
**ADWORDS_SAME_AS_LINK** | **Int** | Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. |  [optional]
**DUPLICATE_HEADERS** | **Int** | Your feed contains duplicate headers. |  [optional]
**FETCH_SAME_SIGNATURE** | [**FETCHSAMESIGNATURE**](#FETCHSAMESIGNATURE) | Ingestion completed early because there are no changes to your feed since the last successful update. |  [optional]
**ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG** | **Int** | Some items have additional_image_link URLs that contain too many characters, so those items will not be published. |  [optional]
**ADDITIONAL_IMAGE_LINK_WARNING** | **Int** | Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. |  [optional]
**IMAGE_LINK_WARNING** | **Int** | Some items have image_link URLs that are formatted incorrectly and will not be published with those items. |  [optional]
**SHIPPING_INVALID** | **Int** | Some items have shipping values that are formatted incorrectly. |  [optional]
**TAX_INVALID** | **Int** | Some items have tax values that are formatted incorrectly. |  [optional]
**SHIPPING_WEIGHT_INVALID** | **Int** | Some items have invalid shipping_weight values. |  [optional]
**EXPIRATION_DATE_INVALID** | **Int** | Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. |  [optional]
**AVAILABILITY_DATE_INVALID** | **Int** | Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. |  [optional]
**SALE_DATE_INVALID** | **Int** | Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. |  [optional]
**WEIGHT_UNIT_INVALID** | **Int** | Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. |  [optional]
**IS_BUNDLE_INVALID** | **Int** | Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. |  [optional]
**UPDATED_TIME_INVALID** | **Int** | Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. |  [optional]
**CUSTOM_LABEL_LENGTH_TOO_LONG** | **Int** | Some items have custom_label values that are too long, those items will be published without that custom label. |  [optional]
**PRODUCT_TYPE_LENGTH_TOO_LONG** | **Int** | Some items have product_type values that are too long, those items will be published without that product type. |  [optional]
**TOO_MANY_ADDITIONAL_IMAGE_LINKS** | **Int** | Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. |  [optional]
**MULTIPACK_INVALID** | **Int** | Some items have invalid multipack values. |  [optional]
**INDEXED_PRODUCT_COUNT_LARGE_DELTA** | **Int** | The product count has increased or decreased significantly compared to the last successful ingestion. |  [optional]
**ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE** | **Int** | Some items include additional_image_links that can&#39;t be found. |  [optional]
**OPTIONAL_PRODUCT_CATEGORY_MISSING** | **Int** | Some items are missing a google_product_category. |  [optional]
**OPTIONAL_PRODUCT_CATEGORY_INVALID** | **Int** | Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. |  [optional]
**OPTIONAL_CONDITION_MISSING** | **Int** | Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**OPTIONAL_CONDITION_INVALID** | **Int** | Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. |  [optional]
**IOS_DEEP_LINK_INVALID** | **Int** | Some items include invalid ios_deep_link values. |  [optional]
**ANDROID_DEEP_LINK_INVALID** | **Int** | Some items include invalid android_deep_link. |  [optional]
**UTM_SOURCE_AUTO_CORRECTED** | **Int** | Some items include utm_source values that are formatted incorrectly and have been automatically corrected. |  [optional]
**COUNTRY_DOES_NOT_MAP_TO_CURRENCY** | **Int** | Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped. |  [optional]
**MIN_AD_PRICE_INVALID** | **Int** | Some items include min_ad_price values that are formatted incorrectly. |  [optional]
**GTIN_INVALID** | **Int** | Some items include incorrectly formatted GTINs. |  [optional]
**INCONSISTENT_CURRENCY_VALUES** | **Int** | Some items include inconsistent currencies in price fields. |  [optional]
**SALES_PRICE_TOO_LOW** | **Int** | Some items include sales price that is much lower than the list price. |  [optional]
**SHIPPING_WIDTH_INVALID** | **Int** | Some items include incorrectly formatted shipping_width. |  [optional]
**SHIPPING_HEIGHT_INVALID** | **Int** | Some items include incorrectly formatted shipping_height. |  [optional]
**SALES_PRICE_TOO_HIGH** | **Int** | Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. |  [optional]
**MPN_INVALID** | **Int** | Some items include incorrectly formatted MPNs. |  [optional]


## Enum: FETCHSAMESIGNATURE
Allowed values: [1]




