# OAIBillingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](OAIBillingApi.md#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](OAIBillingApi.md#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
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
    adsCreditRedeemRequest: (OAIAdsCreditRedeemRequest*) adsCreditRedeemRequest
        completionHandler: (void (^)(OAIAdsCreditRedeemResponse* output, NSError* error)) handler;
```

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdsCreditRedeemRequest* adsCreditRedeemRequest = [[OAIAdsCreditRedeemRequest alloc] init]; // Redeem ad credits request.

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Redeem ad credits
[apiInstance adsCreditRedeemWithAdAccountId:adAccountId
              adsCreditRedeemRequest:adsCreditRedeemRequest
          completionHandler: ^(OAIAdsCreditRedeemResponse* output, NSError* error) {
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
 **adsCreditRedeemRequest** | [**OAIAdsCreditRedeemRequest***](OAIAdsCreditRedeemRequest.md)| Redeem ad credits request. | 

### Return type

[**OAIAdsCreditRedeemResponse***](OAIAdsCreditRedeemResponse.md)

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

Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)

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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIAdsCreditsDiscountsGet200Response***](OAIAdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingProfilesGet**
```objc
-(NSURLSessionTask*) billingProfilesGetWithAdAccountId: (NSString*) adAccountId
    isActive: (NSNumber*) isActive
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIBillingProfilesGet200Response* output, NSError* error)) handler;
```

Get billing profiles

Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* isActive = @56; // Return active billing profiles, if false return all billing profiles.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get billing profiles
[apiInstance billingProfilesGetWithAdAccountId:adAccountId
              isActive:isActive
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
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **isActive** | **NSNumber***| Return active billing profiles, if false return all billing profiles. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

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
        completionHandler: (void (^)(OAISSIOAccountResponse* output, NSError* error)) handler;
```

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get Salesforce account details including bill-to information.
[apiInstance ssioAccountsGetWithAdAccountId:adAccountId
          completionHandler: ^(OAISSIOAccountResponse* output, NSError* error) {
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

[**OAISSIOAccountResponse***](OAISSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrderCreate**
```objc
-(NSURLSessionTask*) ssioInsertionOrderCreateWithAdAccountId: (NSString*) adAccountId
    sSIOCreateInsertionOrderRequest: (OAISSIOCreateInsertionOrderRequest*) sSIOCreateInsertionOrderRequest
        completionHandler: (void (^)(OAISSIOCreateInsertionOrderResponse* output, NSError* error)) handler;
```

Create insertion order through SSIO.

Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAISSIOCreateInsertionOrderRequest* sSIOCreateInsertionOrderRequest = [[OAISSIOCreateInsertionOrderRequest alloc] init]; // Order line to create.

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Create insertion order through SSIO.
[apiInstance ssioInsertionOrderCreateWithAdAccountId:adAccountId
              sSIOCreateInsertionOrderRequest:sSIOCreateInsertionOrderRequest
          completionHandler: ^(OAISSIOCreateInsertionOrderResponse* output, NSError* error) {
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
 **sSIOCreateInsertionOrderRequest** | [**OAISSIOCreateInsertionOrderRequest***](OAISSIOCreateInsertionOrderRequest.md)| Order line to create. | 

### Return type

[**OAISSIOCreateInsertionOrderResponse***](OAISSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrderEdit**
```objc
-(NSURLSessionTask*) ssioInsertionOrderEditWithAdAccountId: (NSString*) adAccountId
    sSIOEditInsertionOrderRequest: (OAISSIOEditInsertionOrderRequest*) sSIOEditInsertionOrderRequest
        completionHandler: (void (^)(OAISSIOEditInsertionOrderResponse* output, NSError* error)) handler;
```

Edit insertion order through SSIO.

Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAISSIOEditInsertionOrderRequest* sSIOEditInsertionOrderRequest = [[OAISSIOEditInsertionOrderRequest alloc] init]; // Order line to create.

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Edit insertion order through SSIO.
[apiInstance ssioInsertionOrderEditWithAdAccountId:adAccountId
              sSIOEditInsertionOrderRequest:sSIOEditInsertionOrderRequest
          completionHandler: ^(OAISSIOEditInsertionOrderResponse* output, NSError* error) {
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
 **sSIOEditInsertionOrderRequest** | [**OAISSIOEditInsertionOrderRequest***](OAISSIOEditInsertionOrderRequest.md)| Order line to create. | 

### Return type

[**OAISSIOEditInsertionOrderResponse***](OAISSIOEditInsertionOrderResponse.md)

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

Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)

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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

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

Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* pinOrderId = 0Q01N0000015hekSVDFDC; // The pin order id associated with the ssio insertion order

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
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    pinOrderId: (NSString*) pinOrderId
        completionHandler: (void (^)(OAISsioOrderLinesGetByAdAccount200Response* output, NSError* error)) handler;
```

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* pinOrderId = 0Q01N0000015hekSVDFDC; // The pin order id associated with the ssio insertino order (optional)

OAIBillingApi*apiInstance = [[OAIBillingApi alloc] init];

// Get Salesforce order lines by ad account id.
[apiInstance ssioOrderLinesGetByAdAccountWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              pinOrderId:pinOrderId
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
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **pinOrderId** | **NSString***| The pin order id associated with the ssio insertino order | [optional] 

### Return type

[**OAISsioOrderLinesGetByAdAccount200Response***](OAISsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

