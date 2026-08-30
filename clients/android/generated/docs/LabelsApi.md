# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsApply**](LabelsApi.md#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labelsCreate**](LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsRemove**](LabelsApi.md#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labelsUpdate**](LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels



## labelsApply

> LabeledEntities labelsApply(adAccountId, labelId, labeledEntitiesCreate)

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LabelsApi;

LabelsApi apiInstance = new LabelsApi();
String adAccountId = null; // String | 
String labelId = null; // String | Label ID.
LabeledEntitiesCreate labeledEntitiesCreate = new LabeledEntitiesCreate(); // LabeledEntitiesCreate | 
try {
    LabeledEntities result = apiInstance.labelsApply(adAccountId, labelId, labeledEntitiesCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#labelsApply");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **labelId** | **String**| Label ID. | [default to null]
 **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  |

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## labelsCreate

> LabelsResponse labelsCreate(adAccountId, labelCreateRequest)

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LabelsApi;

LabelsApi apiInstance = new LabelsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
LabelCreateRequest labelCreateRequest = new LabelCreateRequest(); // LabelCreateRequest | 
try {
    LabelsResponse result = apiInstance.labelsCreate(adAccountId, labelCreateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#labelsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **labelCreateRequest** | [**LabelCreateRequest**](LabelCreateRequest.md)|  |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## labelsList

> LabelsList200Response labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize)

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LabelsApi;

LabelsApi apiInstance = new LabelsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<String> campaignIds = null; // List<String> | List of Campaign Ids to use to filter the results.
List<String> labelIds = null; // List<String> | List of Label Ids to use to filter the results.
List<QueryLabelEntityStatusesItems> entityStatuses = ["ACTIVE"]; // List<QueryLabelEntityStatusesItems> | Label entity status
List<QueryLabelTypesItems> labelTypes = ["BRAND","CUSTOM"]; // List<QueryLabelTypesItems> | Label type.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    LabelsList200Response result = apiInstance.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#labelsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **campaignIds** | [**List&lt;String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **labelIds** | [**List&lt;String&gt;**](String.md)| List of Label Ids to use to filter the results. | [optional] [default to null]
 **entityStatuses** | [**List&lt;QueryLabelEntityStatusesItems&gt;**](QueryLabelEntityStatusesItems.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **labelTypes** | [**List&lt;QueryLabelTypesItems&gt;**](QueryLabelTypesItems.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## labelsRemove

> LabeledEntities labelsRemove(adAccountId, labelId, labeledEntitiesCreate)

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LabelsApi;

LabelsApi apiInstance = new LabelsApi();
String adAccountId = null; // String | 
String labelId = null; // String | Label ID.
LabeledEntitiesCreate labeledEntitiesCreate = new LabeledEntitiesCreate(); // LabeledEntitiesCreate | 
try {
    LabeledEntities result = apiInstance.labelsRemove(adAccountId, labelId, labeledEntitiesCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#labelsRemove");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **labelId** | **String**| Label ID. | [default to null]
 **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  |

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## labelsUpdate

> LabelsResponse labelsUpdate(adAccountId, labelUpdateRequest)

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LabelsApi;

LabelsApi apiInstance = new LabelsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
LabelUpdateRequest labelUpdateRequest = new LabelUpdateRequest(); // LabelUpdateRequest | 
try {
    LabelsResponse result = apiInstance.labelsUpdate(adAccountId, labelUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#labelsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **labelUpdateRequest** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

