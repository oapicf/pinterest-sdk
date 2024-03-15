# Org.OpenAPITools.Model.ConversionEventsDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventName** | **string** | The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt; | 
**ActionSource** | **string** | The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt; | 
**EventTime** | **long** | The time when the event happened. Unix timestamp in seconds. | 
**EventId** | **string** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**EventSourceUrl** | **string** | URL of the web conversion event. | [optional] 
**OptOut** | **bool** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**PartnerName** | **string** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] 
**UserData** | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  | 
**CustomData** | [**ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional] 
**AppId** | **string** | The app store app ID. | [optional] 
**AppName** | **string** | Name of the app. | [optional] 
**AppVersion** | **string** | Version of the app. | [optional] 
**DeviceBrand** | **string** | Brand of the user device. | [optional] 
**DeviceCarrier** | **string** | User device&#39;s mobile carrier. | [optional] 
**DeviceModel** | **string** | Model of the user device. | [optional] 
**DeviceType** | **string** | Type of the user device. | [optional] 
**OsVersion** | **string** | Version of the device operating system. | [optional] 
**Wifi** | **bool** | Whether the event occurred when the user device was connected to wifi. | [optional] 
**Language** | **string** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

