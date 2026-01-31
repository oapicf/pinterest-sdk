# PinterestSdkClient::ConversionEventsDataInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action_source** | **String** | &lt;p&gt;The source indicating where the conversion event occurred.&lt;/p&gt; - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; |  |
| **app_id** | **String** | The app store app ID. | [optional] |
| **app_info** | [**ConversionEventAppInfo**](ConversionEventAppInfo.md) |  | [optional] |
| **app_name** | **String** | Name of the app. | [optional] |
| **app_version** | **String** | Version of the app. | [optional] |
| **custom_data** | [**ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional] |
| **device_brand** | **String** | Brand of the user device. | [optional] |
| **device_carrier** | **String** | User device&#39;s mobile carrier. | [optional] |
| **device_info** | [**ConversionEventDeviceInfo**](ConversionEventDeviceInfo.md) |  | [optional] |
| **device_model** | **String** | Model of the user device. | [optional] |
| **device_type** | **String** | Type of the user device. | [optional] |
| **event_id** | **String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. |  |
| **event_name** | **String** | &lt;p&gt;The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.&lt;/p&gt;  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;checkout&#x60; - &#x60;custom&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; |  |
| **event_source_url** | **String** | URL of the web conversion event. | [optional] |
| **event_time** | **Integer** | The time when the event happened. Unix timestamp in seconds. |  |
| **language** | **String** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] |
| **opt_out** | **Boolean** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] |
| **os_version** | **String** | Version of the device operating system. | [optional] |
| **partner_name** | **String** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] |
| **user_data** | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  |  |
| **wifi** | **Boolean** | Whether the event occurred when the user device was connected to wifi. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEventsDataInner.new(
  action_source: app_ios,
  app_id: 429047995,
  app_info: null,
  app_name: Pinterest,
  app_version: 7.9,
  custom_data: null,
  device_brand: Apple,
  device_carrier: T-Mobile,
  device_info: null,
  device_model: iPhone X,
  device_type: iPhone,
  event_id: eventId0001,
  event_name: checkout,
  event_source_url: https://www.my-clothing-shop.org/,
  event_time: 1451431341,
  language: en,
  opt_out: false,
  os_version: 12.1.4,
  partner_name: ss-partnername,
  user_data: null,
  wifi: false
)
```

