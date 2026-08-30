# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates



## targetingTemplateCreate

> TargetingTemplate targetingTemplateCreate(adAccountId, targetingTemplateCreate)

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TargetingTemplateApi;

TargetingTemplateApi apiInstance = new TargetingTemplateApi();
String adAccountId = null; // String | Unique identifier of an ad account.
TargetingTemplateCreate targetingTemplateCreate = new TargetingTemplateCreate(); // TargetingTemplateCreate | 
try {
    TargetingTemplate result = apiInstance.targetingTemplateCreate(adAccountId, targetingTemplateCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)|  |

### Return type

[**TargetingTemplate**](TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## targetingTemplateList

> TargetingTemplateList200Response targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

List targeting templates

Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;

### Example

```java
// Import classes:
//import org.openapitools.client.api.TargetingTemplateApi;

TargetingTemplateApi apiInstance = new TargetingTemplateApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
Boolean includeSizing = false; // Boolean | Include audience sizing in result or not
String searchQuery = null; // String | Search query. Can contain pin description keywords or comma-separated pin IDs.
try {
    TargetingTemplateList200Response result = apiInstance.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **includeSizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] [default to null]

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## targetingTemplateUpdate

> targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate)

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Example

```java
// Import classes:
//import org.openapitools.client.api.TargetingTemplateApi;

TargetingTemplateApi apiInstance = new TargetingTemplateApi();
String adAccountId = null; // String | Unique identifier of an ad account.
TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate = new TargetingTemplateUpdateRequestReadOrUpdate(); // TargetingTemplateUpdateRequestReadOrUpdate | 
try {
    apiInstance.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetingTemplateApi#targetingTemplateUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **targetingTemplateUpdateRequestReadOrUpdate** | [**TargetingTemplateUpdateRequestReadOrUpdate**](TargetingTemplateUpdateRequestReadOrUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

