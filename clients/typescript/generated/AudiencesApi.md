# .AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesCreateCustom**](AudiencesApi.md#audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiencesGet**](AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiencesCreate**
> Audience audiencesCreate(audienceCreateRequest)

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AudiencesApi(configuration);

let body:.AudiencesApiAudiencesCreateRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // AudienceCreateRequest | List of ads to create, size limit [1, 30]
  audienceCreateRequest: ,
};

apiInstance.audiencesCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceCreateRequest** | **AudienceCreateRequest**| List of ads to create, size limit [1, 30] |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**Audience**

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

# **audiencesCreateCustom**
> Audience audiencesCreateCustom(audienceCreateCustomRequest)

Create a custom audience and find the audiences you want your ads to reach.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AudiencesApi(configuration);

let body:.AudiencesApiAudiencesCreateCustomRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // AudienceCreateCustomRequest | Custom audience to create.
  audienceCreateCustomRequest: ,
};

apiInstance.audiencesCreateCustom(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceCreateCustomRequest** | **AudienceCreateCustomRequest**| Custom audience to create. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**Audience**

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

# **audiencesGet**
> Audience audiencesGet()

Get a specific audience given the audience ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AudiencesApi(configuration);

let body:.AudiencesApiAudiencesGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Unique identifier of an audience
  audienceId: "4",
};

apiInstance.audiencesGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **audienceId** | [**string**] | Unique identifier of an audience | defaults to undefined


### Return type

**Audience**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Audience not found. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **audiencesList**
> AudiencesList200Response audiencesList()

Get list of audiences for the ad account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AudiencesApi(configuration);

let body:.AudiencesApiAudiencesListRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
  // 'ASCENDING' | 'DESCENDING' | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (optional)
  order: "ASCENDING",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // 'OWNED' | 'RECEIVED' | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type. (optional)
  ownershipType: "OWNED",
};

apiInstance.audiencesList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **ownershipType** | [**&#39;OWNED&#39; | &#39;RECEIVED&#39;**]**Array<&#39;OWNED&#39; &#124; &#39;RECEIVED&#39;>** | &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | (optional) defaults to 'OWNED'


### Return type

**AudiencesList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account audience parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **audiencesUpdate**
> Audience audiencesUpdate()

Update (edit or remove) an existing targeting audience.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AudiencesApi(configuration);

let body:.AudiencesApiAudiencesUpdateRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Unique identifier of an audience
  audienceId: "4",
  // AudienceUpdateRequest | The audience to be updated. (optional)
  audienceUpdateRequest: null,
};

apiInstance.audiencesUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceUpdateRequest** | **AudienceUpdateRequest**| The audience to be updated. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **audienceId** | [**string**] | Unique identifier of an audience | defaults to undefined


### Return type

**Audience**

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


