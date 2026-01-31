# Org.OpenAPITools.Api.BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**BoardSectionsCreate**](BoardsApi.md#boardsectionscreate) | **POST** /boards/{board_id}/sections | Create board section |
| [**BoardSectionsDelete**](BoardsApi.md#boardsectionsdelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section |
| [**BoardSectionsList**](BoardsApi.md#boardsectionslist) | **GET** /boards/{board_id}/sections | List board sections |
| [**BoardSectionsListPins**](BoardsApi.md#boardsectionslistpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section |
| [**BoardSectionsUpdate**](BoardsApi.md#boardsectionsupdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section |
| [**BoardsCreate**](BoardsApi.md#boardscreate) | **POST** /boards | Create board |
| [**BoardsDelete**](BoardsApi.md#boardsdelete) | **DELETE** /boards/{board_id} | Delete board |
| [**BoardsGet**](BoardsApi.md#boardsget) | **GET** /boards/{board_id} | Get board |
| [**BoardsList**](BoardsApi.md#boardslist) | **GET** /boards | List boards |
| [**BoardsListPins**](BoardsApi.md#boardslistpins) | **GET** /boards/{board_id}/pins | List Pins on board |
| [**BoardsUpdate**](BoardsApi.md#boardsupdate) | **PATCH** /boards/{board_id} | Update board |

<a id="boardsectionscreate"></a>
# **BoardSectionsCreate**
> BoardSection BoardSectionsCreate (string boardId, BoardSection boardSection, string adAccountId = null)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** | Unique identifier of a board. |  |
| **boardSection** | [**BoardSection**](BoardSection.md) | Create a board section. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardsectionsdelete"></a>
# **BoardSectionsDelete**
> void BoardSectionsDelete (string boardId, string sectionId, string adAccountId = null)

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** | Unique identifier of a board. |  |
| **sectionId** | **string** | Unique identifier of a board section. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardsectionslist"></a>
# **BoardSectionsList**
> BoardSectionsList200Response BoardSectionsList (string boardId, string adAccountId = null, string bookmark = null, int pageSize = null)

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** | Unique identifier of a board. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardsectionslistpins"></a>
# **BoardSectionsListPins**
> BoardsListPins200Response BoardSectionsListPins (string boardId, string sectionId, string adAccountId = null, string bookmark = null, int pageSize = null)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** | Unique identifier of a board. |  |
| **sectionId** | **string** | Unique identifier of a board section. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardsectionsupdate"></a>
# **BoardSectionsUpdate**
> BoardSection BoardSectionsUpdate (string boardId, string sectionId, BoardSection boardSection, string adAccountId = null)

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** | Unique identifier of a board. |  |
| **sectionId** | **string** | Unique identifier of a board section. |  |
| **boardSection** | [**BoardSection**](BoardSection.md) | Update a board section. |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardscreate"></a>
# **BoardsCreate**
> Board BoardsCreate (BoardCreate boardCreate, string adAccountId = null)

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardCreate** | [**BoardCreate**](BoardCreate.md) |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardsdelete"></a>
# **BoardsDelete**
> void BoardsDelete (string boardId, string adAccountId = null)

Delete board

Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

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
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardsget"></a>
# **BoardsGet**
> Board BoardsGet (string boardId, string adAccountId = null)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardslist"></a>
# **BoardsList**
> BoardsList200Response BoardsList (string adAccountId = null, BoardPrivacyFilter privacy = null, string bookmark = null, int pageSize = null)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **privacy** | **BoardPrivacyFilter** | The privacy level of the board | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardslistpins"></a>
# **BoardsListPins**
> BoardsListPins200Response BoardsListPins (string boardId, string bookmark = null, int pageSize = null, List<CreativeType> creativeTypes = null, string adAccountId = null, bool pinMetrics = null)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** | Unique identifier of a board. |  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **creativeTypes** | [**List&lt;CreativeType&gt;**](CreativeType.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional]  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |
| **pinMetrics** | **bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **404** | Board not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="boardsupdate"></a>
# **BoardsUpdate**
> BoardWithUpdatePrivacy BoardsUpdate (string boardId, BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, string adAccountId = null)

Update board

Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **boardId** | **string** |  |  |
| **boardWithUpdatePrivacyUpdate** | [**BoardWithUpdatePrivacyUpdate**](BoardWithUpdatePrivacyUpdate.md) |  |  |
| **adAccountId** | **string** | Unique identifier of an ad account. | [optional]  |

### Return type

[**BoardWithUpdatePrivacy**](BoardWithUpdatePrivacy.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

