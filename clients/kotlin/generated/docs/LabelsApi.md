# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**labelsCreate**](LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labelsList**](LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labelsUpdate**](LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |


<a id="labelsCreate"></a>
# **labelsCreate**
> LabelsResponse labelsCreate(adAccountId, labelCreateRequest)

Create labels

&lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LabelsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val labelCreateRequest : LabelCreateRequest =  // LabelCreateRequest | 
try {
    val result : LabelsResponse = apiInstance.labelsCreate(adAccountId, labelCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LabelsApi#labelsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LabelsApi#labelsCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **labelCreateRequest** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="labelsList"></a>
# **labelsList**
> LabelsList200Response labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark)

List labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LabelsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
val labelIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Label Ids to use to filter the results.
val entityStatuses : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Label entity status
val labelTypes : kotlin.collections.List<kotlin.String> = ["BRAND","CUSTOM"] // kotlin.collections.List<kotlin.String> | Label type.
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
try {
    val result : LabelsList200Response = apiInstance.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LabelsApi#labelsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LabelsApi#labelsList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **campaignIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Campaign Ids to use to filter the results. | [optional] |
| **labelIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Label Ids to use to filter the results. | [optional] |
| **entityStatuses** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Label entity status | [optional] [default to kotlin.collections.List&lt;EntityStatuses&gt;.arrayListOfLeft_ParenthesisEntityStatusesPeriodACTIVERight_Parenthesis] [enum: ACTIVE, ARCHIVED] |
| **labelTypes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Label type. | [optional] [default to kotlin.collections.List&lt;LabelTypes&gt;.arrayListOfLeft_ParenthesisLabelTypesPeriodBRANDCommaLabelTypesPeriodCUSTOMRight_Parenthesis] [enum: BRAND, CUSTOM] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="labelsUpdate"></a>
# **labelsUpdate**
> LabelsResponse labelsUpdate(adAccountId, labelUpdateRequest)

Update labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LabelsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val labelUpdateRequest : LabelUpdateRequest =  // LabelUpdateRequest | 
try {
    val result : LabelsResponse = apiInstance.labelsUpdate(adAccountId, labelUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LabelsApi#labelsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LabelsApi#labelsUpdate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **labelUpdateRequest** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

