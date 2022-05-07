# AdResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **string** | ID of the ad group that contains the ad. | [optional] 
**androidDeepLink** | **string** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carouselAndroidDeepLinks** | **string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **string** | Tracking url for the ad clicks. | [optional] 
**creativeType** | **string** | Ad creative type enum | [optional] 
**destinationUrl** | **string** | Destination URL. | [optional] 
**iosDeepLink** | **string** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**isPinDeleted** | **bool** | Is original pin deleted? | [optional] 
**isRemovable** | **bool** | Is pin repinnable? | [optional] 
**name** | **string** | Name of the ad - 255 chars max. | [optional] 
**pinId** | **string** | Pin ID. | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **string** | Tracking URL for ad impressions. | [optional] 
**adAccountId** | **string** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaignId** | **string** | ID of the ad campaign that contains this ad. | [optional] 
**collectionItemsDestinationUrlTemplate** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**createdTime** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **string** | The ID of this ad. | [optional] 
**rejectedReasons** | **string** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejectionLabels** | **string** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**reviewStatus** | **string** | Ad review status | [optional] 
**type** | **string** | Always \&quot;ad\&quot;. | [optional] 
**updatedTime** | **int** | Last update time. Unix timestamp in seconds. | [optional] 
**summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


