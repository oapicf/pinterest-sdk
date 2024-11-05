# OAILeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](OAILeadFormsApi.md#leadformget) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](OAILeadFormsApi.md#leadformtestcreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsCreate**](OAILeadFormsApi.md#leadformscreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**leadFormsList**](OAILeadFormsApi.md#leadformslist) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**leadFormsUpdate**](OAILeadFormsApi.md#leadformsupdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


# **leadFormGet**
```objc
-(NSURLSessionTask*) leadFormGetWithAdAccountId: (NSString*) adAccountId
    leadFormId: (NSString*) leadFormId
        completionHandler: (void (^)(OAILeadFormResponse* output, NSError* error)) handler;
```

Get lead form by id

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* leadFormId = 1234567890123; // Unique identifier of a lead form.

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// Get lead form by id
[apiInstance leadFormGetWithAdAccountId:adAccountId
              leadFormId:leadFormId
          completionHandler: ^(OAILeadFormResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadFormsApi->leadFormGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **leadFormId** | **NSString***| Unique identifier of a lead form. | 

### Return type

[**OAILeadFormResponse***](OAILeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormTestCreate**
```objc
-(NSURLSessionTask*) leadFormTestCreateWithAdAccountId: (NSString*) adAccountId
    leadFormId: (NSString*) leadFormId
    leadFormTestRequest: (OAILeadFormTestRequest*) leadFormTestRequest
        completionHandler: (void (^)(OAILeadFormTestResponse* output, NSError* error)) handler;
```

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* leadFormId = 1234567890123; // Unique identifier of a lead form.
OAILeadFormTestRequest* leadFormTestRequest = [[OAILeadFormTestRequest alloc] init]; // Subscription to create.

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// Create lead form test data
[apiInstance leadFormTestCreateWithAdAccountId:adAccountId
              leadFormId:leadFormId
              leadFormTestRequest:leadFormTestRequest
          completionHandler: ^(OAILeadFormTestResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadFormsApi->leadFormTestCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **leadFormId** | **NSString***| Unique identifier of a lead form. | 
 **leadFormTestRequest** | [**OAILeadFormTestRequest***](OAILeadFormTestRequest.md)| Subscription to create. | 

### Return type

[**OAILeadFormTestResponse***](OAILeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsCreate**
```objc
-(NSURLSessionTask*) leadFormsCreateWithAdAccountId: (NSString*) adAccountId
    leadFormCreateRequest: (NSArray<OAILeadFormCreateRequest>*) leadFormCreateRequest
        completionHandler: (void (^)(OAILeadFormArrayResponse* output, NSError* error)) handler;
```

Create lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAILeadFormCreateRequest>* leadFormCreateRequest = @[[[OAILeadFormCreateRequest alloc] init]]; // List of lead forms to create, size limit [1, 30].

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// Create lead forms
[apiInstance leadFormsCreateWithAdAccountId:adAccountId
              leadFormCreateRequest:leadFormCreateRequest
          completionHandler: ^(OAILeadFormArrayResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadFormsApi->leadFormsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **leadFormCreateRequest** | [**NSArray&lt;OAILeadFormCreateRequest&gt;***](OAILeadFormCreateRequest.md)| List of lead forms to create, size limit [1, 30]. | 

### Return type

[**OAILeadFormArrayResponse***](OAILeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsList**
```objc
-(NSURLSessionTask*) leadFormsListWithAdAccountId: (NSString*) adAccountId
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAILeadFormsList200Response* output, NSError* error)) handler;
```

List lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// List lead forms
[apiInstance leadFormsListWithAdAccountId:adAccountId
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAILeadFormsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadFormsApi->leadFormsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAILeadFormsList200Response***](OAILeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsUpdate**
```objc
-(NSURLSessionTask*) leadFormsUpdateWithAdAccountId: (NSString*) adAccountId
    leadFormUpdateRequest: (NSArray<OAILeadFormUpdateRequest>*) leadFormUpdateRequest
        completionHandler: (void (^)(OAILeadFormArrayResponse* output, NSError* error)) handler;
```

Update lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAILeadFormUpdateRequest>* leadFormUpdateRequest = @[[[OAILeadFormUpdateRequest alloc] init]]; // List of lead forms to update, size limit [1, 30].

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// Update lead forms
[apiInstance leadFormsUpdateWithAdAccountId:adAccountId
              leadFormUpdateRequest:leadFormUpdateRequest
          completionHandler: ^(OAILeadFormArrayResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadFormsApi->leadFormsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **leadFormUpdateRequest** | [**NSArray&lt;OAILeadFormUpdateRequest&gt;***](OAILeadFormUpdateRequest.md)| List of lead forms to update, size limit [1, 30]. | 

### Return type

[**OAILeadFormArrayResponse***](OAILeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

