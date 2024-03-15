# CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListsCreate**](CustomerListsApi.md#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customerListsGet**](CustomerListsApi.md#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customerListsList**](CustomerListsApi.md#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customerListsUpdate**](CustomerListsApi.md#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list



## customerListsCreate

> CustomerList customerListsCreate(adAccountId, customerListRequest)

Create customer lists

&lt;p&gt;Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).&lt;/p&gt; &lt;p&gt;A customer list is one of the four types of Pinterest audiences: for more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;p/&gt; &lt;p&gt;&lt;b&gt;Please review our &lt;u&gt;&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting#section-13341\&quot; target&#x3D;\&quot;_blank\&quot;&gt;requirements&lt;/a&gt;&lt;/u&gt; for what type of information is allowed when uploading a customer list.&lt;/b&gt;&lt;/p&gt; &lt;p&gt;When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.&lt;/p&gt; &lt;p&gt;Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the &lt;a href&#x3D;\&quot;#operation/create_audience_handler\&quot;&gt;create audience endpoint&lt;/a&gt; before it can be used.&lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListsApi;

CustomerListsApi apiInstance = new CustomerListsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
CustomerListRequest customerListRequest = new CustomerListRequest(); // CustomerListRequest | Parameters to get Customer lists info
try {
    CustomerList result = apiInstance.customerListsCreate(adAccountId, customerListRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListsApi#customerListsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **customerListRequest** | [**CustomerListRequest**](CustomerListRequest.md)| Parameters to get Customer lists info |

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
String adAccountId = null; // String | Unique identifier of an ad account.
String customerListId = null; // String | Unique identifier of a customer list
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
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **customerListId** | **String**| Unique identifier of a customer list | [default to null]

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerListsList

> CustomerListsList200Response customerListsList(adAccountId, pageSize, order, bookmark)

Get customer lists

&lt;p&gt;Get a set of customer lists including id and name based on the filters provided.&lt;/p&gt; &lt;p&gt;(Customer lists are a type of audience.) For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;  or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListsApi;

CustomerListsApi apiInstance = new CustomerListsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
String order = ASCENDING; // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    CustomerListsList200Response result = apiInstance.customerListsList(adAccountId, pageSize, order, bookmark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListsApi#customerListsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerListsUpdate

> CustomerList customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest)

Update customer list

&lt;p&gt;Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)&lt;/p&gt; &lt;p&gt;When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerListsApi;

CustomerListsApi apiInstance = new CustomerListsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String customerListId = null; // String | Unique identifier of a customer list
CustomerListUpdateRequest customerListUpdateRequest = new CustomerListUpdateRequest(); // CustomerListUpdateRequest | 
try {
    CustomerList result = apiInstance.customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerListsApi#customerListsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **customerListId** | **String**| Unique identifier of a customer list | [default to null]
 **customerListUpdateRequest** | [**CustomerListUpdateRequest**](CustomerListUpdateRequest.md)|  |

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

