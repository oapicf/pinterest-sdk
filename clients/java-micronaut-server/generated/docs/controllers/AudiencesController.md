# AudiencesController

All URIs are relative to `"/v5"`

The controller class is defined in **[AudiencesController.java](../../src/main/java/org/openapitools/controller/AudiencesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesCreateCustom**](#audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiencesGet**](#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience

<a id="audiencesCreate"></a>
# **audiencesCreate**
```java
Mono<Audience> AudiencesController.audiencesCreate(adAccountIdaudienceCreateRequest)
```

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**audienceCreateRequest** | [**AudienceCreateRequest**](../../docs/models/AudienceCreateRequest.md) | List of ads to create, size limit [1, 30] |

### Return type
[**Audience**](../../docs/models/Audience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="audiencesCreateCustom"></a>
# **audiencesCreateCustom**
```java
Mono<Audience> AudiencesController.audiencesCreateCustom(adAccountIdaudienceCreateCustomRequest)
```

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**audienceCreateCustomRequest** | [**AudienceCreateCustomRequest**](../../docs/models/AudienceCreateCustomRequest.md) | Custom audience to create. |

### Return type
[**Audience**](../../docs/models/Audience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="audiencesGet"></a>
# **audiencesGet**
```java
Mono<Audience> AudiencesController.audiencesGet(adAccountIdaudienceId)
```

Get audience

Get a specific audience given the audience ID.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**audienceId** | `String` | Unique identifier of an audience |

### Return type
[**Audience**](../../docs/models/Audience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="audiencesList"></a>
# **audiencesList**
```java
Mono<AudiencesList200Response> AudiencesController.audiencesList(adAccountIdbookmarkorderpageSizeownershipType)
```

List audiences

Get list of audiences for the ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**order** | `String` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**ownershipType** | `String` | &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional parameter] [default to `OWNED`] [enum: `OWNED`, `RECEIVED`]

### Return type
[**AudiencesList200Response**](../../docs/models/AudiencesList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="audiencesUpdate"></a>
# **audiencesUpdate**
```java
Mono<Audience> AudiencesController.audiencesUpdate(adAccountIdaudienceIdaudienceUpdateRequest)
```

Update audience

Update (edit or remove) an existing targeting audience.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**audienceId** | `String` | Unique identifier of an audience |
**audienceUpdateRequest** | [**AudienceUpdateRequest**](../../docs/models/AudienceUpdateRequest.md) | The audience to be updated. | [optional parameter]

### Return type
[**Audience**](../../docs/models/Audience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

