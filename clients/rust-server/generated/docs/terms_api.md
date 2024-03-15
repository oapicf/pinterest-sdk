# terms_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**terms_related/list**](terms_api.md#terms_related/list) | **GET** /terms/related | List related terms
**terms_suggested/list**](terms_api.md#terms_suggested/list) | **GET** /terms/suggested | List suggested terms


# **terms_related/list**
> models::RelatedTerms terms_related/list(ctx, terms)
List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **terms** | [**String**](String.md)| List of input terms. | 

### Return type

[**models::RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **terms_suggested/list**
> Vec<String> terms_suggested/list(ctx, term, optional)
List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **term** | **String**| Input term. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**| Input term. | 
 **limit** | **i32**| Max suggested terms to return. | [default to 4]

### Return type

[**Vec<String>**](string.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

