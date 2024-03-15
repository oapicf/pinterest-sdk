# CatalogsRetailFeedsUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**Name** | **String** | A human-friendly name associated to a given feed. | [optional] 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**Location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**DefaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailFeedsUpdateRequest = Initialize-PSOpenAPIToolsCatalogsRetailFeedsUpdateRequest  -DefaultCurrency null `
 -Name null `
 -Format null `
 -Credentials null `
 -Location null `
 -PreferredProcessingSchedule null `
 -Status null `
 -CatalogType null `
 -DefaultAvailability null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailFeedsUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

