# WWW::OpenAPIClient::LeadAdsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LeadAdsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_subscriptions_del_by_id**](LeadAdsApi.md#ad_accounts_subscriptions_del_by_id) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**ad_accounts_subscriptions_get_by_id**](LeadAdsApi.md#ad_accounts_subscriptions_get_by_id) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**ad_accounts_subscriptions_get_list**](LeadAdsApi.md#ad_accounts_subscriptions_get_list) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**ad_accounts_subscriptions_post**](LeadAdsApi.md#ad_accounts_subscriptions_post) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **ad_accounts_subscriptions_del_by_id**
> LeadSubscription ad_accounts_subscriptions_del_by_id(ad_account_id => $ad_account_id, subscription_id => $subscription_id)

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadAdsApi;
my $api_instance = WWW::OpenAPIClient::LeadAdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $subscription_id = "subscription_id_example"; # string | Unique identifier of a subscription.

eval {
    my $result = $api_instance->ad_accounts_subscriptions_del_by_id(ad_account_id => $ad_account_id, subscription_id => $subscription_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadAdsApi->ad_accounts_subscriptions_del_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **subscription_id** | **string**| Unique identifier of a subscription. | 

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_get_by_id**
> LeadSubscription ad_accounts_subscriptions_get_by_id(ad_account_id => $ad_account_id, subscription_id => $subscription_id)

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadAdsApi;
my $api_instance = WWW::OpenAPIClient::LeadAdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $subscription_id = "subscription_id_example"; # string | Unique identifier of a subscription.

eval {
    my $result = $api_instance->ad_accounts_subscriptions_get_by_id(ad_account_id => $ad_account_id, subscription_id => $subscription_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadAdsApi->ad_accounts_subscriptions_get_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **subscription_id** | **string**| Unique identifier of a subscription. | 

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_get_list**
> AdAccountsSubscriptionsGetList200Response ad_accounts_subscriptions_get_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadAdsApi;
my $api_instance = WWW::OpenAPIClient::LeadAdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->ad_accounts_subscriptions_get_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadAdsApi->ad_accounts_subscriptions_get_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsSubscriptionsGetList200Response**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_post**
> LeadSubscription ad_accounts_subscriptions_post(ad_account_id => $ad_account_id, lead_subscription_post_params_create => $lead_subscription_post_params_create)

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadAdsApi;
my $api_instance = WWW::OpenAPIClient::LeadAdsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $lead_subscription_post_params_create = WWW::OpenAPIClient::Object::LeadSubscriptionPostParamsCreate->new(); # LeadSubscriptionPostParamsCreate | 

eval {
    my $result = $api_instance->ad_accounts_subscriptions_post(ad_account_id => $ad_account_id, lead_subscription_post_params_create => $lead_subscription_post_params_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadAdsApi->ad_accounts_subscriptions_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **lead_subscription_post_params_create** | [**LeadSubscriptionPostParamsCreate**](LeadSubscriptionPostParamsCreate.md)|  | 

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

