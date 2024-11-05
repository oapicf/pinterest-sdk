# SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchPartnerPins**](SearchApi.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term |
| [**searchUserBoardsGet**](SearchApi.md#searchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards |
| [**searchUserPinsList**](SearchApi.md#searchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins |


## Creating SearchApi

To initiate an instance of `SearchApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.SearchApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(SearchApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    SearchApi searchApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="searchPartnerPins"></a>
# **searchPartnerPins**
```java
Mono<SearchPartnerPins200Response> SearchApi.searchPartnerPins(termcountryCodebookmarklocalelimit)
```

Search pins by a given search term

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **term** | `String`| Search term to look up pins. | |
| **countryCode** | `String`| Two letter country code (ISO 3166-1 alpha-2) | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **locale** | `String`| Search locale. | [optional parameter] |
| **limit** | `Integer`| Max search result size | [optional parameter] [default to `10`] |


### Return type
[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="searchUserBoardsGet"></a>
# **searchUserBoardsGet**
```java
Mono<SearchUserBoardsGet200Response> SearchApi.searchUserBoardsGet(adAccountIdbookmarkpageSizequery)
```

Search user&#39;s boards

Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **query** | `String`| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional parameter] |


### Return type
[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `boards:read_secret`
* **[client_credentials](auth.md#client_credentials)**, scopes: `boards:read`, `boards:read_secret`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="searchUserPinsList"></a>
# **searchUserPinsList**
```java
Mono<PinsList200Response> SearchApi.searchUserPinsList(queryadAccountIdbookmark)
```

Search user&#39;s Pins

Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | `String`| Search query. Can contain pin description keywords or comma-separated pin IDs. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |


### Return type
[**PinsList200Response**](PinsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `boards:read_secret`, `pins:read`, `pins:read_secret`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

