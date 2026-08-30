# PinRead
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AiDisclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**BoardId** | **String** | The board to which this Pin belongs. | [optional] 
**BoardOwner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**BoardSectionId** | **String** | The board section to which this Pin belongs. | [optional] 
**CreatedAt** | **System.DateTime** |  | [optional] [readonly] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**DominantColor** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**HasBeenPromoted** | **Boolean** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**Id** | **String** |  | 
**IsOwner** | **Boolean** | Whether the &quot;&quot;operation user_account&quot;&quot; is the Pin owner. | [optional] [readonly] 
**IsProduct** | **Boolean** | Whether the Pin is a product Pin. | [optional] [readonly] 
**IsStandard** | **Boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**Media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**ParentPinId** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**PinMetrics** | [**SystemCollectionsHashtable**](.md) | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**AltText** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Link** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinRead = Initialize-PSOpenAPIToolsPinRead  -AiDisclosures null `
 -BoardId null `
 -BoardOwner null `
 -BoardSectionId null `
 -CreatedAt null `
 -CreativeType null `
 -DominantColor null `
 -HasBeenPromoted null `
 -Id null `
 -IsOwner null `
 -IsProduct null `
 -IsStandard null `
 -Media null `
 -ParentPinId null `
 -PinMetrics {90d&#x3D;{pin_click&#x3D;7, impression&#x3D;2, clickthrough&#x3D;3}, lifetime_metrics&#x3D;{pin_click&#x3D;7, impression&#x3D;2, clickthrough&#x3D;3, reaction&#x3D;10, comment&#x3D;2}} `
 -AltText null `
 -Description null `
 -Link null `
 -Title null
```

- Convert the resource to JSON
```powershell
$PinRead | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

