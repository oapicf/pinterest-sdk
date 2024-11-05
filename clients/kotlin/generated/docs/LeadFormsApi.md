# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id |
| [**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data |
| [**leadFormsCreate**](LeadFormsApi.md#leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms |
| [**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms |
| [**leadFormsUpdate**](LeadFormsApi.md#leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms |


<a id="leadFormGet"></a>
# **leadFormGet**
> LeadFormResponse leadFormGet(adAccountId, leadFormId)

Get lead form by id

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadFormId** | **kotlin.String**| Unique identifier of a lead form. | |

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

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **leadFormId** | **kotlin.String**| Unique identifier of a lead form. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. | |

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="leadFormsCreate"></a>
# **leadFormsCreate**
> LeadFormArrayResponse leadFormsCreate(adAccountId, leadFormCreateRequest)

Create lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadFormCreateRequest : kotlin.collections.List<LeadFormCreateRequest> =  // kotlin.collections.List<LeadFormCreateRequest> | List of lead forms to create, size limit [1, 30].
try {
    val result : LeadFormArrayResponse = apiInstance.leadFormsCreate(adAccountId, leadFormCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadFormsApi#leadFormsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadFormsApi#leadFormsCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadFormCreateRequest** | [**kotlin.collections.List&lt;LeadFormCreateRequest&gt;**](LeadFormCreateRequest.md)| List of lead forms to create, size limit [1, 30]. | |

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="leadFormsList"></a>
# **leadFormsList**
> LeadFormsList200Response leadFormsList(adAccountId, pageSize, order, bookmark)

List lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **kotlin.String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadFormsUpdate"></a>
# **leadFormsUpdate**
> LeadFormArrayResponse leadFormsUpdate(adAccountId, leadFormUpdateRequest)

Update lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadFormUpdateRequest : kotlin.collections.List<LeadFormUpdateRequest> =  // kotlin.collections.List<LeadFormUpdateRequest> | List of lead forms to update, size limit [1, 30].
try {
    val result : LeadFormArrayResponse = apiInstance.leadFormsUpdate(adAccountId, leadFormUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadFormsApi#leadFormsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadFormsApi#leadFormsUpdate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadFormUpdateRequest** | [**kotlin.collections.List&lt;LeadFormUpdateRequest&gt;**](LeadFormUpdateRequest.md)| List of lead forms to update, size limit [1, 30]. | |

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

