# Org.OpenAPITools.Api.BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardSectionsCreate**](BoardsApi.md#boardsectionscreate) | **POST** /boards/{board_id}/sections | Create board section
[**BoardSectionsDelete**](BoardsApi.md#boardsectionsdelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**BoardSectionsList**](BoardsApi.md#boardsectionslist) | **GET** /boards/{board_id}/sections | List board sections
[**BoardSectionsListPins**](BoardsApi.md#boardsectionslistpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**BoardSectionsUpdate**](BoardsApi.md#boardsectionsupdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**BoardsCreate**](BoardsApi.md#boardscreate) | **POST** /boards | Create board
[**BoardsDelete**](BoardsApi.md#boardsdelete) | **DELETE** /boards/{board_id} | Delete board
[**BoardsGet**](BoardsApi.md#boardsget) | **GET** /boards/{board_id} | Get board
[**BoardsList**](BoardsApi.md#boardslist) | **GET** /boards | List boards
[**BoardsListPins**](BoardsApi.md#boardslistpins) | **GET** /boards/{board_id}/pins | List Pins on board
[**BoardsUpdate**](BoardsApi.md#boardsupdate) | **PATCH** /boards/{board_id} | Update board


<a name="boardsectionscreate"></a>
# **BoardSectionsCreate**
> BoardSection BoardSectionsCreate (string boardId, BoardSection boardSection)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardSectionsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.
            var boardSection = new BoardSection(); // BoardSection | Create a board section.

            try
            {
                // Create board section
                BoardSection result = apiInstance.BoardSectionsCreate(boardId, boardSection);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardSectionsCreate: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 
 **boardSection** | [**BoardSection**](BoardSection.md)| Create a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | response |  -  |
| **400** | Invalid board section parameters. |  -  |
| **403** | Not authorized to create board sections. |  -  |
| **409** | Could not get exclusive access to the board to create a new section. |  -  |
| **500** | Could not create a new board section. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardsectionsdelete"></a>
# **BoardSectionsDelete**
> void BoardSectionsDelete (string boardId, string sectionId)

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardSectionsDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.
            var sectionId = "sectionId_example";  // string | Unique identifier of a board section.

            try
            {
                // Delete board section
                apiInstance.BoardSectionsDelete(boardId, sectionId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardSectionsDelete: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 
 **sectionId** | **string**| Unique identifier of a board section. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Board section deleted successfully |  -  |
| **403** | Not authorized to delete board section. |  -  |
| **404** | Board section not found. |  -  |
| **409** | Board section conflict. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardsectionslist"></a>
# **BoardSectionsList**
> Paginated BoardSectionsList (string boardId, string bookmark = null, int? pageSize = null)

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardSectionsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List board sections
                Paginated result = apiInstance.BoardSectionsList(boardId, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardSectionsList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardsectionslistpins"></a>
# **BoardSectionsListPins**
> Paginated BoardSectionsListPins (string boardId, string sectionId, string bookmark = null, int? pageSize = null)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardSectionsListPinsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.
            var sectionId = "sectionId_example";  // string | Unique identifier of a board section.
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List Pins on board section
                Paginated result = apiInstance.BoardSectionsListPins(boardId, sectionId, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardSectionsListPins: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 
 **sectionId** | **string**| Unique identifier of a board section. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **403** | Not authorized to access Pins on board section. |  -  |
| **404** | Board or section not found. |  -  |
| **409** | Board section conflict. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardsectionsupdate"></a>
# **BoardSectionsUpdate**
> BoardSection BoardSectionsUpdate (string boardId, string sectionId, BoardSection boardSection)

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardSectionsUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.
            var sectionId = "sectionId_example";  // string | Unique identifier of a board section.
            var boardSection = new BoardSection(); // BoardSection | Update a board section.

            try
            {
                // Update board section
                BoardSection result = apiInstance.BoardSectionsUpdate(boardId, sectionId, boardSection);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardSectionsUpdate: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 
 **sectionId** | **string**| Unique identifier of a board section. | 
 **boardSection** | [**BoardSection**](BoardSection.md)| Update a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **400** | Invalid board section parameters. |  -  |
| **403** | Not authorized to update board section. |  -  |
| **409** | Board section conflict. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardscreate"></a>
# **BoardsCreate**
> Board BoardsCreate (Board board)

Create board

Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var board = new Board(); // Board | Create a board using a single board json object.

            try
            {
                // Create board
                Board result = apiInstance.BoardsCreate(board);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardsCreate: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | response |  -  |
| **400** | The board name is invalid or duplicated. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardsdelete"></a>
# **BoardsDelete**
> void BoardsDelete (string boardId)

Delete board

Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardsDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.

            try
            {
                // Delete board
                apiInstance.BoardsDelete(boardId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardsDelete: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Board deleted successfully |  -  |
| **403** | Not authorized to delete the board. |  -  |
| **404** | Board not found. |  -  |
| **409** | Could not get exclusive access to delete the board. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardsget"></a>
# **BoardsGet**
> Board BoardsGet (string boardId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.

            try
            {
                // Get board
                Board result = apiInstance.BoardsGet(boardId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardsGet: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **404** | Board not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardslist"></a>
# **BoardsList**
> Paginated BoardsList (string bookmark = null, int? pageSize = null, string privacy = null)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)
            var privacy = "PUBLIC";  // string | Privacy setting for a board. (optional) 

            try
            {
                // List boards
                Paginated result = apiInstance.BoardsList(bookmark, pageSize, privacy);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardsList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **string**| Privacy setting for a board. | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardslistpins"></a>
# **BoardsListPins**
> Paginated BoardsListPins (string boardId, string bookmark = null, int? pageSize = null)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardsListPinsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List Pins on board
                Paginated result = apiInstance.BoardsListPins(boardId, bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardsListPins: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **404** | Board not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="boardsupdate"></a>
# **BoardsUpdate**
> Board BoardsUpdate (string boardId, BoardUpdate boardUpdate)

Update board

Update a board owned by the \"operating user_account\".

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BoardsUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new BoardsApi(config);
            var boardId = "boardId_example";  // string | Unique identifier of a board.
            var boardUpdate = new BoardUpdate(); // BoardUpdate | Update a board.

            try
            {
                // Update board
                Board result = apiInstance.BoardsUpdate(boardId, boardUpdate);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BoardsApi.BoardsUpdate: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string**| Unique identifier of a board. | 
 **boardUpdate** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **400** | Invalid board parameters. |  -  |
| **403** | Not authorized to update the board. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

