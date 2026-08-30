

# AdUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of this ad. | 
**pinId** | **String** | Pin ID. This field may only be updated for draft ads. |  [optional]
**adGroupId** | **String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | **String** | Deep link URL for Android devices. |  [optional]
**carouselAndroidDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | **List&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. |  [optional]
**creativeType** | [**CreativeType**](CreativeType.md) |  |  [optional]
**customizableCtaType** | [**CustomizableCTAType**](CustomizableCTAType.md) |  |  [optional]
**destinationUrl** | **String** | Destination URL. |  [optional]
**disclosureType** | [**DisclosureType**](DisclosureType.md) |  |  [optional]
**disclosureUrl** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional]
**gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional]
**iosDeepLink** | **String** | Deep link URL for iOS devices. |  [optional]
**isCarting** | **Boolean** | Is the ad a carting/WTB ad? |  [optional]
**isPinDeleted** | **Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | **Boolean** | Is pin repinnable? |  [optional]
**leadFormId** | **String** | Lead form ID for lead ad generation. |  [optional]
**name** | **String** | Name of the ad - 255 chars max. |  [optional]
**quizPinData** | **Object** | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional]
**status** | [**EntityStatus**](EntityStatus.md) |  |  [optional]
**trackingUrls** | **Object** |  |  [optional]
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. |  [optional]




