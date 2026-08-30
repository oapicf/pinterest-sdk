# ConversionAccessToken

A successful conversion access token response.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **str** |  | 
**token_type** | **str** |  | [optional] [default to 'conversion']

## Example

```python
from openapi_client.models.conversion_access_token import ConversionAccessToken

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionAccessToken from a JSON string
conversion_access_token_instance = ConversionAccessToken.from_json(json)
# print the JSON string representation of the object
print ConversionAccessToken.to_json()

# convert the object into a dict
conversion_access_token_dict = conversion_access_token_instance.to_dict()
# create an instance of ConversionAccessToken from a dict
conversion_access_token_from_dict = ConversionAccessToken.from_dict(conversion_access_token_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


