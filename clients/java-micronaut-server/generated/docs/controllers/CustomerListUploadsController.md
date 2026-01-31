# CustomerListUploadsController

All URIs are relative to `"/v5"`

The controller class is defined in **[CustomerListUploadsController.java](../../src/main/java/org/openapitools/controller/CustomerListUploadsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload

<a id="customerListUploadsCreate"></a>
# **customerListUploadsCreate**
```java
Mono<CustomerListUploadCreateResponse> CustomerListUploadsController.customerListUploadsCreate(adAccountIdcustomerListIdcustomerListUploadCreateRequest)
```

Create customer list upload

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**customerListId** | `String` | Unique identifier of a customer list |
**customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](../../docs/models/CustomerListUploadCreateRequest.md) | Parameters to create a customer list upload request |

### Return type
[**CustomerListUploadCreateResponse**](../../docs/models/CustomerListUploadCreateResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="customerListUploadsGet"></a>
# **customerListUploadsGet**
```java
Mono<CustomerListUploadResponse> CustomerListUploadsController.customerListUploadsGet(adAccountIdcustomerListIdcustomerListUploadId)
```

Get customer list upload

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**customerListId** | `String` | Unique identifier of a customer list |
**customerListUploadId** | `String` | Unique identifier of a customer list upload |

### Return type
[**CustomerListUploadResponse**](../../docs/models/CustomerListUploadResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="customerListUploadsRun"></a>
# **customerListUploadsRun**
```java
Mono<CustomerListUploadResponse> CustomerListUploadsController.customerListUploadsRun(adAccountIdcustomerListIdcustomerListUploadId)
```

Run customer list upload

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**customerListId** | `String` | Unique identifier of a customer list |
**customerListUploadId** | `String` | Unique identifier of a customer list upload |

### Return type
[**CustomerListUploadResponse**](../../docs/models/CustomerListUploadResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

