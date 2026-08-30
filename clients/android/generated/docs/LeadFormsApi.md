# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsCreate**](LeadFormsApi.md#leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**leadFormsUpdate**](LeadFormsApi.md#leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms



## leadFormGet

> LeadForm leadFormGet(leadFormId, adAccountId)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String leadFormId = null; // String | The ID of this lead form
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    LeadForm result = apiInstance.leadFormGet(leadFormId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadFormsApi#leadFormGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFormId** | **String**| The ID of this lead form | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

[**LeadForm**](LeadForm.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## leadFormTestCreate

> LeadFormTest leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | 
String leadFormId = null; // String | Unique identifier of a lead form.
LeadFormTestCreate leadFormTestCreate = new LeadFormTestCreate(); // LeadFormTestCreate | 
try {
    LeadFormTest result = apiInstance.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadFormsApi#leadFormTestCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **leadFormId** | **String**| Unique identifier of a lead form. | [default to null]
 **leadFormTestCreate** | [**LeadFormTestCreate**](LeadFormTestCreate.md)|  |

### Return type

[**LeadFormTest**](LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## leadFormsCreate

> LeadFormsCreate200Response leadFormsCreate(adAccountId, leadFormCreate)

Create lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<LeadFormCreate> leadFormCreate = Arrays.asList(new LeadFormCreate()); // List<LeadFormCreate> | 
try {
    LeadFormsCreate200Response result = apiInstance.leadFormsCreate(adAccountId, leadFormCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadFormsApi#leadFormsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **leadFormCreate** | [**List&lt;LeadFormCreate&gt;**](LeadFormCreate.md)|  |

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## leadFormsList

> LeadFormsList200Response leadFormsList(adAccountId, bookmark, pageSize, order)

List lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    LeadFormsList200Response result = apiInstance.leadFormsList(adAccountId, bookmark, pageSize, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadFormsApi#leadFormsList");
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

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## leadFormsUpdate

> LeadFormsCreate200Response leadFormsUpdate(adAccountId, leadFormBatchUpdate)

Update lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<LeadFormBatchUpdate> leadFormBatchUpdate = Arrays.asList(new LeadFormBatchUpdate()); // List<LeadFormBatchUpdate> | 
try {
    LeadFormsCreate200Response result = apiInstance.leadFormsUpdate(adAccountId, leadFormBatchUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadFormsApi#leadFormsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **leadFormBatchUpdate** | [**List&lt;LeadFormBatchUpdate&gt;**](LeadFormBatchUpdate.md)|  |

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

