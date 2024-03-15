# TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](TermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms
[**termsSuggestedList**](TermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms



## termsRelatedList

> RelatedTerms termsRelatedList(terms)

List related terms

Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TermsApi;

TermsApi apiInstance = new TermsApi();
List<String> terms = null; // List<String> | List of input terms.
try {
    RelatedTerms result = apiInstance.termsRelatedList(terms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TermsApi#termsRelatedList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**List&lt;String&gt;**](String.md)| List of input terms. | [default to null]

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## termsSuggestedList

> List&lt;String&gt; termsSuggestedList(term, limit)

List suggested terms

Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TermsApi;

TermsApi apiInstance = new TermsApi();
String term = sports; // String | Input term.
Integer limit = 4; // Integer | Max suggested terms to return.
try {
    List<String> result = apiInstance.termsSuggestedList(term, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TermsApi#termsSuggestedList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**| Input term. | [default to null]
 **limit** | **Integer**| Max suggested terms to return. | [optional] [default to 4]

### Return type

**List&lt;String&gt;**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

