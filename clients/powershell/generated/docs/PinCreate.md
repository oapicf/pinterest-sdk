# PinCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AltText** | **String** |  | [optional] 
**BoardId** | **String** | The board to which this Pin belongs. | [optional] 
**BoardSectionId** | **String** | The board section to which this Pin belongs. | [optional] 
**Description** | **String** |  | [optional] 
**DominantColor** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**Link** | **String** |  | [optional] 
**MediaSource** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**ParentPinId** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**SponsorId** | **String** | The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. | [optional] 
**Title** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinCreate = Initialize-PSOpenAPIToolsPinCreate  -AltText null `
 -BoardId null `
 -BoardSectionId null `
 -Description null `
 -DominantColor null `
 -Link null `
 -MediaSource null `
 -ParentPinId null `
 -SponsorId null `
 -Title null
```

- Convert the resource to JSON
```powershell
$PinCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

