# BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**boardSectionsCreate**](BoardsApi.md#boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section |
| [**boardSectionsDelete**](BoardsApi.md#boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section |
| [**boardSectionsList**](BoardsApi.md#boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections |
| [**boardSectionsListPins**](BoardsApi.md#boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section |
| [**boardSectionsUpdate**](BoardsApi.md#boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section |
| [**boardsCreate**](BoardsApi.md#boardsCreate) | **POST** /boards | Create board |
| [**boardsDelete**](BoardsApi.md#boardsDelete) | **DELETE** /boards/{board_id} | Delete board |
| [**boardsGet**](BoardsApi.md#boardsGet) | **GET** /boards/{board_id} | Get board |
| [**boardsList**](BoardsApi.md#boardsList) | **GET** /boards | List boards |
| [**boardsListPins**](BoardsApi.md#boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board |
| [**boardsUpdate**](BoardsApi.md#boardsUpdate) | **PATCH** /boards/{board_id} | Update board |


<a id="boardSectionsCreate"></a>
# **boardSectionsCreate**
> BoardSection boardSectionsCreate(boardId, boardSectionCreate, adAccountId)

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val boardSectionCreate : BoardSectionCreate =  // BoardSectionCreate | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : BoardSection = apiInstance.boardSectionsCreate(boardId, boardSectionCreate, adAccountId)
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
| **boardId** | **kotlin.String**| Unique identifier of a board. | |
| **boardSectionCreate** | [**BoardSectionCreate**](BoardSectionCreate.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**BoardSection**](BoardSection.md)

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

<a id="boardSectionsDelete"></a>
# **boardSectionsDelete**
> BoardSection boardSectionsDelete(boardId, sectionId, adAccountId)

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
    val result : BoardSection = apiInstance.boardSectionsDelete(boardId, sectionId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardSectionsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardSectionsDelete")
    e.printStackTrace()
}
```

### Parameters
| **boardId** | **kotlin.String**| Unique identifier of a board. | |
| **sectionId** | **kotlin.String**| Unique identifier of a board section. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**BoardSection**](BoardSection.md)

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
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
| **boardId** | **kotlin.String**| Unique identifier of a board. | |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

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
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
| **boardId** | **kotlin.String**| Unique identifier of a board. | |
| **sectionId** | **kotlin.String**| Unique identifier of a board section. | |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardSectionsUpdate"></a>
# **boardSectionsUpdate**
> BoardSection boardSectionsUpdate(boardId, sectionId, boardSectionUpdateWithRequiredBody, adAccountId)

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
val boardSectionUpdateWithRequiredBody : BoardSectionUpdateWithRequiredBody =  // BoardSectionUpdateWithRequiredBody | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : BoardSection = apiInstance.boardSectionsUpdate(boardId, sectionId, boardSectionUpdateWithRequiredBody, adAccountId)
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
| **boardId** | **kotlin.String**| Unique identifier of a board. | |
| **sectionId** | **kotlin.String**| Unique identifier of a board section. | |
| **boardSectionUpdateWithRequiredBody** | [**BoardSectionUpdateWithRequiredBody**](BoardSectionUpdateWithRequiredBody.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**BoardSection**](BoardSection.md)

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

<a id="boardsCreate"></a>
# **boardsCreate**
> Board boardsCreate(boardCreate, adAccountId)

Create board

Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardCreate : BoardCreate =  // BoardCreate | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Board = apiInstance.boardsCreate(boardCreate, adAccountId)
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
| **boardCreate** | [**BoardCreate**](BoardCreate.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**Board**](Board.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="boardsDelete"></a>
# **boardsDelete**
> Board boardsDelete(boardId, adAccountId)

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : Board = apiInstance.boardsDelete(boardId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BoardsApi#boardsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BoardsApi#boardsDelete")
    e.printStackTrace()
}
```

### Parameters
| **boardId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**Board**](Board.md)

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

<a id="boardsGet"></a>
# **boardsGet**
> Board boardsGet(boardId, adAccountId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | 
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
| **boardId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**Board**](Board.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardsList"></a>
# **boardsList**
> BoardsList200Response boardsList(adAccountId, privacy, bookmark, pageSize)

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val privacy : BoardPrivacyFilter =  // BoardPrivacyFilter | The privacy level of the board
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : BoardsList200Response = apiInstance.boardsList(adAccountId, privacy, bookmark, pageSize)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| **privacy** | [**BoardPrivacyFilter**](.md)| The privacy level of the board | [optional] [enum: ALL, PUBLIC, PROTECTED, SECRET, PUBLIC_AND_SECRET] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardsListPins"></a>
# **boardsListPins**
> BoardsListPins200Response boardsListPins(boardId, creativeTypes, adAccountId, pinMetrics, bookmark, pageSize)

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | Unique identifier of a board.
val creativeTypes : kotlin.collections.List<CreativeType> =  // kotlin.collections.List<CreativeType> | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val pinMetrics : kotlin.Boolean = true // kotlin.Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : BoardsListPins200Response = apiInstance.boardsListPins(boardId, creativeTypes, adAccountId, pinMetrics, bookmark, pageSize)
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
| **boardId** | **kotlin.String**| Unique identifier of a board. | |
| **creativeTypes** | [**kotlin.collections.List&lt;CreativeType&gt;**](CreativeType.md)| Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |
| **pinMetrics** | **kotlin.Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="boardsUpdate"></a>
# **boardsUpdate**
> BoardWithUpdatePrivacy boardsUpdate(boardId, boardWithUpdatePrivacyUpdate, adAccountId)

Update board

Update a board owned by the \&quot;operating user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BoardsApi()
val boardId : kotlin.String = boardId_example // kotlin.String | 
val boardWithUpdatePrivacyUpdate : BoardWithUpdatePrivacyUpdate =  // BoardWithUpdatePrivacyUpdate | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : BoardWithUpdatePrivacy = apiInstance.boardsUpdate(boardId, boardWithUpdatePrivacyUpdate, adAccountId)
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
| **boardId** | **kotlin.String**|  | |
| **boardWithUpdatePrivacyUpdate** | [**BoardWithUpdatePrivacyUpdate**](BoardWithUpdatePrivacyUpdate.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**BoardWithUpdatePrivacy**](BoardWithUpdatePrivacy.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

