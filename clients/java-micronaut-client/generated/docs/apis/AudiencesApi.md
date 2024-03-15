# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**audiencesCreate**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiencesCreateCustom**](AudiencesApi.md#audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience |
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
Mono<Audience> AudiencesApi.audiencesCreate(adAccountIdaudienceCreateRequest)
```

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **audienceCreateRequest** | [**AudienceCreateRequest**](AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] | |


### Return type
[**Audience**](Audience.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="audiencesCreateCustom"></a>
# **audiencesCreateCustom**
```java
Mono<Audience> AudiencesApi.audiencesCreateCustom(adAccountIdaudienceCreateCustomRequest)
```

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **audienceCreateCustomRequest** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md)| Custom audience to create. | |


### Return type
[**Audience**](Audience.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="audiencesGet"></a>
# **audiencesGet**
```java
Mono<Audience> AudiencesApi.audiencesGet(adAccountIdaudienceId)
```

Get audience

Get a specific audience given the audience ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **audienceId** | `String`| Unique identifier of an audience | |


### Return type
[**Audience**](Audience.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="audiencesList"></a>
# **audiencesList**
```java
Mono<AudiencesList200Response> AudiencesApi.audiencesList(adAccountIdbookmarkorderpageSizeownershipType)
```

List audiences

Get list of audiences for the ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **order** | `String`| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`] |
| **ownershipType** | `String`| &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional parameter] [default to `OWNED`] [enum: `OWNED`, `RECEIVED`] |


### Return type
[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="audiencesUpdate"></a>
# **audiencesUpdate**
```java
Mono<Audience> AudiencesApi.audiencesUpdate(adAccountIdaudienceIdaudienceUpdateRequest)
```

Update audience

Update (edit or remove) an existing targeting audience.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **audienceId** | `String`| Unique identifier of an audience | |
| **audienceUpdateRequest** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md)| The audience to be updated. | [optional parameter] |


### Return type
[**Audience**](Audience.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

