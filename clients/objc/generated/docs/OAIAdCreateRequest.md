# OAIAdCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **NSString*** | ID of the ad group that contains the ad. | 
**androidDeepLink** | **NSString*** | Deep link URL for Android devices. | [optional] 
**carouselAndroidDeepLinks** | **NSArray&lt;NSString*&gt;*** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **NSArray&lt;NSString*&gt;*** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **NSArray&lt;NSString*&gt;*** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **NSString*** | Tracking url for the ad clicks. | [optional] 
**creativeType** | [**OAICreativeType***](OAICreativeType.md) |  | 
**customizableCtaType** | [**OAICustomizableCTAType***](OAICustomizableCTAType.md) |  | [optional] 
**destinationUrl** | **NSString*** | Destination URL. | [optional] 
**disclosureType** | [**OAIDisclosureType***](OAIDisclosureType.md) |  | [optional] 
**disclosureUrl** | **NSString*** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**gridClickType** | [**OAIGridClickType***](OAIGridClickType.md) |  | [optional] 
**iosDeepLink** | **NSString*** | Deep link URL for iOS devices. | [optional] 
**isCarting** | **NSNumber*** | Is the ad a carting/WTB ad? | [optional] 
**isPinDeleted** | **NSNumber*** | Is original pin deleted? | [optional] 
**isRemovable** | **NSNumber*** | Is pin repinnable? | [optional] 
**leadFormId** | **NSString*** | Lead form ID for lead ad generation. | [optional] 
**name** | **NSString*** | Name of the ad - 255 chars max. | [optional] 
**pinId** | **NSString*** | Pin ID. | 
**quizPinData** | [**NSObject***](.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) |  | [optional] 
**trackingUrls** | [**NSObject***](.md) |  | [optional] 
**viewTrackingUrl** | **NSString*** | Tracking URL for ad impressions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


