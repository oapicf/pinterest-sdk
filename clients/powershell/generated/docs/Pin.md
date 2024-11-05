# Pin
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
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**BoardId** | **String** | The board to which this Pin belongs. | [optional] 
**BoardSectionId** | **String** | The board section to which this Pin belongs. | [optional] 
**BoardOwner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**IsOwner** | **Boolean** | Whether the &quot;&quot;operation user_account&quot;&quot; is the Pin owner. | [optional] [readonly] 
**Media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**MediaSource** | [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**ParentPinId** | **String** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/article/save-pins-on-pinterest&quot;&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**IsStandard** | **Boolean** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;&quot;&quot;/docs/api-features/content-overview/&quot;&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] 
**HasBeenPromoted** | **Boolean** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**Note** | **String** | Private note for this Pin. &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins&quot;&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**PinMetrics** | [**SystemCollectionsHashtable**](.md) | Pin metrics with associated time intervals if any. | [optional] 

## Examples

- Prepare the resource
```powershell
$Pin = Initialize-PSOpenAPIToolsPin  -Id 813744226420795884 `
 -CreatedAt 2020-01-01T20:10:40Z `
 -Link https://www.pinterest.com/ `
 -Title null `
 -Description null `
 -DominantColor #6E7874 `
 -AltText null `
 -CreativeType null `
 -BoardId null `
 -BoardSectionId null `
 -BoardOwner null `
 -IsOwner null `
 -Media null `
 -MediaSource null `
 -ParentPinId null `
 -IsStandard null `
 -HasBeenPromoted null `
 -Note null `
 -PinMetrics {&quot;90d&quot;:{&quot;pin_click&quot;:7,&quot;impression&quot;:2,&quot;clickthrough&quot;:3},&quot;lifetime_metrics&quot;:{&quot;pin_click&quot;:7,&quot;impression&quot;:2,&quot;clickthrough&quot;:3,&quot;reaction&quot;:10,&quot;comment&quot;:2}}
```

- Convert the resource to JSON
```powershell
$Pin | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

