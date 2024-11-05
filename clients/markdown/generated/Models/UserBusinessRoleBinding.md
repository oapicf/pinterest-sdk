# UserBusinessRoleBinding
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **assets\_summary** | [**BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) |  | [optional] [default to null] |
| **business\_roles** | **List** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to null] |
| **created\_by\_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] [default to null] |
| **created\_by\_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] [default to null] |
| **created\_time** | **Integer** | The time the business relationship was created. Returned in milliseconds. | [optional] [default to null] |
| **id** | **String** | Unique identifier of the business member/business partner/employer. | [optional] [default to null] |
| **is\_shared\_partner** | **Boolean** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] [default to null] |
| **user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

