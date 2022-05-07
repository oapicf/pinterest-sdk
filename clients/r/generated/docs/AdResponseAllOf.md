# openapi::AdResponseAllOf

Creation fields

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


