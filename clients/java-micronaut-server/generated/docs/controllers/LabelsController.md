# LabelsController

All URIs are relative to `"/v5"`

The controller class is defined in **[LabelsController.java](../../src/main/java/org/openapitools/controller/LabelsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsApply**](#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labelsCreate**](#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsRemove**](#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labelsUpdate**](#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels

<a id="labelsApply"></a>
# **labelsApply**
```java
Mono<LabeledEntities> LabelsController.labelsApply(adAccountIdlabelIdlabeledEntitiesCreate)
```

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**labelId** | `String` | Label ID. |
**labeledEntitiesCreate** | [**LabeledEntitiesCreate**](../../docs/models/LabeledEntitiesCreate.md) |  |

### Return type
[**LabeledEntities**](../../docs/models/LabeledEntities.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="labelsCreate"></a>
# **labelsCreate**
```java
Mono<LabelsResponse> LabelsController.labelsCreate(adAccountIdlabelCreateRequest)
```

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

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
Mono<LabelsList200Response> LabelsController.labelsList(adAccountIdcampaignIdslabelIdsentityStatuseslabelTypesbookmarkpageSize)
```

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](../../docs/models/String.md) | List of Campaign Ids to use to filter the results. | [optional parameter]
**labelIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](../../docs/models/String.md) | List of Label Ids to use to filter the results. | [optional parameter]
**entityStatuses** | [**List&lt;QueryLabelEntityStatusesItems&gt;**](../../docs/models/QueryLabelEntityStatusesItems.md) | Label entity status | [optional parameter] [default to `ACTIVE`]
**labelTypes** | [**List&lt;QueryLabelTypesItems&gt;**](../../docs/models/QueryLabelTypesItems.md) | Label type. | [optional parameter] [default to `BRAND,CUSTOM`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**LabelsList200Response**](../../docs/models/LabelsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="labelsRemove"></a>
# **labelsRemove**
```java
Mono<LabeledEntities> LabelsController.labelsRemove(adAccountIdlabelIdlabeledEntitiesCreate)
```

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**labelId** | `String` | Label ID. |
**labeledEntitiesCreate** | [**LabeledEntitiesCreate**](../../docs/models/LabeledEntitiesCreate.md) |  |

### Return type
[**LabeledEntities**](../../docs/models/LabeledEntities.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="labelsUpdate"></a>
# **labelsUpdate**
```java
Mono<LabelsResponse> LabelsController.labelsUpdate(adAccountIdlabelUpdateRequest)
```

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

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

