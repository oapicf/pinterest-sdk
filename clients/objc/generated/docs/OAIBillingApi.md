# OAIBillingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](OAIBillingApi.md#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](OAIBillingApi.md#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingInvoiceDownloadGet**](OAIBillingApi.md#billinginvoicedownloadget) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**billingInvoicesGet**](OAIBillingApi.md#billinginvoicesget) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**billingProfilesGet**](OAIBillingApi.md#billingprofilesget) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](OAIBillingApi.md#ssioaccountsget) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](OAIBillingApi.md#ssioinsertionordercreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](OAIBillingApi.md#ssioinsertionorderedit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](OAIBillingApi.md#ssioinsertionordersstatusgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](OAIBillingApi.md#ssioinsertionordersstatusgetbypinorderid) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](OAIBillingApi.md#ssioorderlinesgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


# **adsCreditRedeem**
```objc
-(NSURLSessionTask*) adsCreditRedeemWithAdAccountId: (NSString*) adAccountId
    adsCreditRedeemCreate: (OAIAdsCreditRedeemCreate*) adsCreditRedeemCreate
        completionHandler: (void (^)(OAIAdsCreditRedeem* output, NSError* error)) handler;
```

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdsCreditRedeemCreate* adsCreditRedeemCreate = [[OAIAdsCreditRedeemCreate alloc] init]; // 

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Redeem ad credits
[apiInstance adsCreditRedeemWithAdAccountId:adAccountId
              adsCreditRedeemCreate:adsCreditRedeemCreate
          completionHandler: ^(OAIAdsCreditRedeem* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->adsCreditRedeem: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adsCreditRedeemCreate** | [**OAIAdsCreditRedeemCreate***](OAIAdsCreditRedeemCreate.md)|  | 

### Return type

[**OAIAdsCreditRedeem***](OAIAdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsCreditsDiscountsGet**
```objc
-(NSURLSessionTask*) adsCreditsDiscountsGetWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIAdsCreditsDiscountsGet200Response* output, NSError* error)) handler;
```

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get ads credit discounts
[apiInstance adsCreditsDiscountsGetWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIAdsCreditsDiscountsGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->adsCreditsDiscountsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIAdsCreditsDiscountsGet200Response***](OAIAdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingInvoiceDownloadGet**
```objc
-(NSURLSessionTask*) billingInvoiceDownloadGetWithAdAccountId: (NSString*) adAccountId
    billingInvoiceId: (NSString*) billingInvoiceId
        completionHandler: (void (^)(OAIBillingInvoiceDownloadResponse* output, NSError* error)) handler;
```

Get download url for a billing invoice

Get download url for a billing invoice.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* billingInvoiceId = @"billingInvoiceId_example"; // Unique identifier of a billing invoice.

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get download url for a billing invoice
[apiInstance billingInvoiceDownloadGetWithAdAccountId:adAccountId
              billingInvoiceId:billingInvoiceId
          completionHandler: ^(OAIBillingInvoiceDownloadResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->billingInvoiceDownloadGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **billingInvoiceId** | **NSString***| Unique identifier of a billing invoice. | 

### Return type

[**OAIBillingInvoiceDownloadResponse***](OAIBillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingInvoicesGet**
```objc
-(NSURLSessionTask*) billingInvoicesGetWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
    sort: (OAIBillingInvoiceSortField) sort
    status: (OAIBillingInvoiceStatus) status
    documentType: (OAIBillingInvoiceDocumentType) documentType
    startDueDate: (NSDate*) startDueDate
    endDueDate: (NSDate*) endDueDate
        completionHandler: (void (^)(OAIBillingInvoicesGet200Response* output, NSError* error)) handler;
```

Get billing invoices

Get billing invoices in the advertiser account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
OAIPinterestLibPaginationOrder order = [[OAIPinterestLibPaginationOrder alloc] init]; // The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
OAIBillingInvoiceSortField sort = [[OAIBillingInvoiceSortField alloc] init]; // Field of which to sort billing invoices (optional)
OAIBillingInvoiceStatus status = [[OAIBillingInvoiceStatus alloc] init]; // Status of billing invoices to filter by (optional)
OAIBillingInvoiceDocumentType documentType = [[OAIBillingInvoiceDocumentType alloc] init]; // Document type of billing invoices to filter by (optional)
NSDate* startDueDate = @"2013-10-20T19:20:30+01:00"; // Starting point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)
NSDate* endDueDate = @"2013-10-20T19:20:30+01:00"; // Ending point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get billing invoices
[apiInstance billingInvoicesGetWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              order:order
              sort:sort
              status:status
              documentType:documentType
              startDueDate:startDueDate
              endDueDate:endDueDate
          completionHandler: ^(OAIBillingInvoicesGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->billingInvoicesGet: %@", error);
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
 **sort** | [**OAIBillingInvoiceSortField**](.md)| Field of which to sort billing invoices | [optional] 
 **status** | [**OAIBillingInvoiceStatus**](.md)| Status of billing invoices to filter by | [optional] 
 **documentType** | [**OAIBillingInvoiceDocumentType**](.md)| Document type of billing invoices to filter by | [optional] 
 **startDueDate** | **NSDate***| Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] 
 **endDueDate** | **NSDate***| Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] 

### Return type

[**OAIBillingInvoicesGet200Response***](OAIBillingInvoicesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingProfilesGet**
```objc
-(NSURLSessionTask*) billingProfilesGetWithIsActive: (NSNumber*) isActive
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIBillingProfilesGet200Response* output, NSError* error)) handler;
```

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* isActive = @56; // Return active billing profiles, if false return all billing profiles.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get billing profiles
[apiInstance billingProfilesGetWithIsActive:isActive
              adAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIBillingProfilesGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->billingProfilesGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isActive** | **NSNumber***| Return active billing profiles, if false return all billing profiles. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIBillingProfilesGet200Response***](OAIBillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioAccountsGet**
```objc
-(NSURLSessionTask*) ssioAccountsGetWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAISSIOAccount* output, NSError* error)) handler;
```

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get Salesforce account details including bill-to information.
[apiInstance ssioAccountsGetWithAdAccountId:adAccountId
          completionHandler: ^(OAISSIOAccount* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->ssioAccountsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAISSIOAccount***](OAISSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrderCreate**
```objc
-(NSURLSessionTask*) ssioInsertionOrderCreateWithAdAccountId: (NSString*) adAccountId
    sSIOInsertionOrderCreate: (OAISSIOInsertionOrderCreate*) sSIOInsertionOrderCreate
        completionHandler: (void (^)(OAISSIOInsertionOrder* output, NSError* error)) handler;
```

Create insertion order through SSIO.

  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAISSIOInsertionOrderCreate* sSIOInsertionOrderCreate = [[OAISSIOInsertionOrderCreate alloc] init]; // 

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Create insertion order through SSIO.
[apiInstance ssioInsertionOrderCreateWithAdAccountId:adAccountId
              sSIOInsertionOrderCreate:sSIOInsertionOrderCreate
          completionHandler: ^(OAISSIOInsertionOrder* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->ssioInsertionOrderCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **sSIOInsertionOrderCreate** | [**OAISSIOInsertionOrderCreate***](OAISSIOInsertionOrderCreate.md)|  | 

### Return type

[**OAISSIOInsertionOrder***](OAISSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrderEdit**
```objc
-(NSURLSessionTask*) ssioInsertionOrderEditWithAdAccountId: (NSString*) adAccountId
    sSIOInsertionOrderUpdate: (OAISSIOInsertionOrderUpdate*) sSIOInsertionOrderUpdate
        completionHandler: (void (^)(OAISSIOInsertionOrder* output, NSError* error)) handler;
```

Edit insertion order through SSIO.

  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAISSIOInsertionOrderUpdate* sSIOInsertionOrderUpdate = [[OAISSIOInsertionOrderUpdate alloc] init]; // 

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Edit insertion order through SSIO.
[apiInstance ssioInsertionOrderEditWithAdAccountId:adAccountId
              sSIOInsertionOrderUpdate:sSIOInsertionOrderUpdate
          completionHandler: ^(OAISSIOInsertionOrder* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->ssioInsertionOrderEdit: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **sSIOInsertionOrderUpdate** | [**OAISSIOInsertionOrderUpdate***](OAISSIOInsertionOrderUpdate.md)|  | 

### Return type

[**OAISSIOInsertionOrder***](OAISSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrdersStatusGetByAdAccount**
```objc
-(NSURLSessionTask*) ssioInsertionOrdersStatusGetByAdAccountWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAISsioInsertionOrdersStatusGetByAdAccount200Response* output, NSError* error)) handler;
```

Get insertion order status by ad account id.

  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get insertion order status by ad account id.
[apiInstance ssioInsertionOrdersStatusGetByAdAccountWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAISsioInsertionOrdersStatusGetByAdAccount200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->ssioInsertionOrdersStatusGetByAdAccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAISsioInsertionOrdersStatusGetByAdAccount200Response***](OAISsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrdersStatusGetByPinOrderId**
```objc
-(NSURLSessionTask*) ssioInsertionOrdersStatusGetByPinOrderIdWithAdAccountId: (NSString*) adAccountId
    pinOrderId: (NSString*) pinOrderId
        completionHandler: (void (^)(OAISSIOInsertionOrderStatusResponse* output, NSError* error)) handler;
```

Get insertion order status by pin order id.

  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* pinOrderId = @"pinOrderId_example"; // The pin order id associated with the ssio insertion order

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get insertion order status by pin order id.
[apiInstance ssioInsertionOrdersStatusGetByPinOrderIdWithAdAccountId:adAccountId
              pinOrderId:pinOrderId
          completionHandler: ^(OAISSIOInsertionOrderStatusResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->ssioInsertionOrdersStatusGetByPinOrderId: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **pinOrderId** | **NSString***| The pin order id associated with the ssio insertion order | 

### Return type

[**OAISSIOInsertionOrderStatusResponse***](OAISSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioOrderLinesGetByAdAccount**
```objc
-(NSURLSessionTask*) ssioOrderLinesGetByAdAccountWithAdAccountId: (NSString*) adAccountId
    pinOrderId: (NSString*) pinOrderId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAISsioOrderLinesGetByAdAccount200Response* output, NSError* error)) handler;
```

Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* pinOrderId = @"pinOrderId_example"; // The pin order id associated with the SSIO insertion order (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get Salesforce order lines by ad account id.
[apiInstance ssioOrderLinesGetByAdAccountWithAdAccountId:adAccountId
              pinOrderId:pinOrderId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAISsioOrderLinesGetByAdAccount200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBillingApi->ssioOrderLinesGetByAdAccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **pinOrderId** | **NSString***| The pin order id associated with the SSIO insertion order | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAISsioOrderLinesGetByAdAccount200Response***](OAISsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

