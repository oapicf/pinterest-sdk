# Pin

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
**creativeType** | [**OpenAPI\Server\Model\CreativeType**](CreativeType.md) |  | [optional] [readonly] 
**boardId** | **string** | The board to which this Pin belongs. | [optional] 
**boardSectionId** | **string** | The board section to which this Pin belongs. | [optional] 
**boardOwner** | [**OpenAPI\Server\Model\BoardOwner**](BoardOwner.md) |  | [optional] 
**isOwner** | **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**media** | [**OpenAPI\Server\Model\SummaryPinMedia**](SummaryPinMedia.md) |  | [optional] 
**mediaSource** | [**OpenAPI\Server\Model\PinMediaSource**](PinMediaSource.md) |  | [optional] 
**parentPinId** | **string** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**isStandard** | **bool** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/content/update/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] 
**hasBeenPromoted** | **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**note** | **string** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**pinMetrics** | **array** | Pin metrics with associated time intervals if any. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


