# PinterestSdkClient::AdResponseAllOf1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
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

instance = PinterestSdkClient::AdResponseAllOf1.new(
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

