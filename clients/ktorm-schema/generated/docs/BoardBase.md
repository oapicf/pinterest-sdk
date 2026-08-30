
# Table `BoardBase`
(mapped from: BoardBase)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**boardPinsModifiedAt** | board_pins_modified_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time of last board pins modified. |  [optional] [readonly]
**collaboratorCount** | collaborator_count | int UNSIGNED |  | **kotlin.Int** | Count of collaborators on the board. |  [optional] [readonly]
**createdAt** | created_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time of board creation. |  [optional] [readonly]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**followerCount** | follower_count | int UNSIGNED |  | **kotlin.Int** | Board follower count. |  [optional] [readonly]
**isAdsOnly** | is_ads_only | boolean |  | **kotlin.Boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. |  [optional]
**media** | media | long |  | [**BoardMedia**](BoardMedia.md) | Board media. |  [optional] [readonly] [foreignkey]
**owner** | owner | long |  | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly] [foreignkey]
**pinCount** | pin_count | int UNSIGNED |  | **kotlin.Int** | Count of Pins on the board. |  [optional] [readonly]













