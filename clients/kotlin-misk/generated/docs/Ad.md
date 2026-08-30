
# Ad

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **kotlin.String** | The ID of the advertiser that this ad belongs to. |  [readonly]
**adGroupId** | **kotlin.String** | ID of the ad group that contains the ad. | 
**campaignId** | **kotlin.String** | ID of the ad campaign that contains this ad. |  [readonly]
**creativeType** | [**CreativeType**](CreativeType.md) |  | 
**id** | **kotlin.String** | The ID of this ad. | 
**pinId** | **kotlin.String** | Pin ID. This field may only be updated for draft ads. | 
**rejectedReasons** | [**kotlin.collections.List&lt;AdDisapprovalReasons&gt;**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. |  [readonly]
**rejectionLabels** | **kotlin.collections.List&lt;kotlin.String&gt;** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. |  [readonly]
**reviewStatus** | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status |  [readonly]
**summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status |  [readonly]
**type** | **kotlin.String** | Always \&quot;ad\&quot;. |  [readonly]
**androidDeepLink** | **kotlin.String** | Deep link URL for Android devices. |  [optional]
**carouselAndroidDeepLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**cartingPlatformType** | **kotlin.Int** | The vendor platform type of the carting/WTB ad. |  [optional] [readonly]
**cartingProducts** | [**kotlin.collections.List&lt;CartingProduct&gt;**](CartingProduct.md) | Array of carting/WTB products for the ad. |  [optional] [readonly]
**clickTrackingUrl** | **kotlin.String** | Tracking url for the ad clicks. |  [optional]
**collectionItemsDestinationUrlTemplate** | **kotlin.String** | Destination URL template for all items within a collections drawer. |  [optional]
**collectionsHeaderType** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  |  [optional]
**createdTime** | **kotlin.Int** | Pin creation time. Unix timestamp in seconds. |  [optional] [readonly]
**customizableCtaType** | [**CustomizableCTAType**](CustomizableCTAType.md) |  |  [optional]
**destinationUrl** | **kotlin.String** | Destination URL. |  [optional]
**disclosureType** | [**DisclosureType**](DisclosureType.md) |  |  [optional]
**disclosureUrl** | **kotlin.String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional]
**gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional]
**iosDeepLink** | **kotlin.String** | Deep link URL for iOS devices. |  [optional]
**isCarting** | **kotlin.Boolean** | Is the ad a carting/WTB ad? |  [optional]
**isCollageAcceptedTerms** | **kotlin.Boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. |  [optional]
**isCollageSingleDestination** | **kotlin.Boolean** | Whether the collage ad has a single destination url override. |  [optional]
**isPinDeleted** | **kotlin.Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | **kotlin.Boolean** | Is pin repinnable? |  [optional]
**leadFormId** | **kotlin.String** | Lead form ID for lead ad generation. |  [optional]
**name** | **kotlin.String** | Name of the ad - 255 chars max. |  [optional]
**quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional]
**status** | [**EntityStatus**](EntityStatus.md) |  |  [optional]
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional]
**updatedTime** | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional] [readonly]
**viewTrackingUrl** | **kotlin.String** | Tracking URL for ad impressions. |  [optional]



