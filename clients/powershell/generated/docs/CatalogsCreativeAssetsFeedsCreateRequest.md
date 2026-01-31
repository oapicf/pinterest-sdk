# CatalogsCreativeAssetsFeedsCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**DefaultCountry** | [**Country**](Country.md) |  | 
**DefaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**DefaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**Location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Name** | **String** | A human-friendly name associated to a given feed. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to "ACTIVE"]

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsFeedsCreateRequest = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsFeedsCreateRequest  -CatalogId null `
 -CatalogType null `
 -Credentials null `
 -DefaultCountry null `
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
$CatalogsCreativeAssetsFeedsCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

