# \TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_related_slash_list**](TermsApi.md#terms_related_slash_list) | **GET** /terms/related | List related terms
[**terms_suggested_slash_list**](TermsApi.md#terms_suggested_slash_list) | **GET** /terms/suggested | List suggested terms



## terms_related_slash_list

> models::RelatedTerms terms_related_slash_list(terms)
List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**terms** | [**Vec<String>**](String.md) | List of input terms. | [required] |

### Return type

[**models::RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## terms_suggested_slash_list

> Vec<String> terms_suggested_slash_list(term, limit)
List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**term** | **String** | Input term. | [required] |
**limit** | Option<**i32**> | Max suggested terms to return. |  |[default to 4]

### Return type

**Vec<String>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

