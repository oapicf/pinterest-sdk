# PinterestSdk.AdResponseAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. | [optional] 
**androidDeepLink** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carouselAndroidDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **[String]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**creativeType** | **String** | Ad creative type enum | [optional] 
**destinationUrl** | **String** | Destination URL. | [optional] 
**iosDeepLink** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**isPinDeleted** | **Boolean** | Is original pin deleted? | [optional] 
**isRemovable** | **Boolean** | Is pin repinnable? | [optional] 
**name** | **String** | Name of the ad - 255 chars max. | [optional] 
**pinId** | **String** | Pin ID. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 



## Enum: CreativeTypeEnum


* `REGULAR` (value: `"REGULAR"`)

* `VIDEO` (value: `"VIDEO"`)

* `SHOPPING` (value: `"SHOPPING"`)

* `CAROUSEL` (value: `"CAROUSEL"`)

* `MAX_VIDEO` (value: `"MAX_VIDEO"`)

* `SHOP_THE_PIN` (value: `"SHOP_THE_PIN"`)

* `STORY` (value: `"STORY"`)




