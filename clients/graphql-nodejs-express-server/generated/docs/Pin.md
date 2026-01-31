# Pin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**altText** | **String** |  | [optional] [default to null]
**boardId** | **String!** | The board to which this Pin belongs. | [optional] [default to null]
**boardOwner** | [***BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to null]
**boardSectionId** | **String** | The board section to which this Pin belongs. | [optional] [default to null]
**createdAt** | **String!** |  | [optional] [readonly] [default to null]
**creativeType** | [***CreativeType**](CreativeType.md) |  | [optional] [readonly] [default to null]
**description** | **String** |  | [optional] [default to null]
**dominantColor** | **String** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] [default to null]
**hasBeenPromoted** | **Boolean!** | Whether the Pin has been promoted or not. | [optional] [readonly] [default to null]
**Id_** | **String!** |  | [default to null]
**isOwner** | **Boolean!** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] [default to null]
**isStandard** | **Boolean!** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] [default to null]
**link** | **String** |  | [optional] [default to null]
**media** | [***PinMedia**](PinMedia.md) |  | [optional] [readonly] [default to null]
**parentPinId** | **String** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] [default to null]
**pinMetrics** | [***TodoObjectMapping**](.md) | Pin metrics with associated time intervals if any. | [optional] [readonly] [default to null]
**title** | **String** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


