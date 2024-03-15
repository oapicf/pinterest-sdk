# PinterestSdkClient::ConversionEventsDataInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_name** | **String** | The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt; |  |
| **action_source** | **String** | The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt; |  |
| **event_time** | **Integer** | The time when the event happened. Unix timestamp in seconds. |  |
| **event_id** | **String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. |  |
| **event_source_url** | **String** | URL of the web conversion event. | [optional] |
| **opt_out** | **Boolean** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] |
| **partner_name** | **String** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] |
| **user_data** | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  |  |
| **custom_data** | [**ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional] |
| **app_id** | **String** | The app store app ID. | [optional] |
| **app_name** | **String** | Name of the app. | [optional] |
| **app_version** | **String** | Version of the app. | [optional] |
| **device_brand** | **String** | Brand of the user device. | [optional] |
| **device_carrier** | **String** | User device&#39;s mobile carrier. | [optional] |
| **device_model** | **String** | Model of the user device. | [optional] |
| **device_type** | **String** | Type of the user device. | [optional] |
| **os_version** | **String** | Version of the device operating system. | [optional] |
| **wifi** | **Boolean** | Whether the event occurred when the user device was connected to wifi. | [optional] |
| **language** | **String** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionEventsDataInner.new(
  event_name: checkout,
  action_source: app_ios,
  event_time: 1451431341,
  event_id: eventId0001,
  event_source_url: https://www.my-clothing-shop.org/,
  opt_out: false,
  partner_name: ss-partnername,
  user_data: null,
  custom_data: null,
  app_id: 429047995,
  app_name: Pinterest,
  app_version: 7.9,
  device_brand: Apple,
  device_carrier: T-Mobile,
  device_model: iPhone X,
  device_type: iPhone,
  os_version: 12.1.4,
  wifi: false,
  language: en
)
```

