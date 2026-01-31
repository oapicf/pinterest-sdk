# WWW::OpenAPIClient::PromotionsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PromotionsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotions_create**](PromotionsApi.md#promotions_create) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotions_delete**](PromotionsApi.md#promotions_delete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotions_get**](PromotionsApi.md#promotions_get) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotions_list**](PromotionsApi.md#promotions_list) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotions_update**](PromotionsApi.md#promotions_update) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


# **promotions_create**
> PromotionsResponse promotions_create(ad_account_id => $ad_account_id, promotion_create_request => $promotion_create_request)

Create promotions

Create multiple new promotions.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PromotionsApi;
my $api_instance = WWW::OpenAPIClient::PromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $promotion_create_request = [WWW::OpenAPIClient::Object::ARRAY[PromotionCreateRequest]->new()]; # ARRAY[PromotionCreateRequest] | List of promotions to create, size limit [1, 30].

eval {
    my $result = $api_instance->promotions_create(ad_account_id => $ad_account_id, promotion_create_request => $promotion_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionsApi->promotions_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **promotion_create_request** | [**ARRAY[PromotionCreateRequest]**](PromotionCreateRequest.md)| List of promotions to create, size limit [1, 30]. | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_delete**
> promotions_delete(ad_account_id => $ad_account_id, promotion_id => $promotion_id)

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PromotionsApi;
my $api_instance = WWW::OpenAPIClient::PromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $promotion_id = "promotion_id_example"; # string | Unique identifier of a promotion

eval {
    $api_instance->promotions_delete(ad_account_id => $ad_account_id, promotion_id => $promotion_id);
};
if ($@) {
    warn "Exception when calling PromotionsApi->promotions_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **promotion_id** | **string**| Unique identifier of a promotion | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_get**
> PromotionResponse promotions_get(ad_account_id => $ad_account_id, promotion_id => $promotion_id)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PromotionsApi;
my $api_instance = WWW::OpenAPIClient::PromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $promotion_id = "promotion_id_example"; # string | Unique identifier of a promotion

eval {
    my $result = $api_instance->promotions_get(ad_account_id => $ad_account_id, promotion_id => $promotion_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionsApi->promotions_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **promotion_id** | **string**| Unique identifier of a promotion | 

### Return type

[**PromotionResponse**](PromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_list**
> PromotionsList200Response promotions_list(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PromotionsApi;
my $api_instance = WWW::OpenAPIClient::PromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->promotions_list(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionsApi->promotions_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotions_update**
> PromotionsResponse promotions_update(ad_account_id => $ad_account_id, promotion_update_request => $promotion_update_request)

Update promotions

Update multiple promotions.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PromotionsApi;
my $api_instance = WWW::OpenAPIClient::PromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $promotion_update_request = [WWW::OpenAPIClient::Object::ARRAY[PromotionUpdateRequest]->new()]; # ARRAY[PromotionUpdateRequest] | List of promotions to create, size limit [1, 30].

eval {
    my $result = $api_instance->promotions_update(ad_account_id => $ad_account_id, promotion_update_request => $promotion_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PromotionsApi->promotions_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **promotion_update_request** | [**ARRAY[PromotionUpdateRequest]**](PromotionUpdateRequest.md)| List of promotions to create, size limit [1, 30]. | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

