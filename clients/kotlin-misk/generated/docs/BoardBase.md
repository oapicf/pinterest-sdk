
# BoardBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [readonly]
**name** | **kotlin.String** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**boardPinsModifiedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of last board pins modified. |  [optional] [readonly]
**collaboratorCount** | **kotlin.Int** | Count of collaborators on the board. |  [optional] [readonly]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of board creation. |  [optional] [readonly]
**description** | **kotlin.String** |  |  [optional]
**followerCount** | **kotlin.Int** | Board follower count. |  [optional] [readonly]
**isAdsOnly** | **kotlin.Boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. |  [optional]
**media** | [**BoardMedia**](BoardMedia.md) | Board media. |  [optional] [readonly]
**owner** | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly]
**pinCount** | **kotlin.Int** | Count of Pins on the board. |  [optional] [readonly]



