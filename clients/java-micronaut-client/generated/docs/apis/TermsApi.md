# TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**termsRelatedList**](TermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms |
| [**termsSuggestedList**](TermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms |


## Creating TermsApi

To initiate an instance of `TermsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.TermsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(TermsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    TermsApi termsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="termsRelatedList"></a>
# **termsRelatedList**
```java
Mono<RelatedTerms> TermsApi.termsRelatedList(terms)
```

List related terms

Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **terms** | [**List&lt;String&gt;**](String.md)| List of input terms. | |


### Return type
[**RelatedTerms**](RelatedTerms.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="termsSuggestedList"></a>
# **termsSuggestedList**
```java
Mono<List<String>> TermsApi.termsSuggestedList(termlimit)
```

List suggested terms

Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **term** | `String`| Input term. | |
| **limit** | `Integer`| Max suggested terms to return. | [optional parameter] [default to `4`] |


### Return type
`List&lt;String&gt;`

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

