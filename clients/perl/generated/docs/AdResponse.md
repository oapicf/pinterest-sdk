# WWW::OpenAPIClient::Object::AdResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdResponse;
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
**creative_type** | **string** | Ad creative type enum | [optional] 
**destination_url** | **string** | Destination URL. | [optional] 
**ios_deep_link** | **string** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**is_pin_deleted** | **boolean** | Is original pin deleted? | [optional] 
**is_removable** | **boolean** | Is pin repinnable? | [optional] 
**name** | **string** | Name of the ad - 255 chars max. | [optional] 
**pin_id** | **string** | Pin ID. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional] 
**ad_account_id** | **string** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaign_id** | **string** | ID of the ad campaign that contains this ad. | [optional] 
**collection_items_destination_url_template** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**created_time** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **string** | The ID of this ad. | [optional] 
**rejected_reasons** | **ARRAY[string]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejection_labels** | **ARRAY[string]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**review_status** | **string** | Ad review status | [optional] 
**type** | **string** | Always \&quot;ad\&quot;. | [optional] 
**updated_time** | **int** | Last update time. Unix timestamp in seconds. | [optional] 
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


