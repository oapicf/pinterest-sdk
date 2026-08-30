# WWW::OpenAPIClient::AdGroupsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AdGroupsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_groups_analytics**](AdGroupsApi.md#ad_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**ad_groups_audience_sizing**](AdGroupsApi.md#ad_groups_audience_sizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**ad_groups_bid_floor_get**](AdGroupsApi.md#ad_groups_bid_floor_get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**ad_groups_create**](AdGroupsApi.md#ad_groups_create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**ad_groups_dynamic_titles_download_csv**](AdGroupsApi.md#ad_groups_dynamic_titles_download_csv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**ad_groups_dynamic_titles_get_status**](AdGroupsApi.md#ad_groups_dynamic_titles_get_status) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**ad_groups_dynamic_titles_get_upload_url**](AdGroupsApi.md#ad_groups_dynamic_titles_get_upload_url) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**ad_groups_dynamic_titles_process_csv**](AdGroupsApi.md#ad_groups_dynamic_titles_process_csv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**ad_groups_get**](AdGroupsApi.md#ad_groups_get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**ad_groups_list**](AdGroupsApi.md#ad_groups_list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**ad_groups_targeting_analytics_get**](AdGroupsApi.md#ad_groups_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**ad_groups_update**](AdGroupsApi.md#ad_groups_update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**get_ad_groups_by_promotion_ids_list**](AdGroupsApi.md#get_ad_groups_by_promotion_ids_list) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


# **ad_groups_analytics**
> ARRAY[AdGroupsAnalyticsMetrics] ad_groups_analytics(start_date => $start_date, end_date => $end_date, ad_group_ids => $ad_group_ids, columns => $columns, granularity => $granularity, ad_account_id => $ad_account_id, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, aggregate_report_rows => $aggregate_report_rows, reporting_timezone => $reporting_timezone)

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to use to filter the results.
my $columns = [(new WWW::OpenAPIClient.ReportingColumnSync())]; # ARRAY[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
my $granularity = new WWW::OpenAPIClient.Granularity(); # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $click_window_days = 30; # double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
my $view_window_days = 1; # double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = 'TIME_OF_AD_ACTION'; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
my $aggregate_report_rows = false; # boolean | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
my $reporting_timezone = new WWW::OpenAPIClient.ReportingTimeZone(); # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.

eval {
    my $result = $api_instance->ad_groups_analytics(start_date => $start_date, end_date => $end_date, ad_group_ids => $ad_group_ids, columns => $columns, granularity => $granularity, ad_account_id => $ad_account_id, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, aggregate_report_rows => $aggregate_report_rows, reporting_timezone => $reporting_timezone);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to use to filter the results. | 
 **columns** | [**ARRAY[ReportingColumnSync]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **click_window_days** | **double**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **double**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **double**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **aggregate_report_rows** | **boolean**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false]
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**ARRAY[AdGroupsAnalyticsMetrics]**](AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_audience_sizing**
> AdGroupAudienceSizing ad_groups_audience_sizing(ad_account_id => $ad_account_id, ad_group_audience_sizing_create => $ad_group_audience_sizing_create)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_group_audience_sizing_create = WWW::OpenAPIClient::Object::AdGroupAudienceSizingCreate->new(); # AdGroupAudienceSizingCreate | 

eval {
    my $result = $api_instance->ad_groups_audience_sizing(ad_account_id => $ad_account_id, ad_group_audience_sizing_create => $ad_group_audience_sizing_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_audience_sizing: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_group_audience_sizing_create** | [**AdGroupAudienceSizingCreate**](AdGroupAudienceSizingCreate.md)|  | 

### Return type

[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_bid_floor_get**
> BidFloor ad_groups_bid_floor_get(ad_account_id => $ad_account_id, bid_floor_create => $bid_floor_create)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bid_floor_create = WWW::OpenAPIClient::Object::BidFloorCreate->new(); # BidFloorCreate | 

eval {
    my $result = $api_instance->ad_groups_bid_floor_get(ad_account_id => $ad_account_id, bid_floor_create => $bid_floor_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_bid_floor_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bid_floor_create** | [**BidFloorCreate**](BidFloorCreate.md)|  | 

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_create**
> AdGroupsCreate200Response ad_groups_create(ad_account_id => $ad_account_id, ad_group_create_create => $ad_group_create_create)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_group_create_create = [WWW::OpenAPIClient::Object::ARRAY[AdGroupCreateCreate]->new()]; # ARRAY[AdGroupCreateCreate] | 

eval {
    my $result = $api_instance->ad_groups_create(ad_account_id => $ad_account_id, ad_group_create_create => $ad_group_create_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_group_create_create** | [**ARRAY[AdGroupCreateCreate]**](AdGroupCreateCreate.md)|  | 

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_download_csv**
> DynamicTitlesDownloadCSV ad_groups_dynamic_titles_download_csv(ad_account_id => $ad_account_id, ad_group_id => $ad_group_id)

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_group_id = "ad_group_id_example"; # string | Ad group ID.

eval {
    my $result = $api_instance->ad_groups_dynamic_titles_download_csv(ad_account_id => $ad_account_id, ad_group_id => $ad_group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_dynamic_titles_download_csv: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_group_id** | **string**| Ad group ID. | 

### Return type

[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_get_status**
> DynamicTitlesGetStatus ad_groups_dynamic_titles_get_status(ad_account_id => $ad_account_id, ad_group_id => $ad_group_id)

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_group_id = "ad_group_id_example"; # string | Ad group ID.

eval {
    my $result = $api_instance->ad_groups_dynamic_titles_get_status(ad_account_id => $ad_account_id, ad_group_id => $ad_group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_dynamic_titles_get_status: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_group_id** | **string**| Ad group ID. | 

### Return type

[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_get_upload_url**
> DynamicTitlesUploadURL ad_groups_dynamic_titles_get_upload_url(ad_account_id => $ad_account_id, ad_group_id => $ad_group_id)

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_group_id = "ad_group_id_example"; # string | Ad group ID.

eval {
    my $result = $api_instance->ad_groups_dynamic_titles_get_upload_url(ad_account_id => $ad_account_id, ad_group_id => $ad_group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_dynamic_titles_get_upload_url: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_group_id** | **string**| Ad group ID. | 

### Return type

[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_dynamic_titles_process_csv**
> DynamicTitlesProcessCSV ad_groups_dynamic_titles_process_csv(ad_account_id => $ad_account_id, ad_group_id => $ad_group_id, dynamic_titles_process_csv_create => $dynamic_titles_process_csv_create)

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_group_id = "ad_group_id_example"; # string | Ad group ID.
my $dynamic_titles_process_csv_create = WWW::OpenAPIClient::Object::DynamicTitlesProcessCSVCreate->new(); # DynamicTitlesProcessCSVCreate | 

eval {
    my $result = $api_instance->ad_groups_dynamic_titles_process_csv(ad_account_id => $ad_account_id, ad_group_id => $ad_group_id, dynamic_titles_process_csv_create => $dynamic_titles_process_csv_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_dynamic_titles_process_csv: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_group_id** | **string**| Ad group ID. | 
 **dynamic_titles_process_csv_create** | [**DynamicTitlesProcessCSVCreate**](DynamicTitlesProcessCSVCreate.md)|  | 

### Return type

[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_get**
> AdGroup ad_groups_get(ad_group_id => $ad_group_id, ad_account_id => $ad_account_id)

Get ad group

Get a specific ad group given the ad group ID.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_group_id = "ad_group_id_example"; # string | Ad group ID.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->ad_groups_get(ad_group_id => $ad_group_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_id** | **string**| Ad group ID. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**AdGroup**](AdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_list**
> AdGroupsList200Response ad_groups_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, campaign_ids => $campaign_ids, ad_group_ids => $ad_group_ids, entity_statuses => $entity_statuses, translate_interests_to_names => $translate_interests_to_names)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
my $entity_statuses = [(new WWW::OpenAPIClient.EntityStatus())]; # ARRAY[EntityStatus] | Entity status
my $translate_interests_to_names = false; # boolean | Return interests as text names (if value is true) rather than topic IDs.

eval {
    my $result = $api_instance->ad_groups_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order, campaign_ids => $campaign_ids, ad_group_ids => $ad_group_ids, entity_statuses => $entity_statuses, translate_interests_to_names => $translate_interests_to_names);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
 **entity_statuses** | [**ARRAY[EntityStatus]**](EntityStatus.md)| Entity status | [optional] 
 **translate_interests_to_names** | **boolean**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_targeting_analytics_get**
> MetricsResponse ad_groups_targeting_analytics_get(ad_account_id => $ad_account_id, ad_group_ids => $ad_group_ids, start_date => $start_date, end_date => $end_date, targeting_types => $targeting_types, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, attribution_types => $attribution_types, reporting_timezone => $reporting_timezone, sort_columns => $sort_columns, sort_ascending => $sort_ascending)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_group_ids = [("null")]; # ARRAY[string] | List of Ad group Ids to use to filter the results.
my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $targeting_types = [(new WWW::OpenAPIClient.AdsAnalyticsAdGroupTargetingType())]; # ARRAY[AdsAnalyticsAdGroupTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
my $columns = [(new WWW::OpenAPIClient.ReportingColumnSync())]; # ARRAY[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
my $granularity = new WWW::OpenAPIClient.Granularity(); # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
my $click_window_days = 30; # double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
my $engagement_window_days = 30; # double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
my $view_window_days = 1; # double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
my $conversion_report_time = 'TIME_OF_AD_ACTION'; # string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
my $attribution_types = [(new WWW::OpenAPIClient.ConversionReportAttributionType())]; # ARRAY[ConversionReportAttributionType] | List of types of attribution for the conversion report
my $reporting_timezone = new WWW::OpenAPIClient.ReportingTimeZone(); # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
my $sort_columns = [("null")]; # ARRAY[string] | Sort Columns.
my $sort_ascending = null; # boolean | Sort ascending.

eval {
    my $result = $api_instance->ad_groups_targeting_analytics_get(ad_account_id => $ad_account_id, ad_group_ids => $ad_group_ids, start_date => $start_date, end_date => $end_date, targeting_types => $targeting_types, columns => $columns, granularity => $granularity, click_window_days => $click_window_days, engagement_window_days => $engagement_window_days, view_window_days => $view_window_days, conversion_report_time => $conversion_report_time, attribution_types => $attribution_types, reporting_timezone => $reporting_timezone, sort_columns => $sort_columns, sort_ascending => $sort_ascending);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_targeting_analytics_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_group_ids** | [**ARRAY[string]**](string.md)| List of Ad group Ids to use to filter the results. | 
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | [**ARRAY[AdsAnalyticsAdGroupTargetingType]**](AdsAnalyticsAdGroupTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | 
 **columns** | [**ARRAY[ReportingColumnSync]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **click_window_days** | **double**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **double**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **double**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **attribution_types** | [**ARRAY[ConversionReportAttributionType]**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
 **sort_columns** | [**ARRAY[string]**](string.md)| Sort Columns. | [optional] 
 **sort_ascending** | **boolean**| Sort ascending. | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_update**
> AdGroupsCreate200Response ad_groups_update(ad_account_id => $ad_account_id, ad_group_update_batch_update => $ad_group_update_batch_update)

Update ad groups

Update multiple existing ad groups.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $ad_group_update_batch_update = [WWW::OpenAPIClient::Object::ARRAY[AdGroupUpdateBatchUpdate]->new()]; # ARRAY[AdGroupUpdateBatchUpdate] | 

eval {
    my $result = $api_instance->ad_groups_update(ad_account_id => $ad_account_id, ad_group_update_batch_update => $ad_group_update_batch_update);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->ad_groups_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **ad_group_update_batch_update** | [**ARRAY[AdGroupUpdateBatchUpdate]**](AdGroupUpdateBatchUpdate.md)|  | 

### Return type

[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ad_groups_by_promotion_ids_list**
> AdGroupsList200Response get_ad_groups_by_promotion_ids_list(ad_account_id => $ad_account_id, promotion_ids => $promotion_ids, bookmark => $bookmark, page_size => $page_size, order => $order)

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdGroupsApi;
my $api_instance = WWW::OpenAPIClient::AdGroupsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $promotion_ids = [("null")]; # ARRAY[string] | List of Promotion IDs to use to filter the results.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.

eval {
    my $result = $api_instance->get_ad_groups_by_promotion_ids_list(ad_account_id => $ad_account_id, promotion_ids => $promotion_ids, bookmark => $bookmark, page_size => $page_size, order => $order);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdGroupsApi->get_ad_groups_by_promotion_ids_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **promotion_ids** | [**ARRAY[string]**](string.md)| List of Promotion IDs to use to filter the results. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

