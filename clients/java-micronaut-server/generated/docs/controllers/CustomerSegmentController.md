# CustomerSegmentController

All URIs are relative to `"/v5"`

The controller class is defined in **[CustomerSegmentController.java](../../src/main/java/org/openapitools/controller/CustomerSegmentController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerSegmentCreate**](#customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customerSegmentList**](#customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customerSegmentUpdate**](#customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments

<a id="customerSegmentCreate"></a>
# **customerSegmentCreate**
```java
Mono<CustomerSegment> CustomerSegmentController.customerSegmentCreate(adAccountIdcustomerSegmentCreate)
```

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**customerSegmentCreate** | [**CustomerSegmentCreate**](../../docs/models/CustomerSegmentCreate.md) |  |

### Return type
[**CustomerSegment**](../../docs/models/CustomerSegment.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="customerSegmentList"></a>
# **customerSegmentList**
```java
Mono<CustomerSegmentList200Response> CustomerSegmentController.customerSegmentList(adAccountIdbookmarkpageSizeorderincludeSizingsearchQuery)
```

List customer segments

Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**includeSizing** | `Boolean` | Include audience sizing in result or not | [optional parameter] [default to `false`]
**searchQuery** | `String` | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional parameter]

### Return type
[**CustomerSegmentList200Response**](../../docs/models/CustomerSegmentList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="customerSegmentUpdate"></a>
# **customerSegmentUpdate**
```java
Mono<Object> CustomerSegmentController.customerSegmentUpdate(adAccountIdcustomerSegmentUpdateRequestUpdateWithRequiredBody)
```

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**customerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](../../docs/models/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md) |  |


### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

