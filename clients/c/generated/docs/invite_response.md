# invite_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**invite_assets_summary_t**](invite_assets_summary.md) \* |  | [optional] 
**business_roles** | **list_t \*** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**created_by_business** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | Metadata for the business that created the invite/request. | [optional] 
**created_by_user** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | Metadata for the user that created the invite/request. | [optional] 
**created_time** | **int** | The time the invite/request was created. Returned in milliseconds. | [optional] 
**id** | **char \*** | Unique identifier of the invite/request. | [optional] 
**invite_data** | [**base_invite_data_response_invite_data_t**](base_invite_data_response_invite_data.md) \* |  | [optional] 
**is_received_invite** | **int** | Indicates whether the invite/request was received. | [optional] 
**user** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | Metadata for the member/partner that was sent the invite/request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


