# TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TermsRelatedList**](TermsApi.md#TermsRelatedList) | **GET** /terms/related | List related terms
[**TermsSuggestedList**](TermsApi.md#TermsSuggestedList) | **GET** /terms/suggested | List suggested terms


# **TermsRelatedList**
> RelatedTerms TermsRelatedList(terms)

List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Example
```R
library(openapi)

# List related terms
#
# prepare function argument(s)
var_terms <- c("inner_example") # array[character] | List of input terms.

api_instance <- TermsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TermsRelatedList(var_termsdata_file = "result.txt")
result <- api_instance$TermsRelatedList(var_terms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | list( **character** )| List of input terms. | 

### Return type

[**RelatedTerms**](RelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid terms related parameters. |  -  |
| **0** | Unexpected error |  -  |

# **TermsSuggestedList**
> array[character] TermsSuggestedList(term, limit = 4)

List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Example
```R
library(openapi)

# List suggested terms
#
# prepare function argument(s)
var_term <- "sports" # character | Input term.
var_limit <- 4 # integer | Max suggested terms to return. (Optional)

api_instance <- TermsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TermsSuggestedList(var_term, limit = var_limitdata_file = "result.txt")
result <- api_instance$TermsSuggestedList(var_term, limit = var_limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **character**| Input term. | 
 **limit** | **integer**| Max suggested terms to return. | [optional] [default to 4]

### Return type

**array[character]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid terms suggested parameters. |  -  |
| **0** | Unexpected error |  -  |

