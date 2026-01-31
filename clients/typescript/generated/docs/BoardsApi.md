# .BoardsApi

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


# **boardSectionsCreate**
> BoardSection boardSectionsCreate(boardSection)

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardSectionsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardSectionsCreateRequest = {
    // Unique identifier of a board.
  boardId: "4",
    // Create a board section.
  boardSection: {
    name: "Salads",
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.boardSectionsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardSection** | **BoardSection**| Create a board section. |
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**BoardSection**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | response |  -  |
**400** | Invalid board section parameters. |  -  |
**403** | Not authorized to create board sections. |  -  |
**409** | Could not get exclusive access to the board to create a new section. |  -  |
**500** | Could not create a new board section. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardSectionsDelete**
> void boardSectionsDelete()

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardSectionsDeleteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardSectionsDeleteRequest = {
    // Unique identifier of a board.
  boardId: "4",
    // Unique identifier of a board section.
  sectionId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.boardSectionsDelete(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **sectionId** | [**string**] | Unique identifier of a board section. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Board section deleted successfully |  -  |
**403** | Not authorized to delete board section. |  -  |
**404** | Board section not found. |  -  |
**409** | Board section conflict. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardSectionsList**
> BoardSectionsList200Response boardSectionsList()

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardSectionsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardSectionsListRequest = {
    // Unique identifier of a board.
  boardId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.boardSectionsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**BoardSectionsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardSectionsListPins**
> BoardsListPins200Response boardSectionsListPins()

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardSectionsListPinsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardSectionsListPinsRequest = {
    // Unique identifier of a board.
  boardId: "4",
    // Unique identifier of a board section.
  sectionId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.boardSectionsListPins(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **sectionId** | [**string**] | Unique identifier of a board section. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**BoardsListPins200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**403** | Not authorized to access Pins on board section. |  -  |
**404** | Board or section not found. |  -  |
**409** | Board section conflict. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardSectionsUpdate**
> BoardSection boardSectionsUpdate(boardSection)

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardSectionsUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardSectionsUpdateRequest = {
    // Unique identifier of a board.
  boardId: "4",
    // Unique identifier of a board section.
  sectionId: "4",
    // Update a board section.
  boardSection: {
    name: "Salads",
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.boardSectionsUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardSection** | **BoardSection**| Update a board section. |
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **sectionId** | [**string**] | Unique identifier of a board section. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**BoardSection**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**400** | Invalid board section parameters. |  -  |
**403** | Not authorized to update board section. |  -  |
**409** | Board section conflict. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsCreate**
> Board boardsCreate(boardCreate)

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardsCreateRequest = {
  
  boardCreate: {
    description: "My favorite summer recipes",
    isAdsOnly: true,
    name: "Summer recipes",
    privacy: null,
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.boardsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardCreate** | **BoardCreate**|  |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Board**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsDelete**
> void boardsDelete()

Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardsDeleteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardsDeleteRequest = {
  
  boardId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.boardsDelete(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] |  | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Resource deleted successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsGet**
> Board boardsGet()

Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardsGetRequest = {
  
  boardId: "4",
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.boardsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] |  | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Board**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsList**
> BoardsList200Response boardsList()

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardsListRequest = {
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // The privacy level of the board (optional)
  privacy: "ALL",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.boardsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **privacy** | **BoardPrivacyFilter** | The privacy level of the board | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25


### Return type

**BoardsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsListPins**
> BoardsListPins200Response boardsListPins()

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardsListPinsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardsListPinsRequest = {
    // Unique identifier of a board.
  boardId: "4",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
  creativeTypes: [
    "REGULAR",
  ],
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
    // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
  pinMetrics: false,
};

const data = await apiInstance.boardsListPins(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **creativeTypes** | **Array&lt;CreativeType&gt;** | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | (optional) defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false


### Return type

**BoardsListPins200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**404** | Board not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsUpdate**
> BoardWithUpdatePrivacy boardsUpdate(boardWithUpdatePrivacyUpdate)

Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import { createConfiguration, BoardsApi } from '';
import type { BoardsApiBoardsUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BoardsApi(configuration);

const request: BoardsApiBoardsUpdateRequest = {
  
  boardId: "4",
  
  boardWithUpdatePrivacyUpdate: {
    description: "My favorite summer recipes",
    name: "Summer recipes",
    privacy: "PUBLIC",
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.boardsUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardWithUpdatePrivacyUpdate** | **BoardWithUpdatePrivacyUpdate**|  |
 **boardId** | [**string**] |  | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**BoardWithUpdatePrivacy**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


