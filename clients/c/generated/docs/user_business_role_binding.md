# user_business_role_binding_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**business_member_assets_summary_t**](business_member_assets_summary.md) \* |  | [optional] 
**business_roles** | **list_t \*** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**created_by_business** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | Metadata for the business that created the business relationship. | [optional] 
**created_by_user** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | Metadata for the user that created the business relationship. | [optional] 
**created_time** | **int** | The time the business relationship was created. Returned in milliseconds. | [optional] 
**id** | **char \*** | Unique identifier of the business member/business partner/employer. | [optional] 
**is_shared_partner** | **int** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] 
**user** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | Metadata for the business member/business partner/employer. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


