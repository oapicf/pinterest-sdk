# AdUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of this ad. | 
**PinId** | **String** | Pin ID. This field may only be updated for draft ads. | [optional] 
**AdGroupId** | **String** | ID of the ad group that contains the ad. | [optional] 
**AndroidDeepLink** | **String** | Deep link URL for Android devices. | [optional] 
**CarouselAndroidDeepLinks** | **String[]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | **String[]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | **String[]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 
**CustomizableCtaType** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**DestinationUrl** | **String** | Destination URL. | [optional] 
**DisclosureType** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**DisclosureUrl** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**GridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**IosDeepLink** | **String** | Deep link URL for iOS devices. | [optional] 
**IsCarting** | **Boolean** | Is the ad a carting/WTB ad? | [optional] 
**IsPinDeleted** | **Boolean** | Is original pin deleted? | [optional] 
**IsRemovable** | **Boolean** | Is pin repinnable? | [optional] 
**LeadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**Name** | **String** | Name of the ad - 255 chars max. | [optional] 
**QuizPinData** | [**SystemCollectionsHashtable**](.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | [**SystemCollectionsHashtable**](.md) |  | [optional] 
**ViewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdUpdateRequest = Initialize-PSOpenAPIToolsAdUpdateRequest  -Id null `
 -PinId null `
 -AdGroupId null `
 -AndroidDeepLink null `
 -CarouselAndroidDeepLinks null `
 -CarouselDestinationUrls null `
 -CarouselIosDeepLinks null `
 -ClickTrackingUrl null `
 -CreativeType null `
 -CustomizableCtaType null `
 -DestinationUrl null `
 -DisclosureType null `
 -DisclosureUrl null `
 -GridClickType null `
 -IosDeepLink null `
 -IsCarting null `
 -IsPinDeleted false `
 -IsRemovable false `
 -LeadFormId null `
 -Name null `
 -QuizPinData null `
 -Status null `
 -TrackingUrls null `
 -ViewTrackingUrl null
```

- Convert the resource to JSON
```powershell
$AdUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

