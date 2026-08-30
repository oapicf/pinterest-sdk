# PinUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AiDisclosures** | [**AiDisclosuresUpdate**](AiDisclosuresUpdate.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**AltText** | **String** |  | [optional] 
**BoardId** | **String** | The board to which this Pin belongs. | [optional] 
**BoardSectionId** | **String** | The board section to which this Pin belongs. | [optional] 
**CarouselSlots** | [**CarouselSlot[]**](CarouselSlot.md) | Carousel Pin slots data. | [optional] 
**Description** | **String** |  | [optional] 
**Link** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinUpdate = Initialize-PSOpenAPIToolsPinUpdate  -AiDisclosures null `
 -AltText null `
 -BoardId null `
 -BoardSectionId null `
 -CarouselSlots null `
 -Description null `
 -Link null `
 -Title null
```

- Convert the resource to JSON
```powershell
$PinUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

