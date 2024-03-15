# .TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](TermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms
[**termsSuggestedList**](TermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms


# **termsRelatedList**
> RelatedTerms termsRelatedList()

Get a list of terms logically related to each input term. <p/> Example: the term \'workout\' would list related terms like \'one song workout\', \'yoga workout\', \'workout motivation\', etc.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TermsApi(configuration);

let body:.TermsApiTermsRelatedListRequest = {
  // Array<string> | List of input terms.
  terms: [
    "workout",
  ],
};

apiInstance.termsRelatedList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | **Array&lt;string&gt;** | List of input terms. | defaults to undefined


### Return type

**RelatedTerms**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid terms related parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **termsSuggestedList**
> Array<string> termsSuggestedList()

Get popular search terms that begin with your input term. <p/> Example: \'sport\' would return popular terms like \'sports bar\' and \'sportswear\', but not \'motor sports\' since the phrase does not begin with the given term.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TermsApi(configuration);

let body:.TermsApiTermsSuggestedListRequest = {
  // string | Input term.
  term: "sports",
  // number | Max suggested terms to return. (optional)
  limit: 4,
};

apiInstance.termsSuggestedList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | [**string**] | Input term. | defaults to undefined
 **limit** | [**number**] | Max suggested terms to return. | (optional) defaults to 4


### Return type

**Array<string>**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid terms suggested parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


