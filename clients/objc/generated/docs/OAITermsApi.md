# OAITermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsRelatedList**](OAITermsApi.md#termsrelatedlist) | **GET** /terms/related | List related terms
[**termsSuggestedList**](OAITermsApi.md#termssuggestedlist) | **GET** /terms/suggested | List suggested terms


# **termsRelatedList**
```objc
-(NSURLSessionTask*) termsRelatedListWithTerms: (NSArray<NSString*>*) terms
        completionHandler: (void (^)(OAIRelatedTerms* output, NSError* error)) handler;
```

List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSArray<NSString*>* terms = @[@"terms_example"]; // List of input terms.

OAITermsApi*apiInstance = [[OAITermsApi alloc] init];

// List related terms
[apiInstance termsRelatedListWithTerms:terms
          completionHandler: ^(OAIRelatedTerms* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITermsApi->termsRelatedList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of input terms. | 

### Return type

[**OAIRelatedTerms***](OAIRelatedTerms.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **termsSuggestedList**
```objc
-(NSURLSessionTask*) termsSuggestedListWithTerm: (NSString*) term
    limit: (NSNumber*) limit
        completionHandler: (void (^)(NSArray<NSString*>* output, NSError* error)) handler;
```

List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* term = sports; // Input term.
NSNumber* limit = 4; // Max suggested terms to return. (optional) (default to @4)

OAITermsApi*apiInstance = [[OAITermsApi alloc] init];

// List suggested terms
[apiInstance termsSuggestedListWithTerm:term
              limit:limit
          completionHandler: ^(NSArray<NSString*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITermsApi->termsSuggestedList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **NSString***| Input term. | 
 **limit** | **NSNumber***| Max suggested terms to return. | [optional] [default to @4]

### Return type

**NSArray<NSString*>***

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

