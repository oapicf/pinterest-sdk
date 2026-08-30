# PinterestSdk.Ad

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The ID of the advertiser that this ad belongs to. | [readonly] 
**adGroupId** | **String** | ID of the ad group that contains the ad. | 
**androidDeepLink** | **String** | Deep link URL for Android devices. | [optional] 
**campaignId** | **String** | ID of the ad campaign that contains this ad. | [readonly] 
**carouselAndroidDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **[String]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**cartingPlatformType** | **Number** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] 
**cartingProducts** | [**[CartingProduct]**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] 
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**collectionItemsDestinationUrlTemplate** | **String** | Destination URL template for all items within a collections drawer. | [optional] 
**collectionsHeaderType** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**createdTime** | **Number** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] 
**creativeType** | [**CreativeType**](CreativeType.md) |  | 
**customizableCtaType** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destinationUrl** | **String** | Destination URL. | [optional] 
**disclosureType** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosureUrl** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**gridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**id** | **String** | The ID of this ad. | 
**iosDeepLink** | **String** | Deep link URL for iOS devices. | [optional] 
**isCarting** | **Boolean** | Is the ad a carting/WTB ad? | [optional] 
**isCollageAcceptedTerms** | **Boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**isCollageSingleDestination** | **Boolean** | Whether the collage ad has a single destination url override. | [optional] 
**isPinDeleted** | **Boolean** | Is original pin deleted? | [optional] 
**isRemovable** | **Boolean** | Is pin repinnable? | [optional] 
**leadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**name** | **String** | Name of the ad - 255 chars max. | [optional] 
**pinId** | **String** | Pin ID. This field may only be updated for draft ads. | 
**quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**rejectedReasons** | [**[AdDisapprovalReasons]**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**rejectionLabels** | **[String]** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**reviewStatus** | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**type** | **String** | Always \&quot;ad\&quot;. | [readonly] 
**updatedTime** | **Number** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 


