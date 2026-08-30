# CustomerListsController

All URIs are relative to `"/v5"`

The controller class is defined in **[CustomerListsController.java](../../src/main/java/org/openapitools/controller/CustomerListsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListsCreate**](#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customerListsGet**](#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customerListsList**](#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customerListsUpdate**](#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list

<a id="customerListsCreate"></a>
# **customerListsCreate**
```java
Mono<CustomerList> CustomerListsController.customerListsCreate(adAccountIdcustomerListCreate)
```

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**customerListCreate** | [**CustomerListCreate**](../../docs/models/CustomerListCreate.md) |  |

### Return type
[**CustomerList**](../../docs/models/CustomerList.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="customerListsGet"></a>
# **customerListsGet**
```java
Mono<CustomerList> CustomerListsController.customerListsGet(adAccountIdcustomerListId)
```

Get customer list

Gets a specific customer list given the customer list ID.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**customerListId** | `String` | Customer list ID. |

### Return type
[**CustomerList**](../../docs/models/CustomerList.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="customerListsList"></a>
# **customerListsList**
```java
Mono<CustomerListsList200Response> CustomerListsController.customerListsList(adAccountIdbookmarkpageSizeorderexcludeNca)
```

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**excludeNca** | `Boolean` | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional parameter] [default to `false`]

### Return type
[**CustomerListsList200Response**](../../docs/models/CustomerListsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="customerListsUpdate"></a>
# **customerListsUpdate**
```java
Mono<CustomerList> CustomerListsController.customerListsUpdate(adAccountIdcustomerListIdcustomerListUpdateWithRequiredBody)
```

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**customerListId** | `String` | Customer list ID. |
**customerListUpdateWithRequiredBody** | [**CustomerListUpdateWithRequiredBody**](../../docs/models/CustomerListUpdateWithRequiredBody.md) |  |

### Return type
[**CustomerList**](../../docs/models/CustomerList.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

