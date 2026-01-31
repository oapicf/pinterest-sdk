# BoardWithUpdatePrivacy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boardPinsModifiedAt** | **\DateTime** | Date and time of last board pins modified. | [optional] [readonly] 
**collaboratorCount** | **int** | Count of collaborators on the board. | [optional] [readonly] 
**createdAt** | **\DateTime** | Date and time of board creation. | [optional] [readonly] 
**description** | **string** |  | [optional] 
**followerCount** | **int** | Board follower count. | [optional] [readonly] 
**id** | **string** |  | [readonly] 
**isAdsOnly** | **bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**media** | [**OpenAPI\Server\Model\BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] 
**name** | **string** | Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [**OpenAPI\Server\Model\BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**pinCount** | **int** | Count of Pins on the board. | [optional] [readonly] 
**privacy** | [**OpenAPI\Server\Model\BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


