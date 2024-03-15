
# Board

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**id** | **kotlin.String** |  |  [optional] [readonly]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of board creation. |  [optional] [readonly]
**boardPinsModifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of last board pins modified. |  [optional] [readonly]
**description** | **kotlin.String** |  |  [optional]
**collaboratorCount** | **kotlin.Int** | Count of collaborators on the board. |  [optional] [readonly]
**pinCount** | **kotlin.Int** | Count of pins on the board. |  [optional] [readonly]
**followerCount** | **kotlin.Int** | Board follower count. |  [optional] [readonly]
**media** | [**BoardMedia**](BoardMedia.md) |  |  [optional]
**owner** | [**BoardOwner**](BoardOwner.md) |  |  [optional]
**privacy** | [**inline**](#Privacy) | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; |  [optional]


<a id="Privacy"></a>
## Enum: privacy
Name | Value
---- | -----
privacy | PUBLIC, PROTECTED, SECRET



