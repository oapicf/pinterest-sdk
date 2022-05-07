# \BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardSectionsCreate**](BoardsApi.md#BoardSectionsCreate) | **Post** /boards/{board_id}/sections | Create board section
[**BoardSectionsDelete**](BoardsApi.md#BoardSectionsDelete) | **Delete** /boards/{board_id}/sections/{section_id} | Delete board section
[**BoardSectionsList**](BoardsApi.md#BoardSectionsList) | **Get** /boards/{board_id}/sections | List board sections
[**BoardSectionsListPins**](BoardsApi.md#BoardSectionsListPins) | **Get** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**BoardSectionsUpdate**](BoardsApi.md#BoardSectionsUpdate) | **Patch** /boards/{board_id}/sections/{section_id} | Update board section
[**BoardsCreate**](BoardsApi.md#BoardsCreate) | **Post** /boards | Create board
[**BoardsDelete**](BoardsApi.md#BoardsDelete) | **Delete** /boards/{board_id} | Delete board
[**BoardsGet**](BoardsApi.md#BoardsGet) | **Get** /boards/{board_id} | Get board
[**BoardsList**](BoardsApi.md#BoardsList) | **Get** /boards | List boards
[**BoardsListPins**](BoardsApi.md#BoardsListPins) | **Get** /boards/{board_id}/pins | List Pins on board
[**BoardsUpdate**](BoardsApi.md#BoardsUpdate) | **Patch** /boards/{board_id} | Update board



## BoardSectionsCreate

> BoardSection BoardSectionsCreate(ctx, boardId, boardSection)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string**| Unique identifier of a board. | 
**boardSection** | [**BoardSection**](BoardSection.md)| Create a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardSectionsDelete

> BoardSectionsDelete(ctx, boardId, sectionId)

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string**| Unique identifier of a board. | 
**sectionId** | **string**| Unique identifier of a board section. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardSectionsList

> Paginated BoardSectionsList(ctx, boardId, optional)

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string**| Unique identifier of a board. | 
 **optional** | ***BoardSectionsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BoardSectionsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardSectionsListPins

> Paginated BoardSectionsListPins(ctx, boardId, sectionId, optional)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string**| Unique identifier of a board. | 
**sectionId** | **string**| Unique identifier of a board section. | 
 **optional** | ***BoardSectionsListPinsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BoardSectionsListPinsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardSectionsUpdate

> BoardSection BoardSectionsUpdate(ctx, boardId, sectionId, boardSection)

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsCreate

> Board BoardsCreate(ctx, board)

Create board

Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**board** | [**Board**](Board.md)| Create a board using a single board json object. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsDelete

> BoardsDelete(ctx, boardId)

Delete board

Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string**| Unique identifier of a board. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsGet

> Board BoardsGet(ctx, boardId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string**| Unique identifier of a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsList

> Paginated BoardsList(ctx, optional)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***BoardsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BoardsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **privacy** | **optional.String**| Privacy setting for a board. | 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsListPins

> Paginated BoardsListPins(ctx, boardId, optional)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string**| Unique identifier of a board. | 
 **optional** | ***BoardsListPinsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BoardsListPinsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsUpdate

> Board BoardsUpdate(ctx, boardId, boardUpdate)

Update board

Update a board owned by the \"operating user_account\".

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string**| Unique identifier of a board. | 
**boardUpdate** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

