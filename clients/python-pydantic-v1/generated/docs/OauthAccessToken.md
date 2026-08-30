# OauthAccessToken

Describes the valid schema for possible OAuth access token requests.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **str** |  | [readonly] 
**expires_in** | **int** |  | [readonly] 
**refresh_token** | **str** |  | [optional] 
**refresh_token_expires_at** | **int** |  | [optional] [readonly] 
**refresh_token_expires_in** | **int** |  | [optional] [readonly] 
**response_type** | [**TokenGrantType**](TokenGrantType.md) |  | [optional] [readonly] 
**scope** | **str** |  | [optional] 
**token_type** | **str** |  | [readonly] [default to 'bearer']

## Example

```python
from openapi_client.models.oauth_access_token import OauthAccessToken

# TODO update the JSON string below
json = "{}"
# create an instance of OauthAccessToken from a JSON string
oauth_access_token_instance = OauthAccessToken.from_json(json)
# print the JSON string representation of the object
print OauthAccessToken.to_json()

# convert the object into a dict
oauth_access_token_dict = oauth_access_token_instance.to_dict()
# create an instance of OauthAccessToken from a dict
oauth_access_token_from_dict = OauthAccessToken.from_dict(oauth_access_token_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


