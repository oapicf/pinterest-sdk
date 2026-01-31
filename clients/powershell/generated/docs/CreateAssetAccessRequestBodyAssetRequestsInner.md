# CreateAssetAccessRequestBodyAssetRequestsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetIdToPermissions** | [**System.Collections.Hashtable**](Array.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 
**PartnerId** | **String** | Unique identifier of a business partner to request asset access to. | 

## Examples

- Prepare the resource
```powershell
$CreateAssetAccessRequestBodyAssetRequestsInner = Initialize-PSOpenAPIToolsCreateAssetAccessRequestBodyAssetRequestsInner  -AssetIdToPermissions {&quot;549760723247&quot;:[&quot;ANALYST&quot;],&quot;549760723248&quot;:[&quot;ANALYST&quot;,&quot;ADMIN&quot;],&quot;809944451643622187&quot;:[&quot;PROFILE_PUBLISHER&quot;]} `
 -PartnerId 809944451643622187
```

- Convert the resource to JSON
```powershell
$CreateAssetAccessRequestBodyAssetRequestsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

