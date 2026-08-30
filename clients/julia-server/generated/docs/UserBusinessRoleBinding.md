# UserBusinessRoleBinding


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`assets_summary`** | [**`*BusinessMemberAssetsSummary`**](BusinessMemberAssetsSummary.md) | Ad accounts and profiles the business member/partner has access to. | [optional] [default to nothing]
**`business_roles`** | **`Vector{String}`** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to nothing]
**`created_by_business`** | [**`*BusinessAccessUserSummary`**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] [default to nothing]
**`created_by_user`** | [**`*BusinessAccessUserSummary`**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] [default to nothing]
**`created_time`** | **`Int64`** | The time the business relationship was created. Returned in milliseconds. | [optional] [default to nothing]
**`id`** | **`String`** | Unique identifier of the business member/business partner/employer. | [optional] [default to nothing]
**`is_shared_partner`** | **`Bool`** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] [default to nothing]
**`user`** | [**`*BusinessAccessUserSummary`**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


