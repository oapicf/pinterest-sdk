# # AdResponseAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group that contains the ad. | [optional]
**android_deep_link** | **string** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional]
**carousel_android_deep_links** | **string[]** | Comma-separated deep links for the carousel pin on Android. | [optional]
**carousel_destination_urls** | **string[]** | Comma-separated destination URLs for the carousel pin to promote. | [optional]
**carousel_ios_deep_links** | **string[]** | Comma-separated deep links for the carousel pin on iOS. | [optional]
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional]
**creative_type** | **string** | Ad creative type enum | [optional]
**destination_url** | **string** | Destination URL. | [optional]
**ios_deep_link** | **string** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional]
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional]
**is_removable** | **bool** | Is pin repinnable? | [optional]
**name** | **string** | Name of the ad - 255 chars max. | [optional]
**pin_id** | **string** | Pin ID. | [optional]
**status** | [**\OpenAPI\Client\Model\EntityStatus**](EntityStatus.md) |  | [optional]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional]
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
