# OauthAccessTokenResponseRefresh

A successful OAuth access token response for the refresh token flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **str** |  | 
**expires_in** | **int** |  | 
**response_type** | **str** |  | [optional] 
**scope** | **str** |  | 
**token_type** | **str** |  | [default to 'bearer']
**refresh_token** | **str** |  | 
**refresh_token_expires_at** | **int** |  | 
**refresh_token_expires_in** | **int** |  | 

## Example

```python
from pinterestsdk.models.oauth_access_token_response_refresh import OauthAccessTokenResponseRefresh

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessTokenResponseRefresh from a JSON string
oauth_access_token_response_refresh_instance = OauthAccessTokenResponseRefresh.from_json(json)
# print the JSON string representation of the object
print(OauthAccessTokenResponseRefresh.to_json())

# convert the object into a dict
oauth_access_token_response_refresh_dict = oauth_access_token_response_refresh_instance.to_dict()
# create an instance of OauthAccessTokenResponseRefresh from a dict
oauth_access_token_response_refresh_from_dict = OauthAccessTokenResponseRefresh.from_dict(oauth_access_token_response_refresh_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


