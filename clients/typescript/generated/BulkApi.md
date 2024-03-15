# .BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](BulkApi.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](BulkApi.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](BulkApi.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **bulkDownloadCreate**
> BulkDownloadResponse bulkDownloadCreate(bulkDownloadRequest)

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BulkApi(configuration);

let body:.BulkApiBulkDownloadCreateRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // BulkDownloadRequest | Parameters to get ad entities in bulk
  bulkDownloadRequest: {
    entityTypes: ["CAMPAIGN","AD_GROUP"],
    entityIds: [
      "4",
    ],
    updatedSince: "1622848072",
    campaignFilter: {
      startTime: "1622848072",
      endTime: "1622848072",
      name: "campaign name",
      campaignStatus: [
        "RUNNING",
      ],
      objectiveType: [
        "AWARENESS",
      ],
    },
    outputFormat: "outputFormat_example",
  },
};

apiInstance.bulkDownloadCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkDownloadRequest** | **BulkDownloadRequest**| Parameters to get ad entities in bulk |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**BulkDownloadResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **bulkRequestGet**
> BulkUpsertStatusResponse bulkRequestGet()

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BulkApi(configuration);

let body:.BulkApiBulkRequestGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Unique identifier of a bulk upsert request.
  bulkRequestId: "bulk_request_id_example",
  // boolean | if set to True then attach the errors/details to all the requests (optional)
  includeDetails: false,
};

apiInstance.bulkRequestGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **bulkRequestId** | [**string**] | Unique identifier of a bulk upsert request. | defaults to undefined
 **includeDetails** | [**boolean**] | if set to True then attach the errors/details to all the requests | (optional) defaults to false


### Return type

**BulkUpsertStatusResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **bulkUpsertCreate**
> BulkUpsertResponse bulkUpsertCreate(bulkUpsertRequest)

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BulkApi(configuration);

let body:.BulkApiBulkUpsertCreateRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // BulkUpsertRequest | Parameters to get create/update ad entities in bulk
  bulkUpsertRequest: {
    create: {
      campaigns: [
        ,
      ],
      adGroups: [
        null,
      ],
      ads: [
        null,
      ],
      productGroups: [
        {
          adGroupId: "2680059592705",
          productGroupPromotion: [
            {
              id: "2680059592705",
              adGroupId: "2680059592705",
              bidInMicroCurrency: 14000000,
              included: true,
              definition: "*/product_type_0='kitchen'/product_type_1='beverage appliances'",
              relativeDefinition: "product_type_1='beverage appliances'",
              parentId: "1231234",
              slideshowCollectionsTitle: "slideshow title",
              slideshowCollectionsDescription: "slideshow description",
              isMdl: true,
              status: "ACTIVE",
              trackingUrl: "https://www.pinterest.com",
              catalogProductGroupId: "1231235",
              catalogProductGroupName: "catalogProductGroupName",
              creativeType: "REGULAR",
              collectionsHeroPinId: "123123",
              collectionsHeroDestinationUrl: "http://www.pinterest.com",
              gridClickType: "CLOSEUP",
            },
          ],
        },
      ],
      keywords: [
        {
          keywords: [
            {
              bid: 200000,
              matchType: "BROAD",
              value: "value_example",
            },
          ],
          parentId: "383791336903426391",
        },
      ],
    },
    update: {
      campaigns: [
        ,
      ],
      adGroups: [
        null,
      ],
      ads: [
        null,
      ],
      productGroups: [
        {
          adGroupId: "2680059592705",
          productGroupPromotion: [
            {
              id: "2680059592705",
              adGroupId: "2680059592705",
              bidInMicroCurrency: 14000000,
              included: true,
              definition: "*/product_type_0='kitchen'/product_type_1='beverage appliances'",
              relativeDefinition: "product_type_1='beverage appliances'",
              parentId: "1231234",
              slideshowCollectionsTitle: "slideshow title",
              slideshowCollectionsDescription: "slideshow description",
              isMdl: true,
              status: "ACTIVE",
              trackingUrl: "https://www.pinterest.com",
              catalogProductGroupId: "1231235",
              catalogProductGroupName: "catalogProductGroupName",
              creativeType: "REGULAR",
              collectionsHeroPinId: "123123",
              collectionsHeroDestinationUrl: "http://www.pinterest.com",
              gridClickType: "CLOSEUP",
            },
          ],
        },
      ],
      keywords: [
        {
          id: "2886364308355",
          archived: false,
          bid: 200000,
        },
      ],
    },
  },
};

apiInstance.bulkUpsertCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkUpsertRequest** | **BulkUpsertRequest**| Parameters to get create/update ad entities in bulk |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**BulkUpsertResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


