# Board

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** |  | [optional] [readonly] [default to null]
**createdAt** | **String!** | Date and time of board creation. | [optional] [readonly] [default to null]
**boardPinsModifiedAt** | **String!** | Date and time of last board pins modified. | [optional] [readonly] [default to null]
**name** | **String!** |  | [default to null]
**description** | **String** |  | [optional] [default to null]
**collaboratorCount** | **Int!** | Count of collaborators on the board. | [optional] [readonly] [default to null]
**pinCount** | **Int!** | Count of pins on the board. | [optional] [readonly] [default to null]
**followerCount** | **Int!** | Board follower count. | [optional] [readonly] [default to null]
**media** | [***BoardMedia**](Board_media.md) |  | [optional] [default to null]
**owner** | [***BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to null]
**privacy** | **String!** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to PUBLIC]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


