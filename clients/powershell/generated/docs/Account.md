# Account
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**About** | **String** | Profile about description. | [optional] 
**AccountType** | **String** | Type of account | [optional] 
**BoardCount** | **Int32** | User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional] [readonly] 
**BusinessName** | **String** |  | [optional] 
**FollowerCount** | **Int32** | User account follower count. | [optional] [readonly] 
**FollowingCount** | **Int32** | User account following count. | [optional] [readonly] 
**Id** | **String** | User account ID. | [optional] 
**MonthlyViews** | **Int32** | User account monthly views. | [optional] [readonly] 
**PinCount** | **Int32** | User account pin count. This includes both created and saved pins. | [optional] [readonly] 
**ProfileImage** | **String** |  | [optional] 
**Username** | **String** |  | [optional] 
**WebsiteUrl** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Account = Initialize-PSOpenAPIToolsAccount  -About null `
 -AccountType null `
 -BoardCount 14 `
 -BusinessName null `
 -FollowerCount 10 `
 -FollowingCount 347 `
 -Id 2783136121146311751 `
 -MonthlyViews 163 `
 -PinCount 339 `
 -ProfileImage null `
 -Username null `
 -WebsiteUrl null
```

- Convert the resource to JSON
```powershell
$Account | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

