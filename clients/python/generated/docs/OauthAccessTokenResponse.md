# OauthAccessTokenResponse

A successful OAuth access token response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **str** |  | 
**expires_in** | **int** |  | 
**response_type** | **str** |  | [optional] 
**scope** | **str** |  | 
**token_type** | **str** |  | [default to 'bearer']

## Example

```python
from pinterestsdk.models.oauth_access_token_response import OauthAccessTokenResponse

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessTokenResponse from a JSON string
oauth_access_token_response_instance = OauthAccessTokenResponse.from_json(json)
# print the JSON string representation of the object
print(OauthAccessTokenResponse.to_json())

# convert the object into a dict
oauth_access_token_response_dict = oauth_access_token_response_instance.to_dict()
# create an instance of OauthAccessTokenResponse from a dict
oauth_access_token_response_from_dict = OauthAccessTokenResponse.from_dict(oauth_access_token_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


