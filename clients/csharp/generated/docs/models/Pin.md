# Org.OpenAPITools.Model.Pin
Pin model containing properties related to a Pinterest Pin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**AltText** | **string** |  | [optional] 
**BoardId** | **string** | The board to which this Pin belongs. | [optional] 
**BoardOwner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**BoardSectionId** | **string** | The board section to which this Pin belongs. | [optional] 
**CreatedAt** | **DateTime** |  | [optional] [readonly] 
**CreativeType** | **CreativeType** |  | [optional] [readonly] 
**Description** | **string** |  | [optional] 
**DominantColor** | **string** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**HasBeenPromoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**IsOwner** | **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**IsStandard** | **bool** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**Link** | **string** |  | [optional] 
**Media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**ParentPinId** | **string** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**PinMetrics** | **Object** | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**Title** | **string** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

