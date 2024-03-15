# AdCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **String** | ID of the ad group that contains the ad. | [optional] 
**AndroidDeepLink** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**CarouselAndroidDeepLinks** | **String[]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | **String[]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | **String[]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 
**DestinationUrl** | **String** | Destination URL. | [optional] 
**IosDeepLink** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**IsPinDeleted** | **Boolean** | Is original pin deleted? | [optional] 
**IsRemovable** | **Boolean** | Is pin repinnable? | [optional] 
**Name** | **String** | Name of the ad - 255 chars max. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 
**LeadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**GridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**CustomizableCtaType** | **String** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**QuizPinData** | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdCommon = Initialize-PSOpenAPIToolsAdCommon  -AdGroupId 2680059592705 `
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
 -QuizPinData null
```

- Convert the resource to JSON
```powershell
$AdCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

