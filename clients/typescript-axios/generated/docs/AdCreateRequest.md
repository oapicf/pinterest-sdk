# AdCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group that contains the ad. | [default to undefined]
**android_deep_link** | **string** | Deep link URL for Android devices. | [optional] [default to undefined]
**carousel_android_deep_links** | **Array&lt;string&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to undefined]
**carousel_destination_urls** | **Array&lt;string&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to undefined]
**carousel_ios_deep_links** | **Array&lt;string&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to undefined]
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional] [default to undefined]
**creative_type** | [**CreativeType**](CreativeType.md) |  | [default to undefined]
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] [default to undefined]
**destination_url** | **string** | Destination URL. | [optional] [default to undefined]
**disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] [default to undefined]
**disclosure_url** | **string** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] [default to undefined]
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] [default to undefined]
**ios_deep_link** | **string** | Deep link URL for iOS devices. | [optional] [default to undefined]
**is_pin_deleted** | **boolean** | Is original pin deleted? | [optional] [default to undefined]
**is_removable** | **boolean** | Is pin repinnable? | [optional] [default to undefined]
**lead_form_id** | **string** | Lead form ID for lead ad generation. | [optional] [default to undefined]
**name** | **string** | Name of the ad - 255 chars max. | [optional] [default to undefined]
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to undefined]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional] [default to undefined]
**pin_id** | **string** | Pin ID. | [default to undefined]

## Example

```typescript
import { AdCreateRequest } from './api';

const instance: AdCreateRequest = {
    ad_group_id,
    android_deep_link,
    carousel_android_deep_links,
    carousel_destination_urls,
    carousel_ios_deep_links,
    click_tracking_url,
    creative_type,
    customizable_cta_type,
    destination_url,
    disclosure_type,
    disclosure_url,
    grid_click_type,
    ios_deep_link,
    is_pin_deleted,
    is_removable,
    lead_form_id,
    name,
    quiz_pin_data,
    status,
    tracking_urls,
    view_tracking_url,
    pin_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
