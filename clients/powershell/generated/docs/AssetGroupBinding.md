# AssetGroupBinding
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Asset Group ID. | [optional] 
**AssetGroupName** | **String** | Asset Group name | [optional] 
**AssetGroupDescription** | **String** | Asset group description | [optional] 
**AssetGroupTypes** | **String[]** | Asset group types | [optional] 
**AdAccountsIds** | **String[]** | A list of ad account IDs under the asset group | [optional] 
**ProfilesIds** | **String[]** | A list of profile IDs under asset group | [optional] 
**CreatedTime** | **Int32** | The creation time of the asset group | [optional] 
**UpdatedTime** | **Int32** | The last update time of the asset group | [optional] 
**Owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional] 
**CreatedBy** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional] 

## Examples

- Prepare the resource
```powershell
$AssetGroupBinding = Initialize-PSOpenAPIToolsAssetGroupBinding  -Id 666791336903426391 `
 -AssetGroupName Canada Ad Accounts `
 -AssetGroupDescription Asset group that has ad accounts used in Canada `
 -AssetGroupTypes [&quot;LOCATION_OR_LANGUAGE&quot;] `
 -AdAccountsIds [&quot;549755885175&quot;] `
 -ProfilesIds [&quot;630433785246278264&quot;] `
 -CreatedTime 1646767577816 `
 -UpdatedTime 1646767577816 `
 -Owner null `
 -CreatedBy null
```

- Convert the resource to JSON
```powershell
$AssetGroupBinding | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

