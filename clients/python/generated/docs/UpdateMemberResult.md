# UpdateMemberResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | **str** | The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. | [optional] 
**member_id** | **str** | Unique identifier of the business member. | [optional] 

## Example

```python
from pinterestsdk.models.update_member_result import UpdateMemberResult

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMemberResult from a JSON string
update_member_result_instance = UpdateMemberResult.from_json(json)
# print the JSON string representation of the object
print(UpdateMemberResult.to_json())

# convert the object into a dict
update_member_result_dict = update_member_result_instance.to_dict()
# create an instance of UpdateMemberResult from a dict
update_member_result_from_dict = UpdateMemberResult.from_dict(update_member_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


