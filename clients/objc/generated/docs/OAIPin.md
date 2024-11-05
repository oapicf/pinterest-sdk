# OAIPin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** |  | [optional] [readonly] 
**createdAt** | **NSDate*** |  | [optional] [readonly] 
**link** | **NSString*** |  | [optional] 
**title** | **NSString*** |  | [optional] 
**_description** | **NSString*** |  | [optional] 
**dominantColor** | **NSString*** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] 
**altText** | **NSString*** |  | [optional] 
**creativeType** | [**OAICreativeType***](OAICreativeType.md) |  | [optional] [readonly] 
**boardId** | **NSString*** | The board to which this Pin belongs. | [optional] 
**boardSectionId** | **NSString*** | The board section to which this Pin belongs. | [optional] 
**boardOwner** | [**OAIBoardOwner***](OAIBoardOwner.md) |  | [optional] [readonly] 
**isOwner** | **NSNumber*** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**media** | [**OAIPinMedia***](OAIPinMedia.md) |  | [optional] [readonly] 
**mediaSource** | [**OAIPinMediaSource***](OAIPinMediaSource.md) |  | [optional] 
**parentPinId** | **NSString*** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**isStandard** | **NSNumber*** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] 
**hasBeenPromoted** | **NSNumber*** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**note** | **NSString*** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**pinMetrics** | [**NSObject***](.md) | Pin metrics with associated time intervals if any. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


