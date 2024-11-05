# openapi::ConversionEventsDataInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_name** | **character** | &lt;p&gt;The type of the user event. Please use the right event_name otherwise the event won&#39;t be accepted and show up correctly in reports.   &lt;ul&gt;   &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;custom&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;lead&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;search&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt;  | 
**action_source** | **character** | &lt;p&gt;   The source indicating where the conversion event occurred.   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;web&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt;  | 
**event_time** | **integer** | The time when the event happened. Unix timestamp in seconds. | 
**event_id** | **character** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**event_source_url** | **character** | URL of the web conversion event. | [optional] 
**opt_out** | **character** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**partner_name** | **character** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] 
**user_data** | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  | 
**custom_data** | [**ConversionEventsDataInnerCustomData**](ConversionEvents_data_inner_custom_data.md) |  | [optional] 
**app_id** | **character** | The app store app ID. | [optional] 
**app_name** | **character** | Name of the app. | [optional] 
**app_version** | **character** | Version of the app. | [optional] 
**device_brand** | **character** | Brand of the user device. | [optional] 
**device_carrier** | **character** | User device&#39;s mobile carrier. | [optional] 
**device_model** | **character** | Model of the user device. | [optional] 
**device_type** | **character** | Type of the user device. | [optional] 
**os_version** | **character** | Version of the device operating system. | [optional] 
**wifi** | **character** | Whether the event occurred when the user device was connected to wifi. | [optional] 
**language** | **character** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 


