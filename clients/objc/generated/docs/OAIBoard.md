# OAIBoard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** |  | [optional] [readonly] 
**createdAt** | **NSDate*** | Date and time of board creation. | [optional] [readonly] 
**boardPinsModifiedAt** | **NSDate*** | Date and time of last board pins modified. | [optional] [readonly] 
**name** | **NSString*** |  | 
**_description** | **NSString*** |  | [optional] 
**collaboratorCount** | **NSNumber*** | Count of collaborators on the board. | [optional] [readonly] 
**pinCount** | **NSNumber*** | Count of pins on the board. | [optional] [readonly] 
**followerCount** | **NSNumber*** | Board follower count. | [optional] [readonly] 
**media** | [**OAIBoardMedia***](OAIBoardMedia.md) |  | [optional] 
**owner** | [**OAIBoardOwner***](OAIBoardOwner.md) |  | [optional] [readonly] 
**privacy** | **NSString*** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to @"PUBLIC"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


