# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsCreate**](LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsUpdate**](LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels



## labelsCreate

> LabelsResponse labelsCreate(adAccountId, labelCreateRequest)

Create labels

&lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;

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

> LabelsList200Response labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark)

List labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.LabelsApi;

LabelsApi apiInstance = new LabelsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
List<String> campaignIds = null; // List<String> | List of Campaign Ids to use to filter the results.
List<String> labelIds = null; // List<String> | List of Label Ids to use to filter the results.
List<String> entityStatuses = ["ACTIVE"]; // List<String> | Label entity status
List<String> labelTypes = ["BRAND","CUSTOM"]; // List<String> | Label type.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    LabelsList200Response result = apiInstance.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark);
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
 **entityStatuses** | [**List&lt;String&gt;**](String.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]] [enum: ACTIVE, ARCHIVED]
 **labelTypes** | [**List&lt;String&gt;**](String.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]] [enum: BRAND, CUSTOM]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## labelsUpdate

> LabelsResponse labelsUpdate(adAccountId, labelUpdateRequest)

Update labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;

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

