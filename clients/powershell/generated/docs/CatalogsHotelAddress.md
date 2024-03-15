# CatalogsHotelAddress
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addr1** | **String** | Primary street address of hotel. | [optional] 
**City** | **String** | City where the hotel is located. | [optional] 
**Region** | **String** | State, county, province, where the hotel is located. | [optional] 
**Country** | **String** | Country where the hotel is located. | [optional] 
**PostalCode** | **String** | Required for countries with a postal code system. Postal or zip code of the hotel. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelAddress = Initialize-PSOpenAPIToolsCatalogsHotelAddress  -Addr1 null `
 -City null `
 -Region null `
 -Country null `
 -PostalCode null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelAddress | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

