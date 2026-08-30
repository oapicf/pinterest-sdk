# OAIAd

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | The ID of the advertiser that this ad belongs to. | [readonly] 
**adGroupId** | **NSString*** | ID of the ad group that contains the ad. | 
**androidDeepLink** | **NSString*** | Deep link URL for Android devices. | [optional] 
**campaignId** | **NSString*** | ID of the ad campaign that contains this ad. | [readonly] 
**carouselAndroidDeepLinks** | **NSArray&lt;NSString*&gt;*** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **NSArray&lt;NSString*&gt;*** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **NSArray&lt;NSString*&gt;*** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**cartingPlatformType** | **NSNumber*** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] 
**cartingProducts** | [**NSArray&lt;OAICartingProduct&gt;***](OAICartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] 
**clickTrackingUrl** | **NSString*** | Tracking url for the ad clicks. | [optional] 
**collectionItemsDestinationUrlTemplate** | **NSString*** | Destination URL template for all items within a collections drawer. | [optional] 
**collectionsHeaderType** | [**OAIAdCollectionsHeaderType***](OAIAdCollectionsHeaderType.md) |  | [optional] 
**createdTime** | **NSNumber*** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] 
**creativeType** | [**OAICreativeType***](OAICreativeType.md) |  | 
**customizableCtaType** | [**OAICustomizableCTAType***](OAICustomizableCTAType.md) |  | [optional] 
**destinationUrl** | **NSString*** | Destination URL. | [optional] 
**disclosureType** | [**OAIDisclosureType***](OAIDisclosureType.md) |  | [optional] 
**disclosureUrl** | **NSString*** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**gridClickType** | [**OAIGridClickType***](OAIGridClickType.md) |  | [optional] 
**_id** | **NSString*** | The ID of this ad. | 
**iosDeepLink** | **NSString*** | Deep link URL for iOS devices. | [optional] 
**isCarting** | **NSNumber*** | Is the ad a carting/WTB ad? | [optional] 
**isCollageAcceptedTerms** | **NSNumber*** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**isCollageSingleDestination** | **NSNumber*** | Whether the collage ad has a single destination url override. | [optional] 
**isPinDeleted** | **NSNumber*** | Is original pin deleted? | [optional] 
**isRemovable** | **NSNumber*** | Is pin repinnable? | [optional] 
**leadFormId** | **NSString*** | Lead form ID for lead ad generation. | [optional] 
**name** | **NSString*** | Name of the ad - 255 chars max. | [optional] 
**pinId** | **NSString*** | Pin ID. This field may only be updated for draft ads. | 
**quizPinData** | [**OAIQuizPinData***](OAIQuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**rejectedReasons** | [**NSArray&lt;OAIAdDisapprovalReasons&gt;***](OAIAdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**rejectionLabels** | **NSArray&lt;NSString*&gt;*** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**reviewStatus** | [**OAIAdReviewStatus***](OAIAdReviewStatus.md) | Ad review status | [readonly] 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) |  | [optional] 
**summaryStatus** | [**OAIPinPromotionSummaryStatus***](OAIPinPromotionSummaryStatus.md) | Ad summary status | [readonly] 
**trackingUrls** | [**OAITrackingUrls***](OAITrackingUrls.md) |  | [optional] 
**type** | **NSString*** | Always \&quot;ad\&quot;. | [readonly] 
**updatedTime** | **NSNumber*** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 
**viewTrackingUrl** | **NSString*** | Tracking URL for ad impressions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


