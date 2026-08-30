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
[**billing_invoice_download_get**](BillingApi.md#billing_invoice_download_get) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice
[**billing_invoices_get**](BillingApi.md#billing_invoices_get) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices
[**billing_profiles_get**](BillingApi.md#billing_profiles_get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssio_accounts_get**](BillingApi.md#ssio_accounts_get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssio_insertion_order_create**](BillingApi.md#ssio_insertion_order_create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssio_insertion_order_edit**](BillingApi.md#ssio_insertion_order_edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssio_insertion_orders_status_get_by_ad_account**](BillingApi.md#ssio_insertion_orders_status_get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssio_insertion_orders_status_get_by_pin_order_id**](BillingApi.md#ssio_insertion_orders_status_get_by_pin_order_id) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssio_order_lines_get_by_ad_account**](BillingApi.md#ssio_order_lines_get_by_ad_account) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


# **ads_credit_redeem**
> AdsCreditRedeem ads_credit_redeem(ad_account_id => $ad_account_id, ads_credit_redeem_create => $ads_credit_redeem_create)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ads_credit_redeem_create = WWW::OpenAPIClient::Object::AdsCreditRedeemCreate->new(); # AdsCreditRedeemCreate | 

eval {
    my $result = $api_instance->ads_credit_redeem(ad_account_id => $ad_account_id, ads_credit_redeem_create => $ads_credit_redeem_create);
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
 **ads_credit_redeem_create** | [**AdsCreditRedeemCreate**](AdsCreditRedeemCreate.md)|  | 

### Return type

[**AdsCreditRedeem**](AdsCreditRedeem.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_credits_discounts_get**
> AdsCreditsDiscountsGet200Response ads_credits_discounts_get(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

Get ads credit discounts

Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

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
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

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
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_invoice_download_get**
> BillingInvoiceDownloadResponse billing_invoice_download_get(ad_account_id => $ad_account_id, billing_invoice_id => $billing_invoice_id)

Get download url for a billing invoice

Get download url for a billing invoice.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $billing_invoice_id = "billing_invoice_id_example"; # string | Unique identifier of a billing invoice.

eval {
    my $result = $api_instance->billing_invoice_download_get(ad_account_id => $ad_account_id, billing_invoice_id => $billing_invoice_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->billing_invoice_download_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **billing_invoice_id** | **string**| Unique identifier of a billing invoice. | 

### Return type

[**BillingInvoiceDownloadResponse**](BillingInvoiceDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_invoices_get**
> BillingInvoicesGet200Response billing_invoices_get(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, sort => $sort, status => $status, document_type => $document_type, start_due_date => $start_due_date, end_due_date => $end_due_date)

Get billing invoices

Get billing invoices in the advertiser account.

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
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $sort = new WWW::OpenAPIClient.BillingInvoiceSortField(); # BillingInvoiceSortField | Field of which to sort billing invoices
my $status = new WWW::OpenAPIClient.BillingInvoiceStatus(); # BillingInvoiceStatus | Status of billing invoices to filter by
my $document_type = new WWW::OpenAPIClient.BillingInvoiceDocumentType(); # BillingInvoiceDocumentType | Document type of billing invoices to filter by
my $start_due_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
my $end_due_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD

eval {
    my $result = $api_instance->billing_invoices_get(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, sort => $sort, status => $status, document_type => $document_type, start_due_date => $start_due_date, end_due_date => $end_due_date);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->billing_invoices_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **sort** | [**BillingInvoiceSortField**](.md)| Field of which to sort billing invoices | [optional] 
 **status** | [**BillingInvoiceStatus**](.md)| Status of billing invoices to filter by | [optional] 
 **document_type** | [**BillingInvoiceDocumentType**](.md)| Document type of billing invoices to filter by | [optional] 
 **start_due_date** | **DATE**| Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] 
 **end_due_date** | **DATE**| Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | [optional] 

### Return type

[**BillingInvoicesGet200Response**](BillingInvoicesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_profiles_get**
> BillingProfilesGet200Response billing_profiles_get(is_active => $is_active, ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

Get billing profiles

Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $is_active = null; # boolean | Return active billing profiles, if false return all billing profiles.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->billing_profiles_get(is_active => $is_active, ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BillingApi->billing_profiles_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **is_active** | **boolean**| Return active billing profiles, if false return all billing profiles. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_accounts_get**
> SSIOAccount ssio_accounts_get(ad_account_id => $ad_account_id)

Get Salesforce account details including bill-to information.

  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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

[**SSIOAccount**](SSIOAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_order_create**
> SSIOInsertionOrder ssio_insertion_order_create(ad_account_id => $ad_account_id, ssio_insertion_order_create => $ssio_insertion_order_create)

Create insertion order through SSIO.

  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ssio_insertion_order_create = WWW::OpenAPIClient::Object::SSIOInsertionOrderCreate->new(); # SSIOInsertionOrderCreate | 

eval {
    my $result = $api_instance->ssio_insertion_order_create(ad_account_id => $ad_account_id, ssio_insertion_order_create => $ssio_insertion_order_create);
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
 **ssio_insertion_order_create** | [**SSIOInsertionOrderCreate**](SSIOInsertionOrderCreate.md)|  | 

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_order_edit**
> SSIOInsertionOrder ssio_insertion_order_edit(ad_account_id => $ad_account_id, ssio_insertion_order_update => $ssio_insertion_order_update)

Edit insertion order through SSIO.

  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ssio_insertion_order_update = WWW::OpenAPIClient::Object::SSIOInsertionOrderUpdate->new(); # SSIOInsertionOrderUpdate | 

eval {
    my $result = $api_instance->ssio_insertion_order_edit(ad_account_id => $ad_account_id, ssio_insertion_order_update => $ssio_insertion_order_update);
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
 **ssio_insertion_order_update** | [**SSIOInsertionOrderUpdate**](SSIOInsertionOrderUpdate.md)|  | 

### Return type

[**SSIOInsertionOrder**](SSIOInsertionOrder.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssio_insertion_orders_status_get_by_ad_account**
> SsioInsertionOrdersStatusGetByAdAccount200Response ssio_insertion_orders_status_get_by_ad_account(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

Get insertion order status by ad account id.

  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

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
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

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
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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

  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $pin_order_id = "pin_order_id_example"; # string | The pin order id associated with the ssio insertion order

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
> SsioOrderLinesGetByAdAccount200Response ssio_order_lines_get_by_ad_account(ad_account_id => $ad_account_id, pin_order_id => $pin_order_id, bookmark => $bookmark, page_size => $page_size)

Get Salesforce order lines by ad account id.

  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BillingApi;
my $api_instance = WWW::OpenAPIClient::BillingApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $pin_order_id = "pin_order_id_example"; # string | The pin order id associated with the SSIO insertion order
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->ssio_order_lines_get_by_ad_account(ad_account_id => $ad_account_id, pin_order_id => $pin_order_id, bookmark => $bookmark, page_size => $page_size);
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
 **pin_order_id** | **string**| The pin order id associated with the SSIO insertion order | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

