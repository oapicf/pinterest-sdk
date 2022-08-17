# CatalogsFeedValidationWarnings
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **TITLE\_LENGTH\_TOO\_LONG** | **Integer** | The title for some items were truncated because they contain too many characters. | [optional] [default to null] |
| **DESCRIPTION\_LENGTH\_TOO\_LONG** | **Integer** | The description for some items were truncated because they contain too many characters. | [optional] [default to null] |
| **GENDER\_INVALID** | **Integer** | Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to null] |
| **AGE\_GROUP\_INVALID** | **Integer** | Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to null] |
| **SIZE\_TYPE\_INVALID** | **Integer** | Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to null] |
| **LINK\_FORMAT\_WARNING** | **Integer** | Some items have an invalid product link which contains invalid UTM tracking paramaters. | [optional] [default to null] |
| **DUPLICATE\_PRODUCTS** | **Integer** | Some products are duplicated. | [optional] [default to null] |
| **SALES\_PRICE\_INVALID** | **Integer** | Some items have sale price values that are higher than the original price of the item. | [optional] [default to null] |
| **PRODUCT\_CATEGORY\_DEPTH\_WARNING** | **Integer** | Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to null] |
| **ADWORDS\_SAME\_AS\_LINK** | **Integer** | Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. | [optional] [default to null] |
| **DUPLICATE\_HEADERS** | **Integer** | Your feed contains duplicate headers. | [optional] [default to null] |
| **FETCH\_SAME\_SIGNATURE** | **Integer** | Ingestion completed early because there are no changes to your feed since the last successful update. | [optional] [default to null] |
| **ADWORDS\_FORMAT\_WARNING** | **Integer** | Some items have adwords_redirect links that are formatted incorrectly. | [optional] [default to null] |
| **ADDITIONAL\_IMAGE\_LINK\_LENGTH\_TOO\_LONG** | **Integer** | Some items have additional_image_link URLs that contain too many characters, so those items will not be published. | [optional] [default to null] |
| **ADDITIONAL\_IMAGE\_LINK\_WARNING** | **Integer** | Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. | [optional] [default to null] |
| **IMAGE\_LINK\_WARNING** | **Integer** | Some items have image_link URLs that are formatted incorrectly and will not be published with those items. | [optional] [default to null] |
| **SHIPPING\_INVALID** | **Integer** | Some items have shipping values that are formatted incorrectly. | [optional] [default to null] |
| **TAX\_INVALID** | **Integer** | Some items have tax values that are formatted incorrectly. | [optional] [default to null] |
| **SHIPPING\_WEIGHT\_INVALID** | **Integer** | Some items have invalid shipping_weight values. | [optional] [default to null] |
| **EXPIRATION\_DATE\_INVALID** | **Integer** | Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. | [optional] [default to null] |
| **AVAILABILITY\_DATE\_INVALID** | **Integer** | Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. | [optional] [default to null] |
| **SALE\_DATE\_INVALID** | **Integer** | Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. | [optional] [default to null] |
| **WEIGHT\_UNIT\_INVALID** | **Integer** | Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. | [optional] [default to null] |
| **IS\_BUNDLE\_INVALID** | **Integer** | Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. | [optional] [default to null] |
| **UPDATED\_TIME\_INVALID** | **Integer** | Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. | [optional] [default to null] |
| **CUSTOM\_LABEL\_LENGTH\_TOO\_LONG** | **Integer** | Some items have custom_label values that are too long, those items will be published without that custom label. | [optional] [default to null] |
| **PRODUCT\_TYPE\_LENGTH\_TOO\_LONG** | **Integer** | Some items have product_type values that are too long, those items will be published without that product type. | [optional] [default to null] |
| **TOO\_MANY\_ADDITIONAL\_IMAGE\_LINKS** | **Integer** | Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. | [optional] [default to null] |
| **MULTIPACK\_INVALID** | **Integer** | Some items have invalid multipack values. | [optional] [default to null] |
| **INDEXED\_PRODUCT\_COUNT\_LARGE\_DELTA** | **Integer** | The product count has increased or decreased significantly compared to the last successful ingestion. | [optional] [default to null] |
| **ITEM\_ADDITIONAL\_IMAGE\_DOWNLOAD\_FAILURE** | **Integer** | Some items include additional_image_links that can&#39;t be found. | [optional] [default to null] |
| **OPTIONAL\_PRODUCT\_CATEGORY\_MISSING** | **Integer** | Some items are missing a google_product_category. | [optional] [default to null] |
| **OPTIONAL\_PRODUCT\_CATEGORY\_INVALID** | **Integer** | Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. | [optional] [default to null] |
| **OPTIONAL\_CONDITION\_MISSING** | **Integer** | Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to null] |
| **OPTIONAL\_CONDITION\_INVALID** | **Integer** | Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] [default to null] |
| **IOS\_DEEP\_LINK\_INVALID** | **Integer** | Some items include invalid ios_deep_link values. | [optional] [default to null] |
| **ANDROID\_DEEP\_LINK\_INVALID** | **Integer** | Some items include invalid android_deep_link. | [optional] [default to null] |
| **AVAILABILITY\_NORMALIZED** | **Integer** | Some items include availability values that are formatted incorrectly and have been automatically corrected. | [optional] [default to null] |
| **CONDITION\_NORMALIZED** | **Integer** | Some items include condition values that are formatted incorrectly and have been automatically corrected. | [optional] [default to null] |
| **GENDER\_NORMALIZED** | **Integer** | Some items include gender values that are formatted incorrectly and have been automatically corrected. | [optional] [default to null] |
| **SIZE\_TYPE\_NORMALIZED** | **Integer** | Some items include size_type values that are formatted incorrectly and have been automatically corrected. | [optional] [default to null] |
| **AGE\_GROUP\_NORMALIZED** | **Integer** | Some items include age_group values that are formatted incorrectly and have been automatically corrected. | [optional] [default to null] |
| **UTM\_SOURCE\_AUTO\_CORRECTED** | **Integer** | Some items include utm_source values that are formatted incorrectly and have been automatically corrected. | [optional] [default to null] |
| **COUNTRY\_DOES\_NOT\_MAP\_TO\_CURRENCY** | **Integer** | Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped. | [optional] [default to null] |
| **MIN\_AD\_PRICE\_INVALID** | **Integer** | Some items include min_ad_price values that are formatted incorrectly. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

