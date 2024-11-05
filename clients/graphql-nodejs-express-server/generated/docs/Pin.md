# Pin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** |  | [optional] [readonly] [default to null]
**createdAt** | **String!** |  | [optional] [readonly] [default to null]
**link** | **String** |  | [optional] [default to null]
**title** | **String** |  | [optional] [default to null]
**description** | **String** |  | [optional] [default to null]
**dominantColor** | **String** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] [default to null]
**altText** | **String** |  | [optional] [default to null]
**creativeType** | [***CreativeType**](CreativeType.md) |  | [optional] [readonly] [default to null]
**boardId** | **String!** | The board to which this Pin belongs. | [optional] [default to null]
**boardSectionId** | **String** | The board section to which this Pin belongs. | [optional] [default to null]
**boardOwner** | [***BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to null]
**isOwner** | **Boolean!** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] [default to null]
**media** | [***PinMedia**](PinMedia.md) |  | [optional] [readonly] [default to null]
**mediaSource** | [***PinMediaSource**](PinMediaSource.md) |  | [optional] [default to null]
**parentPinId** | **String** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to null]
**isStandard** | **Boolean!** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] [default to null]
**hasBeenPromoted** | **Boolean!** | Whether the Pin has been promoted or not. | [optional] [readonly] [default to null]
**note** | **String** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to null]
**pinMetrics** | [***TodoObjectMapping**](.md) | Pin metrics with associated time intervals if any. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


