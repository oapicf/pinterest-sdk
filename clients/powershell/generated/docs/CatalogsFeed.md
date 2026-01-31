# CatalogsFeed
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **System.DateTime** |  | 
**Id** | **String** |  | 
**UpdatedAt** | **System.DateTime** |  | 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**DefaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**DefaultCountry** | [**Country**](Country.md) |  | 
**DefaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | 
**DefaultLocale** | **String** | The locale used within a feed for product descriptions. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**Location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**CatalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeed = Initialize-PSOpenAPIToolsCatalogsFeed  -CreatedAt 2022-03-14T15:15:22Z `
 -Id null `
 -UpdatedAt 2022-03-14T15:16:34Z `
 -CatalogType null `
 -Credentials null `
 -DefaultAvailability null `
 -DefaultCountry null `
 -DefaultCurrency null `
 -DefaultLocale en-US `
 -Format null `
 -Location null `
 -Name null `
 -PreferredProcessingSchedule null `
 -Status null `
 -CatalogId null
```

- Convert the resource to JSON
```powershell
$CatalogsFeed | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

