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
import { createConfiguration, BulkApi } from '';
import type { BulkApiBulkDownloadCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BulkApi(configuration);

const request: BulkApiBulkDownloadCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Parameters to get ad entities in bulk
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

const data = await apiInstance.bulkDownloadCreate(request);
console.log('API called successfully. Returned data:', data);
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
import { createConfiguration, BulkApi } from '';
import type { BulkApiBulkRequestGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BulkApi(configuration);

const request: BulkApiBulkRequestGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a bulk upsert request.
  bulkRequestId: "bulk_request_id_example",
    // if set to True then attach the errors/details to all the requests (optional)
  includeDetails: false,
};

const data = await apiInstance.bulkRequestGet(request);
console.log('API called successfully. Returned data:', data);
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
import { createConfiguration, BulkApi } from '';
import type { BulkApiBulkUpsertCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BulkApi(configuration);

const request: BulkApiBulkUpsertCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Parameters to get create/update ad entities in bulk
  bulkUpsertRequest: {
    create: {
      campaigns: [
        ,
      ],
      adGroups: [
        ,
      ],
      ads: [
        ,
      ],
      productGroups: [
        {
          adGroupId: "2680059592705",
          productGroupPromotion: [
            ,
          ],
        },
      ],
      keywords: [
        {
          keywords: [
            {
              bid: 1,
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
        ,
      ],
      ads: [
        ,
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
          bid: 1,
        },
      ],
    },
  },
};

const data = await apiInstance.bulkUpsertCreate(request);
console.log('API called successfully. Returned data:', data);
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


