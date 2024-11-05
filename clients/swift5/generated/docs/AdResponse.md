# AdResponse

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
**destinationUrl** | **String** | Destination URL. | [optional] 
**iosDeepLink** | **String** | Deep link URL for iOS devices. | [optional] 
**isPinDeleted** | **Bool** | Is original pin deleted? | [optional] 
**isRemovable** | **Bool** | Is pin repinnable? | [optional] 
**name** | **String** | Name of the ad - 255 chars max. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 
**leadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**gridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**customizableCtaType** | **String** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**pinId** | **String** | Pin ID. | [optional] 
**adAccountId** | **String** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaignId** | **String** | ID of the ad campaign that contains this ad. | [optional] 
**collectionItemsDestinationUrlTemplate** | **String** | Destination URL template for all items within a collections drawer. | [optional] 
**createdTime** | **Int** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **String** | The ID of this ad. | [optional] 
**rejectedReasons** | **[String]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejectionLabels** | **[String]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**reviewStatus** | **String** | Ad review status | [optional] 
**type** | **String** | Always \&quot;ad\&quot;. | [optional] 
**updatedTime** | **Int** | Last update time. Unix timestamp in seconds. | [optional] 
**summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


