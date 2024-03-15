
# Table `ConversionEvents_data_inner`
(mapped from: ConversionEventsDataInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**eventName** | event_name | text NOT NULL |  | **kotlin.String** | The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt; | 
**actionSource** | action_source | text NOT NULL |  | **kotlin.String** | The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt; | 
**eventTime** | event_time | long NOT NULL |  | **kotlin.Long** | The time when the event happened. Unix timestamp in seconds. | 
**eventId** | event_id | text NOT NULL |  | **kotlin.String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**userData** | user_data | long NOT NULL |  | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  |  [foreignkey]
**eventSourceUrl** | event_source_url | text |  | **kotlin.String** | URL of the web conversion event. |  [optional]
**optOut** | opt_out | boolean |  | **kotlin.Boolean** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. |  [optional]
**partnerName** | partner_name | text |  | **kotlin.String** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ |  [optional]
**customData** | custom_data | long |  | [**ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  |  [optional] [foreignkey]
**appId** | app_id | text |  | **kotlin.String** | The app store app ID. |  [optional]
**appName** | app_name | text |  | **kotlin.String** | Name of the app. |  [optional]
**appVersion** | app_version | text |  | **kotlin.String** | Version of the app. |  [optional]
**deviceBrand** | device_brand | text |  | **kotlin.String** | Brand of the user device. |  [optional]
**deviceCarrier** | device_carrier | text |  | **kotlin.String** | User device&#39;s mobile carrier. |  [optional]
**deviceModel** | device_model | text |  | **kotlin.String** | Model of the user device. |  [optional]
**deviceType** | device_type | text |  | **kotlin.String** | Type of the user device. |  [optional]
**osVersion** | os_version | text |  | **kotlin.String** | Version of the device operating system. |  [optional]
**wifi** | wifi | boolean |  | **kotlin.Boolean** | Whether the event occurred when the user device was connected to wifi. |  [optional]
**language** | language | text |  | **kotlin.String** | Two-character ISO-639-1 language code indicating the user&#39;s language. |  [optional]





















