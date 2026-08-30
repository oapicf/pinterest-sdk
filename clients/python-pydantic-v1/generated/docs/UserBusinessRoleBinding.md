# UserBusinessRoleBinding


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**BusinessMemberAssetsSummary**](BusinessMemberAssetsSummary.md) | Ad accounts and profiles the business member/partner has access to. | [optional] 
**business_roles** | **List[str]** | The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] 
**created_by_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the business relationship. | [optional] 
**created_by_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the business relationship. | [optional] 
**created_time** | **int** | The time the business relationship was created. Returned in milliseconds. | [optional] 
**id** | **str** | Unique identifier of the business member/business partner/employer. | [optional] 
**is_shared_partner** | **bool** | This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business member/business partner/employer. | [optional] 

## Example

```python
from openapi_client.models.user_business_role_binding import UserBusinessRoleBinding

# TODO update the JSON string below
json = "{}"
# create an instance of UserBusinessRoleBinding from a JSON string
user_business_role_binding_instance = UserBusinessRoleBinding.from_json(json)
# print the JSON string representation of the object
print UserBusinessRoleBinding.to_json()

# convert the object into a dict
user_business_role_binding_dict = user_business_role_binding_instance.to_dict()
# create an instance of UserBusinessRoleBinding from a dict
user_business_role_binding_from_dict = UserBusinessRoleBinding.from_dict(user_business_role_binding_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


