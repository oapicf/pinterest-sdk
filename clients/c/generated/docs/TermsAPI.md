# TermsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TermsAPI_termsRelatedList**](TermsAPI.md#TermsAPI_termsRelatedList) | **GET** /terms/related | List related terms
[**TermsAPI_termsSuggestedList**](TermsAPI.md#TermsAPI_termsSuggestedList) | **GET** /terms/suggested | List suggested terms


# **TermsAPI_termsRelatedList**
```c
// List related terms
//
// Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
//
related_terms_t* TermsAPI_termsRelatedList(apiClient_t *apiClient, list_t *terms);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**terms** | **[list_t](char.md) \*** | List of input terms. | 

### Return type

[related_terms_t](related_terms.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TermsAPI_termsSuggestedList**
```c
// List suggested terms
//
// Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
//
list_t* TermsAPI_termsSuggestedList(apiClient_t *apiClient, char *term, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**term** | **char \*** | Input term. | 
**limit** | **int \*** | Max suggested terms to return. | [optional] [default to 4]

### Return type


[list_t](char.md) *




### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

