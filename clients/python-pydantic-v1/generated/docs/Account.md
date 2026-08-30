# Account

User account model containing properties related to a user's account.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**about** | **str** | Profile about description. | [optional] 
**account_type** | [**UserAccountType**](UserAccountType.md) | Type of account | [optional] 
**board_count** | **int** |   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. | [optional] [readonly] 
**business_name** | **str** |  | [optional] 
**follower_count** | **int** | User account follower count. | [optional] [readonly] 
**following_count** | **int** | User account following count. | [optional] [readonly] 
**id** | **str** | User account ID. | [optional] 
**monthly_views** | **int** | User account monthly views. | [optional] [readonly] 
**pin_count** | **int** | User account pin count. This includes both created and saved pins. | [optional] [readonly] 
**profile_image** | **str** |  | [optional] 
**username** | **str** |  | [optional] 
**website_url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.account import Account

# TODO update the JSON string below
json = "{}"
# create an instance of Account from a JSON string
account_instance = Account.from_json(json)
# print the JSON string representation of the object
print Account.to_json()

# convert the object into a dict
account_dict = account_instance.to_dict()
# create an instance of Account from a dict
account_from_dict = Account.from_dict(account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


