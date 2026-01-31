# OauthAccessTokenResponseClientCredentials

A successful OAuth client token response for the client token flow.

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
from pinterestsdk.models.oauth_access_token_response_client_credentials import OauthAccessTokenResponseClientCredentials

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessTokenResponseClientCredentials from a JSON string
oauth_access_token_response_client_credentials_instance = OauthAccessTokenResponseClientCredentials.from_json(json)
# print the JSON string representation of the object
print(OauthAccessTokenResponseClientCredentials.to_json())

# convert the object into a dict
oauth_access_token_response_client_credentials_dict = oauth_access_token_response_client_credentials_instance.to_dict()
# create an instance of OauthAccessTokenResponseClientCredentials from a dict
oauth_access_token_response_client_credentials_from_dict = OauthAccessTokenResponseClientCredentials.from_dict(oauth_access_token_response_client_credentials_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


