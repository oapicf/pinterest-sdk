# .ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


# **adAccountsCatalogsProductGroupsList**
> AdAccountsCatalogsProductGroupsList200Response adAccountsCatalogsProductGroupsList()

This endpoint is completely deprecated. Please use <a href=\'/docs/api/v5/#operation/catalogs_product_groups/list\'>List product groups</a> from Catalogs API instead.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ProductGroupsApi(configuration);

let body:.ProductGroupsApiAdAccountsCatalogsProductGroupsListRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | The feed profile id whose catalog product groups we want to return. (optional)
  feedProfileId: "4",
};

apiInstance.adAccountsCatalogsProductGroupsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **feedProfileId** | [**string**] | The feed profile id whose catalog product groups we want to return. | (optional) defaults to undefined


### Return type

**AdAccountsCatalogsProductGroupsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads parameters. |  -  |
**401** | Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest. |  -  |
**404** | Merchant data not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


