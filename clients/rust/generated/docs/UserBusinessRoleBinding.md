# UserBusinessRoleBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | Option<[**models::BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md)> |  | [optional]
**business_roles** | Option<**Vec<String>**> | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional]
**created_by_business** | Option<[**models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md)> | Metadata for the business that created the business relationship. | [optional]
**created_by_user** | Option<[**models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md)> | Metadata for the user that created the business relationship. | [optional]
**created_time** | Option<**i32**> | The time the business relationship was created. Returned in milliseconds. | [optional]
**id** | Option<**String**> | Unique identifier of the business member/business partner/employer. | [optional]
**is_shared_partner** | Option<**bool**> | This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to. | [optional]
**user** | Option<[**models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md)> | Metadata for the business member/business partner/employer. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


