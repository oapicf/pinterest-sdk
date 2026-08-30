# UserWebsiteCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verification_method** | [**WebsiteVerificationMethod**](WebsiteVerificationMethod.md) | Method used to verify website ownership. | [optional] 
**website** | **str** | Website with path or domain only | [optional] 

## Example

```python
from openapi_client.models.user_website_create import UserWebsiteCreate

# TODO update the JSON string below
json = "{}"
# create an instance of UserWebsiteCreate from a JSON string
user_website_create_instance = UserWebsiteCreate.from_json(json)
# print the JSON string representation of the object
print UserWebsiteCreate.to_json()

# convert the object into a dict
user_website_create_dict = user_website_create_instance.to_dict()
# create an instance of UserWebsiteCreate from a dict
user_website_create_from_dict = UserWebsiteCreate.from_dict(user_website_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


