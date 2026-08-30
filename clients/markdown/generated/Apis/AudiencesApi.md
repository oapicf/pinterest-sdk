# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**audiences/create**](AudiencesApi.md#audiences/create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiences/get**](AudiencesApi.md#audiences/get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**audiences/list**](AudiencesApi.md#audiences/list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**audiences/update**](AudiencesApi.md#audiences/update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |


<a name="audiences/create"></a>
# **audiences/create**
> AdAccountsAudience audiences/create(ad\_account\_id, AdAccountsAudienceCreate)

Create audience

    Create a new audience for the ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](../Models/AdAccountsAudienceCreate.md)|  | |

### Return type

[**AdAccountsAudience**](../Models/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="audiences/get"></a>
# **audiences/get**
> AdAccountsAudience audiences/get(audience\_id, ad\_account\_id)

Get audience

    Get a specific audience given the audience ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audience\_id** | **String**| Audience ID. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**AdAccountsAudience**](../Models/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="audiences/list"></a>
# **audiences/list**
> audiences_list_200_response audiences/list(ad\_account\_id, bookmark, page\_size, order, ownership\_type, exclude\_nca)

List audiences

    Get list of audiences for the ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **ownership\_type** | [**AudienceOwnershipType**](../Models/.md)|  | [optional] [default to null] [enum: OWNED, RECEIVED] |
| **exclude\_nca** | **Boolean**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false] |

### Return type

[**audiences_list_200_response**](../Models/audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="audiences/update"></a>
# **audiences/update**
> AdAccountsAudience audiences/update(audience\_id, ad\_account\_id, AdAccountsAudienceUpdate)

Update audience

    Update an existing audience for the ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audience\_id** | **String**| Audience ID. | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](../Models/AdAccountsAudienceUpdate.md)|  | |

### Return type

[**AdAccountsAudience**](../Models/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

