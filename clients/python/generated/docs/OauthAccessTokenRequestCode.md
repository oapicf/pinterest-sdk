# OauthAccessTokenRequestCode


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | 
**redirect_uri** | **str** |  | 
**grant_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.oauth_access_token_request_code import OauthAccessTokenRequestCode

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessTokenRequestCode from a JSON string
oauth_access_token_request_code_instance = OauthAccessTokenRequestCode.from_json(json)
# print the JSON string representation of the object
print(OauthAccessTokenRequestCode.to_json())

# convert the object into a dict
oauth_access_token_request_code_dict = oauth_access_token_request_code_instance.to_dict()
# create an instance of OauthAccessTokenRequestCode from a dict
oauth_access_token_request_code_from_dict = OauthAccessTokenRequestCode.from_dict(oauth_access_token_request_code_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


