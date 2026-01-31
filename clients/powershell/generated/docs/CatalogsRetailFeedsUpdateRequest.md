# CatalogsRetailFeedsUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**DefaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**DefaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**Location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**Name** | **String** | A human-friendly name associated to a given feed. | [optional] 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailFeedsUpdateRequest = Initialize-PSOpenAPIToolsCatalogsRetailFeedsUpdateRequest  -CatalogType null `
 -Credentials null `
 -DefaultAvailability null `
 -DefaultCurrency null `
 -Format null `
 -Location null `
 -Name null `
 -PreferredProcessingSchedule null `
 -Status null
```

- Convert the resource to JSON
```powershell
$CatalogsRetailFeedsUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

