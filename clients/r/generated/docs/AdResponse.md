# openapi::AdResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **character** | ID of the ad group that contains the ad. | [optional] 
**android_deep_link** | **character** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carousel_android_deep_links** | **array[character]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **array[character]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **array[character]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **character** | Tracking url for the ad clicks. | [optional] 
**creative_type** | **character** | Ad creative type enum | [optional] 
**destination_url** | **character** | Destination URL. | [optional] 
**ios_deep_link** | **character** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**is_pin_deleted** | **character** | Is original pin deleted? | [optional] 
**is_removable** | **character** | Is pin repinnable? | [optional] 
**name** | **character** | Name of the ad - 255 chars max. | [optional] 
**pin_id** | **character** | Pin ID. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**view_tracking_url** | **character** | Tracking URL for ad impressions. | [optional] 
**ad_account_id** | **character** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaign_id** | **character** | ID of the ad campaign that contains this ad. | [optional] 
**collection_items_destination_url_template** | **character** | Destination URL template for all items within a collections drawer. | [optional] 
**created_time** | **integer** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **character** | The ID of this ad. | [optional] 
**rejected_reasons** | **array[character]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejection_labels** | **array[character]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**review_status** | **character** | Ad review status | [optional] 
**type** | **character** | Always \&quot;ad\&quot;. | [optional] 
**updated_time** | **integer** | Last update time. Unix timestamp in seconds. | [optional] 
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 


