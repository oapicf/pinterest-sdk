# LeadFormsController

All URIs are relative to `"/v5"`

The controller class is defined in **[LeadFormsController.java](../../src/main/java/org/openapitools/controller/LeadFormsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsCreate**](#leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**leadFormsList**](#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**leadFormsUpdate**](#leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms

<a id="leadFormGet"></a>
# **leadFormGet**
```java
Mono<LeadForm> LeadFormsController.leadFormGet(leadFormIdadAccountId)
```

Get lead form by id

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**leadFormId** | `String` | The ID of this lead form |
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**LeadForm**](../../docs/models/LeadForm.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="leadFormTestCreate"></a>
# **leadFormTestCreate**
```java
Mono<LeadFormTest> LeadFormsController.leadFormTestCreate(adAccountIdleadFormIdleadFormTestCreate)
```

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**leadFormId** | `String` | Unique identifier of a lead form. |
**leadFormTestCreate** | [**LeadFormTestCreate**](../../docs/models/LeadFormTestCreate.md) |  |

### Return type
[**LeadFormTest**](../../docs/models/LeadFormTest.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="leadFormsCreate"></a>
# **leadFormsCreate**
```java
Mono<LeadFormsCreate200Response> LeadFormsController.leadFormsCreate(adAccountIdleadFormCreate)
```

Create lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**leadFormCreate** | [**List&lt;@Valid LeadFormCreate&gt;**](../../docs/models/LeadFormCreate.md) |  |

### Return type
[**LeadFormsCreate200Response**](../../docs/models/LeadFormsCreate200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="leadFormsList"></a>
# **leadFormsList**
```java
Mono<LeadFormsList200Response> LeadFormsController.leadFormsList(adAccountIdbookmarkpageSizeorder)
```

List lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]

### Return type
[**LeadFormsList200Response**](../../docs/models/LeadFormsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="leadFormsUpdate"></a>
# **leadFormsUpdate**
```java
Mono<LeadFormsCreate200Response> LeadFormsController.leadFormsUpdate(adAccountIdleadFormBatchUpdate)
```

Update lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**leadFormBatchUpdate** | [**List&lt;@Valid LeadFormBatchUpdate&gt;**](../../docs/models/LeadFormBatchUpdate.md) |  |

### Return type
[**LeadFormsCreate200Response**](../../docs/models/LeadFormsCreate200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

