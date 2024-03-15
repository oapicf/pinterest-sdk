# TERMS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**terms_related_list**](TERMS_API.md#terms_related_list) | **Get** /terms/related | List related terms
[**terms_suggested_list**](TERMS_API.md#terms_suggested_list) | **Get** /terms/suggested | List suggested terms


# **terms_related_list**
> terms_related_list (terms: LIST [STRING_32] ): detachable RELATED_TERMS


List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**LIST [STRING_32]**](STRING_32.md)| List of input terms. | [default to null]

### Return type

[**RELATED_TERMS**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **terms_suggested_list**
> terms_suggested_list (term: STRING_32 ; limit:  detachable INTEGER_32 ): detachable LIST [STRING_32]


List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **STRING_32**| Input term. | [default to null]
 **limit** | **INTEGER_32**| Max suggested terms to return. | [optional] [default to 4]

### Return type

[**LIST [STRING_32]**](STRING_32.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

