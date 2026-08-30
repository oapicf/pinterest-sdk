# TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_related_list**](TermsApi.md#terms_related_list) | **GET** /terms/related | List related terms
[**terms_suggested_list**](TermsApi.md#terms_suggested_list) | **GET** /terms/suggested | List suggested terms


# **terms_related_list**
> `terms_related_list`(req::`HTTP.Request`, `terms`::`Vector{String}`;) -> `RelatedTerms`

List related terms

Get a list of terms logically related to each input term.  Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`terms`** | [**`Vector{String}`**](String.md)| List of input terms. |

### Return type

[**`RelatedTerms`**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **terms_suggested_list**
> `terms_suggested_list`(req::`HTTP.Request`, `term`::`String`; `limit`=nothing,) -> `Vector{String}`

List suggested terms

Get popular search terms that begin with your input term.  Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`term`** | **`String`**| Input term. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Max suggested terms to return. | [default to 4]

### Return type

**`Vector{String}`**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

