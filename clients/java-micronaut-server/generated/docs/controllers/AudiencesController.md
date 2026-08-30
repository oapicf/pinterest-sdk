# AudiencesController

All URIs are relative to `"/v5"`

The controller class is defined in **[AudiencesController.java](../../src/main/java/org/openapitools/controller/AudiencesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesGet**](#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience

<a id="audiencesCreate"></a>
# **audiencesCreate**
```java
Mono<AdAccountsAudience> AudiencesController.audiencesCreate(adAccountIdadAccountsAudienceCreate)
```

Create audience

Create a new audience for the ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**adAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](../../docs/models/AdAccountsAudienceCreate.md) |  |

### Return type
[**AdAccountsAudience**](../../docs/models/AdAccountsAudience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="audiencesGet"></a>
# **audiencesGet**
```java
Mono<AdAccountsAudience> AudiencesController.audiencesGet(audienceIdadAccountId)
```

Get audience

Get a specific audience given the audience ID.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**audienceId** | `String` | Audience ID. |
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**AdAccountsAudience**](../../docs/models/AdAccountsAudience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="audiencesList"></a>
# **audiencesList**
```java
Mono<AudiencesList200Response> AudiencesController.audiencesList(adAccountIdbookmarkpageSizeorderownershipTypeexcludeNca)
```

List audiences

Get list of audiences for the ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**ownershipType** | [**AudienceOwnershipType**](../../docs/models/.md) |  | [optional parameter] [enum: `OWNED`, `RECEIVED`]
**excludeNca** | `Boolean` | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional parameter] [default to `false`]

### Return type
[**AudiencesList200Response**](../../docs/models/AudiencesList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="audiencesUpdate"></a>
# **audiencesUpdate**
```java
Mono<AdAccountsAudience> AudiencesController.audiencesUpdate(audienceIdadAccountIdadAccountsAudienceUpdate)
```

Update audience

Update an existing audience for the ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**audienceId** | `String` | Audience ID. |
**adAccountId** | `String` | Unique identifier of an ad account. |
**adAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](../../docs/models/AdAccountsAudienceUpdate.md) |  |

### Return type
[**AdAccountsAudience**](../../docs/models/AdAccountsAudience.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

