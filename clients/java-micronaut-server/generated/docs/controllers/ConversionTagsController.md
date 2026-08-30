# ConversionTagsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ConversionTagsController.java](../../src/main/java/org/openapitools/controller/ConversionTagsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionTagsCreate**](#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversionTagsGet**](#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversionTagsList**](#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
[**ocpmEligibleConversionTagsGet**](#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**pageVisitConversionTagsGet**](#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags

<a id="conversionTagsCreate"></a>
# **conversionTagsCreate**
```java
Mono<ConversionTag> ConversionTagsController.conversionTagsCreate(adAccountIdconversionTagCreate)
```

Create conversion tag

Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionTagCreate** | [**ConversionTagCreate**](../../docs/models/ConversionTagCreate.md) |  |

### Return type
[**ConversionTag**](../../docs/models/ConversionTag.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="conversionTagsGet"></a>
# **conversionTagsGet**
```java
Mono<ConversionTag> ConversionTagsController.conversionTagsGet(adAccountIdconversionTagId)
```

Get conversion tag

Get information about an existing conversion tag.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionTagId** | `String` | Id of the conversion tag. |

### Return type
[**ConversionTag**](../../docs/models/ConversionTag.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="conversionTagsList"></a>
# **conversionTagsList**
```java
Mono<ConversionTagsList200Response> ConversionTagsController.conversionTagsList(adAccountIdfilterDeleted)
```

List conversion tags

List conversion tags associated with an ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**filterDeleted** | `Boolean` | Filter by deleted status | [optional parameter] [default to `false`]

### Return type
[**ConversionTagsList200Response**](../../docs/models/ConversionTagsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="ocpmEligibleConversionTagsGet"></a>
# **ocpmEligibleConversionTagsGet**
```java
Mono<Map<String, List<ConversionEventResponse>>> ConversionTagsController.ocpmEligibleConversionTagsGet(adAccountId)
```

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**Map&lt;String, List&lt;ConversionEventResponse&gt;&gt;**](../../docs/models/List.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pageVisitConversionTagsGet"></a>
# **pageVisitConversionTagsGet**
```java
Mono<PageVisitConversionTagsGet200Response> ConversionTagsController.pageVisitConversionTagsGet(adAccountIdbookmarkpageSizeorder)
```

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]

### Return type
[**PageVisitConversionTagsGet200Response**](../../docs/models/PageVisitConversionTagsGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

