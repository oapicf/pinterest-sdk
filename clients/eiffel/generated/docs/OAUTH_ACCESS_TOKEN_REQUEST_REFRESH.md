# OAUTH_ACCESS_TOKEN_REQUEST_REFRESH

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grant_type** | [**STRING_32**](STRING_32.md) |  | [default to null]
**refresh_token** | [**STRING_32**](STRING_32.md) |  | [default to null]
**scope** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**refresh_on** | **BOOLEAN** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


