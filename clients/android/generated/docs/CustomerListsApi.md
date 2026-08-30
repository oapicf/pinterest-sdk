# CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListsCreate**](CustomerListsApi.md#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customerListsGet**](CustomerListsApi.md#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customerListsList**](CustomerListsApi.md#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customerListsUpdate**](CustomerListsApi.md#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list



## customerListsCreate

> CustomerList customerListsCreate(adAccountId, customerListCreate)

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListsApi;

CustomerListsApi apiInstance = new CustomerListsApi();
String adAccountId = null; // String | 
CustomerListCreate customerListCreate = new CustomerListCreate(); // CustomerListCreate | 
try {
    CustomerList result = apiInstance.customerListsCreate(adAccountId, customerListCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListsApi#customerListsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **customerListCreate** | [**CustomerListCreate**](CustomerListCreate.md)|  |

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerListsGet

> CustomerList customerListsGet(adAccountId, customerListId)

Get customer list

Gets a specific customer list given the customer list ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListsApi;

CustomerListsApi apiInstance = new CustomerListsApi();
String adAccountId = null; // String | 
String customerListId = null; // String | Customer list ID.
try {
    CustomerList result = apiInstance.customerListsGet(adAccountId, customerListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListsApi#customerListsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **customerListId** | **String**| Customer list ID. | [default to null]

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerListsList

> CustomerListsList200Response customerListsList(adAccountId, bookmark, pageSize, order, excludeNca)

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListsApi;

CustomerListsApi apiInstance = new CustomerListsApi();
String adAccountId = null; // String | 
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
Boolean excludeNca = false; // Boolean | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
try {
    CustomerListsList200Response result = apiInstance.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListsApi#customerListsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **excludeNca** | **Boolean**| When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerListsUpdate

> CustomerList customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody)

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListsApi;

CustomerListsApi apiInstance = new CustomerListsApi();
String adAccountId = null; // String | 
String customerListId = null; // String | Customer list ID.
CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody = new CustomerListUpdateWithRequiredBody(); // CustomerListUpdateWithRequiredBody | 
try {
    CustomerList result = apiInstance.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListsApi#customerListsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **customerListId** | **String**| Customer list ID. | [default to null]
 **customerListUpdateWithRequiredBody** | [**CustomerListUpdateWithRequiredBody**](CustomerListUpdateWithRequiredBody.md)|  |

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

