# AdResponseAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | Option<**String**> | ID of the ad group that contains the ad. | [optional]
**android_deep_link** | Option<**String**> | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional]
**carousel_android_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on Android. | [optional]
**carousel_destination_urls** | Option<**Vec<String>**> | Comma-separated destination URLs for the carousel pin to promote. | [optional]
**carousel_ios_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on iOS. | [optional]
**click_tracking_url** | Option<**String**> | Tracking url for the ad clicks. | [optional]
**creative_type** | Option<**String**> | Ad creative type enum | [optional]
**destination_url** | Option<**String**> | Destination URL. | [optional]
**ios_deep_link** | Option<**String**> | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional]
**is_pin_deleted** | Option<**bool**> | Is original pin deleted? | [optional]
**is_removable** | Option<**bool**> | Is pin repinnable? | [optional]
**name** | Option<**String**> | Name of the ad - 255 chars max. | [optional]
**pin_id** | Option<**String**> | Pin ID. | [optional]
**status** | Option<[**crate::models::EntityStatus**](EntityStatus.md)> |  | [optional]
**tracking_urls** | Option<[**crate::models::TrackingUrls**](TrackingUrls.md)> |  | [optional]
**view_tracking_url** | Option<**String**> | Tracking URL for ad impressions. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


