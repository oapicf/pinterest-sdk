# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkDownloadCreate**](BulkApi.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk |
| [**bulkRequestGet**](BulkApi.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk |
| [**bulkUpsertCreate**](BulkApi.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk |


## Creating BulkApi

To initiate an instance of `BulkApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.BulkApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BulkApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BulkApi bulkApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="bulkDownloadCreate"></a>
# **bulkDownloadCreate**
```java
Mono<BulkDownloadResponse> BulkApi.bulkDownloadCreate(adAccountIdbulkDownloadRequest)
```

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bulkDownloadRequest** | [**BulkDownloadRequest**](BulkDownloadRequest.md)| Parameters to get ad entities in bulk | |


### Return type
[**BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="bulkRequestGet"></a>
# **bulkRequestGet**
```java
Mono<BulkUpsertStatusResponse> BulkApi.bulkRequestGet(adAccountIdbulkRequestIdincludeDetails)
```

Download advertiser entities in bulk

Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bulkRequestId** | `String`| Unique identifier of a bulk upsert request. | |
| **includeDetails** | `Boolean`| if set to True then attach the errors/details to all the requests | [optional parameter] [default to `false`] |


### Return type
[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="bulkUpsertCreate"></a>
# **bulkUpsertCreate**
```java
Mono<BulkUpsertResponse> BulkApi.bulkUpsertCreate(adAccountIdbulkUpsertRequest)
```

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk | |


### Return type
[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

