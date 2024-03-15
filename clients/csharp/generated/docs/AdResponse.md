# Org.OpenAPITools.Model.AdResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group that contains the ad. | [optional] 
**AndroidDeepLink** | **string** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**CarouselAndroidDeepLinks** | **List&lt;string&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | **List&lt;string&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | **List&lt;string&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | **string** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | **CreativeType** |  | [optional] 
**DestinationUrl** | **string** | Destination URL. | [optional] 
**IosDeepLink** | **string** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**IsPinDeleted** | **bool** | Is original pin deleted? | [optional] 
**IsRemovable** | **bool** | Is pin repinnable? | [optional] 
**Name** | **string** | Name of the ad - 255 chars max. | [optional] 
**Status** | **EntityStatus** |  | [optional] 
**TrackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | **string** | Tracking URL for ad impressions. | [optional] 
**LeadFormId** | **string** | Lead form ID for lead ad generation. | [optional] 
**GridClickType** | **GridClickType** |  | [optional] 
**CustomizableCtaType** | **string** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**QuizPinData** | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  | [optional] 
**PinId** | **string** | Pin ID. | [optional] 
**AdAccountId** | **string** | The ID of the advertiser that this ad belongs to. | [optional] 
**CampaignId** | **string** | ID of the ad campaign that contains this ad. | [optional] 
**CollectionItemsDestinationUrlTemplate** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**CreatedTime** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] 
**Id** | **string** | The ID of this ad. | [optional] 
**RejectedReasons** | **List&lt;AdResponse.RejectedReasonsEnum&gt;** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**RejectionLabels** | **List&lt;string&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**ReviewStatus** | **string** | Ad review status | [optional] 
**Type** | **string** | Always \&quot;ad\&quot;. | [optional] 
**UpdatedTime** | **int** | Last update time. Unix timestamp in seconds. | [optional] 
**SummaryStatus** | **PinPromotionSummaryStatus** | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

