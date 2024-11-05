# # AdUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group that contains the ad. | [optional]
**android_deep_link** | **string** | Deep link URL for Android devices. | [optional]
**carousel_android_deep_links** | **string[]** | Comma-separated deep links for the carousel pin on Android. | [optional]
**carousel_destination_urls** | **string[]** | Comma-separated destination URLs for the carousel pin to promote. | [optional]
**carousel_ios_deep_links** | **string[]** | Comma-separated deep links for the carousel pin on iOS. | [optional]
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional]
**creative_type** | [**\OpenAPI\Client\Model\CreativeType**](CreativeType.md) |  | [optional]
**destination_url** | **string** | Destination URL. | [optional]
**ios_deep_link** | **string** | Deep link URL for iOS devices. | [optional]
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional]
**is_removable** | **bool** | Is pin repinnable? | [optional]
**name** | **string** | Name of the ad - 255 chars max. | [optional]
**status** | [**\OpenAPI\Client\Model\EntityStatus**](EntityStatus.md) |  | [optional]
**tracking_urls** | [**\OpenAPI\Client\Model\TrackingUrls**](TrackingUrls.md) |  | [optional]
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional]
**lead_form_id** | **string** | Lead form ID for lead ad generation. | [optional]
**grid_click_type** | [**\OpenAPI\Client\Model\GridClickType**](GridClickType.md) |  | [optional]
**customizable_cta_type** | **string** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional]
**quiz_pin_data** | [**\OpenAPI\Client\Model\QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional]
**id** | **string** | The ID of this ad. |
**pin_id** | **string** | Pin ID. This field may only be updated for draft ads. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
