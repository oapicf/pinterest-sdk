# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**labelsApply**](LabelsApi.md#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity |
| [**labelsCreate**](LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labelsList**](LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labelsRemove**](LabelsApi.md#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities |
| [**labelsUpdate**](LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |


<a id="labelsApply"></a>
# **labelsApply**
> LabeledEntities labelsApply(adAccountId, labelId, labeledEntitiesCreate)

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LabelsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val labelId : kotlin.String = labelId_example // kotlin.String | Label ID.
val labeledEntitiesCreate : LabeledEntitiesCreate =  // LabeledEntitiesCreate | 
try {
    val result : LabeledEntities = apiInstance.labelsApply(adAccountId, labelId, labeledEntitiesCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LabelsApi#labelsApply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LabelsApi#labelsApply")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| **labelId** | **kotlin.String**| Label ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | |

### Return type

[**LabeledEntities**](LabeledEntities.md)

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

<a id="labelsCreate"></a>
# **labelsCreate**
> LabelsResponse labelsCreate(adAccountId, labelCreateRequest)

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

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

<a id="labelsList"></a>
# **labelsList**
> LabelsList200Response labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize)

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LabelsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val campaignIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Campaign Ids to use to filter the results.
val labelIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Label Ids to use to filter the results.
val entityStatuses : kotlin.collections.List<QueryLabelEntityStatusesItems> =  // kotlin.collections.List<QueryLabelEntityStatusesItems> | Label entity status
val labelTypes : kotlin.collections.List<QueryLabelTypesItems> =  // kotlin.collections.List<QueryLabelTypesItems> | Label type.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : LabelsList200Response = apiInstance.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize)
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
| **entityStatuses** | [**kotlin.collections.List&lt;QueryLabelEntityStatusesItems&gt;**](QueryLabelEntityStatusesItems.md)| Label entity status | [optional] [default to arrayListOf(QueryLabelEntityStatusesItems.ACTIVE)] |
| **labelTypes** | [**kotlin.collections.List&lt;QueryLabelTypesItems&gt;**](QueryLabelTypesItems.md)| Label type. | [optional] [default to arrayListOf(QueryLabelTypesItems.BRAND,QueryLabelTypesItems.CUSTOM)] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

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

<a id="labelsRemove"></a>
# **labelsRemove**
> LabeledEntities labelsRemove(adAccountId, labelId, labeledEntitiesCreate)

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LabelsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val labelId : kotlin.String = labelId_example // kotlin.String | Label ID.
val labeledEntitiesCreate : LabeledEntitiesCreate =  // LabeledEntitiesCreate | 
try {
    val result : LabeledEntities = apiInstance.labelsRemove(adAccountId, labelId, labeledEntitiesCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LabelsApi#labelsRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LabelsApi#labelsRemove")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| **labelId** | **kotlin.String**| Label ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | |

### Return type

[**LabeledEntities**](LabeledEntities.md)

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

<a id="labelsUpdate"></a>
# **labelsUpdate**
> LabelsResponse labelsUpdate(adAccountId, labelUpdateRequest)

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

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

