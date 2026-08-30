# CartingProduct
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CartingProductId** | **String** | the internal Pinterest carting product id (different from industry product id) | 
**DisplayPreferredRetailersOnly** | **Boolean** | Whether to display only the preferred retailers for the carting product | [optional] 
**DisplayProductPrice** | **Boolean** | Whether to display the price for the carting product | [optional] 
**PreferredRetailers** | [**CartingRetailer[]**](CartingRetailer.md) | A sorted array of preferred retailers for the carting product | [optional] 
**RandomizePreferredRetailers** | **Boolean** | Whether to randomize preferred retailers for the carting product | [optional] 

## Examples

- Prepare the resource
```powershell
$CartingProduct = Initialize-PSOpenAPIToolsCartingProduct  -CartingProductId null `
 -DisplayPreferredRetailersOnly null `
 -DisplayProductPrice null `
 -PreferredRetailers null `
 -RandomizePreferredRetailers null
```

- Convert the resource to JSON
```powershell
$CartingProduct | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

