# LocalStoreUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AddressPrimary** | **String** | Primary address line of the store. | [optional] 
**AddressSecondary** | **String** | Secondary address line of the store. | [optional] 
**City** | **String** | City where the store is located. | [optional] 
**Country** | [**Country**](Country.md) | Country code where the store is located. | [optional] 
**Id** | **String** | The ID of the local store. | 
**Latitude** | **Double** | Geographic latitude coordinate of the store. | [optional] 
**Longitude** | **Double** | Geographic longitude coordinate of the store. | [optional] 
**Name** | **String** | The name of the local store. | [optional] 
**PostalCode** | **String** | Postal or ZIP code of the store. | [optional] 
**Region** | **String** | State or region code where the store is located. | [optional] 
**StoreCode** | **String** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | [optional] 

## Examples

- Prepare the resource
```powershell
$LocalStoreUpdate = Initialize-PSOpenAPIToolsLocalStoreUpdate  -AddressPrimary 123 Johnson St `
 -AddressSecondary Suite 100 `
 -City Sunnyvale `
 -Country null `
 -Id 1234567890 `
 -Latitude -30.21 `
 -Longitude 50.45 `
 -Name Sunnyvale Store `
 -PostalCode 94043 `
 -Region CA `
 -StoreCode store_1
```

- Convert the resource to JSON
```powershell
$LocalStoreUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

