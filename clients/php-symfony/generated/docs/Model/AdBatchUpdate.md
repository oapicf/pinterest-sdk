# AdBatchUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **string** | ID of the ad group that contains the ad. | [optional] 
**androidDeepLink** | **string** | Deep link URL for Android devices. | [optional] 
**carouselAndroidDeepLinks** | **string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **string** | Tracking url for the ad clicks. | [optional] 
**collectionItemsDestinationUrlTemplate** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**collectionsHeaderType** | [**OpenAPI\Server\Model\AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**creativeType** | [**OpenAPI\Server\Model\CreativeType**](CreativeType.md) |  | [optional] 
**customizableCtaType** | [**OpenAPI\Server\Model\CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destinationUrl** | **string** | Destination URL. | [optional] 
**disclosureType** | [**OpenAPI\Server\Model\DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosureUrl** | **string** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**gridClickType** | [**OpenAPI\Server\Model\GridClickType**](GridClickType.md) |  | [optional] 
**id** | **string** | The ID of this ad. | 
**iosDeepLink** | **string** | Deep link URL for iOS devices. | [optional] 
**isCarting** | **bool** | Is the ad a carting/WTB ad? | [optional] 
**isCollageAcceptedTerms** | **bool** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**isCollageSingleDestination** | **bool** | Whether the collage ad has a single destination url override. | [optional] 
**isPinDeleted** | **bool** | Is original pin deleted? | [optional] 
**isRemovable** | **bool** | Is pin repinnable? | [optional] 
**leadFormId** | **string** | Lead form ID for lead ad generation. | [optional] 
**name** | **string** | Name of the ad - 255 chars max. | [optional] 
**pinId** | **string** | Pin ID. This field may only be updated for draft ads. | [optional] 
**quizPinData** | [**OpenAPI\Server\Model\QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrls** | [**OpenAPI\Server\Model\TrackingUrls**](TrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **string** | Tracking URL for ad impressions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


