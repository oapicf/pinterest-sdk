# openapi::BaseInviteDataResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Unique identifier of the invite/request. | [optional] [Pattern: ^\\d+$] 
**invite_data** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponse_invite_data.md) |  | [optional] 
**is_received_invite** | **character** | Indicates whether the invite/request was received. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 


