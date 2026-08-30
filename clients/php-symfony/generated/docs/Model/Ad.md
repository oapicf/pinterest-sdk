# Ad

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | The ID of the advertiser that this ad belongs to. | [readonly] 
**adGroupId** | **string** | ID of the ad group that contains the ad. | 
**androidDeepLink** | **string** | Deep link URL for Android devices. | [optional] 
**campaignId** | **string** | ID of the ad campaign that contains this ad. | [readonly] 
**carouselAndroidDeepLinks** | **string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**cartingPlatformType** | **int** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] 
**cartingProducts** | [**OpenAPI\Server\Model\CartingProduct**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] 
**clickTrackingUrl** | **string** | Tracking url for the ad clicks. | [optional] 
**collectionItemsDestinationUrlTemplate** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**collectionsHeaderType** | [**OpenAPI\Server\Model\AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**createdTime** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] 
**creativeType** | [**OpenAPI\Server\Model\CreativeType**](CreativeType.md) |  | 
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
**pinId** | **string** | Pin ID. This field may only be updated for draft ads. | 
**quizPinData** | [**OpenAPI\Server\Model\QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**rejectedReasons** | [**OpenAPI\Server\Model\AdDisapprovalReasons**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**rejectionLabels** | **string** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**reviewStatus** | [**OpenAPI\Server\Model\AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] 
**summaryStatus** | [**OpenAPI\Server\Model\PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] 
**trackingUrls** | [**OpenAPI\Server\Model\TrackingUrls**](TrackingUrls.md) |  | [optional] 
**type** | **string** | Always \&quot;ad\&quot;. | [readonly] 
**updatedTime** | **int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 
**viewTrackingUrl** | **string** | Tracking URL for ad impressions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


