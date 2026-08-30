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
-(NSURLSessionTask*) leadFormGetWithLeadFormId: (NSString*) leadFormId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAILeadForm* output, NSError* error)) handler;
```

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* leadFormId = @"leadFormId_example"; // The ID of this lead form
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// Get lead form by id
[apiInstance leadFormGetWithLeadFormId:leadFormId
              adAccountId:adAccountId
          completionHandler: ^(OAILeadForm* output, NSError* error) {
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
 **leadFormId** | **NSString***| The ID of this lead form | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAILeadForm***](OAILeadForm.md)

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
    leadFormTestCreate: (OAILeadFormTestCreate*) leadFormTestCreate
        completionHandler: (void (^)(OAILeadFormTest* output, NSError* error)) handler;
```

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSString* leadFormId = @"leadFormId_example"; // Unique identifier of a lead form.
OAILeadFormTestCreate* leadFormTestCreate = [[OAILeadFormTestCreate alloc] init]; // 

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// Create lead form test data
[apiInstance leadFormTestCreateWithAdAccountId:adAccountId
              leadFormId:leadFormId
              leadFormTestCreate:leadFormTestCreate
          completionHandler: ^(OAILeadFormTest* output, NSError* error) {
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
 **adAccountId** | **NSString***|  | 
 **leadFormId** | **NSString***| Unique identifier of a lead form. | 
 **leadFormTestCreate** | [**OAILeadFormTestCreate***](OAILeadFormTestCreate.md)|  | 

### Return type

[**OAILeadFormTest***](OAILeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsCreate**
```objc
-(NSURLSessionTask*) leadFormsCreateWithAdAccountId: (NSString*) adAccountId
    leadFormCreate: (NSArray<OAILeadFormCreate>*) leadFormCreate
        completionHandler: (void (^)(OAILeadFormsCreate200Response* output, NSError* error)) handler;
```

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAILeadFormCreate>* leadFormCreate = @[[[OAILeadFormCreate alloc] init]]; // 

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// Create lead forms
[apiInstance leadFormsCreateWithAdAccountId:adAccountId
              leadFormCreate:leadFormCreate
          completionHandler: ^(OAILeadFormsCreate200Response* output, NSError* error) {
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
 **leadFormCreate** | [**NSArray&lt;OAILeadFormCreate&gt;***](OAILeadFormCreate.md)|  | 

### Return type

[**OAILeadFormsCreate200Response***](OAILeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsList**
```objc
-(NSURLSessionTask*) leadFormsListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
        completionHandler: (void (^)(OAILeadFormsList200Response* output, NSError* error)) handler;
```

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
OAIPinterestLibPaginationOrder order = [[OAIPinterestLibPaginationOrder alloc] init]; // The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// List lead forms
[apiInstance leadFormsListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              order:order
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
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]
 **order** | [**OAIPinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

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
    leadFormBatchUpdate: (NSArray<OAILeadFormBatchUpdate>*) leadFormBatchUpdate
        completionHandler: (void (^)(OAILeadFormsCreate200Response* output, NSError* error)) handler;
```

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAILeadFormBatchUpdate>* leadFormBatchUpdate = @[[[OAILeadFormBatchUpdate alloc] init]]; // 

OAILeadFormsApi*apiInstance = [[OAILeadFormsApi alloc] init];

// Update lead forms
[apiInstance leadFormsUpdateWithAdAccountId:adAccountId
              leadFormBatchUpdate:leadFormBatchUpdate
          completionHandler: ^(OAILeadFormsCreate200Response* output, NSError* error) {
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
 **leadFormBatchUpdate** | [**NSArray&lt;OAILeadFormBatchUpdate&gt;***](OAILeadFormBatchUpdate.md)|  | 

### Return type

[**OAILeadFormsCreate200Response***](OAILeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

