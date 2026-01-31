# OAILabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsCreate**](OAILabelsApi.md#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](OAILabelsApi.md#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsUpdate**](OAILabelsApi.md#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labelsCreate**
```objc
-(NSURLSessionTask*) labelsCreateWithAdAccountId: (NSString*) adAccountId
    labelCreateRequest: (OAILabelCreateRequest*) labelCreateRequest
        completionHandler: (void (^)(OAILabelsResponse* output, NSError* error)) handler;
```

Create labels

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

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
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    labelTypes: (NSArray<NSString*>*) labelTypes
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAILabelsList200Response* output, NSError* error)) handler;
```

List labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results. (optional)
NSArray<NSString*>* labelIds = @[@"labelIds_example"]; // List of Label Ids to use to filter the results. (optional)
NSArray<NSString*>* entityStatuses = @[@"entityStatuses_example"]; // Label entity status (optional)
NSArray<NSString*>* labelTypes = ["BRAND","CUSTOM"]; // Label type. (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAILabelsApi*apiInstance = [[OAILabelsApi alloc] init];

// List labels
[apiInstance labelsListWithAdAccountId:adAccountId
              campaignIds:campaignIds
              labelIds:labelIds
              entityStatuses:entityStatuses
              labelTypes:labelTypes
              pageSize:pageSize
              bookmark:bookmark
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
 **entityStatuses** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Label entity status | [optional] 
 **labelTypes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Label type. | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAILabelsList200Response***](OAILabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsUpdate**
```objc
-(NSURLSessionTask*) labelsUpdateWithAdAccountId: (NSString*) adAccountId
    labelUpdateRequest: (OAILabelUpdateRequest*) labelUpdateRequest
        completionHandler: (void (^)(OAILabelsResponse* output, NSError* error)) handler;
```

Update labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

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

