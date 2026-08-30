# CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerListUploadsCreate**](CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload |
| [**customerListUploadsGet**](CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload |
| [**customerListUploadsRun**](CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload |


## Creating CustomerListUploadsApi

To initiate an instance of `CustomerListUploadsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.CustomerListUploadsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(CustomerListUploadsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    CustomerListUploadsApi customerListUploadsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="customerListUploadsCreate"></a>
# **customerListUploadsCreate**
```java
Mono<CustomerListUploadCreateResponse> CustomerListUploadsApi.customerListUploadsCreate(adAccountIdcustomerListIdcustomerListUploadCreateRequest)
```

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **customerListId** | `String`| Customer list ID. | |
| **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)|  | |


### Return type
[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="customerListUploadsGet"></a>
# **customerListUploadsGet**
```java
Mono<CustomerListUpload> CustomerListUploadsApi.customerListUploadsGet(adAccountIdcustomerListIdcustomerListUploadId)
```

Get customer list upload

Get the metadata for a given upload by its ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **customerListId** | `String`| Customer list ID. | |
| **customerListUploadId** | `String`| Customer List Upload ID. | |


### Return type
[**CustomerListUpload**](CustomerListUpload.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="customerListUploadsRun"></a>
# **customerListUploadsRun**
```java
Mono<CustomerListUpload> CustomerListUploadsApi.customerListUploadsRun(adAccountIdcustomerListIdcustomerListUploadId)
```

Run customer list upload

Begin processing a customer list upload.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **customerListId** | `String`| Customer list ID. | |
| **customerListUploadId** | `String`| Customer List Upload ID. | |


### Return type
[**CustomerListUpload**](CustomerListUpload.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

