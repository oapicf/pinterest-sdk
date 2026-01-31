# OAIPin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**altText** | **NSString*** |  | [optional] 
**boardId** | **NSString*** | The board to which this Pin belongs. | [optional] 
**boardOwner** | [**OAIBoardOwner***](OAIBoardOwner.md) |  | [optional] [readonly] 
**boardSectionId** | **NSString*** | The board section to which this Pin belongs. | [optional] 
**createdAt** | **NSDate*** |  | [optional] [readonly] 
**creativeType** | [**OAICreativeType***](OAICreativeType.md) |  | [optional] [readonly] 
**_description** | **NSString*** |  | [optional] 
**dominantColor** | **NSString*** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**hasBeenPromoted** | **NSNumber*** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**_id** | **NSString*** |  | 
**isOwner** | **NSNumber*** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**isStandard** | **NSNumber*** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**link** | **NSString*** |  | [optional] 
**media** | [**OAIPinMedia***](OAIPinMedia.md) |  | [optional] [readonly] 
**parentPinId** | **NSString*** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**pinMetrics** | [**NSObject***](.md) | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**title** | **NSString*** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


