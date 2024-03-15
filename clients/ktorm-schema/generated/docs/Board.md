
# Table `Board`
(mapped from: Board)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional] [readonly]
**createdAt** | created_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time of board creation. |  [optional] [readonly]
**boardPinsModifiedAt** | board_pins_modified_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time of last board pins modified. |  [optional] [readonly]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**collaboratorCount** | collaborator_count | int UNSIGNED |  | **kotlin.Int** | Count of collaborators on the board. |  [optional] [readonly]
**pinCount** | pin_count | int UNSIGNED |  | **kotlin.Int** | Count of pins on the board. |  [optional] [readonly]
**followerCount** | follower_count | int UNSIGNED |  | **kotlin.Int** | Board follower count. |  [optional] [readonly]
**media** | media | long |  | [**BoardMedia**](BoardMedia.md) |  |  [optional] [foreignkey]
**owner** | owner | long |  | [**BoardOwner**](BoardOwner.md) |  |  [optional] [foreignkey]
**privacy** | privacy | text |  | [**privacy**](#Privacy) | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; |  [optional]













