# AdResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group that contains the ad. | [optional] 
**AndroidDeepLink** | Pointer to **string** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**CarouselAndroidDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | Pointer to **[]string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | Pointer to **string** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | **string** | Ad creative type enum | [optional] 
**DestinationUrl** | Pointer to **string** | Destination URL. | [optional] 
**IosDeepLink** | Pointer to **string** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**IsPinDeleted** | **bool** | Is original pin deleted? | [optional] 
**IsRemovable** | **bool** | Is pin repinnable? | [optional] 
**Name** | Pointer to **string** | Name of the ad - 255 chars max. | [optional] 
**PinId** | **string** | Pin ID. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | Pointer to [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | Pointer to **string** | Tracking URL for ad impressions. | [optional] 
**AdAccountId** | **string** | The ID of the advertiser that this ad belongs to. | [optional] 
**CampaignId** | **string** | ID of the ad campaign that contains this ad. | [optional] 
**CollectionItemsDestinationUrlTemplate** | Pointer to **string** | Destination URL template for all items within a collections drawer. | [optional] 
**CreatedTime** | **int32** | Pin creation time. Unix timestamp in seconds. | [optional] 
**Id** | **string** | The ID of this ad. | [optional] 
**RejectedReasons** | **[]string** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**RejectionLabels** | **[]string** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**ReviewStatus** | **string** | Ad review status | [optional] 
**Type** | **string** | Always \&quot;ad\&quot;. | [optional] 
**UpdatedTime** | **int32** | Last update time. Unix timestamp in seconds. | [optional] 
**SummaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


