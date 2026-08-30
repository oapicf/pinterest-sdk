# TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**termsRelatedList**](#termsrelatedlist) | **GET** /terms/related | List related terms|
|[**termsSuggestedList**](#termssuggestedlist) | **GET** /terms/suggested | List suggested terms|

# **termsRelatedList**
> RelatedTerms termsRelatedList()

Get a list of terms logically related to each input term.  Example: the term \'workout\' would list related terms like \'one song workout\', \'yoga workout\', \'workout motivation\', etc.

### Example

```typescript
import {
    TermsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new TermsApi(configuration);

let terms: Array<string>; //List of input terms. (default to undefined)

const { status, data } = await apiInstance.termsRelatedList(
    terms
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **terms** | **Array&lt;string&gt;** | List of input terms. | defaults to undefined|


### Return type

**RelatedTerms**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **termsSuggestedList**
> Array<string> termsSuggestedList()

Get popular search terms that begin with your input term.  Example: \'sport\' would return popular terms like \'sports bar\' and \'sportswear\', but not \'motor sports\' since the phrase does not begin with the given term.

### Example

```typescript
import {
    TermsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new TermsApi(configuration);

let term: string; //Input term. (default to undefined)
let limit: number; //Max suggested terms to return. (optional) (default to 4)

const { status, data } = await apiInstance.termsSuggestedList(
    term,
    limit
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **term** | [**string**] | Input term. | defaults to undefined|
| **limit** | [**number**] | Max suggested terms to return. | (optional) defaults to 4|


### Return type

**Array<string>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

