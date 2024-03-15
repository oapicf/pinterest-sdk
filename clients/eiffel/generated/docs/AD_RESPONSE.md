# AD_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | [**STRING_32**](STRING_32.md) | ID of the ad group that contains the ad. | [optional] [default to null]
**android_deep_link** | [**STRING_32**](STRING_32.md) | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] [default to null]
**carousel_android_deep_links** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated deep links for the carousel pin on Android. | [optional] [default to null]
**carousel_destination_urls** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to null]
**carousel_ios_deep_links** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to null]
**click_tracking_url** | [**STRING_32**](STRING_32.md) | Tracking url for the ad clicks. | [optional] [default to null]
**creative_type** | [**CREATIVE_TYPE**](CreativeType.md) |  | [optional] [default to null]
**destination_url** | [**STRING_32**](STRING_32.md) | Destination URL. | [optional] [default to null]
**ios_deep_link** | [**STRING_32**](STRING_32.md) | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] [default to null]
**is_pin_deleted** | **BOOLEAN** | Is original pin deleted? | [optional] [default to null]
**is_removable** | **BOOLEAN** | Is pin repinnable? | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Name of the ad - 255 chars max. | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to null]
**tracking_urls** | [**AD_COMMON_TRACKING_URLS**](AdCommon_tracking_urls.md) |  | [optional] [default to null]
**view_tracking_url** | [**STRING_32**](STRING_32.md) | Tracking URL for ad impressions. | [optional] [default to null]
**lead_form_id** | [**STRING_32**](STRING_32.md) | Lead form ID for lead ad generation. | [optional] [default to null]
**grid_click_type** | [**GRID_CLICK_TYPE**](GridClickType.md) |  | [optional] [default to null]
**customizable_cta_type** | [**STRING_32**](STRING_32.md) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] [default to null]
**quiz_pin_data** | [**AD_COMMON_QUIZ_PIN_DATA**](AdCommon_quiz_pin_data.md) |  | [optional] [default to null]
**pin_id** | [**STRING_32**](STRING_32.md) | Pin ID. | [optional] [default to null]
**ad_account_id** | [**STRING_32**](STRING_32.md) | The ID of the advertiser that this ad belongs to. | [optional] [default to null]
**campaign_id** | [**STRING_32**](STRING_32.md) | ID of the ad campaign that contains this ad. | [optional] [default to null]
**collection_items_destination_url_template** | [**STRING_32**](STRING_32.md) | Destination URL template for all items within a collections drawer. | [optional] [default to null]
**created_time** | **INTEGER_32** | Pin creation time. Unix timestamp in seconds. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | The ID of this ad. | [optional] [default to null]
**rejected_reasons** | [**LIST [STRING_32]**](STRING_32.md) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to null]
**rejection_labels** | [**LIST [STRING_32]**](STRING_32.md) | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to null]
**review_status** | [**STRING_32**](STRING_32.md) | Ad review status | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;ad\&quot;. | [optional] [default to null]
**updated_time** | **INTEGER_32** | Last update time. Unix timestamp in seconds. | [optional] [default to null]
**summary_status** | [**PIN_PROMOTION_SUMMARY_STATUS**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


