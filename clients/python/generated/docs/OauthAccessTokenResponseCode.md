# OauthAccessTokenResponseCode


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refresh_token** | **str** |  | [optional] 
**refresh_token_expires_at** | **int** |  | [optional] 
**refresh_token_expires_in** | **int** |  | [optional] 
**access_token** | **str** |  | 
**expires_in** | **int** |  | 
**response_type** | **str** |  | [optional] 
**scope** | **str** |  | 
**token_type** | **str** |  | [default to 'bearer']

## Example

```python
from pinterestsdk.models.oauth_access_token_response_code import OauthAccessTokenResponseCode

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessTokenResponseCode from a JSON string
oauth_access_token_response_code_instance = OauthAccessTokenResponseCode.from_json(json)
# print the JSON string representation of the object
print(OauthAccessTokenResponseCode.to_json())

# convert the object into a dict
oauth_access_token_response_code_dict = oauth_access_token_response_code_instance.to_dict()
# create an instance of OauthAccessTokenResponseCode from a dict
oauth_access_token_response_code_from_dict = OauthAccessTokenResponseCode.from_dict(oauth_access_token_response_code_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


