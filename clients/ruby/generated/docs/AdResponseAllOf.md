# PinterestSdkClient::AdResponseAllOf

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

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdResponseAllOf.new(
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
  view_tracking_url: null
)
```

