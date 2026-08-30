# invite_business_role_binding_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_by_business_id** | **char \*** | Unique identifier for the business that created the invite/request. | [optional] 
**created_by_user_id** | **char \*** | Unique identifier for the user that created the invite/request. | [optional] 
**id** | **char \*** | Unique identifier of the invite/request. | [optional] 
**invite_data** | [**invite_data_response_t**](invite_data_response.md) \* |  | [optional] 
**is_received_invite** | **int** | Indicates whether the invite/request was received. | [optional] 
**user** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | Metadata for the member/partner that was sent the invite/request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


