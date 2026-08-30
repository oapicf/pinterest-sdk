# Ad


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the advertiser that this ad belongs to. | [readonly] [default to undefined]
**ad_group_id** | **string** | ID of the ad group that contains the ad. | [default to undefined]
**android_deep_link** | **string** | Deep link URL for Android devices. | [optional] [default to undefined]
**campaign_id** | **string** | ID of the ad campaign that contains this ad. | [readonly] [default to undefined]
**carousel_android_deep_links** | **Array&lt;string&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to undefined]
**carousel_destination_urls** | **Array&lt;string&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to undefined]
**carousel_ios_deep_links** | **Array&lt;string&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to undefined]
**carting_platform_type** | **number** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] [default to undefined]
**carting_products** | [**Array&lt;CartingProduct&gt;**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] [default to undefined]
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional] [default to undefined]
**collection_items_destination_url_template** | **string** | Destination URL template for all items within a collections drawer. | [optional] [default to undefined]
**collections_header_type** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] [default to undefined]
**created_time** | **number** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**creative_type** | [**CreativeType**](CreativeType.md) |  | [default to undefined]
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] [default to undefined]
**destination_url** | **string** | Destination URL. | [optional] [default to undefined]
**disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] [default to undefined]
**disclosure_url** | **string** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] [default to undefined]
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] [default to undefined]
**id** | **string** | The ID of this ad. | [default to undefined]
**ios_deep_link** | **string** | Deep link URL for iOS devices. | [optional] [default to undefined]
**is_carting** | **boolean** | Is the ad a carting/WTB ad? | [optional] [default to undefined]
**is_collage_accepted_terms** | **boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] [default to undefined]
**is_collage_single_destination** | **boolean** | Whether the collage ad has a single destination url override. | [optional] [default to undefined]
**is_pin_deleted** | **boolean** | Is original pin deleted? | [optional] [default to undefined]
**is_removable** | **boolean** | Is pin repinnable? | [optional] [default to undefined]
**lead_form_id** | **string** | Lead form ID for lead ad generation. | [optional] [default to undefined]
**name** | **string** | Name of the ad - 255 chars max. | [optional] [default to undefined]
**pin_id** | **string** | Pin ID. This field may only be updated for draft ads. | [default to undefined]
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to undefined]
**rejected_reasons** | [**Array&lt;AdDisapprovalReasons&gt;**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] [default to undefined]
**rejection_labels** | **Array&lt;string&gt;** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] [default to undefined]
**review_status** | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] [default to undefined]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to undefined]
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]
**type** | **string** | Always \&quot;ad\&quot;. | [readonly] [default to undefined]
**updated_time** | **number** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional] [default to undefined]

## Example

```typescript
import { Ad } from './api';

const instance: Ad = {
    ad_account_id,
    ad_group_id,
    android_deep_link,
    campaign_id,
    carousel_android_deep_links,
    carousel_destination_urls,
    carousel_ios_deep_links,
    carting_platform_type,
    carting_products,
    click_tracking_url,
    collection_items_destination_url_template,
    collections_header_type,
    created_time,
    creative_type,
    customizable_cta_type,
    destination_url,
    disclosure_type,
    disclosure_url,
    grid_click_type,
    id,
    ios_deep_link,
    is_carting,
    is_collage_accepted_terms,
    is_collage_single_destination,
    is_pin_deleted,
    is_removable,
    lead_form_id,
    name,
    pin_id,
    quiz_pin_data,
    rejected_reasons,
    rejection_labels,
    review_status,
    status,
    summary_status,
    tracking_urls,
    type,
    updated_time,
    view_tracking_url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
