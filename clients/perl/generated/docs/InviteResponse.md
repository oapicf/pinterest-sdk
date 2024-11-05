# WWW::OpenAPIClient::Object::InviteResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::InviteResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] 
**business_roles** | **ARRAY[string]** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**created_by_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] 
**created_by_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] 
**created_time** | **int** | The time the invite/request was created. Returned in milliseconds. | [optional] 
**id** | **string** | Unique identifier of the invite/request. | [optional] 
**invite_data** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**is_received_invite** | **boolean** | Indicates whether the invite/request was received. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


