# AdResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group that contains the ad. | [optional] [default to undefined]
**android_deep_link** | **string** | Deep link URL for Android devices. | [optional] [default to undefined]
**carousel_android_deep_links** | **Array&lt;string&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to undefined]
**carousel_destination_urls** | **Array&lt;string&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to undefined]
**carousel_ios_deep_links** | **Array&lt;string&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to undefined]
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional] [default to undefined]
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] [default to undefined]
**destination_url** | **string** | Destination URL. | [optional] [default to undefined]
**ios_deep_link** | **string** | Deep link URL for iOS devices. | [optional] [default to undefined]
**is_pin_deleted** | **boolean** | Is original pin deleted? | [optional] [default to undefined]
**is_removable** | **boolean** | Is pin repinnable? | [optional] [default to undefined]
**name** | **string** | Name of the ad - 255 chars max. | [optional] [default to undefined]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional] [default to undefined]
**lead_form_id** | **string** | Lead form ID for lead ad generation. | [optional] [default to undefined]
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] [default to undefined]
**customizable_cta_type** | **string** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] [default to undefined]
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to undefined]
**pin_id** | **string** | Pin ID. | [optional] [default to undefined]
**ad_account_id** | **string** | The ID of the advertiser that this ad belongs to. | [optional] [default to undefined]
**campaign_id** | **string** | ID of the ad campaign that contains this ad. | [optional] [default to undefined]
**collection_items_destination_url_template** | **string** | Destination URL template for all items within a collections drawer. | [optional] [default to undefined]
**created_time** | **number** | Pin creation time. Unix timestamp in seconds. | [optional] [default to undefined]
**id** | **string** | The ID of this ad. | [optional] [default to undefined]
**rejected_reasons** | **Array&lt;string&gt;** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to undefined]
**rejection_labels** | **Array&lt;string&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to undefined]
**review_status** | **string** | Ad review status | [optional] [default to undefined]
**type** | **string** | Always \&quot;ad\&quot;. | [optional] [default to undefined]
**updated_time** | **number** | Last update time. Unix timestamp in seconds. | [optional] [default to undefined]
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] [default to undefined]

## Example

```typescript
import { AdResponse } from './api';

const instance: AdResponse = {
    ad_group_id,
    android_deep_link,
    carousel_android_deep_links,
    carousel_destination_urls,
    carousel_ios_deep_links,
    click_tracking_url,
    creative_type,
    destination_url,
    ios_deep_link,
    is_pin_deleted,
    is_removable,
    name,
    status,
    tracking_urls,
    view_tracking_url,
    lead_form_id,
    grid_click_type,
    customizable_cta_type,
    quiz_pin_data,
    pin_id,
    ad_account_id,
    campaign_id,
    collection_items_destination_url_template,
    created_time,
    id,
    rejected_reasons,
    rejection_labels,
    review_status,
    type,
    updated_time,
    summary_status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
