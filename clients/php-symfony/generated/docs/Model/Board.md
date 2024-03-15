# Board

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [readonly] 
**createdAt** | **\DateTime** | Date and time of board creation. | [optional] [readonly] 
**boardPinsModifiedAt** | **\DateTime** | Date and time of last board pins modified. | [optional] [readonly] 
**name** | **string** |  | 
**description** | **string** |  | [optional] 
**collaboratorCount** | **int** | Count of collaborators on the board. | [optional] [readonly] 
**pinCount** | **int** | Count of pins on the board. | [optional] [readonly] 
**followerCount** | **int** | Board follower count. | [optional] [readonly] 
**media** | [**OpenAPI\Server\Model\BoardMedia**](BoardMedia.md) |  | [optional] 
**owner** | [**OpenAPI\Server\Model\BoardOwner**](BoardOwner.md) |  | [optional] 
**privacy** | **string** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to 'PUBLIC']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


