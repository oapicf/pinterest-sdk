# Board
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BoardPinsModifiedAt** | **System.DateTime** | Date and time of last board pins modified. | [optional] [readonly] 
**CollaboratorCount** | **Int32** | Count of collaborators on the board. | [optional] [readonly] 
**CreatedAt** | **System.DateTime** | Date and time of board creation. | [optional] [readonly] 
**Description** | **String** |  | [optional] 
**FollowerCount** | **Int32** | Board follower count. | [optional] [readonly] 
**Id** | **String** |  | [readonly] 
**IsAdsOnly** | **Boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to $false]
**Media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] 
**Name** | **String** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes &quot;&quot;Ad-only Pins&quot;&quot;. | 
**Owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**PinCount** | **Int32** | Count of Pins on the board. | [optional] [readonly] 
**Privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$Board = Initialize-PSOpenAPIToolsBoard  -BoardPinsModifiedAt null `
 -CollaboratorCount 17 `
 -CreatedAt null `
 -Description My favorite summer recipes `
 -FollowerCount 13 `
 -Id 549755885175 `
 -IsAdsOnly true `
 -Media null `
 -Name Summer recipes `
 -Owner null `
 -PinCount 5 `
 -Privacy null
```

- Convert the resource to JSON
```powershell
$Board | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

