

# AdCreate

Resource create operation model.

The class is defined in **[AdCreate.java](../../src/main/java/org/openapitools/model/AdCreate.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | `String` | ID of the ad group that contains the ad. | 
**androidDeepLink** | `String` | Deep link URL for Android devices. |  [optional property]
**carouselAndroidDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on Android. |  [optional property]
**carouselDestinationUrls** | `List&lt;String&gt;` | Comma-separated destination URLs for the carousel pin to promote. |  [optional property]
**carouselIosDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on iOS. |  [optional property]
**clickTrackingUrl** | `String` | Tracking url for the ad clicks. |  [optional property]
**collectionItemsDestinationUrlTemplate** | `String` | Destination URL template for all items within a collections drawer. |  [optional property]
**collectionsHeaderType** | `AdCollectionsHeaderType` |  |  [optional property]
**creativeType** | `CreativeType` |  | 
**customizableCtaType** | `CustomizableCTAType` |  |  [optional property]
**destinationUrl** | `String` | Destination URL. |  [optional property]
**disclosureType** | `DisclosureType` |  |  [optional property]
**disclosureUrl** | `String` | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional property]
**gridClickType** | `GridClickType` |  |  [optional property]
**iosDeepLink** | `String` | Deep link URL for iOS devices. |  [optional property]
**isCarting** | `Boolean` | Is the ad a carting/WTB ad? |  [optional property]
**isCollageAcceptedTerms** | `Boolean` | Whether the advertiser has accepted the terms and conditions for collage ad. |  [optional property]
**isCollageSingleDestination** | `Boolean` | Whether the collage ad has a single destination url override. |  [optional property]
**isPinDeleted** | `Boolean` | Is original pin deleted? |  [optional property]
**isRemovable** | `Boolean` | Is pin repinnable? |  [optional property]
**leadFormId** | `String` | Lead form ID for lead ad generation. |  [optional property]
**name** | `String` | Name of the ad - 255 chars max. |  [optional property]
**pinId** | `String` | Pin ID. This field may only be updated for draft ads. | 
**quizPinData** | [`QuizPinData`](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**viewTrackingUrl** | `String` | Tracking URL for ad impressions. |  [optional property]





























