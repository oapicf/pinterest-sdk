

# Board

Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional] [readonly]
**createdAt** | **OffsetDateTime** | Date and time of board creation. |  [optional] [readonly]
**boardPinsModifiedAt** | **OffsetDateTime** | Date and time of last board pins modified. |  [optional] [readonly]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**collaboratorCount** | **Int** | Count of collaborators on the board. |  [optional] [readonly]
**pinCount** | **Int** | Count of pins on the board. |  [optional] [readonly]
**followerCount** | **Int** | Board follower count. |  [optional] [readonly]
**media** | [**BoardMedia**](BoardMedia.md) |  |  [optional]
**owner** | [**BoardOwner**](BoardOwner.md) |  |  [optional]
**privacy** | [**Privacy**](#Privacy) | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; |  [optional]


## Enum: Privacy
Allowed values: [PUBLIC, PROTECTED, SECRET]




