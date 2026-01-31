# Org.OpenAPITools.Api.TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**TermsRelatedList**](TermsApi.md#termsrelatedlist) | **GET** /terms/related | List related terms |
| [**TermsSuggestedList**](TermsApi.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms |

<a id="termsrelatedlist"></a>
# **TermsRelatedList**
> RelatedTerms TermsRelatedList (List<string> terms)

List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **terms** | [**List&lt;string&gt;**](string.md) | List of input terms. |  |

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid terms related parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="termssuggestedlist"></a>
# **TermsSuggestedList**
> List&lt;string&gt; TermsSuggestedList (string term, int limit = null)

List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **term** | **string** | Input term. |  |
| **limit** | **int** | Max suggested terms to return. | [optional] [default to 4] |

### Return type

**List<string>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid terms suggested parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

