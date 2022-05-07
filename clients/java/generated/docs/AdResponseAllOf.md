

# AdResponseAllOf

Creation fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. |  [optional]
**carouselAndroidDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | **List&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. |  [optional]
**creativeType** | [**CreativeTypeEnum**](#CreativeTypeEnum) | Ad creative type enum |  [optional]
**destinationUrl** | **String** | Destination URL. |  [optional]
**iosDeepLink** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. |  [optional]
**isPinDeleted** | **Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | **Boolean** | Is pin repinnable? |  [optional]
**name** | **String** | Name of the ad - 255 chars max. |  [optional]
**pinId** | **String** | Pin ID. |  [optional]
**status** | **EntityStatus** |  |  [optional]
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional]
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. |  [optional]



## Enum: CreativeTypeEnum

Name | Value
---- | -----
REGULAR | &quot;REGULAR&quot;
VIDEO | &quot;VIDEO&quot;
SHOPPING | &quot;SHOPPING&quot;
CAROUSEL | &quot;CAROUSEL&quot;
MAX_VIDEO | &quot;MAX_VIDEO&quot;
SHOP_THE_PIN | &quot;SHOP_THE_PIN&quot;
STORY | &quot;STORY&quot;



