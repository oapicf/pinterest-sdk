# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms


<a id="leadFormGet"></a>
# **leadFormGet**
> LeadFormResponse leadFormGet(adAccountId, leadFormId)

Get lead form by id

Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadFormId : kotlin.String = 1234567890123 // kotlin.String | Unique identifier of a lead form.
try {
    val result : LeadFormResponse = apiInstance.leadFormGet(adAccountId, leadFormId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadFormsApi#leadFormGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadFormsApi#leadFormGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **leadFormId** | **kotlin.String**| Unique identifier of a lead form. |

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadFormTestCreate"></a>
# **leadFormTestCreate**
> LeadFormTestResponse leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadFormId : kotlin.String = 1234567890123 // kotlin.String | Unique identifier of a lead form.
val leadFormTestRequest : LeadFormTestRequest =  // LeadFormTestRequest | Subscription to create.
try {
    val result : LeadFormTestResponse = apiInstance.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadFormsApi#leadFormTestCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadFormsApi#leadFormTestCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **leadFormId** | **kotlin.String**| Unique identifier of a lead form. |
 **leadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. |

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="leadFormsList"></a>
# **leadFormsList**
> LeadFormsList200Response leadFormsList(adAccountId, pageSize, order, bookmark)

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : LeadFormsList200Response = apiInstance.leadFormsList(adAccountId, pageSize, order, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadFormsApi#leadFormsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadFormsApi#leadFormsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **kotlin.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

