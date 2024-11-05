# PinCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [readonly] 
**createdAt** | **\DateTime** |  | [optional] [readonly] 
**link** | **string** |  | [optional] 
**title** | **string** |  | [optional] 
**description** | **string** |  | [optional] 
**dominantColor** | **string** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] 
**altText** | **string** |  | [optional] 
**boardId** | **string** | The board to which this Pin belongs. | [optional] 
**boardSectionId** | **string** | The board section to which this Pin belongs. | [optional] 
**boardOwner** | [**OpenAPI\Server\Model\BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**media** | [**OpenAPI\Server\Model\PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**mediaSource** | [**OpenAPI\Server\Model\PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parentPinId** | **string** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**note** | **string** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


