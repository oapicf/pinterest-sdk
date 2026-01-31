# UserWebsiteVerifyRequest

User website verification request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verification_method** | **str** |  | [optional] [default to 'METATAG']
**website** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.user_website_verify_request import UserWebsiteVerifyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UserWebsiteVerifyRequest from a JSON string
user_website_verify_request_instance = UserWebsiteVerifyRequest.from_json(json)
# print the JSON string representation of the object
print(UserWebsiteVerifyRequest.to_json())

# convert the object into a dict
user_website_verify_request_dict = user_website_verify_request_instance.to_dict()
# create an instance of UserWebsiteVerifyRequest from a dict
user_website_verify_request_from_dict = UserWebsiteVerifyRequest.from_dict(user_website_verify_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


