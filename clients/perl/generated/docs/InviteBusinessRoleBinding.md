# WWW::OpenAPIClient::Object::InviteBusinessRoleBinding

## Load the model package
```perl
use WWW::OpenAPIClient::Object::InviteBusinessRoleBinding;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_by_business_id** | **string** | Unique identifier for the business that created the invite/request. | [optional] 
**created_by_user_id** | **string** | Unique identifier for the user that created the invite/request. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that updated the invite/request. | [optional] 
**id** | **string** | Unique identifier of the invite/request. | [optional] 
**invite_data** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**is_received_invite** | **boolean** | Indicates whether the invite/request was received. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


