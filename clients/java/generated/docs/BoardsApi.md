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


<a name="boardSectionsCreate"></a>
# **boardSectionsCreate**
> BoardSection boardSectionsCreate(boardId, boardSection)

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    BoardSection boardSection = new BoardSection(); // BoardSection | Create a board section.
    try {
      BoardSection result = apiInstance.boardSectionsCreate(boardId, boardSection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardSectionsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |
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
**201** | response |  -  |
**400** | Invalid board section parameters. |  -  |
**403** | Not authorized to create board sections. |  -  |
**409** | Could not get exclusive access to the board to create a new section. |  -  |
**500** | Could not create a new board section. |  -  |
**0** | Unexpected error |  -  |

<a name="boardSectionsDelete"></a>
# **boardSectionsDelete**
> boardSectionsDelete(boardId, sectionId)

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    String sectionId = "sectionId_example"; // String | Unique identifier of a board section.
    try {
      apiInstance.boardSectionsDelete(boardId, sectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardSectionsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |
 **sectionId** | **String**| Unique identifier of a board section. |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

<a name="boardSectionsList"></a>
# **boardSectionsList**
> Paginated boardSectionsList(boardId, bookmark, pageSize)

List board sections

Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
    try {
      Paginated result = apiInstance.boardSectionsList(boardId, bookmark, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardSectionsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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
**200** | response |  -  |
**0** | Unexpected error |  -  |

<a name="boardSectionsListPins"></a>
# **boardSectionsListPins**
> Paginated boardSectionsListPins(boardId, sectionId, bookmark, pageSize)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    String sectionId = "sectionId_example"; // String | Unique identifier of a board section.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
    try {
      Paginated result = apiInstance.boardSectionsListPins(boardId, sectionId, bookmark, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardSectionsListPins");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |
 **sectionId** | **String**| Unique identifier of a board section. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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
**200** | response |  -  |
**403** | Not authorized to access Pins on board section. |  -  |
**404** | Board or section not found. |  -  |
**409** | Board section conflict. |  -  |
**0** | Unexpected error |  -  |

<a name="boardSectionsUpdate"></a>
# **boardSectionsUpdate**
> BoardSection boardSectionsUpdate(boardId, sectionId, boardSection)

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    String sectionId = "sectionId_example"; // String | Unique identifier of a board section.
    BoardSection boardSection = new BoardSection(); // BoardSection | Update a board section.
    try {
      BoardSection result = apiInstance.boardSectionsUpdate(boardId, sectionId, boardSection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardSectionsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |
 **sectionId** | **String**| Unique identifier of a board section. |
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
**200** | response |  -  |
**400** | Invalid board section parameters. |  -  |
**403** | Not authorized to update board section. |  -  |
**409** | Board section conflict. |  -  |
**0** | Unexpected error |  -  |

<a name="boardsCreate"></a>
# **boardsCreate**
> Board boardsCreate(board)

Create board

Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    Board board = new Board(); // Board | Create a board using a single board json object.
    try {
      Board result = apiInstance.boardsCreate(board);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
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
**201** | response |  -  |
**400** | The board name is invalid or duplicated. |  -  |
**0** | Unexpected error |  -  |

<a name="boardsDelete"></a>
# **boardsDelete**
> boardsDelete(boardId)

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    try {
      apiInstance.boardsDelete(boardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

<a name="boardsGet"></a>
# **boardsGet**
> Board boardsGet(boardId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    try {
      Board result = apiInstance.boardsGet(boardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |

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
**200** | response |  -  |
**404** | Board not found. |  -  |
**0** | Unexpected error |  -  |

<a name="boardsList"></a>
# **boardsList**
> Paginated boardsList(bookmark, pageSize, privacy)

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
    String privacy = "PUBLIC"; // String | Privacy setting for a board.
    try {
      Paginated result = apiInstance.boardsList(bookmark, pageSize, privacy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **String**| Privacy setting for a board. | [optional] [enum: PUBLIC, PROTECTED, SECRET]

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
**200** | response |  -  |
**0** | Unexpected error |  -  |

<a name="boardsListPins"></a>
# **boardsListPins**
> Paginated boardsListPins(boardId, bookmark, pageSize)

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
    Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
    try {
      Paginated result = apiInstance.boardsListPins(boardId, bookmark, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardsListPins");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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
**200** | response |  -  |
**404** | Board not found. |  -  |
**0** | Unexpected error |  -  |

<a name="boardsUpdate"></a>
# **boardsUpdate**
> Board boardsUpdate(boardId, boardUpdate)

Update board

Update a board owned by the \&quot;operating user_account\&quot;.

### Example
```java
// Import classes:
import com.cliffano.pinterestsdk.ApiClient;
import com.cliffano.pinterestsdk.ApiException;
import com.cliffano.pinterestsdk.Configuration;
import com.cliffano.pinterestsdk.auth.*;
import com.cliffano.pinterestsdk.models.*;
import com.cliffano.pinterestsdk.api.BoardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pinterest.com/v5");
    
    // Configure OAuth2 access token for authorization: pinterest_oauth2
    OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
    pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BoardsApi apiInstance = new BoardsApi(defaultClient);
    String boardId = "boardId_example"; // String | Unique identifier of a board.
    BoardUpdate boardUpdate = new BoardUpdate(); // BoardUpdate | Update a board.
    try {
      Board result = apiInstance.boardsUpdate(boardId, boardUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardsApi#boardsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. |
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
**200** | response |  -  |
**400** | Invalid board parameters. |  -  |
**403** | Not authorized to update the board. |  -  |
**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
**0** | Unexpected error |  -  |

