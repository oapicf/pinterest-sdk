# ad_create_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **char \*** | ID of the ad group that contains the ad. | 
**android_deep_link** | **char \*** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carousel_android_deep_links** | **list_t \*** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **list_t \*** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **list_t \*** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **char \*** | Tracking url for the ad clicks. | [optional] 
**creative_type** | **creative_type_t \*** |  | 
**destination_url** | **char \*** | Destination URL. | [optional] 
**ios_deep_link** | **char \*** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**is_pin_deleted** | **int** | Is original pin deleted? | [optional] 
**is_removable** | **int** | Is pin repinnable? | [optional] 
**name** | **char \*** | Name of the ad - 255 chars max. | [optional] 
**status** | **entity_status_t \*** |  | [optional] 
**tracking_urls** | [**ad_common_tracking_urls_t**](ad_common_tracking_urls.md) \* |  | [optional] 
**view_tracking_url** | **char \*** | Tracking URL for ad impressions. | [optional] 
**lead_form_id** | **char \*** | Lead form ID for lead ad generation. | [optional] 
**grid_click_type** | **grid_click_type_t \*** |  | [optional] 
**customizable_cta_type** | **pinterest_rest_api_ad_create_request_CUSTOMIZABLECTATYPE_e** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**quiz_pin_data** | [**ad_common_quiz_pin_data_t**](ad_common_quiz_pin_data.md) \* |  | [optional] 
**pin_id** | **char \*** | Pin ID. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


