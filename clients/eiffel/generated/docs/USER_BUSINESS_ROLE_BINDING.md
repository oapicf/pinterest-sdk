# USER_BUSINESS_ROLE_BINDING

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**BUSINESS_MEMBER_ASSETS_SUMMARY**](BusinessMemberAssetsSummary.md) |  | [optional] [default to null]
**business_roles** | [**LIST [STRING_32]**](STRING_32.md) | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to null]
**created_by_business** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] [default to null]
**created_by_user** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] [default to null]
**created_time** | **INTEGER_32** | The time the business relationship was created. Returned in milliseconds. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Unique identifier of the business member/business partner/employer. | [optional] [default to null]
**is_shared_partner** | **BOOLEAN** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] [default to null]
**user** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


