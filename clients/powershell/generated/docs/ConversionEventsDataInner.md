# ConversionEventsDataInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventName** | **String** | The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt; | 
**ActionSource** | **String** | The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt; | 
**EventTime** | **Int64** | The time when the event happened. Unix timestamp in seconds. | 
**EventId** | **String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**EventSourceUrl** | **String** | URL of the web conversion event. | [optional] 
**OptOut** | **Boolean** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**PartnerName** | **String** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is &quot;&quot;ss-partnername&quot;&quot; lowercase. E.g ‘ss-shopify’ | [optional] 
**UserData** | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  | 
**CustomData** | [**ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional] 
**AppId** | **String** | The app store app ID. | [optional] 
**AppName** | **String** | Name of the app. | [optional] 
**AppVersion** | **String** | Version of the app. | [optional] 
**DeviceBrand** | **String** | Brand of the user device. | [optional] 
**DeviceCarrier** | **String** | User device&#39;s mobile carrier. | [optional] 
**DeviceModel** | **String** | Model of the user device. | [optional] 
**DeviceType** | **String** | Type of the user device. | [optional] 
**OsVersion** | **String** | Version of the device operating system. | [optional] 
**Wifi** | **Boolean** | Whether the event occurred when the user device was connected to wifi. | [optional] 
**Language** | **String** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventsDataInner = Initialize-PSOpenAPIToolsConversionEventsDataInner  -EventName checkout `
 -ActionSource app_ios `
 -EventTime 1451431341 `
 -EventId eventId0001 `
 -EventSourceUrl https://www.my-clothing-shop.org/ `
 -OptOut false `
 -PartnerName ss-partnername `
 -UserData null `
 -CustomData null `
 -AppId 429047995 `
 -AppName Pinterest `
 -AppVersion 7.9 `
 -DeviceBrand Apple `
 -DeviceCarrier T-Mobile `
 -DeviceModel iPhone X `
 -DeviceType iPhone `
 -OsVersion 12.1.4 `
 -Wifi false `
 -Language en
```

- Convert the resource to JSON
```powershell
$ConversionEventsDataInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

