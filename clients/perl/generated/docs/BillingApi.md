# WWW::OpenAPIClient::BillingApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BillingApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ads_credit_redeem**](BillingApi.md#ads_credit_redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**ads_credits_discounts_get**](BillingApi.md#ads_credits_discounts_get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billing_profiles_get**](BillingApi.md#billing_profiles_get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssio_accounts_get**](BillingApi.md#ssio_accounts_get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssio_insertion_order_create**](BillingApi.md#ssio_insertion_order_create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssio_insertion_order_edit**](BillingApi.md#ssio_insertion_order_edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssio_insertion_orders_status_get_by_ad_account**](BillingApi.md#ssio_insertion_orders_status_get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssio_insertion_orders_status_get_by_pin_order_id**](BillingApi.md#ssio_insertion_orders_status_get_by_pin_order_id) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssio_order_lines_get_by_ad_account**](BillingApi.md#ssio_order_lines_get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


# **ads_credit_redeem**
> AdsCreditRedeemResponse ads_credit_redeem(ad_account_id => $ad_account_id, ads_credit_redeem_request => $ads_credit_redeem_request)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ads_credit_redeem_request = WWW::OpenAPIClient::Object::AdsCreditRedeemRequest->new(); # AdsCreditRedeemRequest | Redeem ad credits request.

eval {
    my $result = $api_instance->ads_credit_redeem(ad_account_id => $ad_account_id, ads_credit_redeem_request => $ads_credit_redeem_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->ads_credit_redeem: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ads_credit_redeem_request** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md)| Redeem ad credits request. | 

### Return type

[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_credits_discounts_get**
> AdsCreditsDiscountsGet200Response ads_credits_discounts_get(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

Get ads credit discounts

Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->ads_credits_discounts_get(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->ads_credits_discounts_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_profiles_get**
> BillingProfilesGet200Response billing_profiles_get(ad_account_id => $ad_account_id, is_active => $is_active, bookmark => $bookmark, page_size => $page_size)

Get billing profiles

Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $is_active = null; # boolean | Return active billing profiles, if false return all billing profiles.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->billing_profiles_get(ad_account_id => $ad_account_id, is_active => $is_active, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->billing_profiles_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **is_active** | **boolean**| Return active billing profiles, if false return all billing profiles. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_accounts_get**
> SSIOAccountResponse ssio_accounts_get(ad_account_id => $ad_account_id)

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->ssio_accounts_get(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->ssio_accounts_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**SSIOAccountResponse**](SSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_order_create**
> SSIOCreateInsertionOrderResponse ssio_insertion_order_create(ad_account_id => $ad_account_id, ssio_create_insertion_order_request => $ssio_create_insertion_order_request)

Create insertion order through SSIO.

Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ssio_create_insertion_order_request = WWW::OpenAPIClient::Object::SSIOCreateInsertionOrderRequest->new(); # SSIOCreateInsertionOrderRequest | Order line to create.

eval {
    my $result = $api_instance->ssio_insertion_order_create(ad_account_id => $ad_account_id, ssio_create_insertion_order_request => $ssio_create_insertion_order_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->ssio_insertion_order_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ssio_create_insertion_order_request** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md)| Order line to create. | 

### Return type

[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_order_edit**
> SSIOEditInsertionOrderResponse ssio_insertion_order_edit(ad_account_id => $ad_account_id, ssio_edit_insertion_order_request => $ssio_edit_insertion_order_request)

Edit insertion order through SSIO.

Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ssio_edit_insertion_order_request = WWW::OpenAPIClient::Object::SSIOEditInsertionOrderRequest->new(); # SSIOEditInsertionOrderRequest | Order line to create.

eval {
    my $result = $api_instance->ssio_insertion_order_edit(ad_account_id => $ad_account_id, ssio_edit_insertion_order_request => $ssio_edit_insertion_order_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->ssio_insertion_order_edit: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ssio_edit_insertion_order_request** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md)| Order line to create. | 

### Return type

[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_orders_status_get_by_ad_account**
> SsioInsertionOrdersStatusGetByAdAccount200Response ssio_insertion_orders_status_get_by_ad_account(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

Get insertion order status by ad account id.

Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->ssio_insertion_orders_status_get_by_ad_account(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->ssio_insertion_orders_status_get_by_ad_account: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_orders_status_get_by_pin_order_id**
> SSIOInsertionOrderStatusResponse ssio_insertion_orders_status_get_by_pin_order_id(ad_account_id => $ad_account_id, pin_order_id => $pin_order_id)

Get insertion order status by pin order id.

Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $pin_order_id = 0Q01N0000015hekSVDFDC; # string | The pin order id associated with the ssio insertion order

eval {
    my $result = $api_instance->ssio_insertion_orders_status_get_by_pin_order_id(ad_account_id => $ad_account_id, pin_order_id => $pin_order_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->ssio_insertion_orders_status_get_by_pin_order_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **pin_order_id** | **string**| The pin order id associated with the ssio insertion order | 

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_order_lines_get_by_ad_account**
> SsioOrderLinesGetByAdAccount200Response ssio_order_lines_get_by_ad_account(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, pin_order_id => $pin_order_id)

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $pin_order_id = 0Q01N0000015hekSVDFDC; # string | The pin order id associated with the ssio insertino order

eval {
    my $result = $api_instance->ssio_order_lines_get_by_ad_account(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, pin_order_id => $pin_order_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->ssio_order_lines_get_by_ad_account: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **pin_order_id** | **string**| The pin order id associated with the ssio insertino order | [optional] 

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

