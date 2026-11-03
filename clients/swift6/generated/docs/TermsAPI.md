# TermsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](TermsAPI.md#termsrelatedlist) | **GET** /terms/related | List related terms
[**termsSuggestedList**](TermsAPI.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms


# **termsRelatedList**
```swift
    open class func termsRelatedList(terms: [String], apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> RelatedTerms
```

List related terms

Get a list of terms logically related to each input term.  Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let terms = ["inner_example"] // [String] | List of input terms.

// List related terms
do {
    let response = try await TermsAPI.termsRelatedList(terms: terms)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**[String]**](String.md) | List of input terms. | 

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **termsSuggestedList**
```swift
    open class func termsSuggestedList(term: String, limit: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> [String]
```

List suggested terms

Get popular search terms that begin with your input term.  Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let term = "term_example" // String | Input term.
let limit = 987 // Int | Max suggested terms to return. (optional) (default to 4)

// List suggested terms
do {
    let response = try await TermsAPI.termsSuggestedList(term: term, limit: limit)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String** | Input term. | 
 **limit** | **Int** | Max suggested terms to return. | [optional] [default to 4]

### Return type

**[String]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

