

# AdResponseAllOf

Creation fields

The class is defined in **[AdResponseAllOf.java](../../src/main/java/org/openapitools/model/AdResponseAllOf.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | `String` | ID of the ad group that contains the ad. |  [optional property]
**androidDeepLink** | `String` | Deep link URL for Android devices. Not currently available. Using this field will generate an error. |  [optional property]
**carouselAndroidDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on Android. |  [optional property]
**carouselDestinationUrls** | `List&lt;String&gt;` | Comma-separated destination URLs for the carousel pin to promote. |  [optional property]
**carouselIosDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on iOS. |  [optional property]
**clickTrackingUrl** | `String` | Tracking url for the ad clicks. |  [optional property]
**creativeType** | [**CreativeTypeEnum**](#CreativeTypeEnum) | Ad creative type enum |  [optional property]
**destinationUrl** | `String` | Destination URL. |  [optional property]
**iosDeepLink** | `String` | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. |  [optional property]
**isPinDeleted** | `Boolean` | Is original pin deleted? |  [optional property]
**isRemovable** | `Boolean` | Is pin repinnable? |  [optional property]
**name** | `String` | Name of the ad - 255 chars max. |  [optional property]
**pinId** | `String` | Pin ID. |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**viewTrackingUrl** | `String` | Tracking URL for ad impressions. |  [optional property]







## CreativeTypeEnum

Name | Value
---- | -----
REGULAR | `"REGULAR"`
VIDEO | `"VIDEO"`
SHOPPING | `"SHOPPING"`
CAROUSEL | `"CAROUSEL"`
MAX_VIDEO | `"MAX_VIDEO"`
SHOP_THE_PIN | `"SHOP_THE_PIN"`
STORY | `"STORY"`











