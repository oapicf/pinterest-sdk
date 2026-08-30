

# BoardWithUpdatePrivacy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**boardPinsModifiedAt** | **OffsetDateTime** | Date and time of last board pins modified. |  [optional] [readonly] |
|**collaboratorCount** | **Integer** | Count of collaborators on the board. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Date and time of board creation. |  [optional] [readonly] |
|**description** | **String** |  |  [optional] |
|**followerCount** | **Integer** | Board follower count. |  [optional] [readonly] |
|**id** | **String** |  |  [readonly] |
|**isAdsOnly** | **Boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. |  [optional] |
|**media** | [**BoardMedia**](BoardMedia.md) | Board media. |  [optional] [readonly] |
|**name** | **String** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. |  |
|**owner** | [**BoardOwner**](BoardOwner.md) |  |  [optional] [readonly] |
|**pinCount** | **Integer** | Count of Pins on the board. |  [optional] [readonly] |
|**privacy** | **BoardUpdatePrivacy** |  |  [optional] |



