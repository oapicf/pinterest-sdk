# PinterestSdkClient::AdCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_id** | **String** | ID of the ad group that contains the ad. |  |
| **android_deep_link** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] |
| **carousel_android_deep_links** | **Array&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] |
| **carousel_destination_urls** | **Array&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] |
| **carousel_ios_deep_links** | **Array&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] |
| **click_tracking_url** | **String** | Tracking url for the ad clicks. | [optional] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  |  |
| **destination_url** | **String** | Destination URL. | [optional] |
| **ios_deep_link** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] |
| **is_pin_deleted** | **Boolean** | Is original pin deleted? | [optional] |
| **is_removable** | **Boolean** | Is pin repinnable? | [optional] |
| **name** | **String** | Name of the ad - 255 chars max. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **tracking_urls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] |
| **view_tracking_url** | **String** | Tracking URL for ad impressions. | [optional] |
| **lead_form_id** | **String** | Lead form ID for lead ad generation. | [optional] |
| **grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] |
| **customizable_cta_type** | **String** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] |
| **quiz_pin_data** | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  | [optional] |
| **pin_id** | **String** | Pin ID. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdCreateRequest.new(
  ad_group_id: 2680059592705,
  android_deep_link: null,
  carousel_android_deep_links: null,
  carousel_destination_urls: null,
  carousel_ios_deep_links: null,
  click_tracking_url: null,
  creative_type: null,
  destination_url: null,
  ios_deep_link: null,
  is_pin_deleted: false,
  is_removable: false,
  name: null,
  status: null,
  tracking_urls: null,
  view_tracking_url: null,
  lead_form_id: null,
  grid_click_type: null,
  customizable_cta_type: LEARN_MORE,
  quiz_pin_data: null,
  pin_id: 394205773611545468
)
```

