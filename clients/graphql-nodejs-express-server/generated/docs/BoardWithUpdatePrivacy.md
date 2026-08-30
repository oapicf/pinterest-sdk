# BoardWithUpdatePrivacy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boardPinsModifiedAt** | **String!** | Date and time of last board pins modified. | [optional] [readonly] [default to null]
**collaboratorCount** | **Int!** | Count of collaborators on the board. | [optional] [readonly] [default to null]
**createdAt** | **String!** | Date and time of board creation. | [optional] [readonly] [default to null]
**description** | **String** |  | [optional] [default to null]
**followerCount** | **Int!** | Board follower count. | [optional] [readonly] [default to null]
**Id_** | **String!** |  | [readonly] [default to null]
**isAdsOnly** | **Boolean!** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**media** | [***BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] [default to null]
**name** | **String!** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [default to null]
**owner** | [***BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to null]
**pinCount** | **Int!** | Count of Pins on the board. | [optional] [readonly] [default to null]
**privacy** | [***BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


