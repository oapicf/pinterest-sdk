# Org.OpenAPITools.Model.Pin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**AiDisclosures** | [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**BoardId** | **string** | The board to which this Pin belongs. | [optional] 
**BoardOwner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**BoardSectionId** | **string** | The board section to which this Pin belongs. | [optional] 
**CreatedAt** | **DateTime** |  | [optional] [readonly] 
**CreativeType** | **CreativeType** |  | [optional] [readonly] 
**DominantColor** | **string** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**HasBeenPromoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**IsOwner** | **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**IsProduct** | **bool** | Whether the Pin is a product Pin. | [optional] [readonly] 
**IsStandard** | **bool** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**Media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**ParentPinId** | **string** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**PinMetrics** | **Object** | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**AltText** | **string** |  | [optional] 
**Description** | **string** |  | [optional] 
**Link** | **string** |  | [optional] 
**Title** | **string** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

