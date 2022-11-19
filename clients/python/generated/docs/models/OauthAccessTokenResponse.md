# pinterestsdk.model.oauth_access_token_response.OauthAccessTokenResponse

A successful OAuth access token response.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | A successful OAuth access token response. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**access_token** | str,  | str,  |  | 
**scope** | str,  | str,  |  | 
**token_type** | str,  | str,  |  | if omitted the server will use the default value of "bearer"
**expires_in** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**response_type** | str,  | str,  |  | [optional] must be one of ["authorization_code", "refresh_token", ] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

