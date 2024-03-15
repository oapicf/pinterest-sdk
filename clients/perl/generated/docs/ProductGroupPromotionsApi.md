# WWW::OpenAPIClient::ProductGroupPromotionsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ProductGroupPromotionsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**product_group_promotions_create**](ProductGroupPromotionsApi.md#product_group_promotions_create) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**product_group_promotions_get**](ProductGroupPromotionsApi.md#product_group_promotions_get) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**product_group_promotions_list**](ProductGroupPromotionsApi.md#product_group_promotions_list) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**product_group_promotions_update**](ProductGroupPromotionsApi.md#product_group_promotions_update) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**product_groups_analytics**](ProductGroupPromotionsApi.md#product_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **product_group_promotions_create**
> ProductGroupPromotionResponse product_group_promotions_create(ad_account_id => $ad_account_id, product_group_promotion_create_request => $product_group_promotion_create_request)

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductGroupPromotionsApi;
my $api_instance = WWW::OpenAPIClient::ProductGroupPromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $product_group_promotion_create_request = WWW::OpenAPIClient::Object::ProductGroupPromotionCreateRequest->new(); # ProductGroupPromotionCreateRequest | List of Product Group Promotions to create, size limit [1, 30].

eval {
    my $result = $api_instance->product_group_promotions_create(ad_account_id => $ad_account_id, product_group_promotion_create_request => $product_group_promotion_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductGroupPromotionsApi->product_group_promotions_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **product_group_promotion_create_request** | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md)| List of Product Group Promotions to create, size limit [1, 30]. | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_get**
> ProductGroupPromotionResponse product_group_promotions_get(ad_account_id => $ad_account_id, product_group_promotion_id => $product_group_promotion_id)

Get a product group promotion by id

Get a product group promotion by id

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductGroupPromotionsApi;
my $api_instance = WWW::OpenAPIClient::ProductGroupPromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $product_group_promotion_id = "product_group_promotion_id_example"; # string | Unique identifier of a product group promotion

eval {
    my $result = $api_instance->product_group_promotions_get(ad_account_id => $ad_account_id, product_group_promotion_id => $product_group_promotion_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductGroupPromotionsApi->product_group_promotions_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **product_group_promotion_id** | **string**| Unique identifier of a product group promotion | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_list**
> ProductGroupPromotionsList200Response product_group_promotions_list(ad_account_id => $ad_account_id, product_group_promotion_ids => $product_group_promotion_ids, entity_statuses => $entity_statuses, ad_group_id => $ad_group_id, page_size => $page_size, order => $order, bookmark => $bookmark)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductGroupPromotionsApi;
my $api_instance = WWW::OpenAPIClient::ProductGroupPromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $product_group_promotion_ids = [("null")]; # ARRAY[string] | List of Product group promotion Ids.
my $entity_statuses = [("ACTIVE")]; # ARRAY[string] | Entity status
my $ad_group_id = 123123123; # string | Ad group Id.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->product_group_promotions_list(ad_account_id => $ad_account_id, product_group_promotion_ids => $product_group_promotion_ids, entity_statuses => $entity_statuses, ad_group_id => $ad_group_id, page_size => $page_size, order => $order, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductGroupPromotionsApi->product_group_promotions_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **product_group_promotion_ids** | [**ARRAY[string]**](string.md)| List of Product group promotion Ids. | [optional] 
 **entity_statuses** | [**ARRAY[string]**](string.md)| Entity status | [optional] 
 **ad_group_id** | **string**| Ad group Id. | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_group_promotions_update**
> ProductGroupPromotionResponse product_group_promotions_update(ad_account_id => $ad_account_id, product_group_promotion_update_request => $product_group_promotion_update_request)

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductGroupPromotionsApi;
my $api_instance = WWW::OpenAPIClient::ProductGroupPromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $product_group_promotion_update_request = WWW::OpenAPIClient::Object::ProductGroupPromotionUpdateRequest->new(); # ProductGroupPromotionUpdateRequest | Parameters to update Product group promotions

eval {
    my $result = $api_instance->product_group_promotions_update(ad_account_id => $ad_account_id, product_group_promotion_update_request => $product_group_promotion_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductGroupPromotionsApi->product_group_promotions_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **product_group_promotion_update_request** | [**ProductGroupPromotionUpdateRequest**](ProductGroupPromotionUpdateRequest.md)| Parameters to update Product group promotions | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups_analytics**
> ARRAY[ProductGroupAnalyticsResponseInner] product_groups_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, product_group_ids => $product_group_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductGroupPromotionsApi;
my $api_instance = WWW::OpenAPIClient::ProductGroupPromotionsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $product_group_ids = [("null")]; # ARRAY[string] | List of Product group Ids to use to filter the results.
my $columns = [("TOTAL_CONVERSIONS")]; # ARRAY[string] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
my $granularity = DAY; # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
my $click_window_days = 1; # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $view_window_days = 1; # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = TIME_OF_AD_ACTION; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

eval {
    my $result = $api_instance->product_groups_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, product_group_ids => $product_group_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductGroupPromotionsApi->product_groups_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **product_group_ids** | [**ARRAY[string]**](string.md)| List of Product group Ids to use to filter the results. | 
 **columns** | [**ARRAY[string]**](string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**ARRAY[ProductGroupAnalyticsResponseInner]**](ProductGroupAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

