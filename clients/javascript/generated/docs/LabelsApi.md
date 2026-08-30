# PinterestSdk.LabelsApi

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LabelsApi();
let adAccountId = "adAccountId_example"; // String | 
let labelId = "labelId_example"; // String | Label ID.
let labeledEntitiesCreate = new PinterestSdk.LabeledEntitiesCreate(); // LabeledEntitiesCreate | 
apiInstance.labelsApply(adAccountId, labelId, labeledEntitiesCreate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | 
 **labelId** | **String**| Label ID. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LabelsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let labelCreateRequest = new PinterestSdk.LabelCreateRequest(); // LabelCreateRequest | 
apiInstance.labelsCreate(adAccountId, labelCreateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **labelCreateRequest** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## labelsList

> LabelsList200Response labelsList(adAccountId, opts)

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LabelsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'campaignIds': ["null"], // [String] | List of Campaign Ids to use to filter the results.
  'labelIds': ["null"], // [String] | List of Label Ids to use to filter the results.
  'entityStatuses': [new PinterestSdk.QueryLabelEntityStatusesItems()], // [QueryLabelEntityStatusesItems] | Label entity status
  'labelTypes': [new PinterestSdk.QueryLabelTypesItems()], // [QueryLabelTypesItems] | Label type.
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
};
apiInstance.labelsList(adAccountId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **campaignIds** | [**[String]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **labelIds** | [**[String]**](String.md)| List of Label Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[QueryLabelEntityStatusesItems]**](QueryLabelEntityStatusesItems.md)| Label entity status | [optional] 
 **labelTypes** | [**[QueryLabelTypesItems]**](QueryLabelTypesItems.md)| Label type. | [optional] 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LabelsApi();
let adAccountId = "adAccountId_example"; // String | 
let labelId = "labelId_example"; // String | Label ID.
let labeledEntitiesCreate = new PinterestSdk.LabeledEntitiesCreate(); // LabeledEntitiesCreate | 
apiInstance.labelsRemove(adAccountId, labelId, labeledEntitiesCreate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | 
 **labelId** | **String**| Label ID. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LabelsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let labelUpdateRequest = new PinterestSdk.LabelUpdateRequest(); // LabelUpdateRequest | 
apiInstance.labelsUpdate(adAccountId, labelUpdateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **labelUpdateRequest** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

