# ConversionEventsDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_name** | **string** | &lt;p&gt;The type of the user event. Please use the right event_name otherwise the event won\&#39;t be accepted and show up correctly in reports.   &lt;ul&gt;   &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;custom&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;lead&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;search&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt;  | [default to undefined]
**action_source** | **string** | &lt;p&gt;   The source indicating where the conversion event occurred.   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;web&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt;  | [default to undefined]
**event_time** | **number** | The time when the event happened. Unix timestamp in seconds. | [default to undefined]
**event_id** | **string** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event\&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | [default to undefined]
**event_source_url** | **string** | URL of the web conversion event. | [optional] [default to undefined]
**opt_out** | **boolean** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] [default to undefined]
**partner_name** | **string** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] [default to undefined]
**user_data** | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  | [default to undefined]
**custom_data** | [**ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional] [default to undefined]
**app_id** | **string** | The app store app ID. | [optional] [default to undefined]
**app_name** | **string** | Name of the app. | [optional] [default to undefined]
**app_version** | **string** | Version of the app. | [optional] [default to undefined]
**device_brand** | **string** | Brand of the user device. | [optional] [default to undefined]
**device_carrier** | **string** | User device\&#39;s mobile carrier. | [optional] [default to undefined]
**device_model** | **string** | Model of the user device. | [optional] [default to undefined]
**device_type** | **string** | Type of the user device. | [optional] [default to undefined]
**os_version** | **string** | Version of the device operating system. | [optional] [default to undefined]
**wifi** | **boolean** | Whether the event occurred when the user device was connected to wifi. | [optional] [default to undefined]
**language** | **string** | Two-character ISO-639-1 language code indicating the user\&#39;s language. | [optional] [default to undefined]

## Example

```typescript
import { ConversionEventsDataInner } from './api';

const instance: ConversionEventsDataInner = {
    event_name,
    action_source,
    event_time,
    event_id,
    event_source_url,
    opt_out,
    partner_name,
    user_data,
    custom_data,
    app_id,
    app_name,
    app_version,
    device_brand,
    device_carrier,
    device_model,
    device_type,
    os_version,
    wifi,
    language,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
