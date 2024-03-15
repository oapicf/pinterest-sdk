# FollowUserRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoFollow** | **Boolean** | Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed. | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$FollowUserRequest = Initialize-PSOpenAPIToolsFollowUserRequest  -AutoFollow false
```

- Convert the resource to JSON
```powershell
$FollowUserRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

