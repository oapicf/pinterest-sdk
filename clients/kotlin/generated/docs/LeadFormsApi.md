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
> LeadForm leadFormGet(leadFormId, adAccountId)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val leadFormId : kotlin.String = leadFormId_example // kotlin.String | The ID of this lead form
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : LeadForm = apiInstance.leadFormGet(leadFormId, adAccountId)
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
| **leadFormId** | **kotlin.String**| The ID of this lead form | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |

### Return type

[**LeadForm**](LeadForm.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadFormTestCreate"></a>
# **leadFormTestCreate**
> LeadFormTest leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val leadFormId : kotlin.String = leadFormId_example // kotlin.String | Unique identifier of a lead form.
val leadFormTestCreate : LeadFormTestCreate =  // LeadFormTestCreate | 
try {
    val result : LeadFormTest = apiInstance.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate)
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
| **adAccountId** | **kotlin.String**|  | |
| **leadFormId** | **kotlin.String**| Unique identifier of a lead form. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadFormTestCreate** | [**LeadFormTestCreate**](LeadFormTestCreate.md)|  | |

### Return type

[**LeadFormTest**](LeadFormTest.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="leadFormsCreate"></a>
# **leadFormsCreate**
> LeadFormsCreate200Response leadFormsCreate(adAccountId, leadFormCreate)

Create lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadFormCreate : kotlin.collections.List<LeadFormCreate> =  // kotlin.collections.List<LeadFormCreate> | 
try {
    val result : LeadFormsCreate200Response = apiInstance.leadFormsCreate(adAccountId, leadFormCreate)
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
| **leadFormCreate** | [**kotlin.collections.List&lt;LeadFormCreate&gt;**](LeadFormCreate.md)|  | |

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="leadFormsList"></a>
# **leadFormsList**
> LeadFormsList200Response leadFormsList(adAccountId, bookmark, pageSize, order)

List lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    val result : LeadFormsList200Response = apiInstance.leadFormsList(adAccountId, bookmark, pageSize, order)
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
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadFormsUpdate"></a>
# **leadFormsUpdate**
> LeadFormsCreate200Response leadFormsUpdate(adAccountId, leadFormBatchUpdate)

Update lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadFormsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadFormBatchUpdate : kotlin.collections.List<LeadFormBatchUpdate> =  // kotlin.collections.List<LeadFormBatchUpdate> | 
try {
    val result : LeadFormsCreate200Response = apiInstance.leadFormsUpdate(adAccountId, leadFormBatchUpdate)
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
| **leadFormBatchUpdate** | [**kotlin.collections.List&lt;LeadFormBatchUpdate&gt;**](LeadFormBatchUpdate.md)|  | |

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

