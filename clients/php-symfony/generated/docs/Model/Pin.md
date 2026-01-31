# Pin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**altText** | **string** |  | [optional] 
**boardId** | **string** | The board to which this Pin belongs. | [optional] 
**boardOwner** | [**OpenAPI\Server\Model\BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**boardSectionId** | **string** | The board section to which this Pin belongs. | [optional] 
**createdAt** | **\DateTime** |  | [optional] [readonly] 
**creativeType** | [**OpenAPI\Server\Model\CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**description** | **string** |  | [optional] 
**dominantColor** | **string** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**hasBeenPromoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**id** | **string** |  | 
**isOwner** | **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**isStandard** | **bool** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**link** | **string** |  | [optional] 
**media** | [**OpenAPI\Server\Model\PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**parentPinId** | **string** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**pinMetrics** | **array** | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**title** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


