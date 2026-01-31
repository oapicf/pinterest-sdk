# ConversionAccessTokenResponse

A successful conversion access token response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **str** |  | 
**token_type** | **str** |  | [optional] [default to 'conversion']

## Example

```python
from pinterestsdk.models.conversion_access_token_response import ConversionAccessTokenResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionAccessTokenResponse from a JSON string
conversion_access_token_response_instance = ConversionAccessTokenResponse.from_json(json)
# print the JSON string representation of the object
print(ConversionAccessTokenResponse.to_json())

# convert the object into a dict
conversion_access_token_response_dict = conversion_access_token_response_instance.to_dict()
# create an instance of ConversionAccessTokenResponse from a dict
conversion_access_token_response_from_dict = ConversionAccessTokenResponse.from_dict(conversion_access_token_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


