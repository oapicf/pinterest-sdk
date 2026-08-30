# TargetingTemplateController

All URIs are relative to `"/v5"`

The controller class is defined in **[TargetingTemplateController.java](../../src/main/java/org/openapitools/controller/TargetingTemplateController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates

<a id="targetingTemplateCreate"></a>
# **targetingTemplateCreate**
```java
Mono<TargetingTemplate> TargetingTemplateController.targetingTemplateCreate(adAccountIdtargetingTemplateCreate)
```

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**targetingTemplateCreate** | [**TargetingTemplateCreate**](../../docs/models/TargetingTemplateCreate.md) |  |

### Return type
[**TargetingTemplate**](../../docs/models/TargetingTemplate.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="targetingTemplateList"></a>
# **targetingTemplateList**
```java
Mono<TargetingTemplateList200Response> TargetingTemplateController.targetingTemplateList(adAccountIdbookmarkpageSizeorderincludeSizingsearchQuery)
```

List targeting templates

Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**includeSizing** | `Boolean` | Include audience sizing in result or not | [optional parameter] [default to `false`]
**searchQuery** | `String` | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional parameter]

### Return type
[**TargetingTemplateList200Response**](../../docs/models/TargetingTemplateList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="targetingTemplateUpdate"></a>
# **targetingTemplateUpdate**
```java
Mono<Object> TargetingTemplateController.targetingTemplateUpdate(adAccountIdtargetingTemplateUpdateRequestReadOrUpdate)
```

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**targetingTemplateUpdateRequestReadOrUpdate** | [**TargetingTemplateUpdateRequestReadOrUpdate**](../../docs/models/TargetingTemplateUpdateRequestReadOrUpdate.md) |  |


### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

