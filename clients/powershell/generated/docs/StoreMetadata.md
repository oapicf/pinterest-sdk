# StoreMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Geohash** | **String** | Geohash of the store location | [optional] 
**Latitude** | **Double** | Geographic latitude coordinate of the store | [optional] 
**Longitude** | **Double** | Geographic longitude coordinate of the store | [optional] 
**StoreCode** | **String** | Merchant provided store code | 
**StoreId** | **String** | Internal store code | 
**StoreName** | **String** | Store name | [optional] 

## Examples

- Prepare the resource
```powershell
$StoreMetadata = Initialize-PSOpenAPIToolsStoreMetadata  -Geohash 9q `
 -Latitude 37.37695098 `
 -Longitude -122.032913 `
 -StoreCode store_1 `
 -StoreId 9070947806573 `
 -StoreName Store 1 Sunnyvale
```

- Convert the resource to JSON
```powershell
$StoreMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

