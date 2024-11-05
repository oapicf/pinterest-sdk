# openapi::UserBusinessRoleBinding


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) |  | [optional] 
**business_roles** | **array[character]** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**created_by_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] 
**created_by_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] 
**created_time** | **integer** | The time the business relationship was created. Returned in milliseconds. | [optional] 
**id** | **character** | Unique identifier of the business member/business partner/employer. | [optional] [Pattern: ^\\d+$] 
**is_shared_partner** | **character** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] 


