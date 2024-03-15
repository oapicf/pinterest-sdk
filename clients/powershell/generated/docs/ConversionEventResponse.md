# ConversionEventResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversionEvent** | [**ConversionTagType**](ConversionTagType.md) |  | [optional] 
**ConversionTagId** | **String** | Id of the tag. | [optional] 
**AdAccountId** | **String** | Id of the ad account. | [optional] 
**CreatedTime** | **Int32** | Creation date in epoch format. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventResponse = Initialize-PSOpenAPIToolsConversionEventResponse  -ConversionEvent null `
 -ConversionTagId 2614324385652 `
 -AdAccountId 549757463328 `
 -CreatedTime 1564768710
```

- Convert the resource to JSON
```powershell
$ConversionEventResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

