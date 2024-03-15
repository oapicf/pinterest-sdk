# PinCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] [readonly] 
**CreatedAt** | **System.DateTime** |  | [optional] [readonly] 
**Link** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**DominantColor** | **String** | Dominant pin color. Hex number, e.g. \&quot;&quot;#6E7874\&quot;&quot;. | [optional] 
**AltText** | **String** |  | [optional] 
**BoardId** | **String** | The board to which this Pin belongs. | [optional] 
**BoardSectionId** | **String** | The board section to which this Pin belongs. | [optional] 
**BoardOwner** | [**BoardOwner**](BoardOwner.md) |  | [optional] 
**Media** | [**SummaryPinMedia**](SummaryPinMedia.md) |  | [optional] 
**MediaSource** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**ParentPinId** | **String** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/article/save-pins-on-pinterest&quot;&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**Note** | **String** | Private note for this Pin. &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins&quot;&quot;&gt;Learn more&lt;/a&gt;. | [optional] 

## Examples

- Prepare the resource
```powershell
$PinCreate = Initialize-PSOpenAPIToolsPinCreate  -Id 813744226420795884 `
 -CreatedAt 2020-01-01T20:10:40Z `
 -Link https://www.pinterest.com/ `
 -Title null `
 -Description null `
 -DominantColor #6E7874 `
 -AltText null `
 -BoardId null `
 -BoardSectionId null `
 -BoardOwner null `
 -Media null `
 -MediaSource null `
 -ParentPinId null `
 -Note null
```

- Convert the resource to JSON
```powershell
$PinCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

