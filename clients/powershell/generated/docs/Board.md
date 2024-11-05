# Board
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] [readonly] 
**CreatedAt** | **System.DateTime** | Date and time of board creation. | [optional] [readonly] 
**BoardPinsModifiedAt** | **System.DateTime** | Date and time of last board pins modified. | [optional] [readonly] 
**Name** | **String** |  | 
**Description** | **String** |  | [optional] 
**CollaboratorCount** | **Int32** | Count of collaborators on the board. | [optional] [readonly] 
**PinCount** | **Int32** | Count of pins on the board. | [optional] [readonly] 
**FollowerCount** | **Int32** | Board follower count. | [optional] [readonly] 
**Media** | [**BoardMedia**](BoardMedia.md) |  | [optional] 
**Owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**Privacy** | **String** | Privacy setting for a board. Learn more about &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/article/secret-boards&quot;&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/protected-boards&quot;&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to "PUBLIC"]

## Examples

- Prepare the resource
```powershell
$Board = Initialize-PSOpenAPIToolsBoard  -Id 549755885175 `
 -CreatedAt 2020-01-01T20:10:40Z `
 -BoardPinsModifiedAt 2020-01-01T20:10:40Z `
 -Name Summer Recipes `
 -Description My favorite summer recipes `
 -CollaboratorCount 17 `
 -PinCount 5 `
 -FollowerCount 13 `
 -Media null `
 -Owner null `
 -Privacy null
```

- Convert the resource to JSON
```powershell
$Board | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

