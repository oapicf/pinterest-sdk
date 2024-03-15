# AdCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **String** | ID of the ad group that contains the ad. | 
**android_deep_link** | Option<**String**> | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional]
**carousel_android_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on Android. | [optional]
**carousel_destination_urls** | Option<**Vec<String>**> | Comma-separated destination URLs for the carousel pin to promote. | [optional]
**carousel_ios_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on iOS. | [optional]
**click_tracking_url** | Option<**String**> | Tracking url for the ad clicks. | [optional]
**creative_type** | [**models::CreativeType**](CreativeType.md) |  | 
**destination_url** | Option<**String**> | Destination URL. | [optional]
**ios_deep_link** | Option<**String**> | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional]
**is_pin_deleted** | Option<**bool**> | Is original pin deleted? | [optional]
**is_removable** | Option<**bool**> | Is pin repinnable? | [optional]
**name** | Option<**String**> | Name of the ad - 255 chars max. | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]
**tracking_urls** | Option<[**models::AdCommonTrackingUrls**](AdCommon_tracking_urls.md)> |  | [optional]
**view_tracking_url** | Option<**String**> | Tracking URL for ad impressions. | [optional]
**lead_form_id** | Option<**String**> | Lead form ID for lead ad generation. | [optional]
**grid_click_type** | Option<[**models::GridClickType**](GridClickType.md)> |  | [optional]
**customizable_cta_type** | Option<**String**> | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional]
**quiz_pin_data** | Option<[**models::AdCommonQuizPinData**](AdCommon_quiz_pin_data.md)> |  | [optional]
**pin_id** | **String** | Pin ID. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


