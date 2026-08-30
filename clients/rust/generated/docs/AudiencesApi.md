# \AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiences_slash_create**](AudiencesApi.md#audiences_slash_create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiences_slash_get**](AudiencesApi.md#audiences_slash_get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiences_slash_list**](AudiencesApi.md#audiences_slash_list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiences_slash_update**](AudiencesApi.md#audiences_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience



## audiences_slash_create

> models::AdAccountsAudience audiences_slash_create(ad_account_id, ad_accounts_audience_create)
Create audience

Create a new audience for the ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**ad_accounts_audience_create** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md) |  | [required] |

### Return type

[**models::AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audiences_slash_get

> models::AdAccountsAudience audiences_slash_get(audience_id, ad_account_id)
Get audience

Get a specific audience given the audience ID.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**audience_id** | **String** | Audience ID. | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audiences_slash_list

> models::AudiencesList200Response audiences_slash_list(ad_account_id, bookmark, page_size, order, ownership_type, exclude_nca)
List audiences

Get list of audiences for the ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]
**order** | Option<[**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)> | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**ownership_type** | Option<[**AudienceOwnershipType**](AudienceOwnershipType.md)> |  |  |
**exclude_nca** | Option<**bool**> | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). |  |[default to false]

### Return type

[**models::AudiencesList200Response**](audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audiences_slash_update

> models::AdAccountsAudience audiences_slash_update(audience_id, ad_account_id, ad_accounts_audience_update)
Update audience

Update an existing audience for the ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**audience_id** | **String** | Audience ID. | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**ad_accounts_audience_update** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md) |  | [required] |

### Return type

[**models::AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

