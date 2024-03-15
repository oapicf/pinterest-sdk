# CatalogsFeed
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **System.DateTime** |  | [optional] 
**Id** | **String** |  | [optional] 
**UpdatedAt** | **System.DateTime** |  | [optional] 
**Name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**Location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**DefaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | 
**DefaultLocale** | **String** | The locale used within a feed for product descriptions. | 
**DefaultCountry** | [**Country**](Country.md) |  | 
**DefaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**CatalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeed = Initialize-PSOpenAPIToolsCatalogsFeed  -CreatedAt 2022-03-14T15:15:22Z `
 -Id null `
 -UpdatedAt 2022-03-14T15:16:34Z `
 -Name null `
 -Format null `
 -CatalogType null `
 -Credentials null `
 -Location null `
 -PreferredProcessingSchedule null `
 -Status null `
 -DefaultCurrency null `
 -DefaultLocale en-US `
 -DefaultCountry null `
 -DefaultAvailability null `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsFeed | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

