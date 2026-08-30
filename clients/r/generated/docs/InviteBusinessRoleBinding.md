# openapi::InviteBusinessRoleBinding

An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_by_business_id** | **character** | Unique identifier for the business that created the invite/request. | [optional] 
**created_by_user_id** | **character** | Unique identifier for the user that created the invite/request. | [optional] 
**id** | **character** | Unique identifier of the invite/request. | [optional] [Pattern: ^\\d+$] 
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] 
**is_received_invite** | **character** | Indicates whether the invite/request was received. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 


