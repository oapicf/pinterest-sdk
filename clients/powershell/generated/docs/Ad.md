# Ad
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | The ID of the advertiser that this ad belongs to. | [readonly] 
**AdGroupId** | **String** | ID of the ad group that contains the ad. | 
**AndroidDeepLink** | **String** | Deep link URL for Android devices. | [optional] 
**CampaignId** | **String** | ID of the ad campaign that contains this ad. | [readonly] 
**CarouselAndroidDeepLinks** | **String[]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | **String[]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | **String[]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**CartingPlatformType** | **Int32** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] 
**CartingProducts** | [**CartingProduct[]**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] 
**ClickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**CollectionItemsDestinationUrlTemplate** | **String** | Destination URL template for all items within a collections drawer. | [optional] 
**CollectionsHeaderType** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**CreatedTime** | **Int32** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | 
**CustomizableCtaType** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**DestinationUrl** | **String** | Destination URL. | [optional] 
**DisclosureType** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**DisclosureUrl** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**GridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**Id** | **String** | The ID of this ad. | 
**IosDeepLink** | **String** | Deep link URL for iOS devices. | [optional] 
**IsCarting** | **Boolean** | Is the ad a carting/WTB ad? | [optional] 
**IsCollageAcceptedTerms** | **Boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**IsCollageSingleDestination** | **Boolean** | Whether the collage ad has a single destination url override. | [optional] 
**IsPinDeleted** | **Boolean** | Is original pin deleted? | [optional] 
**IsRemovable** | **Boolean** | Is pin repinnable? | [optional] 
**LeadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**Name** | **String** | Name of the ad - 255 chars max. | [optional] 
**PinId** | **String** | Pin ID. This field may only be updated for draft ads. | 
**QuizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**RejectedReasons** | [**AdDisapprovalReasons[]**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is &quot;&quot;REJECTED&quot;&quot;. | [readonly] 
**RejectionLabels** | **String[]** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is &quot;&quot;REJECTED&quot;&quot;. | [readonly] 
**ReviewStatus** | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**SummaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**Type** | **String** | Always &quot;&quot;ad&quot;&quot;. | [readonly] 
**UpdatedTime** | **Int32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 
**ViewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 

## Examples

- Prepare the resource
```powershell
$Ad = Initialize-PSOpenAPIToolsAd  -AdAccountId null `
 -AdGroupId null `
 -AndroidDeepLink null `
 -CampaignId null `
 -CarouselAndroidDeepLinks null `
 -CarouselDestinationUrls null `
 -CarouselIosDeepLinks null `
 -CartingPlatformType null `
 -CartingProducts null `
 -ClickTrackingUrl null `
 -CollectionItemsDestinationUrlTemplate null `
 -CollectionsHeaderType null `
 -CreatedTime null `
 -CreativeType null `
 -CustomizableCtaType null `
 -DestinationUrl null `
 -DisclosureType null `
 -DisclosureUrl null `
 -GridClickType null `
 -Id null `
 -IosDeepLink null `
 -IsCarting null `
 -IsCollageAcceptedTerms null `
 -IsCollageSingleDestination null `
 -IsPinDeleted null `
 -IsRemovable null `
 -LeadFormId null `
 -Name null `
 -PinId null `
 -QuizPinData null `
 -RejectedReasons null `
 -RejectionLabels null `
 -ReviewStatus null `
 -Status null `
 -SummaryStatus null `
 -TrackingUrls null `
 -Type null `
 -UpdatedTime null `
 -ViewTrackingUrl null
```

- Convert the resource to JSON
```powershell
$Ad | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

