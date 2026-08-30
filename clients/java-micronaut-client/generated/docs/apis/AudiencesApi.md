# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**audiencesCreate**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiencesGet**](AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**audiencesList**](AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**audiencesUpdate**](AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |


## Creating AudiencesApi

To initiate an instance of `AudiencesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AudiencesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AudiencesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AudiencesApi audiencesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="audiencesCreate"></a>
# **audiencesCreate**
```java
Mono<AdAccountsAudience> AudiencesApi.audiencesCreate(adAccountIdadAccountsAudienceCreate)
```

Create audience

Create a new audience for the ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md)|  | |


### Return type
[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="audiencesGet"></a>
# **audiencesGet**
```java
Mono<AdAccountsAudience> AudiencesApi.audiencesGet(audienceIdadAccountId)
```

Get audience

Get a specific audience given the audience ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audienceId** | `String`| Audience ID. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="audiencesList"></a>
# **audiencesList**
```java
Mono<AudiencesList200Response> AudiencesApi.audiencesList(adAccountIdbookmarkpageSizeorderownershipTypeexcludeNca)
```

List audiences

Get list of audiences for the ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **ownershipType** | [**AudienceOwnershipType**](.md)|  | [optional parameter] [enum: `OWNED`, `RECEIVED`] |
| **excludeNca** | `Boolean`| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional parameter] [default to `false`] |


### Return type
[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="audiencesUpdate"></a>
# **audiencesUpdate**
```java
Mono<AdAccountsAudience> AudiencesApi.audiencesUpdate(audienceIdadAccountIdadAccountsAudienceUpdate)
```

Update audience

Update an existing audience for the ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audienceId** | `String`| Audience ID. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md)|  | |


### Return type
[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

