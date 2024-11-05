# AdCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **String** | ID of the ad group that contains the ad. | 
**AndroidDeepLink** | **String** | Deep link URL for Android devices. | [optional] 
**CarouselAndroidDeepLinks** | **String[]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | **String[]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | **String[]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | 
**DestinationUrl** | **String** | Destination URL. | [optional] 
**IosDeepLink** | **String** | Deep link URL for iOS devices. | [optional] 
**IsPinDeleted** | **Boolean** | Is original pin deleted? | [optional] 
**IsRemovable** | **Boolean** | Is pin repinnable? | [optional] 
**Name** | **String** | Name of the ad - 255 chars max. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 
**LeadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**GridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**CustomizableCtaType** | **String** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**QuizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**PinId** | **String** | Pin ID. | 

## Examples

- Prepare the resource
```powershell
$AdCreateRequest = Initialize-PSOpenAPIToolsAdCreateRequest  -AdGroupId 2680059592705 `
 -AndroidDeepLink null `
 -CarouselAndroidDeepLinks null `
 -CarouselDestinationUrls null `
 -CarouselIosDeepLinks null `
 -ClickTrackingUrl null `
 -CreativeType null `
 -DestinationUrl null `
 -IosDeepLink null `
 -IsPinDeleted false `
 -IsRemovable false `
 -Name null `
 -Status null `
 -TrackingUrls null `
 -ViewTrackingUrl null `
 -LeadFormId null `
 -GridClickType null `
 -CustomizableCtaType LEARN_MORE `
 -QuizPinData null `
 -PinId 394205773611545468
```

- Convert the resource to JSON
```powershell
$AdCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

