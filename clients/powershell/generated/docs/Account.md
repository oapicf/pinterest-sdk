# Account
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountType** | **String** | Type of account | [optional] 
**Id** | **String** | User account ID. | [optional] 
**ProfileImage** | **String** |  | [optional] 
**WebsiteUrl** | **String** |  | [optional] 
**Username** | **String** |  | [optional] 
**About** | **String** | Profile about description. | [optional] 
**BusinessName** | **String** |  | [optional] 
**BoardCount** | **Int32** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional] [readonly] 
**PinCount** | **Int32** | User account pin count. This includes both created and saved pins. | [optional] [readonly] 
**FollowerCount** | **Int32** | User account follower count. | [optional] [readonly] 
**FollowingCount** | **Int32** | User account following count. | [optional] [readonly] 
**MonthlyViews** | **Int32** | User account monthly views. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$Account = Initialize-PSOpenAPIToolsAccount  -AccountType null `
 -Id 2783136121146311751 `
 -ProfileImage null `
 -WebsiteUrl null `
 -Username null `
 -About null `
 -BusinessName null `
 -BoardCount 14 `
 -PinCount 339 `
 -FollowerCount 10 `
 -FollowingCount 347 `
 -MonthlyViews 163
```

- Convert the resource to JSON
```powershell
$Account | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

