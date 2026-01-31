# LabelsController

All URIs are relative to `"/v5"`

The controller class is defined in **[LabelsController.java](../../src/main/java/org/openapitools/controller/LabelsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsCreate**](#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsUpdate**](#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels

<a id="labelsCreate"></a>
# **labelsCreate**
```java
Mono<LabelsResponse> LabelsController.labelsCreate(adAccountIdlabelCreateRequest)
```

Create labels

&lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**labelCreateRequest** | [**LabelCreateRequest**](../../docs/models/LabelCreateRequest.md) |  |

### Return type
[**LabelsResponse**](../../docs/models/LabelsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="labelsList"></a>
# **labelsList**
```java
Mono<LabelsList200Response> LabelsController.labelsList(adAccountIdcampaignIdslabelIdsentityStatuseslabelTypespageSizebookmark)
```

List labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](../../docs/models/String.md) | List of Campaign Ids to use to filter the results. | [optional parameter]
**labelIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](../../docs/models/String.md) | List of Label Ids to use to filter the results. | [optional parameter]
**entityStatuses** | [**List&lt;String&gt;**](../../docs/models/String.md) | Label entity status | [optional parameter] [default to `ACTIVE`] [enum: `ACTIVE`, `ARCHIVED`]
**labelTypes** | [**List&lt;String&gt;**](../../docs/models/String.md) | Label type. | [optional parameter] [default to `BRAND,CUSTOM`] [enum: `BRAND`, `CUSTOM`]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]

### Return type
[**LabelsList200Response**](../../docs/models/LabelsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="labelsUpdate"></a>
# **labelsUpdate**
```java
Mono<LabelsResponse> LabelsController.labelsUpdate(adAccountIdlabelUpdateRequest)
```

Update labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**labelUpdateRequest** | [**LabelUpdateRequest**](../../docs/models/LabelUpdateRequest.md) |  |

### Return type
[**LabelsResponse**](../../docs/models/LabelsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

