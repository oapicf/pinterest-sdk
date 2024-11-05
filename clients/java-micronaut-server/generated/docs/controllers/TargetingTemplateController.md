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
Mono<TargetingTemplateGetResponseData> TargetingTemplateController.targetingTemplateCreate(adAccountIdtargetingTemplateCreate)
```

Create targeting templates

&lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**targetingTemplateCreate** | [**TargetingTemplateCreate**](../../docs/models/TargetingTemplateCreate.md) | targeting template creation entity |

### Return type
[**TargetingTemplateGetResponseData**](../../docs/models/TargetingTemplateGetResponseData.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="targetingTemplateList"></a>
# **targetingTemplateList**
```java
Mono<TargetingTemplateList200Response> TargetingTemplateController.targetingTemplateList(adAccountIdorderincludeSizingsearchQuerypageSizebookmark)
```

List targeting templates

Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**order** | `String` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**includeSizing** | `Boolean` | Include audience sizing in result or not | [optional parameter] [default to `false`]
**searchQuery** | `String` | Search keyword for targeting templates | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**TargetingTemplateList200Response**](../../docs/models/TargetingTemplateList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="targetingTemplateUpdate"></a>
# **targetingTemplateUpdate**
```java
Mono<Object> TargetingTemplateController.targetingTemplateUpdate(adAccountIdtargetingTemplateUpdateRequest)
```

Update targeting templates

&lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**targetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](../../docs/models/TargetingTemplateUpdateRequest.md) | Operation type and targeting template ID |


### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

