# # InviteResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**\OpenAPI\Client\Model\InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional]
**business_roles** | **string[]** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional]
**created_by_business** | [**\OpenAPI\Client\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional]
**created_by_user** | [**\OpenAPI\Client\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional]
**created_time** | **int** | The time the invite/request was created. Returned in milliseconds. | [optional]
**id** | **string** | Unique identifier of the invite/request. | [optional]
**invite_data** | [**\OpenAPI\Client\Model\BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional]
**is_received_invite** | **bool** | Indicates whether the invite/request was received. | [optional]
**user** | [**\OpenAPI\Client\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
