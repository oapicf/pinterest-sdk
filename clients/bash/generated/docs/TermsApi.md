# TermsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](TermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms
[**termsSuggestedList**](TermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms



## termsRelatedList

List related terms

Get a list of terms logically related to each input term. <p/>
Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Example

```bash
 termsRelatedList  Specify as:  terms=value1 terms=value2 terms=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**array[string]**](string.md) | List of input terms. | [default to null]

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## termsSuggestedList

List suggested terms

Get popular search terms that begin with your input term. <p/>
Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Example

```bash
 termsSuggestedList  term=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **string** | Input term. | [default to null]
 **limit** | **integer** | Max suggested terms to return. | [optional] [default to 4]

### Return type

**array[string]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

