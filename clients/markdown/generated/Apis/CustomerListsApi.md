# CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerLists/create**](CustomerListsApi.md#customerLists/create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists |
| [**customerLists/get**](CustomerListsApi.md#customerLists/get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list |
| [**customerLists/list**](CustomerListsApi.md#customerLists/list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists |
| [**customerLists/update**](CustomerListsApi.md#customerLists/update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list |


<a name="customerLists/create"></a>
# **customerLists/create**
> CustomerList customerLists/create(ad\_account\_id, CustomerListCreate)

Create customer lists

    Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **CustomerListCreate** | [**CustomerListCreate**](../Models/CustomerListCreate.md)|  | |

### Return type

[**CustomerList**](../Models/CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="customerLists/get"></a>
# **customerLists/get**
> CustomerList customerLists/get(ad\_account\_id, customer\_list\_id)

Get customer list

    Gets a specific customer list given the customer list ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **customer\_list\_id** | **String**| Customer list ID. | [default to null] |

### Return type

[**CustomerList**](../Models/CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="customerLists/list"></a>
# **customerLists/list**
> customer_lists_list_200_response customerLists/list(ad\_account\_id, bookmark, page\_size, order, exclude\_nca)

Get customer lists

    Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **exclude\_nca** | **Boolean**| When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to false] |

### Return type

[**customer_lists_list_200_response**](../Models/customer_lists_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="customerLists/update"></a>
# **customerLists/update**
> CustomerList customerLists/update(ad\_account\_id, customer\_list\_id, CustomerListUpdateWithRequiredBody)

Update customer list

    Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **customer\_list\_id** | **String**| Customer list ID. | [default to null] |
| **CustomerListUpdateWithRequiredBody** | [**CustomerListUpdateWithRequiredBody**](../Models/CustomerListUpdateWithRequiredBody.md)|  | |

### Return type

[**CustomerList**](../Models/CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

