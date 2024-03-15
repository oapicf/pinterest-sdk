# WWW::OpenAPIClient::AdAccountsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AdAccountsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_analytics**](AdAccountsApi.md#ad_account_analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**ad_account_targeting_analytics_get**](AdAccountsApi.md#ad_account_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**ad_accounts_create**](AdAccountsApi.md#ad_accounts_create) | **POST** /ad_accounts | Create ad account
[**ad_accounts_get**](AdAccountsApi.md#ad_accounts_get) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**ad_accounts_list**](AdAccountsApi.md#ad_accounts_list) | **GET** /ad_accounts | List ad accounts
[**analytics_create_mmm_report**](AdAccountsApi.md#analytics_create_mmm_report) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analytics_create_report**](AdAccountsApi.md#analytics_create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analytics_create_template_report**](AdAccountsApi.md#analytics_create_template_report) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analytics_get_mmm_report**](AdAccountsApi.md#analytics_get_mmm_report) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analytics_get_report**](AdAccountsApi.md#analytics_get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandbox_delete**](AdAccountsApi.md#sandbox_delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templates_list**](AdAccountsApi.md#templates_list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates


# **ad_account_analytics**
> ARRAY[AdAccountAnalyticsResponseInner] ad_account_analytics(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $columns = [("TOTAL_CONVERSIONS")]; # ARRAY[string] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
my $granularity = DAY; # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
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
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**ARRAY[string]**](string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**ARRAY[AdAccountAnalyticsResponseInner]**](AdAccountAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_account_targeting_analytics_get**
> MetricsResponse ad_account_targeting_analytics_get(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, targeting_types => $targeting_types, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, attribution_types => $attribution_types)

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $targeting_types = [(new WWW::OpenAPIClient.AdsAnalyticsTargetingType())]; # ARRAY[AdsAnalyticsTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
my $columns = [("TOTAL_CONVERSIONS")]; # ARRAY[string] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
my $granularity = DAY; # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
my $click_window_days = 1; # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $view_window_days = 1; # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = TIME_OF_AD_ACTION; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
my $attribution_types = new WWW::OpenAPIClient.ConversionReportAttributionType(); # ConversionReportAttributionType | List of types of attribution for the conversion report

eval {
    my $result = $api_instance->ad_account_targeting_analytics_get(ad_account_id => $ad_account_id, start_date => $start_date, end_date => $end_date, targeting_types => $targeting_types, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, attribution_types => $attribution_types);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ad_account_targeting_analytics_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | [**ARRAY[AdsAnalyticsTargetingType]**](AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | 
 **columns** | [**ARRAY[string]**](string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **attribution_types** | [**ConversionReportAttributionType**](.md)| List of types of attribution for the conversion report | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_create**
> AdAccount ad_accounts_create(ad_account_create_request => $ad_account_create_request)

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_create_request = WWW::OpenAPIClient::Object::AdAccountCreateRequest->new(); # AdAccountCreateRequest | Ad account to create.

eval {
    my $result = $api_instance->ad_accounts_create(ad_account_create_request => $ad_account_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ad_accounts_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_create_request** | [**AdAccountCreateRequest**](AdAccountCreateRequest.md)| Ad account to create. | 

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_get**
> AdAccount ad_accounts_get(ad_account_id => $ad_account_id)

Get ad account

Get an ad account

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->ad_accounts_get(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->ad_accounts_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_list**
> AdAccountsList200Response ad_accounts_list(bookmark => $bookmark, page_size => $page_size, include_shared_accounts => $include_shared_accounts)

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
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
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
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **include_shared_accounts** | **boolean**| Include shared ad accounts | [optional] [default to true]

### Return type

[**AdAccountsList200Response**](AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_mmm_report**
> CreateMMMReportResponse analytics_create_mmm_report(ad_account_id => $ad_account_id, create_mmm_report_request => $create_mmm_report_request)

Create a request for a Marketing Mix Modeling (MMM) report

This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $create_mmm_report_request = WWW::OpenAPIClient::Object::CreateMMMReportRequest->new(); # CreateMMMReportRequest | 

eval {
    my $result = $api_instance->analytics_create_mmm_report(ad_account_id => $ad_account_id, create_mmm_report_request => $create_mmm_report_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->analytics_create_mmm_report: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **create_mmm_report_request** | [**CreateMMMReportRequest**](CreateMMMReportRequest.md)|  | 

### Return type

[**CreateMMMReportResponse**](CreateMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_report**
> AdsAnalyticsCreateAsyncResponse analytics_create_report(ad_account_id => $ad_account_id, ads_analytics_create_async_request => $ads_analytics_create_async_request)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

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

# **analytics_create_template_report**
> AdsAnalyticsCreateAsyncResponse analytics_create_template_report(ad_account_id => $ad_account_id, template_id => $template_id, start_date => $start_date, end_date => $end_date, granularity => $granularity)

Create async request for an analytics report using a template

This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $template_id = "template_id_example"; # string | Unique identifier of a template.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
my $granularity = DAY; # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly

eval {
    my $result = $api_instance->analytics_create_template_report(ad_account_id => $ad_account_id, template_id => $template_id, start_date => $start_date, end_date => $end_date, granularity => $granularity);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->analytics_create_template_report: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **template_id** | **string**| Unique identifier of a template. | 
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] 
 **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [optional] 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_mmm_report**
> GetMMMReportResponse analytics_get_mmm_report(ad_account_id => $ad_account_id, token => $token)

Get advertiser Marketing Mix Modeling (MMM) report.

Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.

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
    my $result = $api_instance->analytics_get_mmm_report(ad_account_id => $ad_account_id, token => $token);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->analytics_get_mmm_report: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **token** | **string**| Token returned from the post request creation call | 

### Return type

[**GetMMMReportResponse**](GetMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_report**
> AdsAnalyticsGetAsyncResponse analytics_get_report(ad_account_id => $ad_account_id, token => $token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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

# **sandbox_delete**
> string sandbox_delete(ad_account_id => $ad_account_id)

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->sandbox_delete(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->sandbox_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

**string**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **templates_list**
> TemplatesList200Response templates_list(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark)

List templates

Gets all Templates associated with an ad account ID.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdAccountsApi;
my $api_instance = WWW::OpenAPIClient::AdAccountsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->templates_list(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdAccountsApi->templates_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**TemplatesList200Response**](TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

