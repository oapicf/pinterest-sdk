# CONVERSION_EVENTS_DATA_INNER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_name** | [**STRING_32**](STRING_32.md) | The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt; | [default to null]
**action_source** | [**STRING_32**](STRING_32.md) | The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt; | [default to null]
**event_time** | **INTEGER_64** | The time when the event happened. Unix timestamp in seconds. | [default to null]
**event_id** | [**STRING_32**](STRING_32.md) | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | [default to null]
**event_source_url** | [**STRING_32**](STRING_32.md) | URL of the web conversion event. | [optional] [default to null]
**opt_out** | **BOOLEAN** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] [default to null]
**partner_name** | [**STRING_32**](STRING_32.md) | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] [default to null]
**user_data** | [**CONVERSION_EVENTS_USER_DATA**](ConversionEventsUserData.md) |  | [default to null]
**custom_data** | [**CONVERSION_EVENTS_DATA_INNER_CUSTOM_DATA**](ConversionEvents_data_inner_custom_data.md) |  | [optional] [default to null]
**app_id** | [**STRING_32**](STRING_32.md) | The app store app ID. | [optional] [default to null]
**app_name** | [**STRING_32**](STRING_32.md) | Name of the app. | [optional] [default to null]
**app_version** | [**STRING_32**](STRING_32.md) | Version of the app. | [optional] [default to null]
**device_brand** | [**STRING_32**](STRING_32.md) | Brand of the user device. | [optional] [default to null]
**device_carrier** | [**STRING_32**](STRING_32.md) | User device&#39;s mobile carrier. | [optional] [default to null]
**device_model** | [**STRING_32**](STRING_32.md) | Model of the user device. | [optional] [default to null]
**device_type** | [**STRING_32**](STRING_32.md) | Type of the user device. | [optional] [default to null]
**os_version** | [**STRING_32**](STRING_32.md) | Version of the device operating system. | [optional] [default to null]
**wifi** | **BOOLEAN** | Whether the event occurred when the user device was connected to wifi. | [optional] [default to null]
**language** | [**STRING_32**](STRING_32.md) | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


