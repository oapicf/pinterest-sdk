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

> LeadFormResponse leadFormGet(adAccountId, leadFormId)

Get lead form by id

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String leadFormId = 1234567890123; // String | Unique identifier of a lead form.
try {
    LeadFormResponse result = apiInstance.leadFormGet(adAccountId, leadFormId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadFormsApi#leadFormGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **leadFormId** | **String**| Unique identifier of a lead form. | [default to null]

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## leadFormTestCreate

> LeadFormTestResponse leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String leadFormId = 1234567890123; // String | Unique identifier of a lead form.
LeadFormTestRequest leadFormTestRequest = new LeadFormTestRequest(); // LeadFormTestRequest | Subscription to create.
try {
    LeadFormTestResponse result = apiInstance.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadFormsApi#leadFormTestCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **leadFormId** | **String**| Unique identifier of a lead form. | [default to null]
 **leadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. |

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## leadFormsCreate

> LeadFormArrayResponse leadFormsCreate(adAccountId, leadFormCreateRequest)

Create lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<LeadFormCreateRequest> leadFormCreateRequest = Arrays.asList(new LeadFormCreateRequest()); // List<LeadFormCreateRequest> | List of lead forms to create, size limit [1, 30].
try {
    LeadFormArrayResponse result = apiInstance.leadFormsCreate(adAccountId, leadFormCreateRequest);
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
 **leadFormCreateRequest** | [**List&lt;LeadFormCreateRequest&gt;**](LeadFormCreateRequest.md)| List of lead forms to create, size limit [1, 30]. |

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## leadFormsList

> LeadFormsList200Response leadFormsList(adAccountId, pageSize, order, bookmark)

List lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
String order = ASCENDING; // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    LeadFormsList200Response result = apiInstance.leadFormsList(adAccountId, pageSize, order, bookmark);
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
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## leadFormsUpdate

> LeadFormArrayResponse leadFormsUpdate(adAccountId, leadFormUpdateRequest)

Update lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadFormsApi;

LeadFormsApi apiInstance = new LeadFormsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<LeadFormUpdateRequest> leadFormUpdateRequest = Arrays.asList(new LeadFormUpdateRequest()); // List<LeadFormUpdateRequest> | List of lead forms to update, size limit [1, 30].
try {
    LeadFormArrayResponse result = apiInstance.leadFormsUpdate(adAccountId, leadFormUpdateRequest);
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
 **leadFormUpdateRequest** | [**List&lt;LeadFormUpdateRequest&gt;**](LeadFormUpdateRequest.md)| List of lead forms to update, size limit [1, 30]. |

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

