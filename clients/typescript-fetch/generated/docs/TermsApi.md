# TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**termsRelatedList**](TermsApi.md#termsrelatedlist) | **GET** /terms/related | List related terms |
| [**termsSuggestedList**](TermsApi.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms |



## termsRelatedList

> RelatedTerms termsRelatedList(terms)

List related terms

Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term \&#39;workout\&#39; would list related terms like \&#39;one song workout\&#39;, \&#39;yoga workout\&#39;, \&#39;workout motivation\&#39;, etc.

### Example

```ts
import {
  Configuration,
  TermsApi,
} from '';
import type { TermsRelatedListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new TermsApi(config);

  const body = {
    // Array<string> | List of input terms.
    terms: ...,
  } satisfies TermsRelatedListRequest;

  try {
    const data = await api.termsRelatedList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **terms** | `Array<string>` | List of input terms. | |

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid terms related parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## termsSuggestedList

> Array&lt;string&gt; termsSuggestedList(term, limit)

List suggested terms

Get popular search terms that begin with your input term. &lt;p/&gt; Example: \&#39;sport\&#39; would return popular terms like \&#39;sports bar\&#39; and \&#39;sportswear\&#39;, but not \&#39;motor sports\&#39; since the phrase does not begin with the given term.

### Example

```ts
import {
  Configuration,
  TermsApi,
} from '';
import type { TermsSuggestedListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new TermsApi(config);

  const body = {
    // string | Input term.
    term: sports,
    // number | Max suggested terms to return. (optional)
    limit: 4,
  } satisfies TermsSuggestedListRequest;

  try {
    const data = await api.termsSuggestedList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **term** | `string` | Input term. | [Defaults to `undefined`] |
| **limit** | `number` | Max suggested terms to return. | [Optional] [Defaults to `4`] |

### Return type

**Array<string>**

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid terms suggested parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

