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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardSectionsCreateRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // BoardSection | Create a board section.
  boardSection: {
    name: "Salads",
  },
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.boardSectionsCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardSectionsDeleteRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // string | Unique identifier of a board section.
  sectionId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.boardSectionsDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardSectionsListRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

apiInstance.boardSectionsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**BoardSectionsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardSectionsListPinsRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // string | Unique identifier of a board section.
  sectionId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

apiInstance.boardSectionsListPins(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **sectionId** | [**string**] | Unique identifier of a board section. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**BoardsListPins200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardSectionsUpdateRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // string | Unique identifier of a board section.
  sectionId: "4",
  // BoardSection | Update a board section.
  boardSection: {
    name: "Salads",
  },
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.boardSectionsUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
> Board boardsCreate(board)

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardsCreateRequest = {
  // Board | Create a board using a single board json object.
  board: {
    name: "Summer Recipes",
    description: "My favorite summer recipes",
    privacy: "PUBLIC",
  },
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.boardsCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | **Board**| Create a board using a single board json object. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Board**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | response |  -  |
**400** | The board name is invalid or duplicated. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsDelete**
> void boardsDelete()

Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardsDeleteRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.boardsDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
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
**204** | Board deleted successfully |  -  |
**403** | Not authorized to delete the board. |  -  |
**404** | Board not found. |  -  |
**409** | Could not get exclusive access to delete the board. |  -  |
**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsGet**
> Board boardsGet()

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardsGetRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.boardsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Board**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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

# **boardsList**
> BoardsList200Response boardsList()

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardsListRequest = {
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // 'ALL' | 'PROTECTED' | 'PUBLIC' | 'SECRET' | 'PUBLIC_AND_SECRET' | Privacy setting for a board. (optional)
  privacy: "ALL",
};

apiInstance.boardsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **privacy** | [**&#39;ALL&#39; | &#39;PROTECTED&#39; | &#39;PUBLIC&#39; | &#39;SECRET&#39; | &#39;PUBLIC_AND_SECRET&#39;**]**Array<&#39;ALL&#39; &#124; &#39;PROTECTED&#39; &#124; &#39;PUBLIC&#39; &#124; &#39;SECRET&#39; &#124; &#39;PUBLIC_AND_SECRET&#39;>** | Privacy setting for a board. | (optional) defaults to undefined


### Return type

**BoardsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **boardsListPins**
> BoardsListPins200Response boardsListPins()

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardsListPinsRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'> | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
  creativeTypes: [
    "REGULAR",
  ],
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
  // boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)
  pinMetrics: false,
};

apiInstance.boardsListPins(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **creativeTypes** | **Array<&#39;REGULAR&#39; &#124; &#39;VIDEO&#39; &#124; &#39;SHOPPING&#39; &#124; &#39;CAROUSEL&#39; &#124; &#39;MAX_VIDEO&#39; &#124; &#39;SHOP_THE_PIN&#39; &#124; &#39;COLLECTION&#39; &#124; &#39;IDEA&#39;>** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | (optional) defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined
 **pinMetrics** | [**boolean**] | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | (optional) defaults to false


### Return type

**BoardsListPins200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

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
> Board boardsUpdate(boardUpdate)

Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BoardsApi(configuration);

let body:.BoardsApiBoardsUpdateRequest = {
  // string | Unique identifier of a board.
  boardId: "4",
  // BoardUpdate | Update a board.
  boardUpdate: {
    name: "Summer Recipes",
    description: "My favorite summer recipes",
    privacy: "PUBLIC",
  },
  // string | Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

apiInstance.boardsUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardUpdate** | **BoardUpdate**| Update a board. |
 **boardId** | [**string**] | Unique identifier of a board. | defaults to undefined
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**Board**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**400** | Invalid board parameters. |  -  |
**403** | Not authorized to update the board. |  -  |
**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

