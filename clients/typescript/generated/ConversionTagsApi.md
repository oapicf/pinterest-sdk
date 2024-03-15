# .ConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionTagsCreate**](ConversionTagsApi.md#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversionTagsGet**](ConversionTagsApi.md#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversionTagsList**](ConversionTagsApi.md#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
[**ocpmEligibleConversionTagsGet**](ConversionTagsApi.md#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**pageVisitConversionTagsGet**](ConversionTagsApi.md#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


# **conversionTagsCreate**
> ConversionTagResponse conversionTagsCreate(conversionTagCreate)

Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account\'s ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConversionTagsApi(configuration);

let body:.ConversionTagsApiConversionTagsCreateRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // ConversionTagCreate | Conversion Tag to create
  conversionTagCreate: ,
};

apiInstance.conversionTagsCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversionTagCreate** | **ConversionTagCreate**| Conversion Tag to create |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**ConversionTagResponse**

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

# **conversionTagsGet**
> ConversionTagResponse conversionTagsGet()

Get information about an existing conversion tag.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConversionTagsApi(configuration);

let body:.ConversionTagsApiConversionTagsGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Id of the conversion tag.
  conversionTagId: "2617998078212",
};

apiInstance.conversionTagsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **conversionTagId** | [**string**] | Id of the conversion tag. | defaults to undefined


### Return type

**ConversionTagResponse**

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

# **conversionTagsList**
> ConversionTagListResponse conversionTagsList()

List conversion tags associated with an ad account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConversionTagsApi(configuration);

let body:.ConversionTagsApiConversionTagsListRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // boolean | Filter out deleted tags. (optional)
  filterDeleted: true,
};

apiInstance.conversionTagsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **filterDeleted** | [**boolean**] | Filter out deleted tags. | (optional) defaults to false


### Return type

**ConversionTagListResponse**

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

# **ocpmEligibleConversionTagsGet**
> { [key: string]: Array<ConversionEventResponse>; } ocpmEligibleConversionTagsGet()

Get Ocpm eligible conversion tag events for an ad account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConversionTagsApi(configuration);

let body:.ConversionTagsApiOcpmEligibleConversionTagsGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
};

apiInstance.ocpmEligibleConversionTagsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**{ [key: string]: Array<ConversionEventResponse>; }**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected errors |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pageVisitConversionTagsGet**
> PageVisitConversionTagsGet200Response pageVisitConversionTagsGet()

Get all page visit conversion tag events for an ad account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConversionTagsApi(configuration);

let body:.ConversionTagsApiPageVisitConversionTagsGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // 'ASCENDING' | 'DESCENDING' | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
  order: "ASCENDING",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

apiInstance.pageVisitConversionTagsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**PageVisitConversionTagsGet200Response**

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


