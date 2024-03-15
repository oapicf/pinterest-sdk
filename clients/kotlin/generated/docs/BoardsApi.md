# BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardSectionsCreate**](BoardsApi.md#boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**boardSectionsDelete**](BoardsApi.md#boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**boardSectionsList**](BoardsApi.md#boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**boardSectionsListPins**](BoardsApi.md#boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**boardSectionsUpdate**](BoardsApi.md#boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boardsCreate**](BoardsApi.md#boardsCreate) | **POST** /boards | Create board
[**boardsDelete**](BoardsApi.md#boardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**boardsGet**](BoardsApi.md#boardsGet) | **GET** /boards/{board_id} | Get board
[**boardsList**](BoardsApi.md#boardsList) | **GET** /boards | List boards
[**boardsListPins**](BoardsApi.md#boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boardsUpdate**](BoardsApi.md#boardsUpdate) | **PATCH** /boards/{board_id} | Update board


<a id="boardSectionsCreate"></a>
# **boardSectionsCreate**
> BoardSection boardSectionsCreate(boardId, boardSection, adAccountId)

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val boardSection : BoardSection =  // BoardSection | Create a board section.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : BoardSection = apiInstance.boardSectionsCreate(boardId, boardSection, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardSectionsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardSectionsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **boardSection** | [**BoardSection**](BoardSection.md)| Create a board section. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**BoardSection**](BoardSection.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="boardSectionsDelete"></a>
# **boardSectionsDelete**
> boardSectionsDelete(boardId, sectionId, adAccountId)

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val sectionId : kotlin.String = sectionId_example // kotlin.String | Unique identifier of a board section.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    apiInstance.boardSectionsDelete(boardId, sectionId, adAccountId)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardSectionsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardSectionsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **sectionId** | **kotlin.String**| Unique identifier of a board section. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardSectionsList"></a>
# **boardSectionsList**
> BoardSectionsList200Response boardSectionsList(boardId, adAccountId, bookmark, pageSize)

List board sections

Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
try {
    val result : BoardSectionsList200Response = apiInstance.boardSectionsList(boardId, adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardSectionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardSectionsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardSectionsListPins"></a>
# **boardSectionsListPins**
> BoardsListPins200Response boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val sectionId : kotlin.String = sectionId_example // kotlin.String | Unique identifier of a board section.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
try {
    val result : BoardsListPins200Response = apiInstance.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardSectionsListPins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardSectionsListPins")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **sectionId** | **kotlin.String**| Unique identifier of a board section. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardSectionsUpdate"></a>
# **boardSectionsUpdate**
> BoardSection boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId)

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val sectionId : kotlin.String = sectionId_example // kotlin.String | Unique identifier of a board section.
val boardSection : BoardSection =  // BoardSection | Update a board section.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : BoardSection = apiInstance.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardSectionsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardSectionsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **sectionId** | **kotlin.String**| Unique identifier of a board section. |
 **boardSection** | [**BoardSection**](BoardSection.md)| Update a board section. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**BoardSection**](BoardSection.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="boardsCreate"></a>
# **boardsCreate**
> Board boardsCreate(board, adAccountId)

Create board

Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val board : Board =  // Board | Create a board using a single board json object.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Board = apiInstance.boardsCreate(board, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**Board**](Board.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="boardsDelete"></a>
# **boardsDelete**
> boardsDelete(boardId, adAccountId)

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    apiInstance.boardsDelete(boardId, adAccountId)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardsGet"></a>
# **boardsGet**
> Board boardsGet(boardId, adAccountId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Board = apiInstance.boardsGet(boardId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**Board**](Board.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardsList"></a>
# **boardsList**
> BoardsList200Response boardsList(adAccountId, bookmark, pageSize, privacy)

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val privacy : kotlin.String = privacy_example // kotlin.String | Privacy setting for a board.
try {
    val result : BoardsList200Response = apiInstance.boardsList(adAccountId, bookmark, pageSize, privacy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **kotlin.String**| Privacy setting for a board. | [optional] [enum: ALL, PROTECTED, PUBLIC, SECRET, PUBLIC_AND_SECRET]

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardsListPins"></a>
# **boardsListPins**
> BoardsListPins200Response boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics)

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
val creativeTypes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinMetrics : kotlin.Boolean = true // kotlin.Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
try {
    val result : BoardsListPins200Response = apiInstance.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardsListPins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardsListPins")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **creativeTypes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [enum: REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA]
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **kotlin.Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardsUpdate"></a>
# **boardsUpdate**
> Board boardsUpdate(boardId, boardUpdate, adAccountId)

Update board

Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val boardUpdate : BoardUpdate =  // BoardUpdate | Update a board.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Board = apiInstance.boardsUpdate(boardId, boardUpdate, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **kotlin.String**| Unique identifier of a board. |
 **boardUpdate** | [**BoardUpdate**](BoardUpdate.md)| Update a board. |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional]

### Return type

[**Board**](Board.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

