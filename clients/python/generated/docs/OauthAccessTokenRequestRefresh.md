# OauthAccessTokenRequestRefresh


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refresh_token** | **str** |  | 
**scope** | **str** |  | [optional] 
**grant_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.oauth_access_token_request_refresh import OauthAccessTokenRequestRefresh

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessTokenRequestRefresh from a JSON string
oauth_access_token_request_refresh_instance = OauthAccessTokenRequestRefresh.from_json(json)
# print the JSON string representation of the object
print(OauthAccessTokenRequestRefresh.to_json())

# convert the object into a dict
oauth_access_token_request_refresh_dict = oauth_access_token_request_refresh_instance.to_dict()
# create an instance of OauthAccessTokenRequestRefresh from a dict
oauth_access_token_request_refresh_from_dict = OauthAccessTokenRequestRefresh.from_dict(oauth_access_token_request_refresh_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


