# WWW::OpenAPIClient::Object::AdCreateRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdCreateRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group that contains the ad. | 
**android_deep_link** | **string** | Deep link URL for Android devices. | [optional] 
**carousel_android_deep_links** | **ARRAY[string]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **ARRAY[string]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **ARRAY[string]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | 
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destination_url** | **string** | Destination URL. | [optional] 
**disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosure_url** | **string** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 
**ios_deep_link** | **string** | Deep link URL for iOS devices. | [optional] 
**is_pin_deleted** | **boolean** | Is original pin deleted? | [optional] 
**is_removable** | **boolean** | Is pin repinnable? | [optional] 
**lead_form_id** | **string** | Lead form ID for lead ad generation. | [optional] 
**name** | **string** | Name of the ad - 255 chars max. | [optional] 
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional] 
**pin_id** | **string** | Pin ID. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


