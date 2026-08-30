

# AdBatchUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | **String** | Deep link URL for Android devices. |  [optional]
**carouselAndroidDeepLinks** | **Seq&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | **Seq&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | **Seq&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. |  [optional]
**collectionItemsDestinationUrlTemplate** | **String** | Destination URL template for all items within a collections drawer. |  [optional]
**collectionsHeaderType** | **AdCollectionsHeaderType** |  |  [optional]
**creativeType** | **CreativeType** |  |  [optional]
**customizableCtaType** | **CustomizableCTAType** |  |  [optional]
**destinationUrl** | **String** | Destination URL. |  [optional]
**disclosureType** | **DisclosureType** |  |  [optional]
**disclosureUrl** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional]
**gridClickType** | **GridClickType** |  |  [optional]
**id** | **String** | The ID of this ad. | 
**iosDeepLink** | **String** | Deep link URL for iOS devices. |  [optional]
**isCarting** | **Boolean** | Is the ad a carting/WTB ad? |  [optional]
**isCollageAcceptedTerms** | **Boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. |  [optional]
**isCollageSingleDestination** | **Boolean** | Whether the collage ad has a single destination url override. |  [optional]
**isPinDeleted** | **Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | **Boolean** | Is pin repinnable? |  [optional]
**leadFormId** | **String** | Lead form ID for lead ad generation. |  [optional]
**name** | **String** | Name of the ad - 255 chars max. |  [optional]
**pinId** | **String** | Pin ID. This field may only be updated for draft ads. |  [optional]
**quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional]
**status** | **EntityStatus** |  |  [optional]
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional]
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. |  [optional]



