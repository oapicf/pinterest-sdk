# CUSTOMERLISTS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**customer_lists_create**](CUSTOMERLISTS_API.md#customer_lists_create) | **Post** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customer_lists_get**](CUSTOMERLISTS_API.md#customer_lists_get) | **Get** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customer_lists_list**](CUSTOMERLISTS_API.md#customer_lists_list) | **Get** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customer_lists_update**](CUSTOMERLISTS_API.md#customer_lists_update) | **Patch** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


# **customer_lists_create**
> customer_lists_create (ad_account_id: STRING_32 ; customer_list_create: CUSTOMER_LIST_CREATE ): detachable CUSTOMER_LIST


Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **customer_list_create** | [**CUSTOMER_LIST_CREATE**](CUSTOMER_LIST_CREATE.md)|  | 

### Return type

[**CUSTOMER_LIST**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_lists_get**
> customer_lists_get (ad_account_id: STRING_32 ; customer_list_id: STRING_32 ): detachable CUSTOMER_LIST


Get customer list

Gets a specific customer list given the customer list ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **customer_list_id** | **STRING_32**| Customer list ID. | [default to null]

### Return type

[**CUSTOMER_LIST**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_lists_list**
> customer_lists_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; exclude_nca:  detachable BOOLEAN ): detachable CUSTOMER_LISTS_LIST_200_RESPONSE


Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **exclude_nca** | **BOOLEAN**| When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**CUSTOMER_LISTS_LIST_200_RESPONSE**](customer_lists_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_lists_update**
> customer_lists_update (ad_account_id: STRING_32 ; customer_list_id: STRING_32 ; customer_list_update_with_required_body: CUSTOMER_LIST_UPDATE_WITH_REQUIRED_BODY ): detachable CUSTOMER_LIST


Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **customer_list_id** | **STRING_32**| Customer list ID. | [default to null]
 **customer_list_update_with_required_body** | [**CUSTOMER_LIST_UPDATE_WITH_REQUIRED_BODY**](CUSTOMER_LIST_UPDATE_WITH_REQUIRED_BODY.md)|  | 

### Return type

[**CUSTOMER_LIST**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

