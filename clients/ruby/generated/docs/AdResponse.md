# PinterestSdkClient::AdResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_id** | **String** | ID of the ad group that contains the ad. | [optional] |
| **android_deep_link** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] |
| **carousel_android_deep_links** | **Array&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] |
| **carousel_destination_urls** | **Array&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] |
| **carousel_ios_deep_links** | **Array&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] |
| **click_tracking_url** | **String** | Tracking url for the ad clicks. | [optional] |
| **creative_type** | **String** | Ad creative type enum | [optional] |
| **destination_url** | **String** | Destination URL. | [optional] |
| **ios_deep_link** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] |
| **is_pin_deleted** | **Boolean** | Is original pin deleted? | [optional] |
| **is_removable** | **Boolean** | Is pin repinnable? | [optional] |
| **name** | **String** | Name of the ad - 255 chars max. | [optional] |
| **pin_id** | **String** | Pin ID. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |
| **view_tracking_url** | **String** | Tracking URL for ad impressions. | [optional] |
| **ad_account_id** | **String** | The ID of the advertiser that this ad belongs to. | [optional] |
| **campaign_id** | **String** | ID of the ad campaign that contains this ad. | [optional] |
| **collection_items_destination_url_template** | **String** | Destination URL template for all items within a collections drawer. | [optional] |
| **created_time** | **Integer** | Pin creation time. Unix timestamp in seconds. | [optional] |
| **id** | **String** | The ID of this ad. | [optional] |
| **rejected_reasons** | **Array&lt;String&gt;** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] |
| **rejection_labels** | **Array&lt;String&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] |
| **review_status** | **String** | Ad review status | [optional] |
| **type** | **String** | Always \&quot;ad\&quot;. | [optional] |
| **updated_time** | **Integer** | Last update time. Unix timestamp in seconds. | [optional] |
| **summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdResponse.new(
  ad_group_id: 2680059592705,
  android_deep_link: null,
  carousel_android_deep_links: null,
  carousel_destination_urls: null,
  carousel_ios_deep_links: null,
  click_tracking_url: null,
  creative_type: REGULAR,
  destination_url: null,
  ios_deep_link: null,
  is_pin_deleted: false,
  is_removable: false,
  name: null,
  pin_id: 394205773611545468,
  status: null,
  tracking_urls: null,
  view_tracking_url: null,
  ad_account_id: 549755885175,
  campaign_id: 626735565838,
  collection_items_destination_url_template: null,
  created_time: 1451431341,
  id: 687195134316,
  rejected_reasons: null,
  rejection_labels: null,
  review_status: PENDING,
  type: pinpromotion,
  updated_time: 1451431341,
  summary_status: null
)
```

