# CartingRetailer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RetailerId** | **String** | Unique identifier for the retailer | 
**RetailerName** | **String** | Name of the retailer | 

## Examples

- Prepare the resource
```powershell
$CartingRetailer = Initialize-PSOpenAPIToolsCartingRetailer  -RetailerId null `
 -RetailerName null
```

- Convert the resource to JSON
```powershell
$CartingRetailer | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

