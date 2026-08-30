# CatalogsHotelFeedsCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] 
**CatalogType** | **String** |  | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**DefaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**DefaultLocale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**Location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Name** | **String** | A human-friendly name associated to a given feed. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelFeedsCreateRequest = Initialize-PSOpenAPIToolsCatalogsHotelFeedsCreateRequest  -CatalogId null `
 -CatalogType null `
 -Credentials null `
 -DefaultCurrency null `
 -DefaultLocale null `
 -Format null `
 -Location null `
 -Name null `
 -PreferredProcessingSchedule null `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelFeedsCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

