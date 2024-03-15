# WWW::OpenAPIClient::ProductGroupsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ProductGroupsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_catalogs_product_groups_list**](ProductGroupsApi.md#ad_accounts_catalogs_product_groups_list) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


# **ad_accounts_catalogs_product_groups_list**
> AdAccountsCatalogsProductGroupsList200Response ad_accounts_catalogs_product_groups_list(ad_account_id => $ad_account_id, feed_profile_id => $feed_profile_id)

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductGroupsApi;
my $api_instance = WWW::OpenAPIClient::ProductGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $feed_profile_id = "feed_profile_id_example"; # string | The feed profile id whose catalog product groups we want to return.

eval {
    my $result = $api_instance->ad_accounts_catalogs_product_groups_list(ad_account_id => $ad_account_id, feed_profile_id => $feed_profile_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductGroupsApi->ad_accounts_catalogs_product_groups_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **feed_profile_id** | **string**| The feed profile id whose catalog product groups we want to return. | [optional] 

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

