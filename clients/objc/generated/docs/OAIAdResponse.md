# OAIAdResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **NSString*** | ID of the ad group that contains the ad. | [optional] 
**androidDeepLink** | **NSString*** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carouselAndroidDeepLinks** | **NSArray&lt;NSString*&gt;*** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **NSArray&lt;NSString*&gt;*** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **NSArray&lt;NSString*&gt;*** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **NSString*** | Tracking url for the ad clicks. | [optional] 
**creativeType** | [**OAICreativeType***](OAICreativeType.md) |  | [optional] 
**destinationUrl** | **NSString*** | Destination URL. | [optional] 
**iosDeepLink** | **NSString*** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**isPinDeleted** | **NSNumber*** | Is original pin deleted? | [optional] 
**isRemovable** | **NSNumber*** | Is pin repinnable? | [optional] 
**name** | **NSString*** | Name of the ad - 255 chars max. | [optional] 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) |  | [optional] 
**trackingUrls** | [**OAIAdCommonTrackingUrls***](OAIAdCommonTrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **NSString*** | Tracking URL for ad impressions. | [optional] 
**leadFormId** | **NSString*** | Lead form ID for lead ad generation. | [optional] 
**gridClickType** | [**OAIGridClickType***](OAIGridClickType.md) |  | [optional] 
**customizableCtaType** | **NSString*** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**quizPinData** | [**OAIAdCommonQuizPinData***](OAIAdCommonQuizPinData.md) |  | [optional] 
**pinId** | **NSString*** | Pin ID. | [optional] 
**adAccountId** | **NSString*** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaignId** | **NSString*** | ID of the ad campaign that contains this ad. | [optional] 
**collectionItemsDestinationUrlTemplate** | **NSString*** | Destination URL template for all items within a collections drawer. | [optional] 
**createdTime** | **NSNumber*** | Pin creation time. Unix timestamp in seconds. | [optional] 
**_id** | **NSString*** | The ID of this ad. | [optional] 
**rejectedReasons** | **NSArray&lt;NSString*&gt;*** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejectionLabels** | **NSArray&lt;NSString*&gt;*** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**reviewStatus** | **NSString*** | Ad review status | [optional] 
**type** | **NSString*** | Always \&quot;ad\&quot;. | [optional] 
**updatedTime** | **NSNumber*** | Last update time. Unix timestamp in seconds. | [optional] 
**summaryStatus** | [**OAIPinPromotionSummaryStatus***](OAIPinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


