# WWW::OpenAPIClient::Object::AdUpdateRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdUpdateRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group that contains the ad. | [optional] 
**android_deep_link** | **string** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carousel_android_deep_links** | **ARRAY[string]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **ARRAY[string]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **ARRAY[string]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] 
**destination_url** | **string** | Destination URL. | [optional] 
**ios_deep_link** | **string** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**is_pin_deleted** | **boolean** | Is original pin deleted? | [optional] 
**is_removable** | **boolean** | Is pin repinnable? | [optional] 
**name** | **string** | Name of the ad - 255 chars max. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_urls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional] 
**lead_form_id** | **string** | Lead form ID for lead ad generation. | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 
**customizable_cta_type** | **string** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**quiz_pin_data** | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  | [optional] 
**id** | **string** | The ID of this ad. | 
**pin_id** | **string** | Pin ID. This field may only be updated for draft ads. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


