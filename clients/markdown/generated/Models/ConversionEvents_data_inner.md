# ConversionEvents_data_inner
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **event\_name** | **String** | The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt; | [default to null] |
| **action\_source** | **String** | The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt; | [default to null] |
| **event\_time** | **Long** | The time when the event happened. Unix timestamp in seconds. | [default to null] |
| **event\_id** | **String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | [default to null] |
| **event\_source\_url** | **String** | URL of the web conversion event. | [optional] [default to null] |
| **opt\_out** | **Boolean** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] [default to null] |
| **partner\_name** | **String** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] [default to null] |
| **user\_data** | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  | [default to null] |
| **custom\_data** | [**ConversionEvents_data_inner_custom_data**](ConversionEvents_data_inner_custom_data.md) |  | [optional] [default to null] |
| **app\_id** | **String** | The app store app ID. | [optional] [default to null] |
| **app\_name** | **String** | Name of the app. | [optional] [default to null] |
| **app\_version** | **String** | Version of the app. | [optional] [default to null] |
| **device\_brand** | **String** | Brand of the user device. | [optional] [default to null] |
| **device\_carrier** | **String** | User device&#39;s mobile carrier. | [optional] [default to null] |
| **device\_model** | **String** | Model of the user device. | [optional] [default to null] |
| **device\_type** | **String** | Type of the user device. | [optional] [default to null] |
| **os\_version** | **String** | Version of the device operating system. | [optional] [default to null] |
| **wifi** | **Boolean** | Whether the event occurred when the user device was connected to wifi. | [optional] [default to null] |
| **language** | **String** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

