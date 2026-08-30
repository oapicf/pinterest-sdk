# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id |
| [**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data |
| [**leadFormsCreate**](LeadFormsApi.md#leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms |
| [**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms |
| [**leadFormsUpdate**](LeadFormsApi.md#leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms |


## Creating LeadFormsApi

To initiate an instance of `LeadFormsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.LeadFormsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(LeadFormsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    LeadFormsApi leadFormsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="leadFormGet"></a>
# **leadFormGet**
```java
Mono<LeadForm> LeadFormsApi.leadFormGet(leadFormIdadAccountId)
```

Get lead form by id

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **leadFormId** | `String`| The ID of this lead form | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**LeadForm**](LeadForm.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="leadFormTestCreate"></a>
# **leadFormTestCreate**
```java
Mono<LeadFormTest> LeadFormsApi.leadFormTestCreate(adAccountIdleadFormIdleadFormTestCreate)
```

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **leadFormId** | `String`| Unique identifier of a lead form. | |
| **leadFormTestCreate** | [**LeadFormTestCreate**](LeadFormTestCreate.md)|  | |


### Return type
[**LeadFormTest**](LeadFormTest.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="leadFormsCreate"></a>
# **leadFormsCreate**
```java
Mono<LeadFormsCreate200Response> LeadFormsApi.leadFormsCreate(adAccountIdleadFormCreate)
```

Create lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **leadFormCreate** | [**List&lt;@Valid LeadFormCreate&gt;**](LeadFormCreate.md)|  | |


### Return type
[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="leadFormsList"></a>
# **leadFormsList**
```java
Mono<LeadFormsList200Response> LeadFormsApi.leadFormsList(adAccountIdbookmarkpageSizeorder)
```

List lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |


### Return type
[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="leadFormsUpdate"></a>
# **leadFormsUpdate**
```java
Mono<LeadFormsCreate200Response> LeadFormsApi.leadFormsUpdate(adAccountIdleadFormBatchUpdate)
```

Update lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **leadFormBatchUpdate** | [**List&lt;@Valid LeadFormBatchUpdate&gt;**](LeadFormBatchUpdate.md)|  | |


### Return type
[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

