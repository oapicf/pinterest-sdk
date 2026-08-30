# ConversionDeletionRequestsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ConversionDeletionRequestsController.java](../../src/main/java/org/openapitools/controller/ConversionDeletionRequestsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionDeletionRequestCreate**](#conversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversionDeletionRequestDelete**](#conversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversionDeletionRequestGet**](#conversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversionDeletionRequestList**](#conversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests

<a id="conversionDeletionRequestCreate"></a>
# **conversionDeletionRequestCreate**
```java
Mono<ConversionDeletionRequest> ConversionDeletionRequestsController.conversionDeletionRequestCreate(adAccountIdconversionDeletionRequestCreate)
```

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionDeletionRequestCreate** | [**ConversionDeletionRequestCreate**](../../docs/models/ConversionDeletionRequestCreate.md) |  |

### Return type
[**ConversionDeletionRequest**](../../docs/models/ConversionDeletionRequest.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`
* **client_credentials**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="conversionDeletionRequestDelete"></a>
# **conversionDeletionRequestDelete**
```java
Mono<ConversionDeletionRequest> ConversionDeletionRequestsController.conversionDeletionRequestDelete(requestIdadAccountId)
```

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**requestId** | `String` | Unique identifier of the conversion deletion request |
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**ConversionDeletionRequest**](../../docs/models/ConversionDeletionRequest.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`
* **client_credentials**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="conversionDeletionRequestGet"></a>
# **conversionDeletionRequestGet**
```java
Mono<ConversionDeletionRequest> ConversionDeletionRequestsController.conversionDeletionRequestGet(requestIdadAccountId)
```

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**requestId** | `String` | Unique identifier of the conversion deletion request |
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**ConversionDeletionRequest**](../../docs/models/ConversionDeletionRequest.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="conversionDeletionRequestList"></a>
# **conversionDeletionRequestList**
```java
Mono<ConversionDeletionRequestList200Response> ConversionDeletionRequestsController.conversionDeletionRequestList(adAccountIdbookmarkpageSizeorder)
```

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]

### Return type
[**ConversionDeletionRequestList200Response**](../../docs/models/ConversionDeletionRequestList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

