# ConversionEventsDataInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionSource** | **String** | &lt;p&gt;The source indicating where the conversion event occurred.&lt;/p&gt; - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; | 
**AppId** | **String** | The app store app ID. | [optional] 
**AppInfo** | [**ConversionEventAppInfo**](ConversionEventAppInfo.md) |  | [optional] 
**AppName** | **String** | Name of the app. | [optional] 
**AppVersion** | **String** | Version of the app. | [optional] 
**CustomData** | [**ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional] 
**DeviceBrand** | **String** | Brand of the user device. | [optional] 
**DeviceCarrier** | **String** | User device&#39;s mobile carrier. | [optional] 
**DeviceInfo** | [**ConversionEventDeviceInfo**](ConversionEventDeviceInfo.md) |  | [optional] 
**DeviceModel** | **String** | Model of the user device. | [optional] 
**DeviceType** | **String** | Type of the user device. | [optional] 
**EventId** | **String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**EventName** | **String** | &lt;p&gt;The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.&lt;/p&gt;  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;checkout&#x60; - &#x60;custom&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; | 
**EventSourceUrl** | **String** | URL of the web conversion event. | [optional] 
**EventTime** | **Int64** | The time when the event happened. Unix timestamp in seconds. | 
**Language** | **String** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 
**OptOut** | **Boolean** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**OsVersion** | **String** | Version of the device operating system. | [optional] 
**PartnerName** | **String** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is &quot;&quot;ss-partnername&quot;&quot; lowercase. E.g ‘ss-shopify’ | [optional] 
**UserData** | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  | 
**Wifi** | **Boolean** | Whether the event occurred when the user device was connected to wifi. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventsDataInner = Initialize-PSOpenAPIToolsConversionEventsDataInner  -ActionSource app_ios `
 -AppId 429047995 `
 -AppInfo null `
 -AppName Pinterest `
 -AppVersion 7.9 `
 -CustomData null `
 -DeviceBrand Apple `
 -DeviceCarrier T-Mobile `
 -DeviceInfo null `
 -DeviceModel iPhone X `
 -DeviceType iPhone `
 -EventId eventId0001 `
 -EventName checkout `
 -EventSourceUrl https://www.my-clothing-shop.org/ `
 -EventTime 1451431341 `
 -Language en `
 -OptOut false `
 -OsVersion 12.1.4 `
 -PartnerName ss-partnername `
 -UserData null `
 -Wifi false
```

- Convert the resource to JSON
```powershell
$ConversionEventsDataInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

