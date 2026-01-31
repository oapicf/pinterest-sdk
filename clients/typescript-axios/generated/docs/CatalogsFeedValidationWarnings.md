# CatalogsFeedValidationWarnings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AD_LINK_FORMAT_WARNING** | **number** | Some items have ad links that are formatted incorrectly. | [optional] [default to undefined]
**AD_LINK_SAME_AS_LINK** | **number** | Some items have ad link URLs that are duplicates of the link URLs for those items. | [optional] [default to undefined]
**TITLE_LENGTH_TOO_LONG** | **number** | The title for some items were truncated because they contain too many characters. | [optional] [default to undefined]
**DESCRIPTION_LENGTH_TOO_LONG** | **number** | The description for some items were truncated because they contain too many characters. | [optional] [default to undefined]
**GENDER_INVALID** | **number** | Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to undefined]
**AGE_GROUP_INVALID** | **number** | Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to undefined]
**SIZE_TYPE_INVALID** | **number** | Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to undefined]
**SIZE_SYSTEM_INVALID** | **number** | Some items have size system values which are not one of the supported size systems. | [optional] [default to undefined]
**LINK_FORMAT_WARNING** | **number** | Some items have an invalid product link which contains invalid UTM tracking paramaters. | [optional] [default to undefined]
**SALES_PRICE_INVALID** | **number** | Some items have sale price values that are higher than the original price of the item. | [optional] [default to undefined]
**PRODUCT_CATEGORY_DEPTH_WARNING** | **number** | Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to undefined]
**ADWORDS_FORMAT_WARNING** | **number** | Some items have adwords_redirect links that are formatted incorrectly. | [optional] [default to undefined]
**ADWORDS_SAME_AS_LINK** | **number** | Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. | [optional] [default to undefined]
**DUPLICATE_HEADERS** | **number** | Your feed contains duplicate headers. | [optional] [default to undefined]
**FETCH_SAME_SIGNATURE** | **number** | Ingestion completed early because there are no changes to your feed since the last successful update. | [optional] [default to undefined]
**ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG** | **number** | Some items have additional_image_link URLs that contain too many characters, so those items will not be published. | [optional] [default to undefined]
**ADDITIONAL_IMAGE_LINK_WARNING** | **number** | Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. | [optional] [default to undefined]
**IMAGE_LINK_WARNING** | **number** | Some items have image_link URLs that are formatted incorrectly and will not be published with those items. | [optional] [default to undefined]
**SHIPPING_INVALID** | **number** | Some items have shipping values that are formatted incorrectly. | [optional] [default to undefined]
**TAX_INVALID** | **number** | Some items have tax values that are formatted incorrectly. | [optional] [default to undefined]
**SHIPPING_WEIGHT_INVALID** | **number** | Some items have invalid shipping_weight values. | [optional] [default to undefined]
**EXPIRATION_DATE_INVALID** | **number** | Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. | [optional] [default to undefined]
**AVAILABILITY_DATE_INVALID** | **number** | Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. | [optional] [default to undefined]
**SALE_DATE_INVALID** | **number** | Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. | [optional] [default to undefined]
**WEIGHT_UNIT_INVALID** | **number** | Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. | [optional] [default to undefined]
**IS_BUNDLE_INVALID** | **number** | Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. | [optional] [default to undefined]
**UPDATED_TIME_INVALID** | **number** | Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. | [optional] [default to undefined]
**CUSTOM_LABEL_LENGTH_TOO_LONG** | **number** | Some items have custom_label values that are too long, those items will be published without that custom label. | [optional] [default to undefined]
**PRODUCT_TYPE_LENGTH_TOO_LONG** | **number** | Some items have product_type values that are too long, those items will be published without that product type. | [optional] [default to undefined]
**TOO_MANY_ADDITIONAL_IMAGE_LINKS** | **number** | Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. | [optional] [default to undefined]
**MULTIPACK_INVALID** | **number** | Some items have invalid multipack values. | [optional] [default to undefined]
**INDEXED_PRODUCT_COUNT_LARGE_DELTA** | **number** | The product count has increased or decreased significantly compared to the last successful ingestion. | [optional] [default to undefined]
**ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE** | **number** | Some items include additional_image_links that can\&#39;t be found. | [optional] [default to undefined]
**OPTIONAL_PRODUCT_CATEGORY_MISSING** | **number** | Some items are missing a google_product_category. | [optional] [default to undefined]
**OPTIONAL_PRODUCT_CATEGORY_INVALID** | **number** | Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. | [optional] [default to undefined]
**OPTIONAL_CONDITION_MISSING** | **number** | Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to undefined]
**OPTIONAL_CONDITION_INVALID** | **number** | Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to undefined]
**IOS_DEEP_LINK_INVALID** | **number** | Some items include invalid ios_deep_link values. | [optional] [default to undefined]
**ANDROID_DEEP_LINK_INVALID** | **number** | Some items include invalid android_deep_link. | [optional] [default to undefined]
**UTM_SOURCE_AUTO_CORRECTED** | **number** | Some items include utm_source values that are formatted incorrectly and have been automatically corrected. | [optional] [default to undefined]
**COUNTRY_DOES_NOT_MAP_TO_CURRENCY** | **number** | Some items include a currency that doesn\&#39;t match the usual currency for the location where that product is sold or shipped. | [optional] [default to undefined]
**MIN_AD_PRICE_INVALID** | **number** | Some items include min_ad_price values that are formatted incorrectly. | [optional] [default to undefined]
**GTIN_INVALID** | **number** | Some items include incorrectly formatted GTINs. | [optional] [default to undefined]
**INCONSISTENT_CURRENCY_VALUES** | **number** | Some items include inconsistent currencies in price fields. | [optional] [default to undefined]
**SALES_PRICE_TOO_LOW** | **number** | Some items include sales price that is much lower than the list price. | [optional] [default to undefined]
**SHIPPING_WIDTH_INVALID** | **number** | Some items include incorrectly formatted shipping_width. | [optional] [default to undefined]
**SHIPPING_HEIGHT_INVALID** | **number** | Some items include incorrectly formatted shipping_height. | [optional] [default to undefined]
**SALES_PRICE_TOO_HIGH** | **number** | Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. | [optional] [default to undefined]
**MPN_INVALID** | **number** | Some items include incorrectly formatted MPNs. | [optional] [default to undefined]

## Example

```typescript
import { CatalogsFeedValidationWarnings } from './api';

const instance: CatalogsFeedValidationWarnings = {
    AD_LINK_FORMAT_WARNING,
    AD_LINK_SAME_AS_LINK,
    TITLE_LENGTH_TOO_LONG,
    DESCRIPTION_LENGTH_TOO_LONG,
    GENDER_INVALID,
    AGE_GROUP_INVALID,
    SIZE_TYPE_INVALID,
    SIZE_SYSTEM_INVALID,
    LINK_FORMAT_WARNING,
    SALES_PRICE_INVALID,
    PRODUCT_CATEGORY_DEPTH_WARNING,
    ADWORDS_FORMAT_WARNING,
    ADWORDS_SAME_AS_LINK,
    DUPLICATE_HEADERS,
    FETCH_SAME_SIGNATURE,
    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG,
    ADDITIONAL_IMAGE_LINK_WARNING,
    IMAGE_LINK_WARNING,
    SHIPPING_INVALID,
    TAX_INVALID,
    SHIPPING_WEIGHT_INVALID,
    EXPIRATION_DATE_INVALID,
    AVAILABILITY_DATE_INVALID,
    SALE_DATE_INVALID,
    WEIGHT_UNIT_INVALID,
    IS_BUNDLE_INVALID,
    UPDATED_TIME_INVALID,
    CUSTOM_LABEL_LENGTH_TOO_LONG,
    PRODUCT_TYPE_LENGTH_TOO_LONG,
    TOO_MANY_ADDITIONAL_IMAGE_LINKS,
    MULTIPACK_INVALID,
    INDEXED_PRODUCT_COUNT_LARGE_DELTA,
    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE,
    OPTIONAL_PRODUCT_CATEGORY_MISSING,
    OPTIONAL_PRODUCT_CATEGORY_INVALID,
    OPTIONAL_CONDITION_MISSING,
    OPTIONAL_CONDITION_INVALID,
    IOS_DEEP_LINK_INVALID,
    ANDROID_DEEP_LINK_INVALID,
    UTM_SOURCE_AUTO_CORRECTED,
    COUNTRY_DOES_NOT_MAP_TO_CURRENCY,
    MIN_AD_PRICE_INVALID,
    GTIN_INVALID,
    INCONSISTENT_CURRENCY_VALUES,
    SALES_PRICE_TOO_LOW,
    SHIPPING_WIDTH_INVALID,
    SHIPPING_HEIGHT_INVALID,
    SALES_PRICE_TOO_HIGH,
    MPN_INVALID,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
