# SearchController

All URIs are relative to `"/v5"`

The controller class is defined in **[SearchController.java](../../src/main/java/org/openapitools/controller/SearchController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchPartnerPins**](#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
[**searchUserBoardsGet**](#searchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards
[**searchUserPinsList**](#searchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins

<a id="searchPartnerPins"></a>
# **searchPartnerPins**
```java
Mono<SearchPartnerPins200Response> SearchController.searchPartnerPins(termcountryCodebookmarklocalelimit)
```

Search pins by a given search term

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**term** | `String` | Search term to look up pins. |
**countryCode** | `String` | Two letter country code (ISO 3166-1 alpha-2) |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**locale** | `String` | Search locale. | [optional parameter]
**limit** | `Integer` | Max search result size | [optional parameter] [default to `10`]

### Return type
[**SearchPartnerPins200Response**](../../docs/models/SearchPartnerPins200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="searchUserBoardsGet"></a>
# **searchUserBoardsGet**
```java
Mono<SearchUserBoardsGet200Response> SearchController.searchUserBoardsGet(adAccountIdbookmarkpageSizequery)
```

Search user&#39;s boards

Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**query** | `String` | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional parameter]

### Return type
[**SearchUserBoardsGet200Response**](../../docs/models/SearchUserBoardsGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:read_secret`
* **client_credentials**, scopes: `boards:read`, `boards:read_secret`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="searchUserPinsList"></a>
# **searchUserPinsList**
```java
Mono<PinsList200Response> SearchController.searchUserPinsList(queryadAccountIdbookmark)
```

Search user&#39;s Pins

Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**query** | `String` | Search query. Can contain pin description keywords or comma-separated pin IDs. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**PinsList200Response**](../../docs/models/PinsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:read_secret`, `pins:read`, `pins:read_secret`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

