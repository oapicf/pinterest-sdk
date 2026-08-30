# Org.OpenAPITools.Model.Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | [readonly] 
**Name** | **string** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**BoardPinsModifiedAt** | **DateTime** | Date and time of last board pins modified. | [optional] [readonly] 
**CollaboratorCount** | **int** | Count of collaborators on the board. | [optional] [readonly] 
**CreatedAt** | **DateTime** | Date and time of board creation. | [optional] [readonly] 
**Description** | **string** |  | [optional] 
**FollowerCount** | **int** | Board follower count. | [optional] [readonly] 
**IsAdsOnly** | **bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**Media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] 
**Owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**PinCount** | **int** | Count of Pins on the board. | [optional] [readonly] 
**Privacy** | **BoardPrivacy** |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

