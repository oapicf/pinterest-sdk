# InviteResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`assets_summary`** | [**`*InviteAssetsSummary`**](InviteAssetsSummary.md) |  | [optional] [default to nothing]
**`business_roles`** | **`Vector{String}`** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to nothing]
**`created_by_business`** | [**`*BusinessAccessUserSummary`**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] [default to nothing]
**`created_by_user`** | [**`*BusinessAccessUserSummary`**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] [default to nothing]
**`created_time`** | **`Int64`** | The time the invite/request was created. Returned in milliseconds. | [optional] [default to nothing]
**`id`** | **`String`** | Unique identifier of the invite/request. | [optional] [default to nothing]
**`invite_data`** | [**`*InviteDataResponse`**](InviteDataResponse.md) |  | [optional] [default to nothing]
**`is_received_invite`** | **`Bool`** | Indicates whether the invite/request was received. | [optional] [default to nothing]
**`user`** | [**`*BusinessAccessUserSummary`**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


