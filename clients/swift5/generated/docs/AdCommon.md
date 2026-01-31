# AdCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. | [optional] 
**androidDeepLink** | **String** | Deep link URL for Android devices. | [optional] 
**carouselAndroidDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **[String]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**creativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 
**customizableCtaType** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destinationUrl** | **String** | Destination URL. | [optional] 
**disclosureType** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosureUrl** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**gridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**iosDeepLink** | **String** | Deep link URL for iOS devices. | [optional] 
**isPinDeleted** | **Bool** | Is original pin deleted? | [optional] 
**isRemovable** | **Bool** | Is pin repinnable? | [optional] 
**leadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**name** | **String** | Name of the ad - 255 chars max. | [optional] 
**quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


