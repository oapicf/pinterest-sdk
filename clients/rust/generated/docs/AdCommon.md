# AdCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | Option<**String**> | ID of the ad group that contains the ad. | [optional]
**android_deep_link** | Option<**String**> | Deep link URL for Android devices. | [optional]
**carousel_android_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on Android. | [optional]
**carousel_destination_urls** | Option<**Vec<String>**> | Comma-separated destination URLs for the carousel pin to promote. | [optional]
**carousel_ios_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on iOS. | [optional]
**click_tracking_url** | Option<**String**> | Tracking url for the ad clicks. | [optional]
**creative_type** | Option<[**models::CreativeType**](CreativeType.md)> |  | [optional]
**destination_url** | Option<**String**> | Destination URL. | [optional]
**ios_deep_link** | Option<**String**> | Deep link URL for iOS devices. | [optional]
**is_pin_deleted** | Option<**bool**> | Is original pin deleted? | [optional]
**is_removable** | Option<**bool**> | Is pin repinnable? | [optional]
**name** | Option<**String**> | Name of the ad - 255 chars max. | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]
**tracking_urls** | Option<[**models::TrackingUrls**](TrackingUrls.md)> |  | [optional]
**view_tracking_url** | Option<**String**> | Tracking URL for ad impressions. | [optional]
**lead_form_id** | Option<**String**> | Lead form ID for lead ad generation. | [optional]
**grid_click_type** | Option<[**models::GridClickType**](GridClickType.md)> |  | [optional]
**customizable_cta_type** | Option<**String**> | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional]
**quiz_pin_data** | Option<[**models::QuizPinData**](QuizPinData.md)> | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


