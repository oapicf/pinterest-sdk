# OAILeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadsExportCreate**](OAILeadsExportApi.md#leadsexportcreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leadsExportGet**](OAILeadsExportApi.md#leadsexportget) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


# **leadsExportCreate**
```objc
-(NSURLSessionTask*) leadsExportCreateWithAdAccountId: (NSString*) adAccountId
    leadsExportCreateRequest: (OAILeadsExportCreateRequest*) leadsExportCreateRequest
        completionHandler: (void (^)(OAILeadsExportCreateResponse* output, NSError* error)) handler;
```

Create a request to export leads collected from a lead ad

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAILeadsExportCreateRequest* leadsExportCreateRequest = [[OAILeadsExportCreateRequest alloc] init]; // 

OAILeadsExportApi*apiInstance = [[OAILeadsExportApi alloc] init];

// Create a request to export leads collected from a lead ad
[apiInstance leadsExportCreateWithAdAccountId:adAccountId
              leadsExportCreateRequest:leadsExportCreateRequest
          completionHandler: ^(OAILeadsExportCreateResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadsExportApi->leadsExportCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **leadsExportCreateRequest** | [**OAILeadsExportCreateRequest***](OAILeadsExportCreateRequest.md)|  | 

### Return type

[**OAILeadsExportCreateResponse***](OAILeadsExportCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadsExportGet**
```objc
-(NSURLSessionTask*) leadsExportGetWithAdAccountId: (NSString*) adAccountId
    leadsExportId: (NSString*) leadsExportId
        completionHandler: (void (^)(OAILeadsExportResponseData* output, NSError* error)) handler;
```

Get the lead export from the lead export create call

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* leadsExportId = 123755885175; // lead_export_id token returned from the create a lead export endpoint

OAILeadsExportApi*apiInstance = [[OAILeadsExportApi alloc] init];

// Get the lead export from the lead export create call
[apiInstance leadsExportGetWithAdAccountId:adAccountId
              leadsExportId:leadsExportId
          completionHandler: ^(OAILeadsExportResponseData* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILeadsExportApi->leadsExportGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **leadsExportId** | **NSString***| lead_export_id token returned from the create a lead export endpoint | 

### Return type

[**OAILeadsExportResponseData***](OAILeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

