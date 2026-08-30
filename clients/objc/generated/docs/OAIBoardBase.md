# OAIBoardBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boardPinsModifiedAt** | **NSDate*** | Date and time of last board pins modified. | [optional] [readonly] 
**collaboratorCount** | **NSNumber*** | Count of collaborators on the board. | [optional] [readonly] 
**createdAt** | **NSDate*** | Date and time of board creation. | [optional] [readonly] 
**_description** | **NSString*** |  | [optional] 
**followerCount** | **NSNumber*** | Board follower count. | [optional] [readonly] 
**_id** | **NSString*** |  | [readonly] 
**isAdsOnly** | **NSNumber*** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to @(NO)]
**media** | [**OAIBoardMedia***](OAIBoardMedia.md) | Board media. | [optional] [readonly] 
**name** | **NSString*** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [**OAIBoardOwner***](OAIBoardOwner.md) |  | [optional] [readonly] 
**pinCount** | **NSNumber*** | Count of Pins on the board. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


