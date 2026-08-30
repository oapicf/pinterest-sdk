# AssetGroupBinding
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountsIds** | **String[]** | A list of ad account IDs under the asset group | 
**AssetGroupDescription** | **String** | Asset group description | 
**AssetGroupName** | **String** | Asset Group name | 
**AssetGroupTypes** | **String[]** | Asset group types | 
**CatalogsIds** | **String[]** | A list of catalog IDs under asset group | 
**CreatedBy** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | 
**CreatedTime** | **Int32** | The creation time of the asset group | 
**Id** | **String** | Asset Group ID. | 
**Owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | 
**ProfilesIds** | **String[]** | A list of profile IDs under asset group | 
**UpdatedTime** | **Int32** | The last update time of the asset group | 

## Examples

- Prepare the resource
```powershell
$AssetGroupBinding = Initialize-PSOpenAPIToolsAssetGroupBinding  -AdAccountsIds [&quot;549755885175&quot;] `
 -AssetGroupDescription Asset group that has ad accounts used in Canada `
 -AssetGroupName Canada Ad Accounts `
 -AssetGroupTypes [&quot;LOCATION_OR_LANGUAGE&quot;] `
 -CatalogsIds [&quot;4836859046874&quot;] `
 -CreatedBy null `
 -CreatedTime 1646767577816 `
 -Id 666791336903426391 `
 -Owner null `
 -ProfilesIds [&quot;630433785246278264&quot;] `
 -UpdatedTime 1646767577816
```

- Convert the resource to JSON
```powershell
$AssetGroupBinding | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

