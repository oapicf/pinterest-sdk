# ConversionEventResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Id of the ad account. | [optional] 
**ConversionEvent** | [**ConversionTagType**](ConversionTagType.md) |  | [optional] 
**ConversionTagId** | **String** | Id of the tag. | [optional] 
**CreatedTime** | **Int32** | Creation date in epoch format. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventResponse = Initialize-PSOpenAPIToolsConversionEventResponse  -AdAccountId 549757463328 `
 -ConversionEvent null `
 -ConversionTagId 2614324385652 `
 -CreatedTime 1564768710
```

- Convert the resource to JSON
```powershell
$ConversionEventResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

