# TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](TermsApi.md#termsRelatedList) | **Get** /terms/related | List related terms
[**termsSuggestedList**](TermsApi.md#termsSuggestedList) | **Get** /terms/suggested | List suggested terms


<a name="termsRelatedList"></a>
# **termsRelatedList**
> RelatedTerms termsRelatedList(terms)

List related terms

Get a list of terms logically related to each input term.  Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = TermsApi()
val terms : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of input terms.
try {
    val result : RelatedTerms = apiInstance.termsRelatedList(terms)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TermsApi#termsRelatedList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsApi#termsRelatedList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of input terms. |

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="termsSuggestedList"></a>
# **termsSuggestedList**
> kotlin.collections.List&lt;kotlin.String&gt; termsSuggestedList(term, limit)

List suggested terms

Get popular search terms that begin with your input term.  Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = TermsApi()
val term : kotlin.String = term_example // kotlin.String | Input term.
val limit : kotlin.Int = 56 // kotlin.Int | Max suggested terms to return.
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.termsSuggestedList(term, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TermsApi#termsSuggestedList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsApi#termsSuggestedList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **kotlin.String**| Input term. |
 **limit** | **kotlin.Int**| Max suggested terms to return. | [optional] [default to 4]

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

