# OauthAccessTokenRequestClientCredentials


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **str** |  | 
**grant_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.oauth_access_token_request_client_credentials import OauthAccessTokenRequestClientCredentials

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessTokenRequestClientCredentials from a JSON string
oauth_access_token_request_client_credentials_instance = OauthAccessTokenRequestClientCredentials.from_json(json)
# print the JSON string representation of the object
print(OauthAccessTokenRequestClientCredentials.to_json())

# convert the object into a dict
oauth_access_token_request_client_credentials_dict = oauth_access_token_request_client_credentials_instance.to_dict()
# create an instance of OauthAccessTokenRequestClientCredentials from a dict
oauth_access_token_request_client_credentials_from_dict = OauthAccessTokenRequestClientCredentials.from_dict(oauth_access_token_request_client_credentials_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


