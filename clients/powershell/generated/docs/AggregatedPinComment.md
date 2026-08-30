# AggregatedPinComment
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AiDisclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**AltText** | **String** |  | [optional] 
**BoardId** | **String** | The board to which this Pin belongs. | [optional] 
**BoardOwner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**BoardSectionId** | **String** | The board section to which this Pin belongs. | [optional] 
**CreatedAt** | **System.DateTime** |  | [optional] [readonly] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**Description** | **String** |  | [optional] 
**DominantColor** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**HasBeenPromoted** | **Boolean** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**Id** | **String** |  | 
**IsOwner** | **Boolean** | Whether the &quot;&quot;operation user_account&quot;&quot; is the Pin owner. | [optional] [readonly] 
**IsProduct** | **Boolean** | Whether the Pin is a product Pin. | [optional] [readonly] 
**IsStandard** | **Boolean** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**Link** | **String** |  | [optional] 
**Media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**ParentPinId** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**PinMetrics** | [**SystemCollectionsHashtable**](.md) | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**Title** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AggregatedPinComment = Initialize-PSOpenAPIToolsAggregatedPinComment  -AiDisclosures null `
 -AltText null `
 -BoardId null `
 -BoardOwner null `
 -BoardSectionId null `
 -CreatedAt null `
 -CreativeType null `
 -Description null `
 -DominantColor null `
 -HasBeenPromoted null `
 -Id null `
 -IsOwner null `
 -IsProduct null `
 -IsStandard null `
 -Link null `
 -Media null `
 -ParentPinId null `
 -PinMetrics {&quot;90d&quot;:{&quot;pin_click&quot;:7,&quot;impression&quot;:2,&quot;clickthrough&quot;:3},&quot;lifetime_metrics&quot;:{&quot;pin_click&quot;:7,&quot;impression&quot;:2,&quot;clickthrough&quot;:3,&quot;reaction&quot;:10,&quot;comment&quot;:2}} `
 -Title null
```

- Convert the resource to JSON
```powershell
$AggregatedPinComment | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

