# TermsController

All URIs are relative to `"/v5"`

The controller class is defined in **[TermsController.java](../../src/main/java/org/openapitools/controller/TermsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](#termsRelatedList) | **GET** /terms/related | List related terms
[**termsSuggestedList**](#termsSuggestedList) | **GET** /terms/suggested | List suggested terms

<a id="termsRelatedList"></a>
# **termsRelatedList**
```java
Mono<RelatedTerms> TermsController.termsRelatedList(terms)
```

List related terms

Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**terms** | [**List&lt;String&gt;**](../../docs/models/String.md) | List of input terms. |

### Return type
[**RelatedTerms**](../../docs/models/RelatedTerms.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="termsSuggestedList"></a>
# **termsSuggestedList**
```java
Mono<List<String>> TermsController.termsSuggestedList(termlimit)
```

List suggested terms

Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**term** | `String` | Input term. |
**limit** | `Integer` | Max suggested terms to return. | [optional parameter] [default to `4`]

### Return type
`List&lt;String&gt;`

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

