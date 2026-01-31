# OauthAccessTokenResponseIntegrationRefresh


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refresh_token** | **str** |  | 
**refresh_token_expires_in** | **int** |  | 
**access_token** | **str** |  | 
**expires_in** | **int** |  | 
**response_type** | **str** |  | [optional] 
**scope** | **str** |  | 
**token_type** | **str** |  | [default to 'bearer']

## Example

```python
from pinterestsdk.models.oauth_access_token_response_integration_refresh import OauthAccessTokenResponseIntegrationRefresh

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessTokenResponseIntegrationRefresh from a JSON string
oauth_access_token_response_integration_refresh_instance = OauthAccessTokenResponseIntegrationRefresh.from_json(json)
# print the JSON string representation of the object
print(OauthAccessTokenResponseIntegrationRefresh.to_json())

# convert the object into a dict
oauth_access_token_response_integration_refresh_dict = oauth_access_token_response_integration_refresh_instance.to_dict()
# create an instance of OauthAccessTokenResponseIntegrationRefresh from a dict
oauth_access_token_response_integration_refresh_from_dict = OauthAccessTokenResponseIntegrationRefresh.from_dict(oauth_access_token_response_integration_refresh_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


