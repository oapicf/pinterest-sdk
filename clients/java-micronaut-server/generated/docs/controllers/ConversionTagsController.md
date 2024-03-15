# ConversionTagsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ConversionTagsController.java](../../src/main/java/org/openapitools/controller/ConversionTagsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionTagsCreate**](#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversionTagsGet**](#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversionTagsList**](#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
[**ocpmEligibleConversionTagsGet**](#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**pageVisitConversionTagsGet**](#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags

<a id="conversionTagsCreate"></a>
# **conversionTagsCreate**
```java
Mono<ConversionTagResponse> ConversionTagsController.conversionTagsCreate(adAccountIdconversionTagCreate)
```

Create conversion tag

Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/enhanced-match/\&quot;&gt;Enhanced match&lt;/a&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionTagCreate** | [**ConversionTagCreate**](../../docs/models/ConversionTagCreate.md) | Conversion Tag to create |

### Return type
[**ConversionTagResponse**](../../docs/models/ConversionTagResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="conversionTagsGet"></a>
# **conversionTagsGet**
```java
Mono<ConversionTagResponse> ConversionTagsController.conversionTagsGet(adAccountIdconversionTagId)
```

Get conversion tag

Get information about an existing conversion tag.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionTagId** | `String` | Id of the conversion tag. |

### Return type
[**ConversionTagResponse**](../../docs/models/ConversionTagResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="conversionTagsList"></a>
# **conversionTagsList**
```java
Mono<ConversionTagListResponse> ConversionTagsController.conversionTagsList(adAccountIdfilterDeleted)
```

Get conversion tags

List conversion tags associated with an ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**filterDeleted** | `Boolean` | Filter out deleted tags. | [optional parameter] [default to `false`]

### Return type
[**ConversionTagListResponse**](../../docs/models/ConversionTagListResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

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

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pageVisitConversionTagsGet"></a>
# **pageVisitConversionTagsGet**
```java
Mono<PageVisitConversionTagsGet200Response> ConversionTagsController.pageVisitConversionTagsGet(adAccountIdpageSizeorderbookmark)
```

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**order** | `String` | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**PageVisitConversionTagsGet200Response**](../../docs/models/PageVisitConversionTagsGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

