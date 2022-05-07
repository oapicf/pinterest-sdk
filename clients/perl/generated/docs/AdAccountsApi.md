# WWW::OpenAPIClient::AdAccountsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AdAccountsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_analytics**](AdAccountsApi.md#ad_account_analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**ad_accounts_list**](AdAccountsApi.md#ad_accounts_list) | **GET** /ad_accounts | List ad accounts
[**ad_groups_analytics**](AdAccountsApi.md#ad_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**ad_groups_list**](AdAccountsApi.md#ad_groups_list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**ads_analytics**](AdAccountsApi.md#ads_analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_list**](AdAccountsApi.md#ads_list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**analytics_create_report**](AdAccountsApi.md#analytics_create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analytics_get_report**](AdAccountsApi.md#analytics_get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaigns_analytics**](AdAccountsApi.md#campaigns_analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaigns_list**](AdAccountsApi.md#campaigns_list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**product_groups_analytics**](AdAccountsApi.md#product_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **ad_account_analytics**
> ARRAY[HASH[string,object]] ad_account_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
my $columns = [("SPEND_IN_DOLLAR")]; # ARRAY[string] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
my $granularity = DAY; # Granularity | Granularity
my $click_window_days = 1; # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $view_window_days = 1; # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = TIME_OF_AD_ACTION; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

eval {
    my $result = $api_instance->ad_account_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ad_account_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **start_date** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **columns** | [**ARRAY[string]**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**ARRAY[HASH[string,object]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_list**
> Paginated ad_accounts_list(bookmark => $bookmark, page_size => $page_size, include_shared_accounts => $include_shared_accounts)

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
my $include_shared_accounts = true; # boolean | Include shared ad accounts

eval {
    my $result = $api_instance->ad_accounts_list(bookmark => $bookmark, page_size => $page_size, include_shared_accounts => $include_shared_accounts);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ad_accounts_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **include_shared_accounts** | **boolean**| Include shared ad accounts | [optional] [default to true]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_analytics**
> ARRAY[HASH[string,object]] ad_groups_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, ad_group_ids => $ad_group_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to use to filter the results.
my $columns = [("SPEND_IN_DOLLAR")]; # ARRAY[string] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
my $granularity = DAY; # Granularity | Granularity
my $click_window_days = 1; # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $view_window_days = 1; # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = TIME_OF_AD_ACTION; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

eval {
    my $result = $api_instance->ad_groups_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, ad_group_ids => $ad_group_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ad_groups_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **start_date** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to use to filter the results. | 
 **columns** | [**ARRAY[string]**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**ARRAY[HASH[string,object]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_list**
> Paginated ad_groups_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, ad_group_ids => $ad_group_ids, entity_statuses => $entity_statuses, page_size => $page_size, order => $order, bookmark => $bookmark, translate_interests_to_names => $translate_interests_to_names)

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to use to filter the results.
my $entity_statuses = [("ACTIVE")]; # ARRAY[string] | Entity status
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $translate_interests_to_names = false; # boolean | Return interests as text names (if value is true) rather than topic IDs.

eval {
    my $result = $api_instance->ad_groups_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, ad_group_ids => $ad_group_ids, entity_statuses => $entity_statuses, page_size => $page_size, order => $order, bookmark => $bookmark, translate_interests_to_names => $translate_interests_to_names);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ad_groups_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **entity_statuses** | [**ARRAY[string]**](string.md)| Entity status | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **translate_interests_to_names** | **boolean**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_analytics**
> ARRAY[HASH[string,object]] ads_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, ad_ids => $ad_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
my $ad_ids = [("null")]; # ARRAY[string] | List of Ad Ids to use to filter the results.
my $columns = [("SPEND_IN_DOLLAR")]; # ARRAY[string] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
my $granularity = DAY; # Granularity | Granularity
my $click_window_days = 1; # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $view_window_days = 1; # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = TIME_OF_AD_ACTION; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

eval {
    my $result = $api_instance->ads_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, ad_ids => $ad_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ads_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **start_date** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **ad_ids** | [**ARRAY[string]**](string.md)| List of Ad Ids to use to filter the results. | 
 **columns** | [**ARRAY[string]**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**ARRAY[HASH[string,object]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_list**
> Paginated ads_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, ad_group_ids => $ad_group_ids, ad_ids => $ad_ids, entity_statuses => $entity_statuses, page_size => $page_size, order => $order, bookmark => $bookmark)

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to use to filter the results.
my $ad_ids = [("null")]; # ARRAY[string] | List of Ad Ids to use to filter the results.
my $entity_statuses = [("ACTIVE")]; # ARRAY[string] | Entity status
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->ads_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, ad_group_ids => $ad_group_ids, ad_ids => $ad_ids, entity_statuses => $entity_statuses, page_size => $page_size, order => $order, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ads_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **ad_ids** | [**ARRAY[string]**](string.md)| List of Ad Ids to use to filter the results. | [optional] 
 **entity_statuses** | [**ARRAY[string]**](string.md)| Entity status | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_report**
> AdsAnalyticsCreateAsyncResponse analytics_create_report(ad_account_id => $ad_account_id, ads_analytics_create_async_request => $ads_analytics_create_async_request)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ads_analytics_create_async_request = WWW::OpenAPIClient::Object::AdsAnalyticsCreateAsyncRequest->new(); # AdsAnalyticsCreateAsyncRequest | 

eval {
    my $result = $api_instance->analytics_create_report(ad_account_id => $ad_account_id, ads_analytics_create_async_request => $ads_analytics_create_async_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->analytics_create_report: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ads_analytics_create_async_request** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  | 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_report**
> AdsAnalyticsGetAsyncResponse analytics_get_report(ad_account_id => $ad_account_id, token => $token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $token = "token_example"; # string | Token returned from the post request creation call

eval {
    my $result = $api_instance->analytics_get_report(ad_account_id => $ad_account_id, token => $token);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->analytics_get_report: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **token** | **string**| Token returned from the post request creation call | 

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_analytics**
> ARRAY[HASH[string,object]] campaigns_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, campaign_ids => $campaign_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $columns = [("SPEND_IN_DOLLAR")]; # ARRAY[string] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
my $granularity = DAY; # Granularity | Granularity
my $click_window_days = 1; # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $view_window_days = 1; # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = TIME_OF_AD_ACTION; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

eval {
    my $result = $api_instance->campaigns_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, campaign_ids => $campaign_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->campaigns_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **start_date** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | 
 **columns** | [**ARRAY[string]**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**ARRAY[HASH[string,object]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_list**
> Paginated campaigns_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, entity_statuses => $entity_statuses, page_size => $page_size, order => $order, bookmark => $bookmark)

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $entity_statuses = [("ACTIVE")]; # ARRAY[string] | Entity status
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->campaigns_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, entity_statuses => $entity_statuses, page_size => $page_size, order => $order, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->campaigns_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **entity_statuses** | [**ARRAY[string]**](string.md)| Entity status | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups_analytics**
> ARRAY[HASH[string,object]] product_groups_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, product_group_ids => $product_group_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
my $product_group_ids = [("null")]; # ARRAY[string] | List of Product group Ids to use to filter the results.
my $columns = [("SPEND_IN_DOLLAR")]; # ARRAY[string] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
my $granularity = DAY; # Granularity | Granularity
my $click_window_days = 1; # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $view_window_days = 1; # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = TIME_OF_AD_ACTION; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

eval {
    my $result = $api_instance->product_groups_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, product_group_ids => $product_group_ids, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->product_groups_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **start_date** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **end_date** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **product_group_ids** | [**ARRAY[string]**](string.md)| List of Product group Ids to use to filter the results. | 
 **columns** | [**ARRAY[string]**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| Granularity | 
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**ARRAY[HASH[string,object]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

