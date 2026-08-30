# OAILabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsApply**](OAILabelsApi.md#labelsapply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labelsCreate**](OAILabelsApi.md#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](OAILabelsApi.md#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsRemove**](OAILabelsApi.md#labelsremove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labelsUpdate**](OAILabelsApi.md#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labelsApply**
```objc
-(NSURLSessionTask*) labelsApplyWithAdAccountId: (NSString*) adAccountId
    labelId: (NSString*) labelId
    labeledEntitiesCreate: (OAILabeledEntitiesCreate*) labeledEntitiesCreate
        completionHandler: (void (^)(OAILabeledEntities* output, NSError* error)) handler;
```

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSString* labelId = @"labelId_example"; // Label ID.
OAILabeledEntitiesCreate* labeledEntitiesCreate = [[OAILabeledEntitiesCreate alloc] init]; // 

OAILabelsApi*apiInstance = [[OAILabelsApi alloc] init];

// Apply label to entity
[apiInstance labelsApplyWithAdAccountId:adAccountId
              labelId:labelId
              labeledEntitiesCreate:labeledEntitiesCreate
          completionHandler: ^(OAILabeledEntities* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILabelsApi->labelsApply: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***|  | 
 **labelId** | **NSString***| Label ID. | 
 **labeledEntitiesCreate** | [**OAILabeledEntitiesCreate***](OAILabeledEntitiesCreate.md)|  | 

### Return type

[**OAILabeledEntities***](OAILabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsCreate**
```objc
-(NSURLSessionTask*) labelsCreateWithAdAccountId: (NSString*) adAccountId
    labelCreateRequest: (OAILabelCreateRequest*) labelCreateRequest
        completionHandler: (void (^)(OAILabelsResponse* output, NSError* error)) handler;
```

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAILabelCreateRequest* labelCreateRequest = [[OAILabelCreateRequest alloc] init]; // 

OAILabelsApi*apiInstance = [[OAILabelsApi alloc] init];

// Create labels
[apiInstance labelsCreateWithAdAccountId:adAccountId
              labelCreateRequest:labelCreateRequest
          completionHandler: ^(OAILabelsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILabelsApi->labelsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **labelCreateRequest** | [**OAILabelCreateRequest***](OAILabelCreateRequest.md)|  | 

### Return type

[**OAILabelsResponse***](OAILabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsList**
```objc
-(NSURLSessionTask*) labelsListWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    labelIds: (NSArray<NSString*>*) labelIds
    entityStatuses: (NSArray<OAIQueryLabelEntityStatusesItems>*) entityStatuses
    labelTypes: (NSArray<OAIQueryLabelTypesItems>*) labelTypes
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAILabelsList200Response* output, NSError* error)) handler;
```

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results. (optional)
NSArray<NSString*>* labelIds = @[@"labelIds_example"]; // List of Label Ids to use to filter the results. (optional)
NSArray<OAIQueryLabelEntityStatusesItems>* entityStatuses = @[[[OAIQueryLabelEntityStatusesItems alloc] init]]; // Label entity status (optional)
NSArray<OAIQueryLabelTypesItems>* labelTypes = @[[[OAIQueryLabelTypesItems alloc] init]]; // Label type. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAILabelsApi*apiInstance = [[OAILabelsApi alloc] init];

// List labels
[apiInstance labelsListWithAdAccountId:adAccountId
              campaignIds:campaignIds
              labelIds:labelIds
              entityStatuses:entityStatuses
              labelTypes:labelTypes
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAILabelsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILabelsApi->labelsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **labelIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Label Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**NSArray&lt;OAIQueryLabelEntityStatusesItems&gt;***](OAIQueryLabelEntityStatusesItems*.md)| Label entity status | [optional] 
 **labelTypes** | [**NSArray&lt;OAIQueryLabelTypesItems&gt;***](OAIQueryLabelTypesItems*.md)| Label type. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAILabelsList200Response***](OAILabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsRemove**
```objc
-(NSURLSessionTask*) labelsRemoveWithAdAccountId: (NSString*) adAccountId
    labelId: (NSString*) labelId
    labeledEntitiesCreate: (OAILabeledEntitiesCreate*) labeledEntitiesCreate
        completionHandler: (void (^)(OAILabeledEntities* output, NSError* error)) handler;
```

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSString* labelId = @"labelId_example"; // Label ID.
OAILabeledEntitiesCreate* labeledEntitiesCreate = [[OAILabeledEntitiesCreate alloc] init]; // 

OAILabelsApi*apiInstance = [[OAILabelsApi alloc] init];

// Remove label from entities
[apiInstance labelsRemoveWithAdAccountId:adAccountId
              labelId:labelId
              labeledEntitiesCreate:labeledEntitiesCreate
          completionHandler: ^(OAILabeledEntities* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILabelsApi->labelsRemove: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***|  | 
 **labelId** | **NSString***| Label ID. | 
 **labeledEntitiesCreate** | [**OAILabeledEntitiesCreate***](OAILabeledEntitiesCreate.md)|  | 

### Return type

[**OAILabeledEntities***](OAILabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsUpdate**
```objc
-(NSURLSessionTask*) labelsUpdateWithAdAccountId: (NSString*) adAccountId
    labelUpdateRequest: (OAILabelUpdateRequest*) labelUpdateRequest
        completionHandler: (void (^)(OAILabelsResponse* output, NSError* error)) handler;
```

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAILabelUpdateRequest* labelUpdateRequest = [[OAILabelUpdateRequest alloc] init]; // 

OAILabelsApi*apiInstance = [[OAILabelsApi alloc] init];

// Update labels
[apiInstance labelsUpdateWithAdAccountId:adAccountId
              labelUpdateRequest:labelUpdateRequest
          completionHandler: ^(OAILabelsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILabelsApi->labelsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **labelUpdateRequest** | [**OAILabelUpdateRequest***](OAILabelUpdateRequest.md)|  | 

### Return type

[**OAILabelsResponse***](OAILabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

