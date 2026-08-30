# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesGet**](AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience



## audiencesCreate

> AdAccountsAudience audiencesCreate(adAccountId, adAccountsAudienceCreate)

Create audience

Create a new audience for the ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AdAccountsAudienceCreate adAccountsAudienceCreate = new AdAccountsAudienceCreate(); // AdAccountsAudienceCreate | 
try {
    AdAccountsAudience result = apiInstance.audiencesCreate(adAccountId, adAccountsAudienceCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **adAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md)|  |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## audiencesGet

> AdAccountsAudience audiencesGet(audienceId, adAccountId)

Get audience

Get a specific audience given the audience ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String audienceId = null; // String | Audience ID.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    AdAccountsAudience result = apiInstance.audiencesGet(audienceId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **String**| Audience ID. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audiencesList

> AudiencesList200Response audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca)

List audiences

Get list of audiences for the ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
AudienceOwnershipType ownershipType = null; // AudienceOwnershipType | 
Boolean excludeNca = false; // Boolean | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
try {
    AudiencesList200Response result = apiInstance.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesList");
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
 **ownershipType** | [**AudienceOwnershipType**](.md)|  | [optional] [default to null] [enum: OWNED, RECEIVED]
 **excludeNca** | **Boolean**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audiencesUpdate

> AdAccountsAudience audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate)

Update audience

Update an existing audience for the ad account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AudiencesApi;

AudiencesApi apiInstance = new AudiencesApi();
String audienceId = null; // String | Audience ID.
String adAccountId = null; // String | Unique identifier of an ad account.
AdAccountsAudienceUpdate adAccountsAudienceUpdate = new AdAccountsAudienceUpdate(); // AdAccountsAudienceUpdate | 
try {
    AdAccountsAudience result = apiInstance.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiencesApi#audiencesUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **String**| Audience ID. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **adAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md)|  |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

