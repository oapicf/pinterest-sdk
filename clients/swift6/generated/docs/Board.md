# Board

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boardPinsModifiedAt** | **Date** | Date and time of last board pins modified. | [optional] [readonly] 
**collaboratorCount** | **Int** | Count of collaborators on the board. | [optional] [readonly] 
**createdAt** | **Date** | Date and time of board creation. | [optional] [readonly] 
**description** | **String** |  | [optional] 
**followerCount** | **Int** | Board follower count. | [optional] [readonly] 
**id** | **String** |  | [readonly] 
**isAdsOnly** | **Bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] 
**name** | **String** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**pinCount** | **Int** | Count of Pins on the board. | [optional] [readonly] 
**privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


