# CatalogsFeed
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**CreatedAt** | **System.DateTime** |  | [readonly] 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**DefaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**DefaultCountry** | [**Country**](Country.md) |  | 
**DefaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**DefaultLocale** | **String** | The locale used within a feed for product descriptions. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**Id** | **String** | ID of the feed entity. | [readonly] 
**Location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**UpdatedAt** | **System.DateTime** |  | [readonly] 
**CatalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeed = Initialize-PSOpenAPIToolsCatalogsFeed  -CatalogType null `
 -CreatedAt null `
 -Credentials null `
 -DefaultAvailability null `
 -DefaultCountry null `
 -DefaultCurrency null `
 -DefaultLocale null `
 -Format null `
 -Id 864344156814050986 `
 -Location null `
 -Name null `
 -PreferredProcessingSchedule null `
 -Status null `
 -UpdatedAt null `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsFeed | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

