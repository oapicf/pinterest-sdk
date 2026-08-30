# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiences_create**](AudiencesApi.md#audiences_create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiences_get**](AudiencesApi.md#audiences_get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiences_list**](AudiencesApi.md#audiences_list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiences_update**](AudiencesApi.md#audiences_update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiences_create**
> `audiences_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `ad_accounts_audience_create`::`AdAccountsAudienceCreate`;) -> `AdAccountsAudience`

Create audience

Create a new audience for the ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`ad_accounts_audience_create`** | [**`AdAccountsAudienceCreate`**](AdAccountsAudienceCreate.md)|  |

### Return type

[**`AdAccountsAudience`**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_get**
> `audiences_get`(req::`HTTP.Request`, `audience_id`::`String`, `ad_account_id`::`String`;) -> `AdAccountsAudience`

Get audience

Get a specific audience given the audience ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`audience_id`** | **`String`**| Audience ID. |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`AdAccountsAudience`**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_list**
> `audiences_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `ownership_type`=nothing, `exclude_nca`=nothing,) -> `AudiencesList200Response`

List audiences

Get list of audiences for the ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]
 **`ownership_type`** | [**`AudienceOwnershipType`**](.md)|  | [default to nothing]
 **`exclude_nca`** | **`Bool`**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [default to false]

### Return type

[**`AudiencesList200Response`**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_update**
> `audiences_update`(req::`HTTP.Request`, `audience_id`::`String`, `ad_account_id`::`String`, `ad_accounts_audience_update`::`AdAccountsAudienceUpdate`;) -> `AdAccountsAudience`

Update audience

Update an existing audience for the ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`audience_id`** | **`String`**| Audience ID. |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`ad_accounts_audience_update`** | [**`AdAccountsAudienceUpdate`**](AdAccountsAudienceUpdate.md)|  |

### Return type

[**`AdAccountsAudience`**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

