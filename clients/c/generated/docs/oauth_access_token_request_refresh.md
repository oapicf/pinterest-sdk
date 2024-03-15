# oauth_access_token_request_refresh_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grant_type** | **pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_e** |  | 
**refresh_token** | **char \*** |  | 
**scope** | **char \*** |  | [optional] 
**refresh_on** | **int** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


