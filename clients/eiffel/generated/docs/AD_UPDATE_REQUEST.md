# AD_UPDATE_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | [**STRING_32**](STRING_32.md) | ID of the ad group that contains the ad. | [optional] [default to null]
**android_deep_link** | [**STRING_32**](STRING_32.md) | Deep link URL for Android devices. | [optional] [default to null]
**carousel_android_deep_links** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated deep links for the carousel pin on Android. | [optional] [default to null]
**carousel_destination_urls** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to null]
**carousel_ios_deep_links** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to null]
**click_tracking_url** | [**STRING_32**](STRING_32.md) | Tracking url for the ad clicks. | [optional] [default to null]
**creative_type** | [**CREATIVE_TYPE**](CreativeType.md) |  | [optional] [default to null]
**destination_url** | [**STRING_32**](STRING_32.md) | Destination URL. | [optional] [default to null]
**ios_deep_link** | [**STRING_32**](STRING_32.md) | Deep link URL for iOS devices. | [optional] [default to null]
**is_pin_deleted** | **BOOLEAN** | Is original pin deleted? | [optional] [default to null]
**is_removable** | **BOOLEAN** | Is pin repinnable? | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Name of the ad - 255 chars max. | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to null]
**tracking_urls** | [**TRACKING_URLS**](TrackingUrls.md) |  | [optional] [default to null]
**view_tracking_url** | [**STRING_32**](STRING_32.md) | Tracking URL for ad impressions. | [optional] [default to null]
**lead_form_id** | [**STRING_32**](STRING_32.md) | Lead form ID for lead ad generation. | [optional] [default to null]
**grid_click_type** | [**GRID_CLICK_TYPE**](GridClickType.md) |  | [optional] [default to null]
**customizable_cta_type** | [**STRING_32**](STRING_32.md) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] [default to null]
**quiz_pin_data** | [**QUIZ_PIN_DATA**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | The ID of this ad. | [default to null]
**pin_id** | [**STRING_32**](STRING_32.md) | Pin ID. This field may only be updated for draft ads. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


