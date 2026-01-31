

# AdCommon

Creation fields

The class is defined in **[AdCommon.java](../../src/main/java/org/openapitools/model/AdCommon.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | `String` | ID of the ad group that contains the ad. |  [optional property]
**androidDeepLink** | `String` | Deep link URL for Android devices. |  [optional property]
**carouselAndroidDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on Android. |  [optional property]
**carouselDestinationUrls** | `List&lt;String&gt;` | Comma-separated destination URLs for the carousel pin to promote. |  [optional property]
**carouselIosDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on iOS. |  [optional property]
**clickTrackingUrl** | `String` | Tracking url for the ad clicks. |  [optional property]
**creativeType** | `CreativeType` |  |  [optional property]
**customizableCtaType** | `CustomizableCTAType` |  |  [optional property]
**destinationUrl** | `String` | Destination URL. |  [optional property]
**disclosureType** | `DisclosureType` |  |  [optional property]
**disclosureUrl** | `String` | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional property]
**gridClickType** | `GridClickType` |  |  [optional property]
**iosDeepLink** | `String` | Deep link URL for iOS devices. |  [optional property]
**isPinDeleted** | `Boolean` | Is original pin deleted? |  [optional property]
**isRemovable** | `Boolean` | Is pin repinnable? |  [optional property]
**leadFormId** | `String` | Lead form ID for lead ad generation. |  [optional property]
**name** | `String` | Name of the ad - 255 chars max. |  [optional property]
**quizPinData** | [`QuizPinData`](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**viewTrackingUrl** | `String` | Tracking URL for ad impressions. |  [optional property]























