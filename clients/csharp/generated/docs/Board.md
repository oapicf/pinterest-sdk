# Org.OpenAPITools.Model.Board
Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | [optional] [readonly] 
**CreatedAt** | **DateTime** | Date and time of board creation. | [optional] [readonly] 
**BoardPinsModifiedAt** | **DateTime** | Date and time of last board pins modified. | [optional] [readonly] 
**Name** | **string** |  | 
**Description** | **string** |  | [optional] 
**CollaboratorCount** | **int** | Count of collaborators on the board. | [optional] [readonly] 
**PinCount** | **int** | Count of pins on the board. | [optional] [readonly] 
**FollowerCount** | **int** | Board follower count. | [optional] [readonly] 
**Media** | [**BoardMedia**](BoardMedia.md) |  | [optional] 
**Owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] 
**Privacy** | **string** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to PrivacyEnum.PUBLIC]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

