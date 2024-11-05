# CatalogsHotelFeedsCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**Name** | **String** | A human-friendly name associated to a given feed. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**DefaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**Location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**CatalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelFeedsCreateRequest = Initialize-PSOpenAPIToolsCatalogsHotelFeedsCreateRequest  -DefaultCurrency null `
 -Name null `
 -Format null `
 -DefaultLocale null `
 -Credentials null `
 -Location null `
 -PreferredProcessingSchedule null `
 -CatalogType null `
 -CatalogId null `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelFeedsCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

