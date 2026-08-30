# UserWebsite


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** | Status of the verification process | [optional] [readonly] 
**verified_at** | **str** | UTC timestamp when the verification happened - sometimes missing | [optional] [readonly] 
**website** | **str** | Website with path or domain only | [optional] 

## Example

```python
from pinterestsdk.models.user_website import UserWebsite

# TODO update the JSON string below
json = "{}"
# create an instance of UserWebsite from a JSON string
user_website_instance = UserWebsite.from_json(json)
# print the JSON string representation of the object
print(UserWebsite.to_json())

# convert the object into a dict
user_website_dict = user_website_instance.to_dict()
# create an instance of UserWebsite from a dict
user_website_from_dict = UserWebsite.from_dict(user_website_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


