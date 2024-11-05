# ConversionEventsDataInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventName** | **string** | &lt;p&gt;The type of the user event. Please use the right event_name otherwise the event won&#39;t be accepted and show up correctly in reports.   &lt;ul&gt;   &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;custom&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;lead&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;search&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt; | 
**actionSource** | **string** | &lt;p&gt;   The source indicating where the conversion event occurred.   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;web&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt; | 
**eventTime** | **int** | The time when the event happened. Unix timestamp in seconds. | 
**eventId** | **string** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**eventSourceUrl** | **string** | URL of the web conversion event. | [optional] 
**optOut** | **bool** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**partnerName** | **string** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] 
**userData** | [**OpenAPI\Server\Model\ConversionEventsUserData**](ConversionEventsUserData.md) |  | 
**customData** | [**OpenAPI\Server\Model\ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional] 
**appId** | **string** | The app store app ID. | [optional] 
**appName** | **string** | Name of the app. | [optional] 
**appVersion** | **string** | Version of the app. | [optional] 
**deviceBrand** | **string** | Brand of the user device. | [optional] 
**deviceCarrier** | **string** | User device&#39;s mobile carrier. | [optional] 
**deviceModel** | **string** | Model of the user device. | [optional] 
**deviceType** | **string** | Type of the user device. | [optional] 
**osVersion** | **string** | Version of the device operating system. | [optional] 
**wifi** | **bool** | Whether the event occurred when the user device was connected to wifi. | [optional] 
**language** | **string** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


