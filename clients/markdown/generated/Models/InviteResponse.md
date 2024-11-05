# InviteResponse
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **assets\_summary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] [default to null] |
| **business\_roles** | **List** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to null] |
| **created\_by\_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] [default to null] |
| **created\_by\_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] [default to null] |
| **created\_time** | **Integer** | The time the invite/request was created. Returned in milliseconds. | [optional] [default to null] |
| **id** | **String** | Unique identifier of the invite/request. | [optional] [default to null] |
| **invite\_data** | [**BaseInviteDataResponse_invite_data**](BaseInviteDataResponse_invite_data.md) |  | [optional] [default to null] |
| **is\_received\_invite** | **Boolean** | Indicates whether the invite/request was received. | [optional] [default to null] |
| **user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

