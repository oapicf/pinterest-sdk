# UserBusinessRoleBinding
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetsSummary** | [**BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) |  | [optional] 
**BusinessRoles** | **String[]** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**CreatedByBusiness** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] 
**CreatedByUser** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] 
**CreatedTime** | **Int32** | The time the business relationship was created. Returned in milliseconds. | [optional] 
**Id** | **String** | Unique identifier of the business member/business partner/employer. | [optional] 
**IsSharedPartner** | **Boolean** | This field is only relevant when business_role&#x3D;&quot;&quot;PARTNER&quot;&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] 
**User** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] 

## Examples

- Prepare the resource
```powershell
$UserBusinessRoleBinding = Initialize-PSOpenAPIToolsUserBusinessRoleBinding  -AssetsSummary null `
 -BusinessRoles [&quot;BIZ_ADMIN&quot;] `
 -CreatedByBusiness null `
 -CreatedByUser null `
 -CreatedTime 1646767577816 `
 -Id 383791336903426391 `
 -IsSharedPartner false `
 -User null
```

- Convert the resource to JSON
```powershell
$UserBusinessRoleBinding | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

