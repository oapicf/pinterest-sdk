# WWW::OpenAPIClient::TermsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::TermsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_related_list**](TermsApi.md#terms_related_list) | **GET** /terms/related | List related terms
[**terms_suggested_list**](TermsApi.md#terms_suggested_list) | **GET** /terms/suggested | List suggested terms


# **terms_related_list**
> RelatedTerms terms_related_list(terms => $terms)

List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TermsApi;
my $api_instance = WWW::OpenAPIClient::TermsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $terms = [("workout")]; # ARRAY[string] | List of input terms.

eval {
    my $result = $api_instance->terms_related_list(terms => $terms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TermsApi->terms_related_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**ARRAY[string]**](string.md)| List of input terms. | 

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **terms_suggested_list**
> ARRAY[string] terms_suggested_list(term => $term, limit => $limit)

List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TermsApi;
my $api_instance = WWW::OpenAPIClient::TermsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $term = sports; # string | Input term.
my $limit = 4; # int | Max suggested terms to return.

eval {
    my $result = $api_instance->terms_suggested_list(term => $term, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TermsApi->terms_suggested_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **string**| Input term. | 
 **limit** | **int**| Max suggested terms to return. | [optional] [default to 4]

### Return type

**ARRAY[string]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

