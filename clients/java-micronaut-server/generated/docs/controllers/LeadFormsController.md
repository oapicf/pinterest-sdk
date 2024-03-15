# LeadFormsController

All URIs are relative to `"/v5"`

The controller class is defined in **[LeadFormsController.java](../../src/main/java/org/openapitools/controller/LeadFormsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsList**](#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms

<a id="leadFormGet"></a>
# **leadFormGet**
```java
Mono<LeadFormResponse> LeadFormsController.leadFormGet(adAccountIdleadFormId)
```

Get lead form by id

Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**leadFormId** | `String` | Unique identifier of a lead form. |

### Return type
[**LeadFormResponse**](../../docs/models/LeadFormResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="leadFormTestCreate"></a>
# **leadFormTestCreate**
```java
Mono<LeadFormTestResponse> LeadFormsController.leadFormTestCreate(adAccountIdleadFormIdleadFormTestRequest)
```

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**leadFormId** | `String` | Unique identifier of a lead form. |
**leadFormTestRequest** | [**LeadFormTestRequest**](../../docs/models/LeadFormTestRequest.md) | Subscription to create. |

### Return type
[**LeadFormTestResponse**](../../docs/models/LeadFormTestResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="leadFormsList"></a>
# **leadFormsList**
```java
Mono<LeadFormsList200Response> LeadFormsController.leadFormsList(adAccountIdpageSizeorderbookmark)
```

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**order** | `String` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**LeadFormsList200Response**](../../docs/models/LeadFormsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

