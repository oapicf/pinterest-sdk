# UserBusinessRoleBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [***models::BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) | Ad accounts and profiles the business member/partner has access to. | [optional] [default to None]
**business_roles** | **Vec<models::BusinessRoleResponse>** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to None]
**created_by_business** | [***models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] [default to None]
**created_by_user** | [***models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] [default to None]
**created_time** | **i32** | The time the business relationship was created. Returned in milliseconds. | [optional] [default to None]
**id** | **String** | Unique identifier of the business member/business partner/employer. | [optional] [default to None]
**is_shared_partner** | **bool** | This field is only relevant when business_role=\"PARTNER\". If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to. | [optional] [default to None]
**user** | [***models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


